package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
class APPluginContext extends android.view.ContextThemeWrapper {
    private android.content.res.AssetManager mAsset;
    private java.lang.ClassLoader mClassLoader;
    private android.content.res.Resources mResources;
    private android.content.res.Resources.Theme mTheme;
    private int mThemeResId;

    public APPluginContext(android.content.Context context, int i17, java.lang.String str, java.lang.ClassLoader classLoader) {
        this(context, i17, str, classLoader, null);
    }

    private static java.lang.String getApplicationPackageName(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 0).packageName : "";
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("APMidasCommMethod", "getApplicationPackageName error:" + e17.toString());
            return "";
        }
    }

    private int getInnerRIdValue(java.lang.String str) {
        int i17 = -1;
        try {
            java.lang.String substring = str.substring(0, str.indexOf(".R.") + 2);
            int lastIndexOf = str.lastIndexOf(".");
            java.lang.String substring2 = str.substring(lastIndexOf + 1, str.length());
            java.lang.String substring3 = str.substring(0, lastIndexOf);
            java.lang.String str2 = substring + "$" + substring3.substring(substring3.lastIndexOf(".") + 1, substring3.length());
            i17 = java.lang.Class.forName(str2).getDeclaredField(substring2).getInt(null);
            com.tencent.midas.comm.APLog.i("APPluginContext", "getInnderR rStrnig:" + substring3 + ", className:" + str2 + ", fieldName:" + substring2);
            return i17;
        } catch (java.lang.Throwable unused) {
            return i17;
        }
    }

    private android.content.res.AssetManager getSelfAssets(android.content.Context context, java.lang.String str) {
        boolean z17;
        boolean z18;
        android.content.res.AssetManager assetManager = null;
        try {
            android.content.res.AssetManager assetManager2 = (android.content.res.AssetManager) android.content.res.AssetManager.class.newInstance();
            try {
                try {
                    java.lang.Class.forName("com.tencent.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
                    z17 = true;
                } catch (java.lang.Throwable unused) {
                    assetManager = assetManager2;
                    return assetManager;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e17.toString());
                z17 = false;
            }
            if (!z17) {
                try {
                    java.lang.Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
                    z17 = true;
                } catch (java.lang.Exception e18) {
                    com.tencent.midas.comm.APLog.w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e18.toString());
                    z17 = false;
                }
            }
            try {
                z18 = "com.tencent.weread".equals(getApplicationPackageName(context));
            } catch (java.lang.Exception unused2) {
                z18 = false;
            }
            if (z17 || z18) {
                java.util.ArrayList<java.lang.String> midasEmptyPaht = com.tencent.midas.plugin.APPluginUtils.getMidasEmptyPaht(context);
                com.tencent.midas.comm.APLog.i("APPluginContext", "loadEmptyResAPK emptyList.size:" + midasEmptyPaht.size());
                for (int i17 = 0; i17 < midasEmptyPaht.size(); i17++) {
                    java.lang.String str2 = midasEmptyPaht.get(i17);
                    com.tencent.midas.comm.APLog.i("APPluginContext", "loadEmptyResAPK emptyResFirstPath:" + str2);
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        com.tencent.midas.comm.APLog.i("APPluginContext", "loadEmptyResAPK id:" + ((java.lang.Integer) android.content.res.AssetManager.class.getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assetManager2, str2)).intValue());
                    }
                }
            }
            android.content.res.AssetManager.class.getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assetManager2, str);
            try {
                for (java.lang.String str3 : context.getApplicationInfo().sharedLibraryFiles) {
                    if (str3.endsWith(".apk")) {
                        android.content.res.AssetManager.class.getDeclaredMethod("addAssetPathAsSharedLibrary", java.lang.String.class).invoke(assetManager2, str3);
                    }
                }
                return assetManager2;
            } catch (java.lang.Exception unused3) {
                return assetManager2;
            }
        } catch (java.lang.Throwable unused4) {
        }
    }

    private android.content.res.Resources getSelfRes(android.content.Context context, android.content.res.AssetManager assetManager) {
        return new android.content.res.Resources(assetManager, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
    }

    private android.content.res.Resources.Theme getSelfTheme(android.content.Context context, android.content.res.Resources resources) {
        android.content.res.Resources.Theme newTheme = resources.newTheme();
        int themeId = getThemeId(context);
        this.mThemeResId = themeId;
        newTheme.applyStyle(themeId, true);
        return newTheme;
    }

    private static int getThemeId(android.content.Context context) {
        try {
            java.lang.reflect.Method method = android.view.ContextThemeWrapper.class.getMethod("getThemeResId", new java.lang.Class[0]);
            method.setAccessible(true);
            return ((java.lang.Integer) method.invoke(context, new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.mAsset;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        java.lang.ClassLoader classLoader = this.mClassLoader;
        return classLoader != null ? classLoader : super.getClassLoader();
    }

    public android.content.res.Resources getRes() {
        return this.mResources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.mResources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        return this.mTheme;
    }

    public void setClassLoader(java.lang.ClassLoader classLoader) {
        this.mClassLoader = classLoader;
    }

    public APPluginContext(android.content.Context context, int i17, java.lang.String str, java.lang.ClassLoader classLoader, android.content.res.Resources resources) {
        super(context, i17);
        this.mAsset = null;
        this.mResources = null;
        this.mTheme = null;
        this.mClassLoader = classLoader;
        com.tencent.midas.comm.APLog.i("APPluginContext", "APPluginContext mClassLoader:" + this.mClassLoader + " apkPath:" + str);
        if (resources != null) {
            this.mAsset = resources.getAssets();
            com.tencent.midas.comm.APLog.i("APPluginContext", "APPluginActivity APPluginContext 1 mAsset:" + this.mAsset);
            this.mResources = resources;
        } else {
            android.content.res.AssetManager selfAssets = getSelfAssets(context, str);
            this.mAsset = selfAssets;
            this.mResources = getSelfRes(context, selfAssets);
            com.tencent.midas.comm.APLog.i("APPluginContext", "APPluginActivity APPluginContext 2 mAsset:" + this.mAsset + ", mResources:" + this.mResources);
        }
        this.mTheme = getSelfTheme(context, this.mResources);
    }
}
