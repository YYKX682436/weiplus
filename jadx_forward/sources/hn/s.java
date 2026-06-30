package hn;

@j95.b
/* loaded from: classes4.dex */
public final class s extends i95.w implements vg3.k3, com.p314xaae8f345.mm.ui.da {
    public void Ai(android.content.Context context, vg3.i3 param, vg3.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRoomOpenService", "context is not MMActivity");
            return;
        }
        r45.lz lzVar = new r45.lz();
        lzVar.f461526d = param.f518245d;
        lzVar.f461529g = param.f518248g;
        lzVar.f461527e = param.f518246e;
        lzVar.f461528f = param.f518247f;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1023;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappbindchatroom";
        lVar.f152197a = lzVar;
        lVar.f152198b = new r45.mz();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pm0.v.X(new hn.j(h0Var, context));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new hn.n(param, activityC21401x6ce6f73f, context, h3Var, h0Var, this));
    }

    public void Bi(android.content.Context context, vg3.i3 param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        r45.pz pzVar = new r45.pz();
        pzVar.f465018d = param.f518245d;
        pzVar.f465021g = param.f518248g;
        pzVar.f465019e = param.f518246e;
        pzVar.f465020f = param.f518247f;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1969;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappjoinchatroom";
        lVar.f152197a = pzVar;
        lVar.f152198b = new r45.qz();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pm0.v.X(new hn.o(h0Var, context));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new hn.q(h0Var, context));
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
    }

    public void wi(android.content.Context context, vg3.i3 param, vg3.j3 j3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        r45.ca caVar = new r45.ca();
        caVar.f452921d = param.f518245d;
        caVar.f452922e = param.f518251m;
        caVar.f452923f = param.f518253o;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6892;
        lVar.f152199c = "/cgi-bin/micromsg-bin/appunbindchatroom";
        lVar.f152197a = caVar;
        lVar.f152198b = new r45.da();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pm0.v.X(new hn.g(h0Var, context));
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new hn.i(h0Var, param, context, j3Var));
    }
}
