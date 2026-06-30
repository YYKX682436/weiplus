package vp4;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f520517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar) {
        super(1);
        this.f520517d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.p pVar = this.f520517d;
        if (booleanValue) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, 4);
        } else {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, 1012);
        }
        return jz5.f0.f384359a;
    }
}
