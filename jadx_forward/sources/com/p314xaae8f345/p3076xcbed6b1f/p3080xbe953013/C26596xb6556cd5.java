package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.AppInfoChangedBlocker */
/* loaded from: classes13.dex */
public final class C26596xb6556cd5 {
    private static final java.lang.String TAG = "Tinker.AppInfoChangedBlocker";

    /* renamed from: com.tencent.tinker.loader.AppInfoChangedBlocker$HackerCallback */
    /* loaded from: classes13.dex */
    public static class HackerCallback implements android.os.Handler.Callback {

        /* renamed from: APPLICATION_INFO_CHANGED */
        private final int f55421x960ea2b2;

        /* renamed from: origin */
        private android.os.Handler.Callback f55422xc3e1af26;

        public HackerCallback(android.os.Handler.Callback callback, java.lang.Class cls) {
            int i17;
            this.f55422xc3e1af26 = callback;
            try {
                i17 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) cls, "APPLICATION_INFO_CHANGED").getInt(null);
            } catch (java.lang.Throwable unused) {
                i17 = 156;
            }
            this.f55421x960ea2b2 = i17;
        }

        /* renamed from: hackMessage */
        private boolean m104453x6a74c1a6(android.os.Message message) {
            if (message.what != this.f55421x960ea2b2) {
                return false;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26596xb6556cd5.TAG, "Suicide now.", new java.lang.Object[0]);
            android.os.Process.killProcess(android.os.Process.myPid());
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (m104453x6a74c1a6(message)) {
                return true;
            }
            android.os.Handler.Callback callback = this.f55422xc3e1af26;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    /* renamed from: fetchMHObject */
    private static android.os.Handler m104450xe9006574(android.content.Context context) {
        java.lang.Object m104706x60a4f2ef = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104706x60a4f2ef(context, null);
        return (android.os.Handler) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(m104706x60a4f2ef, "mH").get(m104706x60a4f2ef);
    }

    /* renamed from: interceptHandler */
    private static void m104451x724fd028(android.os.Handler handler) {
        java.lang.reflect.Field m104702x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.os.Handler.class, "mCallback");
        android.os.Handler.Callback callback = (android.os.Handler.Callback) m104702x183d66c1.get(handler);
        if (callback instanceof com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26596xb6556cd5.HackerCallback) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "Already intercepted, skip rest logic.", new java.lang.Object[0]);
        } else {
            m104702x183d66c1.set(handler, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26596xb6556cd5.HackerCallback(callback, handler.getClass()));
        }
    }

    /* renamed from: tryStart */
    public static boolean m104452x73d0ef67(android.app.Application application) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "tryStart called.", new java.lang.Object[0]);
            m104451x724fd028(m104450xe9006574(application));
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "tryStart done.", new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "AppInfoChangedBlocker start failed, simply ignore.", th6);
            return false;
        }
    }
}
