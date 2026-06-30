package bs2;

/* loaded from: classes2.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.i2 f23825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ey2.i2 i2Var, bs2.n1 n1Var) {
        super(1);
        this.f23825d = i2Var;
        this.f23826e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject feed = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(feed, "feed");
        boolean O6 = this.f23825d.O6(feed.getId());
        if (O6) {
            com.tencent.mars.xlog.Log.i(this.f23826e.f23909c, "refreshFirstPage: remove read feed, id = ".concat(pm0.v.u(feed.getId())));
        }
        return java.lang.Boolean.valueOf(O6);
    }
}
