package p05;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.k2 f432100a = new p05.k2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f432101b = (lp0.b.h() + "voip") + "/Models";

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19565x75d0d968 f432102c = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19565x75d0d968();

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f432103d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f432104e;

    /* renamed from: f, reason: collision with root package name */
    public static int f432105f;

    static {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        f432103d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f432104e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.xlabeffect.WaveVideoModelResMgr$checkResUpdateCacheFileEventListener$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.r2 r2Var = event.f135586g;
                int i17 = r2Var.f89292a;
                boolean z17 = r2Var.f89296e;
                if (i17 != 188 || !z17) {
                    return false;
                }
                int i18 = r2Var.f89293b;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r2Var.f89294c);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    p05.k2.f432100a.d(r2Var.f89294c, i18);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WaveVideoModelResMgr", "file not exits :%s", r2Var.f89294c);
                }
                return true;
            }
        };
    }

    public final java.lang.String a(int i17) {
        java.lang.String str = f432101b;
        if (i17 == 1) {
            return str + "/roi_facetext.xnet";
        }
        if (i17 == 2) {
            return str + "/roi_saliencymap.xnet";
        }
        if (i17 == 3) {
            return str + "/finder_sr.xnet";
        }
        if (i17 == 6) {
            return str + "/RaisrFilterbankCoefficients.bin";
        }
        if (i17 == 7) {
            return str + "/roi_c2c_face.xnet";
        }
        if (i17 != 8) {
            return null;
        }
        return str + "/RaisrLiteFilterbankCoefficients.bin";
    }

    public final java.lang.String b(int i17) {
        java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(188, i17);
        java.lang.Integer valueOf = Ni != null ? java.lang.Integer.valueOf(Ni.length()) : null;
        if (valueOf == null || !new e06.k(7, 256).m(valueOf.intValue())) {
            return "md5invalid";
        }
        java.lang.String substring = Ni.substring(valueOf.intValue() - 7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    public final void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WaveVideoModelResMgr", "prepareConfig subtype=" + i17 + " exptSwitch=" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19565x75d0d968 c19565x75d0d968 = f432102c;
        if (i17 == 1) {
            c19565x75d0d968.m75022xfca9ce0d(1, i18);
        } else {
            if (i17 != 2) {
                return;
            }
            c19565x75d0d968.m75022xfca9ce0d(2, i18);
        }
    }

    public final boolean d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f432101b);
        if (!r6Var.m()) {
            try {
                r6Var.J();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WaveVideoModelResMgr", e17, "create modelPathDir failed:%s", r6Var);
                return false;
            }
        }
        java.lang.String a17 = a(i17);
        if (a17 != null && str != null) {
            r3 = com.p314xaae8f345.mm.vfs.w6.d(str, a17, false) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WaveVideoModelResMgr", "saveModelToModelRoot: from " + str + " to " + a17 + " results: " + r3);
        }
        return r3;
    }
}
