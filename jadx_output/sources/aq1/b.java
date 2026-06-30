package aq1;

/* loaded from: classes12.dex */
public class b implements en1.j {
    @Override // en1.j
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        r45.sr6 sr6Var = vgVar.f343015a;
        if ((sr6Var.f385951d & 2) != 0) {
            r45.i1 i1Var = sr6Var.f385953f;
            if (!z17) {
                c01.d9.b().b(i1Var.f376645n);
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, true));
            if (i1Var.f376640f != 0) {
                ((com.tencent.mm.storage.ka) c01.d9.b().y()).y0(i1Var.f376640f + "@qqim", 3);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i1Var.f376640f, 3);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
        }
        if (z17) {
            com.tencent.mm.autogen.events.GetCardCountEvent getCardCountEvent = new com.tencent.mm.autogen.events.GetCardCountEvent();
            getCardCountEvent.f54382g.f7031a = false;
            getCardCountEvent.e();
        } else {
            gm0.j1.e().j(new aq1.a(this));
        }
        com.tencent.mm.plugin.report.service.b1.f(2, 8);
    }

    @Override // en1.j
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String r17 = c01.z1.r();
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, true));
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i17, 3);
        ((com.tencent.mm.storage.ka) c01.d9.b().y()).y0(ciVar.f342914a.f392394h, 2);
        if (i17 != 0) {
            ((com.tencent.mm.storage.ka) c01.d9.b().y()).y0(i17 + "@qqim", 3);
        }
    }
}
