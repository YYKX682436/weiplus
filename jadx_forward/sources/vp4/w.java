package vp4;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f520611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vp4.b0 b0Var) {
        super(1);
        this.f520611d = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        vp4.b0 b0Var = this.f520611d;
        yz5.p pVar = b0Var.f520543j;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(intValue), b0Var.f520544k);
        }
        return jz5.f0.f384359a;
    }
}
