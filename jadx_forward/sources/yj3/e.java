package yj3;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f544206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yj3.g gVar) {
        super(3);
        this.f544206d = gVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        data.position(0);
        yz5.q qVar = this.f544206d.f544215h;
        if (qVar != null) {
            qVar.mo147xb9724478(data, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f384359a;
    }
}
