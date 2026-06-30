package ij5;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f373348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ij5.d0 d0Var) {
        super(1);
        this.f373348d = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        ij5.d0 d0Var = this.f373348d;
        if (yVar != null) {
            if (!r26.n0.N(yVar.f527896c)) {
                j75.e eVar = yVar.f379600a;
                if (eVar != null && (eVar instanceof wi5.z)) {
                    wi5.z zVar = (wi5.z) eVar;
                    d0Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f527900b;
                    sb6.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = d0Var.f373295e;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    p13.u uVar = new p13.u();
                    uVar.f432674c = str;
                    uVar.f432683l = r13.a.f450134d;
                    uVar.f432673b = 32;
                    uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) d0Var.f373294d).mo141623x754a37bb();
                    uVar.f432684m = new ij5.v(d0Var, zVar, b17, 0, false, 12, null);
                    uVar.f432681j.addAll(state.f527853p);
                    uVar.f432687p = true;
                    p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", "startSearch " + sj6.hashCode());
                    arrayList.add(sj6);
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = d0Var.O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new ij5.b0(b17, hashMap, d0Var, zVar, null), 1, null);
                    }
                }
                ij5.d0.T6(d0Var).k().setVisibility(8);
                ij5.d0.T6(d0Var).h().setVisibility(0);
            } else {
                ij5.d0.T6(d0Var).k().setVisibility(0);
                ij5.d0.T6(d0Var).h().setVisibility(8);
                d0Var.U6();
                yVar.f527897d.mo152xb9724478();
            }
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f527888c)) {
                ij5.d0.T6(d0Var).k().setVisibility(8);
                ij5.d0.T6(d0Var).h().setVisibility(0);
            } else {
                ij5.d0.T6(d0Var).k().setVisibility(0);
                ij5.d0.T6(d0Var).h().setVisibility(8);
                d0Var.U6();
                wVar.f527889d.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
