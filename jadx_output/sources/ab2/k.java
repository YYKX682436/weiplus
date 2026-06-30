package ab2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment f2781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment, int i17) {
        super(1);
        this.f2781d = finderBizProfileFragment;
        this.f2782e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment = this.f2781d;
        kotlinx.coroutines.l.d(v65.m.b(finderBizProfileFragment.y0()), null, null, new ab2.j(it, finderBizProfileFragment, this.f2782e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
