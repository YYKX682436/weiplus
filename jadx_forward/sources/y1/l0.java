package y1;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final y1.l0 f540302d = new y1.l0();

    public l0() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        jz5.b bVar;
        y1.a aVar = (y1.a) obj;
        y1.a childValue = (y1.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childValue, "childValue");
        if (aVar == null || (str = aVar.f540225a) == null) {
            str = childValue.f540225a;
        }
        if (aVar == null || (bVar = aVar.f540226b) == null) {
            bVar = childValue.f540226b;
        }
        return new y1.a(str, bVar);
    }
}
