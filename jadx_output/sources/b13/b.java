package b13;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.a f17092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b13.a aVar) {
        super(2);
        this.f17092d = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(size, "size");
        c13.b0.f37860d.k(this.f17092d, size.getWidth(), size.getHeight(), intValue);
        return jz5.f0.f302826a;
    }
}
