package qn2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qn2.n nVar, boolean z17) {
        super(0);
        this.f446617d = nVar;
        this.f446618e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ht1 ht1Var;
        r45.jz1 jz1Var;
        java.util.LinkedList m75941xfb821914;
        qn2.n nVar = this.f446617d;
        java.lang.String str = nVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load more winner finish,success:");
        boolean z17 = this.f446618e;
        sb6.append(z17);
        sb6.append(",product size:");
        r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
        sb6.append((ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.m75936x14adae67(4)) == null || (m75941xfb821914 = jz1Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (z17 && (ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f428627o) != null) {
            nVar.C1(ht1Var);
        }
        return jz5.f0.f384359a;
    }
}
