package x00;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t10.d f532503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t10.d dVar) {
        super(1);
        this.f532503d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        t10.d dVar = this.f532503d;
        if (booleanValue) {
            dVar.d(null);
        } else {
            dVar.c("user cancel");
        }
        return jz5.f0.f384359a;
    }
}
