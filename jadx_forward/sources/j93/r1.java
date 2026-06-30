package j93;

/* loaded from: classes.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f380022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(j93.w1 w1Var) {
        super(1);
        this.f380022d = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        j93.w1 w1Var = this.f380022d;
        if (yVar != null) {
            if (!r26.n0.N(yVar.f527896c)) {
                j75.e eVar = yVar.f379600a;
                if (eVar != null && (eVar instanceof wi5.z)) {
                    wi5.z zVar = (wi5.z) eVar;
                    w1Var.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f527900b;
                    sb6.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = w1Var.f380061e;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    p13.u uVar = new p13.u();
                    uVar.f432673b = 16;
                    uVar.f432683l = r13.b.f450135d;
                    uVar.f432678g = new int[]{131072};
                    uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) w1Var.f380060d).mo141623x754a37bb();
                    uVar.f432684m = new j93.p1(w1Var, zVar, b17, 0, false, 12, null);
                    uVar.f432687p = true;
                    uVar.f432674c = str;
                    p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + sj6.hashCode());
                    arrayList.add(sj6);
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = w1Var.O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new j93.t1(b17, hashMap, w1Var, zVar, null), 1, null);
                    }
                }
                j93.w1.T6(w1Var).k().setVisibility(8);
                j93.w1.T6(w1Var).h().setVisibility(0);
            } else {
                j93.w1.T6(w1Var).k().setVisibility(0);
                j93.w1.T6(w1Var).h().setVisibility(8);
                w1Var.U6();
                yVar.f527897d.mo152xb9724478();
            }
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f527888c)) {
                j93.w1.T6(w1Var).k().setVisibility(8);
                j93.w1.T6(w1Var).h().setVisibility(0);
            } else {
                j93.w1.T6(w1Var).k().setVisibility(0);
                j93.w1.T6(w1Var).h().setVisibility(8);
                w1Var.U6();
                wVar.f527889d.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
