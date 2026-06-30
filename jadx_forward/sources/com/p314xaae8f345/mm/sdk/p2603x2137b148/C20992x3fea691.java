package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* renamed from: com.tencent.mm.sdk.platformtools.FLock */
/* loaded from: classes11.dex */
public class C20992x3fea691 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f273944a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f273945b;

    static {
        try {
            java.util.Set set = fp.d0.f346699a;
            fp.b0.f346696a.b("wechatcommon");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FLock", th6, "fail to load so.", new java.lang.Object[0]);
        }
    }

    public C20992x3fea691(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        this.f273944a = null;
        this.f273945b = -1;
        if (r6Var.m()) {
            if (!r6Var.A()) {
                throw new java.lang.IllegalArgumentException("target is not a file.");
            }
        } else {
            if (!z17) {
                throw new java.lang.IllegalArgumentException("target is not exists or create failed.");
            }
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        this.f273944a = r6Var;
    }

    /* renamed from: nativeFree */
    private static native void m77687xb8fff723(int i17);

    /* renamed from: nativeInit */
    private static native int m77688xb90145c7(java.lang.String str);

    /* renamed from: nativeLockRead */
    private static native int m77689x89bfb298(int i17, boolean z17);

    /* renamed from: nativeLockWrite */
    private static native int m77690xae831f1d(int i17, boolean z17);

    /* renamed from: nativeUnlock */
    private static native int m77691x92426e3b(int i17);

    public final synchronized int a() {
        if (!this.f273944a.m()) {
            try {
                this.f273944a.k();
            } catch (java.io.IOException unused) {
            }
            this.f273945b = -1;
        }
        if (this.f273945b == -1) {
            this.f273945b = m77688xb90145c7(this.f273944a.o());
        }
        return this.f273945b;
    }

    public synchronized void b() {
        int a17 = a();
        while (true) {
            int m77689x89bfb298 = m77689x89bfb298(a17, true);
            if (m77689x89bfb298 != 4) {
                if (m77689x89bfb298 == 9) {
                    throw new java.lang.IllegalStateException("bad file descriptor.");
                }
                if (m77689x89bfb298 != 11) {
                    if (m77689x89bfb298 == 22) {
                        throw new java.lang.IllegalStateException("bad operation.");
                    }
                    if (m77689x89bfb298 == 46) {
                        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
                    }
                }
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public synchronized void c() {
        int a17 = a();
        while (true) {
            int m77690xae831f1d = m77690xae831f1d(a17, true);
            if (m77690xae831f1d != 4) {
                if (m77690xae831f1d == 9) {
                    throw new java.lang.IllegalStateException("bad file descriptor.");
                }
                if (m77690xae831f1d != 11) {
                    if (m77690xae831f1d == 22) {
                        throw new java.lang.IllegalStateException("bad operation.");
                    }
                    if (m77690xae831f1d == 46) {
                        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
                    }
                }
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public synchronized boolean d() {
        int m77690xae831f1d;
        int a17 = a();
        while (true) {
            m77690xae831f1d = m77690xae831f1d(a17, false);
            if (m77690xae831f1d != 4) {
                break;
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (m77690xae831f1d == 9) {
            throw new java.lang.IllegalStateException("bad file descriptor.");
        }
        if (m77690xae831f1d == 11) {
            return false;
        }
        if (m77690xae831f1d == 22) {
            throw new java.lang.IllegalStateException("bad operation.");
        }
        if (m77690xae831f1d != 46) {
            return true;
        }
        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
    }

    public synchronized void e() {
        if (this.f273945b == -1) {
            return;
        }
        try {
            int m77691x92426e3b = m77691x92426e3b(this.f273945b);
            if (m77691x92426e3b == 0) {
                synchronized (this) {
                    if (this.f273945b != -1) {
                        m77687xb8fff723(this.f273945b);
                        this.f273945b = -1;
                    }
                }
                return;
            }
            if (m77691x92426e3b == 9) {
                throw new java.lang.IllegalArgumentException(this.f273945b + " is not a valid fd.");
            }
            if (m77691x92426e3b == 22) {
                throw new java.lang.IllegalStateException("bad operation.");
            }
            throw new java.lang.IllegalStateException("other err: " + m77691x92426e3b);
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.f273945b != -1) {
                    m77687xb8fff723(this.f273945b);
                    this.f273945b = -1;
                }
                throw th6;
            }
        }
    }

    /* renamed from: finalize */
    public void m77692xd764dc1e() {
        super.finalize();
        e();
    }
}
