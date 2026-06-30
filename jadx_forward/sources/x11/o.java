package x11;

/* loaded from: classes12.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f532914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x11.t tVar) {
        super(1);
        this.f532914d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        x11.t tVar = this.f532914d;
        tVar.f532930n += intValue;
        tVar.f532926g = true;
        return jz5.f0.f384359a;
    }
}
