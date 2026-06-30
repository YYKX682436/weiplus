package ju1;

/* loaded from: classes9.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.n0 f383291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f383292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383293c;

    public l0(ju1.n0 n0Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f383291a = n0Var;
        this.f383292b = o0Var;
        this.f383293c = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        ju1.n0 n0Var = this.f383291a;
        n0Var.f383286h.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        int i17 = fVar.f152148a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = n0Var.f383285g;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.uo5 uo5Var = (r45.uo5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card, retCode: %s", java.lang.Integer.valueOf(uo5Var.f469067d));
            if (uo5Var.f469067d == 0) {
                j0Var.mo7808x76db6cb1(this.f383292b);
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = n0Var.f383284f;
                java.util.ArrayList arrayList = n0Var.f383305p;
                ju1.a aVar = this.f383293c;
                java.lang.Boolean valueOf = arrayList != null ? java.lang.Boolean.valueOf(arrayList.remove(aVar)) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(valueOf);
                sb6.append(", data type: ");
                sb6.append(aVar.f383221a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f383223c;
                sb6.append(ttVar != null ? ttVar.f468298d : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", sb6.toString());
                j0Var2.mo7808x76db6cb1(arrayList);
                return jz5.f0.f384359a;
            }
            ret_msg = ((r45.uo5) fVar.f152151d).f469068e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ret_msg, "ret_msg");
        } else {
            ret_msg = "";
        }
        ju1.o0 o0Var = ju1.o0.f383313m;
        o0Var.f383315d = ret_msg;
        j0Var.mo7808x76db6cb1(o0Var);
        return jz5.f0.f384359a;
    }
}
