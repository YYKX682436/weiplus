package g36;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f349723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g36.f fVar) {
        super(1);
        this.f349723d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Float f17 = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            f36.a aVar = this.f349723d.f349725b;
            int floatToIntBits = java.lang.Float.floatToIntBits(floatValue);
            aVar.d(floatToIntBits & 255);
            aVar.d((floatToIntBits >> 8) & 255);
            aVar.d((floatToIntBits >> 16) & 255);
            aVar.d((floatToIntBits >> 24) & 255);
        }
        return jz5.f0.f384359a;
    }
}
