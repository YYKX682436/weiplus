package cj;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj.r f41837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cj.r rVar) {
        super(0);
        this.f41837d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.HandlerThread ht6 = (android.os.HandlerThread) ((jz5.n) this.f41837d.f41842e).getValue();
        kotlin.jvm.internal.o.f(ht6, "ht");
        return new android.os.Handler(ht6.getLooper());
    }
}
