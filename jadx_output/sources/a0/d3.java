package a0;

/* loaded from: classes10.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(kotlinx.coroutines.y0 y0Var, boolean z17, a0.m3 m3Var) {
        super(2);
        this.f110d = y0Var;
        this.f111e = z17;
        this.f112f = m3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlinx.coroutines.l.d(this.f110d, null, null, new a0.c3(this.f111e, this.f112f, ((java.lang.Number) obj2).floatValue(), floatValue, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
