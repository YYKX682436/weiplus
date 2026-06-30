package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z f148915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z zVar) {
        super(1);
        this.f148915d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        nm5.b wi6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var;
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((eb0.c) dVar).f332238b;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgByOtherAppUIC", "msgInfo is null, return");
            } else if (f9Var.n2() && (wi6 = ((ud5.e) ((fb0.i) i95.n0.c(fb0.i.class))).wi(f9Var)) != null) {
                java.lang.String str = (java.lang.String) wi6.a(0);
                java.lang.String str2 = (java.lang.String) wi6.a(1);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G0(str2)) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z zVar = this.f148915d;
                    em.a aVar = (em.a) ((jz5.n) zVar.f148917d).mo141623x754a37bb();
                    if (aVar.f335571c == null) {
                        aVar.f335571c = (android.widget.LinearLayout) aVar.f335569a.findViewById(com.p314xaae8f345.mm.R.id.unt);
                    }
                    aVar.f335571c.setVisibility(0);
                    if (zVar.f148918e == null && (k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class)) != null) {
                        zVar.f148918e = ((zh1.p) k5Var).Ui(state.f361553p, state.f361551n, null, state.f361552o);
                    }
                    zh1.w0 w0Var = zVar.f148918e;
                    if (w0Var != null) {
                        ((di1.f) w0Var).i(3L, null, null, 0L);
                    }
                    em.a aVar2 = (em.a) ((jz5.n) zVar.f148917d).mo141623x754a37bb();
                    if (aVar2.f335571c == null) {
                        aVar2.f335571c = (android.widget.LinearLayout) aVar2.f335569a.findViewById(com.p314xaae8f345.mm.R.id.unt);
                    }
                    aVar2.f335571c.setOnClickListener(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.w(zVar, str, str2));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
