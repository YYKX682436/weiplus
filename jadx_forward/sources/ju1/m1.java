package ju1;

/* loaded from: classes9.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.o1 f383297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f383298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383299c;

    public m1(ju1.o1 o1Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f383297a = o1Var;
        this.f383298b = o0Var;
        this.f383299c = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        ju1.o1 o1Var = this.f383297a;
        o1Var.f383286h.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        int i17 = fVar.f152148a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = o1Var.f383285g;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.fd0 fd0Var = (r45.fd0) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemberHistoryCardListViewModel", "do delete card, retCode: %s", java.lang.Integer.valueOf(fd0Var.f455753d));
            if (fd0Var.f455753d == 0) {
                j0Var.mo7808x76db6cb1(this.f383298b);
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = o1Var.f383284f;
                java.util.ArrayList arrayList = o1Var.f383320p;
                ju1.a aVar = this.f383299c;
                java.lang.Boolean valueOf = arrayList != null ? java.lang.Boolean.valueOf(arrayList.remove(aVar)) : null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(valueOf);
                sb6.append(", data type: ");
                sb6.append(aVar.f383221a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f383223c;
                sb6.append(ttVar != null ? ttVar.f468298d : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemberHistoryCardListViewModel", sb6.toString());
                j0Var2.mo7808x76db6cb1(arrayList);
                return jz5.f0.f384359a;
            }
            ret_msg = ((r45.fd0) fVar.f152151d).f455754e;
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
