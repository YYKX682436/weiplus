package fr5;

/* loaded from: classes15.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.q f347535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fr5.q qVar) {
        super(1);
        this.f347535d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        fr5.q qVar = this.f347535d;
        qVar.f347548f.setAlpha(a06.d.b(floatValue));
        qVar.f347543a.invalidate();
        return jz5.f0.f384359a;
    }
}
