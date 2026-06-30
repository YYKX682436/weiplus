package bs2;

/* loaded from: classes2.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f23894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs2.p f23895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(bs2.n1 n1Var, java.util.LinkedList linkedList, cs2.p pVar) {
        super(0);
        this.f23893d = n1Var;
        this.f23894e = linkedList;
        this.f23895f = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f23893d.l(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f23894e.getFirst()).getFeedObject(), this.f23895f.f222092i2, "setCacheWithPreload");
        return jz5.f0.f302826a;
    }
}
