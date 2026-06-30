package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app;

/* renamed from: com.tencent.tinker.loader.app.TinkerInlineFenceAction */
/* loaded from: classes13.dex */
public final class C26613xb81ebbef {

    /* renamed from: ACTION_GET_ASSETS */
    public static final int f55523x7dbfee55 = 9;

    /* renamed from: ACTION_GET_BASE_CONTEXT */
    public static final int f55524xd12ea773 = 8;

    /* renamed from: ACTION_GET_CLASSLOADER */
    public static final int f55525x74f85fd9 = 7;

    /* renamed from: ACTION_GET_RESOURCES */
    public static final int f55526xdd91fdf3 = 10;

    /* renamed from: ACTION_GET_SYSTEM_SERVICE */
    public static final int f55527xbe725557 = 11;

    /* renamed from: ACTION_GET_THEME */
    public static final int f55528x706fd497 = 13;

    /* renamed from: ACTION_MZ_NIGHTMODE_USE_OF */
    public static final int f55529x7d248f9c = 12;

    /* renamed from: ACTION_ON_BASE_CONTEXT_ATTACHED */
    public static final int f55530x8dd1e18b = 1;

    /* renamed from: ACTION_ON_CONFIGURATION_CHANGED */
    public static final int f55531x3cbedfb4 = 3;

    /* renamed from: ACTION_ON_CREATE */
    public static final int f55532xcf7d2093 = 2;

    /* renamed from: ACTION_ON_LOW_MEMORY */
    public static final int f55533xe2ceac83 = 5;

    /* renamed from: ACTION_ON_TERMINATE */
    public static final int f55534x7e3074a = 6;

    /* renamed from: ACTION_ON_TRIM_MEMORY */
    public static final int f55535x56dad287 = 4;

    /* renamed from: callGetAssets */
    public static android.content.res.AssetManager m104545x8f0c05bb(android.os.Handler handler, android.content.res.AssetManager assetManager) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 9, assetManager);
            try {
                handler.handleMessage(message);
                android.content.res.AssetManager assetManager2 = (android.content.res.AssetManager) message.obj;
                message.recycle();
                return assetManager2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callGetBaseContext */
    public static android.content.Context m104546x6e3ba66(android.os.Handler handler, android.content.Context context) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 8, context);
            try {
                handler.handleMessage(message);
                android.content.Context context2 = (android.content.Context) message.obj;
                message.recycle();
                return context2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callGetClassLoader */
    public static java.lang.ClassLoader m104547xbe7dc73(android.os.Handler handler, java.lang.ClassLoader classLoader) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 7, classLoader);
            try {
                handler.handleMessage(message);
                java.lang.ClassLoader classLoader2 = (java.lang.ClassLoader) message.obj;
                message.recycle();
                return classLoader2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callGetResources */
    public static android.content.res.Resources m104548xc36960ed(android.os.Handler handler, android.content.res.Resources resources) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 10, resources);
            try {
                handler.handleMessage(message);
                android.content.res.Resources resources2 = (android.content.res.Resources) message.obj;
                message.recycle();
                return resources2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callGetSystemService */
    public static java.lang.Object m104549xf0b0e84e(android.os.Handler handler, java.lang.String str, java.lang.Object obj) {
        android.os.Message message = null;
        try {
            message = android.os.Message.obtain(handler, 11, new java.lang.Object[]{str, obj});
            handler.handleMessage(message);
            return message.obj;
        } finally {
            message.recycle();
        }
    }

    /* renamed from: callGetTheme */
    public static android.content.res.Resources.Theme m104550x7940bc91(android.os.Handler handler, android.content.res.Resources.Theme theme) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 13, theme);
            try {
                handler.handleMessage(message);
                android.content.res.Resources.Theme theme2 = (android.content.res.Resources.Theme) message.obj;
                message.recycle();
                return theme2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callMZNightModeUseOf */
    public static int m104551xd0bba60e(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 12);
            try {
                handler.handleMessage(message);
                int intValue = ((java.lang.Integer) message.obj).intValue();
                message.recycle();
                return intValue;
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnBaseContextAttached */
    public static void m104552xcf6d0145(android.os.Handler handler, android.content.Context context) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 1, context);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnConfigurationChanged */
    public static void m104553xeb17ad5b(android.os.Handler handler, android.content.res.Configuration configuration) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 3, configuration);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnCreate */
    public static void m104554x426a1839(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 2);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnLowMemory */
    public static void m104555x4c5e6118(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 5);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnTerminate */
    public static void m104556xe0aa204(android.os.Handler handler) {
        android.os.Message message;
        try {
            message = android.os.Message.obtain(handler, 6);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (java.lang.Throwable th6) {
                th = th6;
                message.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            message = null;
        }
    }

    /* renamed from: callOnTrimMemory */
    public static void m104557x63978c80(android.os.Handler handler, int i17) {
        android.os.Message message = null;
        try {
            message = android.os.Message.obtain(handler, 4, java.lang.Integer.valueOf(i17));
            handler.handleMessage(message);
        } finally {
            message.recycle();
        }
    }
}
