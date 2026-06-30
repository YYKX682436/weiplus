package kk5;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.c0 f390147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kk5.c0 c0Var) {
        super(1);
        this.f390147d = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        j75.f m67437x4bd5310;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wi5.c) state.a(wi5.c.class)) != null) {
            java.util.HashSet hashSet = new java.util.HashSet(wi5.p0.f527866a.b(state.f527852o, state.f527851n, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "ClickConfirmMenuAction: " + hashSet);
            int size = hashSet.size();
            kk5.c0 c0Var = this.f390147d;
            if (size > 1) {
                p13.c cVar = c0Var.f390158f;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
                    c0Var.f390158f = null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(hashSet);
                p13.u uVar = new p13.u();
                ((java.util.ArrayList) uVar.f432688q).addAll(hashSet);
                uVar.f432673b = 8;
                uVar.f432683l = r13.b.f450135d;
                uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) c0Var.f390156d).mo141623x754a37bb();
                uVar.f432687p = true;
                uVar.f432684m = new kk5.x(c0Var, new kk5.y(c0Var, arrayList));
                c0Var.f390157e = db5.e1.Q(c0Var.m80379x76847179(), c0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574282hq2), true, true, null);
                c0Var.f390158f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
            } else if (hashSet.size() == 1) {
                java.lang.String str = (java.lang.String) kz5.n0.W(hashSet);
                if (str != null && (P6 = c0Var.P6()) != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
                    m67437x4bd5310.B3(new wi5.j(str, true, 0L));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactCreateChatroomCheckDupUIC", "on ClickConfirmMenuAction: memberSet is empty");
            }
        }
        return jz5.f0.f384359a;
    }
}
