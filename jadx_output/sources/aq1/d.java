package aq1;

/* loaded from: classes11.dex */
public class d implements vg3.g3 {
    public final void a(r45.j4 j4Var, c01.ea eaVar, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        c01.d9.b().p().w(73729, 1);
        java.lang.String P0 = z3Var.P0();
        com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
        t8Var.field_content = x51.j1.g(j4Var.f377561h);
        t8Var.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
        t8Var.field_imgpath = "";
        t8Var.field_sayhicontent = j4Var.f377560g == 3 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h7b) : x51.j1.g(j4Var.f377561h);
        t8Var.field_sayhiuser = g17;
        t8Var.field_scene = 18;
        int i17 = j4Var.f377562i;
        t8Var.field_status = i17 > 3 ? i17 : 3;
        t8Var.field_svrid = j4Var.f377568r;
        t8Var.field_talker = P0;
        t8Var.field_type = j4Var.f377560g;
        t8Var.field_isSend = 0;
        t8Var.field_sayhiencryptuser = g17;
        t8Var.field_ticket = eaVar.f37150i;
        r21.w.Bi().insert(t8Var);
        com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent = new com.tencent.mm.autogen.events.LbsSayHiEvent();
        lbsSayHiEvent.f54464g.f7426a = g17;
        lbsSayHiEvent.e();
    }

    @Override // vg3.g3
    public void l(com.tencent.mm.modelbase.p0 p0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        r45.j4 j4Var = p0Var.f70726a;
        c01.ea w17 = c01.w9.w(j4Var.f377566p);
        if (w17 != null) {
            f9Var.p3(w17.f37147f);
            f9Var.o3(w17.f37148g);
            f9Var.a1(w17.f37146e);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", w17.f37146e);
            if (w17.f37150i == null || w17.f37151j != 1 || j4Var.f377560g == 10000) {
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) > 0) {
                a(j4Var, w17, n17);
                return;
            }
            ((c01.k7) c01.n8.a()).b(str, 10, new aq1.c(this, str, j4Var, w17));
        }
    }

    @Override // vg3.g3
    public void m(com.tencent.mm.modelbase.p0 p0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
    }
}
