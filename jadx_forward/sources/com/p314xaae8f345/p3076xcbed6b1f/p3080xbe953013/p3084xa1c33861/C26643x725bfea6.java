package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareTinkerLog */
/* loaded from: classes13.dex */
public class C26643x725bfea6 {

    /* renamed from: FN_LOG_PRINT_PENDING_LOGS */
    public static final int f55934x58a8a3b = 4002;

    /* renamed from: FN_LOG_PRINT_STACKTRACE */
    public static final int f55935x5ad4a781 = 4001;
    private static final java.lang.String TAG = "Tinker.ShareTinkerLog";

    /* renamed from: debugLog */
    private static final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp f55936x20a68ff1;

    /* renamed from: tinkerLogImpRef */
    private static final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp[] f55937x703ad92c;

    /* renamed from: tinkerLogInlineFenceRef */
    private static final android.os.Handler[] f55938x4e6cf360;

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareTinkerLog$TinkerLogImp */
    /* loaded from: classes13.dex */
    public interface TinkerLogImp {
        void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        /* renamed from: printErrStackTrace */
        void mo2152x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr);

        void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);
    }

    static {
        android.os.Handler[] handlerArr = {null};
        f55938x4e6cf360 = handlerArr;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp tinkerLogImp = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp() { // from class: com.tencent.tinker.loader.shareutil.ShareTinkerLog.1
            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            /* renamed from: printErrStackTrace */
            public void mo2152x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    java.lang.String.format(str2, objArr);
                }
                android.util.Log.getStackTraceString(th6);
            }

            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp
            public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }
        };
        f55936x20a68ff1 = tinkerLogImp;
        f55937x703ad92c = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp[]{tinkerLogImp};
        synchronized (handlerArr) {
            try {
                int i17 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.f297084a;
                java.lang.reflect.Constructor declaredConstructor = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.class.getDeclaredConstructor(new java.lang.Class[0]);
                declaredConstructor.setAccessible(true);
                handlerArr[0] = (android.os.Handler) declaredConstructor.newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused) {
                f55938x4e6cf360[0] = null;
            }
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m104768xba7add57(3, str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m104768xba7add57(6, str, str2, objArr);
    }

    /* renamed from: getDefaultImpl */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp m104764xbfc5eacb() {
        return f55936x20a68ff1;
    }

    /* renamed from: getImpl */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp m104765xfb80ca96() {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp tinkerLogImp;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp[] tinkerLogImpArr = f55937x703ad92c;
        synchronized (tinkerLogImpArr) {
            tinkerLogImp = tinkerLogImpArr[0];
        }
        return tinkerLogImp;
    }

    /* renamed from: getInlineFence */
    private static android.os.Handler m104766x76bd5be2() {
        android.os.Handler handler;
        android.os.Handler[] handlerArr = f55938x4e6cf360;
        synchronized (handlerArr) {
            handler = handlerArr[0];
        }
        return handler;
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m104768xba7add57(4, str, str2, objArr);
    }

    /* renamed from: printErrStackTrace */
    public static void m104767x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m104769xba7add57(str, th6, str2, objArr);
    }

    /* renamed from: printLog */
    private static void m104768xba7add57(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, str2, objArr};
        android.os.Handler m104766x76bd5be2 = m104766x76bd5be2();
        if (m104766x76bd5be2 != null) {
            android.os.Message obtain = android.os.Message.obtain(m104766x76bd5be2, i17, objArr2);
            m104766x76bd5be2.handleMessage(obtain);
            obtain.recycle();
        } else {
            f55936x20a68ff1.e(str, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
        }
    }

    /* renamed from: printPendingLogs */
    public static void m104770xf60b96f9() {
        android.os.Handler m104766x76bd5be2 = m104766x76bd5be2();
        if (m104766x76bd5be2 != null) {
            android.os.Message obtain = android.os.Message.obtain(m104766x76bd5be2, 4002);
            m104766x76bd5be2.handleMessage(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: setTinkerLogImp */
    public static void m104771x280a5769(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp tinkerLogImp) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp[] tinkerLogImpArr = f55937x703ad92c;
        synchronized (tinkerLogImpArr) {
            tinkerLogImpArr[0] = tinkerLogImp;
            if (tinkerLogImp != null && tinkerLogImp != f55936x20a68ff1) {
                m104770xf60b96f9();
            }
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m104768xba7add57(2, str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m104768xba7add57(5, str, str2, objArr);
    }

    /* renamed from: printLog */
    private static void m104769xba7add57(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = {4001, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, th6, str2, objArr};
        android.os.Handler m104766x76bd5be2 = m104766x76bd5be2();
        if (m104766x76bd5be2 != null) {
            android.os.Message obtain = android.os.Message.obtain(m104766x76bd5be2, 4001, objArr2);
            m104766x76bd5be2.handleMessage(obtain);
            obtain.recycle();
        } else {
            f55936x20a68ff1.mo2152x58ef3d35(str, th6, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
        }
    }
}
