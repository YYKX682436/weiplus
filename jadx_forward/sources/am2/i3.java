package am2;

/* loaded from: classes3.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.i3 f90230d = new am2.i3();

    public i3() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5679xf8f87800>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.utils.fake.LiveConfigDebug$configEventListener$2$1
            {
                this.f39173x3fe91575 = -313050608;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5679xf8f87800 c5679xf8f87800) {
                dk2.g0 g0Var;
                mm2.x4 x4Var;
                df2.cy cyVar;
                df2.cy cyVar2;
                df2.cy cyVar3;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5679xf8f87800 event = c5679xf8f87800;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = null;
                am.vi viVar = event.f136005g;
                java.lang.Integer valueOf = viVar != null ? java.lang.Integer.valueOf(viVar.f89730a) : null;
                if (valueOf != null && valueOf.intValue() == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
                    if (c14197x319b1b9e != null && (cyVar3 = (df2.cy) c14197x319b1b9e.m56798x25fe639c(df2.cy.class)) != null) {
                        r45.u12 u12Var = new r45.u12();
                        u12Var.f468460d = 0;
                        u12Var.f468462f = "安全打击toast title";
                        u12Var.f468463g = "安全打击toast content";
                        u12Var.f468468o = "安全打击toast short_content";
                        u12Var.f468464h = "btn_title";
                        cyVar3.e7(u12Var);
                    }
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e2 = dk2.ef.f314904J;
                    if (c14197x319b1b9e2 != null && (cyVar2 = (df2.cy) c14197x319b1b9e2.m56798x25fe639c(df2.cy.class)) != null) {
                        cyVar2.a7();
                    }
                } else if (valueOf != null && valueOf.intValue() == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e3 = dk2.ef.f314904J;
                    if (c14197x319b1b9e3 != null && (cyVar = (df2.cy) c14197x319b1b9e3.m56798x25fe639c(df2.cy.class)) != null) {
                        cyVar.b7();
                    }
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e4 = dk2.ef.f314904J;
                    if (c14197x319b1b9e4 != null && (x4Var = (mm2.x4) c14197x319b1b9e4.m56796xbba4bfc0(mm2.x4.class)) != null) {
                        j2Var = x4Var.A;
                    }
                    if (j2Var != null) {
                        r45.nh1 nh1Var = new r45.nh1();
                        nh1Var.set(0, 2);
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(nh1Var);
                    }
                } else if (valueOf != null && valueOf.intValue() == 5 && (g0Var = dk2.ef.f314927l) != null) {
                    g0Var.g();
                }
                return true;
            }
        };
    }
}
