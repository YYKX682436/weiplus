package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1 f258331a = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f258332b = (lp0.b.h() + "voip") + "/Models";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f258333c = kz5.c1.k(new jz5.l(3, "cldnn_ns_16k.bin"), new jz5.l(4, "cldnn_ns_48k.bin"), new jz5.l(7, "rnnhowlsup_16k.bin"), new jz5.l(8, "cldnnhowlsup_16k.bin"), new jz5.l(9, "cldnnhowlsup_48k.bin"), new jz5.l(10, "channels_ns_16k.bin"), new jz5.l(11, "channels_ns_48k.bin"), new jz5.l(12, "tfunet_aec_16k.xnet"), new jz5.l(13, "cfn_ns_16k.xnet"), new jz5.l(14, "mcfusion_aec_16k.xnet"), new jz5.l(15, "mcfusion_aec_32k.xnet"), new jz5.l(16, "mcfusion_aec_16k_asr.xnet"));

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.VoipModelResMgr$checkResUpdateCacheFileEventListener$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.r2 r2Var = event.f135586g;
                if (r2Var.f89292a != 112 || !r2Var.f89296e) {
                    return false;
                }
                int i17 = r2Var.f89293b;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(r2Var.f89294c);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258331a;
                    s1Var.a();
                    java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258333c;
                    java.lang.String str2 = (java.lang.String) map.get(java.lang.Integer.valueOf(i17));
                    if (str2 != null) {
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258332b + '/' + str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", "Copying file: " + r2Var.f89294c + " to " + str3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", "Copy result: " + (com.p314xaae8f345.mm.vfs.w6.d(r2Var.f89294c, str3, false) > 0));
                    }
                    s1Var.a();
                    java.util.Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(112, intValue);
                        java.lang.String str4 = (java.lang.String) map.get(java.lang.Integer.valueOf(intValue));
                        if (str4 != null) {
                            java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.s1.f258332b + '/' + str4;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", "Copying model: " + Bi + " to " + str5);
                            long d17 = com.p314xaae8f345.mm.vfs.w6.d(Bi, str5, false);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Copy result: ");
                            sb6.append(d17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", sb6.toString());
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipModelResMgr", "file not exits: " + r2Var.f89294c);
                }
                return true;
            }
        };
    }

    public final void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipModelResMgr", "Directory creation result: " + com.p314xaae8f345.mm.vfs.w6.u(f258332b));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipModelResMgr", e17, "Failed to create model directory", new java.lang.Object[0]);
        }
    }

    public final void b(java.lang.StringBuilder stringBuilder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringBuilder, "stringBuilder");
        stringBuilder.append(f258332b);
    }

    public final void c(java.lang.StringBuilder stringBuilder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringBuilder, "stringBuilder");
        java.lang.String str = (java.lang.String) f258333c.get(java.lang.Integer.valueOf(i18));
        if (str == null) {
            stringBuilder.append(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(i17, i18));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.u1.f258339d;
        try {
            t1Var.a();
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.u1.f258340e + '/' + t1Var.b(t1Var.c(str)));
            if (p17 == null) {
                p17 = "";
            }
            if (p17.length() >= 7) {
                p17 = p17.substring(p17.length() - 7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "substring(...)");
            }
            stringBuilder.append(p17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoipModelUdrMgr", "Failed to get MD5 for ".concat(str), e17);
            stringBuilder.append("");
        }
    }
}
