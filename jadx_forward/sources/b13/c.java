package b13;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.a f98626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b13.a aVar) {
        super(2);
        this.f98626d = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        c13.b0.f119393d.k(this.f98626d, size.getWidth(), size.getHeight(), intValue);
        return jz5.f0.f384359a;
    }
}
