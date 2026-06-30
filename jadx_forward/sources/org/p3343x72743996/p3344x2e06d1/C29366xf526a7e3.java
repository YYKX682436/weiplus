package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.StrictModeContext */
/* loaded from: classes13.dex */
public final class C29366xf526a7e3 implements java.io.Closeable {

    /* renamed from: mThreadPolicy */
    private final android.os.StrictMode.ThreadPolicy f73425x6dc488e9;

    /* renamed from: mVmPolicy */
    private final android.os.StrictMode.VmPolicy f73426x1ba22256;

    private C29366xf526a7e3(android.os.StrictMode.ThreadPolicy threadPolicy, android.os.StrictMode.VmPolicy vmPolicy) {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152709xa094bb3a("StrictModeContext", hashCode());
        this.f73425x6dc488e9 = threadPolicy;
        this.f73426x1ba22256 = vmPolicy;
    }

    /* renamed from: allowAllThreadPolicies */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152643xe7bf8932() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowAllThreadPolicies");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(threadPolicy);
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: allowAllVmPolicies */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152644x95aa28df() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowAllVmPolicies");
        try {
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(vmPolicy);
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: allowDiskReads */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowDiskReads");
        try {
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(android.os.StrictMode.allowThreadDiskReads());
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: allowDiskWrites */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowDiskWrites");
        try {
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(android.os.StrictMode.allowThreadDiskWrites());
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: allowSlowCalls */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152647x34802f0b() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowSlowCalls");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(threadPolicy);
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: allowUnbufferedIo */
    public static org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152648x6a7193a7() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("StrictModeContext.allowUnbufferedIo");
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
            }
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 c29366xf526a7e3 = new org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3(threadPolicy);
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return c29366xf526a7e3;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.os.StrictMode.ThreadPolicy threadPolicy = this.f73425x6dc488e9;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        android.os.StrictMode.VmPolicy vmPolicy = this.f73426x1ba22256;
        if (vmPolicy != null) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152693x4eb069a9("StrictModeContext", hashCode());
    }

    private C29366xf526a7e3(android.os.StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    private C29366xf526a7e3(android.os.StrictMode.VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }
}
