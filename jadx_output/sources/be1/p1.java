package be1;

/* loaded from: classes7.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17) {
        super(2);
        this.f19495d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        outRes.put("locationEnabled", java.lang.Boolean.valueOf(!this.f19495d ? !(com.tencent.mm.sdk.platformtools.n2.a() || com.tencent.mm.sdk.platformtools.n2.b()) : !(be1.f0.f19467n.get() || be1.f0.f19468o.get())));
        return jz5.f0.f302826a;
    }
}
