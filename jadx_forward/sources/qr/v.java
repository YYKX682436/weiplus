package qr;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr.x f447582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qr.x xVar) {
        super(1);
        this.f447582d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        qr.x xVar = this.f447582d;
        if (booleanValue) {
            xVar.a(0);
        } else {
            xVar.a(-1);
        }
        return jz5.f0.f384359a;
    }
}
