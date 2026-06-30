package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b;

/* renamed from: com.tencent.tinker.loader.hotplug.ComponentHotplug */
/* loaded from: classes13.dex */
public final class C26616xa188cbbe {
    private static final java.lang.String TAG = "Tinker.ComponentHotplug";

    /* renamed from: sAMSInterceptor */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806 f55561xc7bb2d31;

    /* renamed from: sInstalled */
    private static volatile boolean f55562x362b2847;

    /* renamed from: sMHMessageInterceptor */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868 f55563x3afc318c;

    /* renamed from: sPMSInterceptor */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806 f55564x3b9fd82;

    /* renamed from: sTinkerHackInstrumentation */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e f55565x7c9f0b3b;

    private C26616xa188cbbe() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: ensureComponentHotplugInstalled */
    public static synchronized void m104561x526e6de(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891) {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26616xa188cbbe.class) {
            if (f55562x362b2847) {
                try {
                    f55561xc7bb2d31.m104600x74ae259b();
                    f55564x3b9fd82.m104600x74ae259b();
                    if (android.os.Build.VERSION.SDK_INT < 27) {
                        f55563x3afc318c.m104600x74ae259b();
                    } else {
                        f55565x7c9f0b3b.m104613x74ae259b();
                    }
                } catch (java.lang.Throwable th6) {
                    m104564xdab628e2();
                    throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26619xea648531(th6);
                }
            } else {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "method install() is not invoked, ignore ensuring operations.", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: fetchMHInstance */
    private static android.os.Handler m104562xc62e9d8a(android.content.Context context) {
        java.lang.Object m104706x60a4f2ef = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104706x60a4f2ef(context, null);
        if (m104706x60a4f2ef == null) {
            throw new java.lang.IllegalStateException("failed to fetch instance of ActivityThread.");
        }
        try {
            return (android.os.Handler) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(m104706x60a4f2ef, "mH").get(m104706x60a4f2ef);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.IllegalStateException(th6);
        }
    }

    /* renamed from: install */
    public static synchronized void m104563x74ae259b(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429) {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26616xa188cbbe.class) {
            if (!f55562x362b2847) {
                try {
                    if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26618xe516d55f.m104568x316510(abstractApplicationC26612x4766a891, c26641x1cdfa429)) {
                        f55561xc7bb2d31 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806(abstractApplicationC26612x4766a891, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a.C26620xbf4ae3ef(abstractApplicationC26612x4766a891));
                        f55564x3b9fd82 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26626x4b238806(abstractApplicationC26612x4766a891, "package", new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a.C26622xcc469e3e());
                        f55561xc7bb2d31.m104600x74ae259b();
                        f55564x3b9fd82.m104600x74ae259b();
                        if (android.os.Build.VERSION.SDK_INT < 27) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868 c26623x6fa72868 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868(m104562xc62e9d8a(abstractApplicationC26612x4766a891), new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3082x294b574a.C26621x3f3d93be(abstractApplicationC26612x4766a891));
                            f55563x3afc318c = c26623x6fa72868;
                            c26623x6fa72868.m104600x74ae259b();
                        } else {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e m104610xaf65a0fc = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.InstrumentationC26627xa7feb44e.m104610xaf65a0fc(abstractApplicationC26612x4766a891);
                            f55565x7c9f0b3b = m104610xaf65a0fc;
                            m104610xaf65a0fc.m104613x74ae259b();
                        }
                        f55562x362b2847 = true;
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "installed successfully.", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th6) {
                    m104564xdab628e2();
                    throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26619xea648531(th6);
                }
            }
        }
    }

    /* renamed from: uninstall */
    public static synchronized void m104564xdab628e2() {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26616xa188cbbe.class) {
            if (f55562x362b2847) {
                try {
                    f55561xc7bb2d31.m104601xdab628e2();
                    f55564x3b9fd82.m104601xdab628e2();
                    if (android.os.Build.VERSION.SDK_INT < 27) {
                        f55563x3afc318c.m104601xdab628e2();
                    } else {
                        f55565x7c9f0b3b.m104614xdab628e2();
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "exception when uninstall.", th6);
                }
                f55562x362b2847 = false;
            }
        }
    }
}
