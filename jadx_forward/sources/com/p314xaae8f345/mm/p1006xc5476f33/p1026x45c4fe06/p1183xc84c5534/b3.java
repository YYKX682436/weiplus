package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3 f169345a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f169346b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.x2.f169960d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer[] f169347c = {1084, 1046, 1045};

    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3 b3Var) {
        b3Var.getClass();
        java.lang.Object mo141623x754a37bb = ((jz5.n) f169346b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3 b3Var, java.lang.String str) {
        b3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLaunchOpenSdkAdTracer", "reportKV key[18460] value[" + str + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18460, str);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = initConfig.f158831k2;
        java.lang.String str = c12566x87f2d8b7 != null ? c12566x87f2d8b7.f169667d : null;
        if (str == null || str.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.y2(str, initConfig), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc parcel, java.lang.String instanceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        if (parcel.f166444p == null) {
            java.lang.Integer[] numArr = f169347c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = parcel.f166443o;
            if (!kz5.z.G(numArr, c12559xbdae8559 != null ? java.lang.Integer.valueOf(c12559xbdae8559.f169323f) : null)) {
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.os.PersistableBundle persistableBundle = parcel.C;
        java.lang.String string = persistableBundle != null ? persistableBundle.getString("KEY_OPENSDK_AD_TRACE_KEY") : null;
        h0Var.f391656d = string;
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            android.os.PersistableBundle persistableBundle2 = parcel.f166453w;
            h0Var.f391656d = persistableBundle2 != null ? persistableBundle2.getString("adUxInfo") : null;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z2(instanceId, h0Var), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = initConfig.f158831k2;
        java.lang.String str = c12566x87f2d8b7 != null ? c12566x87f2d8b7.f169667d : null;
        if (str == null || str.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.a3(str, initConfig), "MicroMsg.WeAppLaunchOpenSdkAdTracer");
    }
}
