package az0;

/* loaded from: classes5.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(az0.f2 f2Var, java.util.List list) {
        super(1);
        this.f15654d = f2Var;
        this.f15655e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f15654d.f15461e.r(this.f15655e, null, new az0.k1(it));
        return jz5.f0.f302826a;
    }
}
