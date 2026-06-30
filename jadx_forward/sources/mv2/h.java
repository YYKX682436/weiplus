package mv2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.l f413105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f413106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mv2.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var) {
        super(1);
        this.f413105d = lVar;
        this.f413106e = yj0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        mv2.l lVar = mv2.l.f413130d;
        this.f413105d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPostCommentContentProgress ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f413106e;
        sb6.append(yj0Var.f68961xf609be94);
        sb6.append(' ');
        sb6.append(intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", sb6.toString());
        if (yj0Var.f68965x29d3a50c == 3) {
            yj0Var.f209932y1 = intValue;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().D0(yj0Var.f68959xf9a02e3e, yj0Var.t0(), yj0Var.f68961xf609be94, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.W, yj0Var);
        }
        return jz5.f0.f384359a;
    }
}
