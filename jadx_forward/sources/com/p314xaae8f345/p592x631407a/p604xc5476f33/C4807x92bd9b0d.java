package com.p314xaae8f345.p592x631407a.p604xc5476f33;

/* renamed from: com.tencent.midas.plugin.APPluginContext */
/* loaded from: classes13.dex */
class C4807x92bd9b0d extends android.view.ContextThemeWrapper {

    /* renamed from: mAsset */
    private android.content.res.AssetManager f20754xbdca3683;

    /* renamed from: mClassLoader */
    private java.lang.ClassLoader f20755x70f5dcfe;

    /* renamed from: mResources */
    private android.content.res.Resources f20756x4840838;

    /* renamed from: mTheme */
    private android.content.res.Resources.Theme f20757xbed0c15c;

    /* renamed from: mThemeResId */
    private int f20758xfc30e1df;

    public C4807x92bd9b0d(android.content.Context context, int i17, java.lang.String str, java.lang.ClassLoader classLoader) {
        this(context, i17, str, classLoader, null);
    }

    /* renamed from: getApplicationPackageName */
    private static java.lang.String m42081xf7fd3777(android.content.Context context) {
        if (context == null) {
            return "";
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 0).packageName : "";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APMidasCommMethod", "getApplicationPackageName error:" + e17.toString());
            return "";
        }
    }

    /* renamed from: getInnerRIdValue */
    private int m42082x4c7fd904(java.lang.String str) {
        int i17 = -1;
        try {
            java.lang.String substring = str.substring(0, str.indexOf(".R.") + 2);
            int lastIndexOf = str.lastIndexOf(".");
            java.lang.String substring2 = str.substring(lastIndexOf + 1, str.length());
            java.lang.String substring3 = str.substring(0, lastIndexOf);
            java.lang.String str2 = substring + "$" + substring3.substring(substring3.lastIndexOf(".") + 1, substring3.length());
            i17 = java.lang.Class.forName(str2).getDeclaredField(substring2).getInt(null);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "getInnderR rStrnig:" + substring3 + ", className:" + str2 + ", fieldName:" + substring2);
            return i17;
        } catch (java.lang.Throwable unused) {
            return i17;
        }
    }

    /* renamed from: getSelfAssets */
    private android.content.res.AssetManager m42083x866e3de5(android.content.Context context, java.lang.String str) {
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
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPluginContext", " is not has com.tencent.theme.SkinEngine e:" + e17.toString());
                z17 = false;
            }
            if (!z17) {
                try {
                    java.lang.Class.forName("com.tencent.component.theme.SkinEngine").getMethod("getInstances", new java.lang.Class[0]);
                    z17 = true;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("APPluginContext", " is not has com.tencent.component.theme.SkinEngine e:" + e18.toString());
                    z17 = false;
                }
            }
            try {
                z18 = "com.tencent.weread".equals(m42081xf7fd3777(context));
            } catch (java.lang.Exception unused2) {
                z18 = false;
            }
            if (z17 || z18) {
                java.util.ArrayList<java.lang.String> m42163x399b8346 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42163x399b8346(context);
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "loadEmptyResAPK emptyList.size:" + m42163x399b8346.size());
                for (int i17 = 0; i17 < m42163x399b8346.size(); i17++) {
                    java.lang.String str2 = m42163x399b8346.get(i17);
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "loadEmptyResAPK emptyResFirstPath:" + str2);
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "loadEmptyResAPK id:" + ((java.lang.Integer) android.content.res.AssetManager.class.getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assetManager2, str2)).intValue());
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

    /* renamed from: getSelfRes */
    private android.content.res.Resources m42084xb3b4d97e(android.content.Context context, android.content.res.AssetManager assetManager) {
        return new android.content.res.Resources(assetManager, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
    }

    /* renamed from: getSelfTheme */
    private android.content.res.Resources.Theme m42085x9a01d727(android.content.Context context, android.content.res.Resources resources) {
        android.content.res.Resources.Theme newTheme = resources.newTheme();
        int m42086xed5a6c8e = m42086xed5a6c8e(context);
        this.f20758xfc30e1df = m42086xed5a6c8e;
        newTheme.applyStyle(m42086xed5a6c8e, true);
        return newTheme;
    }

    /* renamed from: getThemeId */
    private static int m42086xed5a6c8e(android.content.Context context) {
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
        return this.f20754xbdca3683;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        java.lang.ClassLoader classLoader = this.f20755x70f5dcfe;
        return classLoader != null ? classLoader : super.getClassLoader();
    }

    /* renamed from: getRes */
    public android.content.res.Resources m42087xb588696a() {
        return this.f20756x4840838;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.f20756x4840838;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        return this.f20757xbed0c15c;
    }

    /* renamed from: setClassLoader */
    public void m42088x372485e9(java.lang.ClassLoader classLoader) {
        this.f20755x70f5dcfe = classLoader;
    }

    public C4807x92bd9b0d(android.content.Context context, int i17, java.lang.String str, java.lang.ClassLoader classLoader, android.content.res.Resources resources) {
        super(context, i17);
        this.f20754xbdca3683 = null;
        this.f20756x4840838 = null;
        this.f20757xbed0c15c = null;
        this.f20755x70f5dcfe = classLoader;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "APPluginContext mClassLoader:" + this.f20755x70f5dcfe + " apkPath:" + str);
        if (resources != null) {
            this.f20754xbdca3683 = resources.getAssets();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "APPluginActivity APPluginContext 1 mAsset:" + this.f20754xbdca3683);
            this.f20756x4840838 = resources;
        } else {
            android.content.res.AssetManager m42083x866e3de5 = m42083x866e3de5(context, str);
            this.f20754xbdca3683 = m42083x866e3de5;
            this.f20756x4840838 = m42084xb3b4d97e(context, m42083x866e3de5);
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APPluginContext", "APPluginActivity APPluginContext 2 mAsset:" + this.f20754xbdca3683 + ", mResources:" + this.f20756x4840838);
        }
        this.f20757xbed0c15c = m42085x9a01d727(context, this.f20756x4840838);
    }
}
