package be1;

/* loaded from: classes7.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17) {
        super(2);
        this.f101028d = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        outRes.put("locationEnabled", java.lang.Boolean.valueOf(!this.f101028d ? !(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()) : !(be1.f0.f101000n.get() || be1.f0.f101001o.get())));
        return jz5.f0.f384359a;
    }
}
