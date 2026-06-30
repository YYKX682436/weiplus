package aw2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aw2.n nVar) {
        super(1);
        this.f96255d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        aw2.n nVar = this.f96255d;
        if (booleanValue) {
            nVar.f96310e.d();
        } else {
            nVar.f96310e.f();
        }
        return jz5.f0.f384359a;
    }
}
