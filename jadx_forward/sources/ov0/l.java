package ov0;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f430672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ov0.t tVar) {
        super(1);
        this.f430672d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f430672d.m157196xda5977e().setTranslationY(-(r0.m47106xf8568a6b() * floatValue));
        return jz5.f0.f384359a;
    }
}
