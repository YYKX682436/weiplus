package com.p314xaae8f345.mm.p2815x498e71d6;

/* renamed from: com.tencent.mm.wemedia.WeMediaBinding */
/* loaded from: classes7.dex */
public class C22932xe093580f {
    private static final java.lang.String TAG = "hi.WeMediaBinding";

    /* renamed from: mContext */
    private android.content.Context f39941xd6cfe882;

    /* renamed from: mNativeInst */
    private volatile long f39942x95333f4a = 0;

    static {
        if (kq5.c.f392819a) {
            return;
        }
        kq5.g.a("hi.LoadDelegate", "loadLibraries start", new java.lang.Object[0]);
        kq5.c.f392820b.mo32130xeb57c8f5("c++_shared");
        kq5.c.f392820b.mo32130xeb57c8f5("wxVcodec1");
        kq5.c.f392820b.mo32130xeb57c8f5("xffmpeg");
        kq5.c.f392820b.mo32130xeb57c8f5("mmmedia");
        kq5.c.f392820b.mo32130xeb57c8f5("wemedia");
        kq5.g.a("hi.LoadDelegate", "loadLibraries end", new java.lang.Object[0]);
        kq5.c.f392819a = true;
    }

    public C22932xe093580f(android.content.Context context) {
        this.f39941xd6cfe882 = context;
        kq5.g.a(TAG, "construct", new java.lang.Object[0]);
    }

    /* renamed from: nativeCreate */
    private native long m83425x73c02ff3(long j17, long j18, long j19, java.lang.String str, com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb interfaceC22933xef8aa7fb);

    /* renamed from: nativeDestroy */
    private native void m83426x23caefe3(long j17);

    /* renamed from: nativeOnBackground */
    private native void m83427xcf90ee24(long j17);

    /* renamed from: nativeOnForeground */
    private native void m83428x95410239(long j17);

    /* renamed from: nativeOnSuspend */
    private native void m83429xc7a59b06(long j17);

    /* renamed from: nativeSetLoglvl */
    private native void m83430xfd475b09(long j17, int i17);

    /* renamed from: finalize */
    public void m83431xd764dc1e() {
        kq5.g.a(TAG, "finalize", new java.lang.Object[0]);
        m83437x36c75a();
    }

    /* renamed from: init */
    public synchronized boolean m83432x316510(long j17, long j18, long j19, java.lang.String str, com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb interfaceC22933xef8aa7fb) {
        kq5.g.a(TAG, "init, isolate_ptr: " + j17 + ", context_ptr: " + j18 + ", uvloop_ptr: " + j19, new java.lang.Object[0]);
        try {
            try {
                try {
                    if (this.f39942x95333f4a != 0) {
                        kq5.g.f392821a.e(TAG, "already init", new java.lang.Object[0]);
                        kq5.g.a(TAG, "init, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
                        return this.f39942x95333f4a > 0;
                    }
                    this.f39942x95333f4a = m83425x73c02ff3(j17, j18, j19, str, interfaceC22933xef8aa7fb);
                    kq5.g.a(TAG, "init, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
                    return this.f39942x95333f4a > 0;
                } catch (java.lang.Exception e17) {
                    kq5.g.b(TAG, e17, "init Exception", new java.lang.Object[0]);
                    kq5.g.a(TAG, "init, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
                    return this.f39942x95333f4a > 0;
                }
            } catch (java.lang.UnsatisfiedLinkError e18) {
                kq5.g.b(TAG, e18, "init UnsatisfiedLinkError", new java.lang.Object[0]);
                kq5.g.a(TAG, "init, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
                return this.f39942x95333f4a > 0;
            }
        } catch (java.lang.Throwable unused) {
            kq5.g.a(TAG, "init, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
            return this.f39942x95333f4a > 0;
        }
    }

    /* renamed from: onBackground */
    public synchronized void m83433x77b5b46d() {
        kq5.g.a(TAG, "onBackground, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onBackground UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onBackground Exception", new java.lang.Object[0]);
        }
        if (this.f39942x95333f4a == 0) {
            return;
        }
        m83427xcf90ee24(this.f39942x95333f4a);
    }

    /* renamed from: onForeground */
    public synchronized void m83434x3d65c882() {
        kq5.g.a(TAG, "onForeground, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onForeground UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onForeground Exception", new java.lang.Object[0]);
        }
        if (this.f39942x95333f4a == 0) {
            return;
        }
        m83428x95410239(this.f39942x95333f4a);
    }

    /* renamed from: onSuspend */
    public synchronized void m83435xe142a15d() {
        kq5.g.a(TAG, "onSuspend, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onSuspend UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onSuspend Exception", new java.lang.Object[0]);
        }
        if (this.f39942x95333f4a == 0) {
            return;
        }
        m83429xc7a59b06(this.f39942x95333f4a);
    }

    /* renamed from: setLoglvl */
    public synchronized void m83436x16e46160(int i17) {
        kq5.g.a(TAG, "setLoglvl, mNativeInst: " + this.f39942x95333f4a + ", loglvl: " + i17, new java.lang.Object[0]);
        try {
        } catch (java.lang.Exception e17) {
            kq5.g.b(TAG, e17, "setLoglvl Exception", new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            kq5.g.b(TAG, e18, "setLoglvl UnsatisfiedLinkError", new java.lang.Object[0]);
        }
        if (this.f39942x95333f4a == 0) {
            return;
        }
        m83430xfd475b09(this.f39942x95333f4a, i17);
    }

    /* renamed from: uint */
    public synchronized void m83437x36c75a() {
        kq5.g.a(TAG, "uint, mNativeInst: " + this.f39942x95333f4a, new java.lang.Object[0]);
        try {
            try {
                if (this.f39942x95333f4a != 0) {
                    m83426x23caefe3(this.f39942x95333f4a);
                    this.f39942x95333f4a = 0L;
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "uint UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "uint Exception", new java.lang.Object[0]);
        }
    }
}
