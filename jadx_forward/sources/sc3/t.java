package sc3;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sc3.k1 k1Var, int i17) {
        super(0);
        this.f488065d = k1Var;
        this.f488066e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc3.k1 k1Var = this.f488065d;
        java.lang.String str = k1Var.Q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy with ");
        int i17 = this.f488066e;
        sb6.append(i17);
        sb6.append(" localStatus:");
        sb6.append(k1Var.G);
        sb6.append(", need destroy ");
        sb6.append(k1Var.f488007J);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!k1Var.f488007J) {
            k1Var.f488007J = true;
            k1Var.v1();
            java.lang.String instanceName = k1Var.f488009e;
            yz5.l lVar = k1Var.f488012h;
            if (lVar != null) {
                lVar.mo146xb9724478(instanceName);
            }
            k1Var.uc();
            if (k1Var.f488018q != null) {
                if (k1Var.K0()) {
                    ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Bi((qk.u6) ((jz5.n) k1Var.H).mo141623x754a37bb());
                }
                k1Var.M0().O(new sc3.s(k1Var, i17));
                k1Var.M0().mo14659x5cd39ffa();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
                java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229373e;
                synchronized (set) {
                    set.remove(instanceName);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229372d = a5Var.a(set);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
