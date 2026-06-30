package bm2;

/* loaded from: classes3.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f22348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(bm2.n5 n5Var) {
        super(1);
        this.f22348d = n5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bm2.m4 it = (bm2.m4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f22102b == this.f22348d.f22156v);
    }
}
