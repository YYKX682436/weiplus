package zs5;

/* loaded from: classes15.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 f557008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs5.y f557009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 e1Var, zs5.y yVar) {
        super(0);
        this.f557008d = e1Var;
        this.f557009e = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e1 e1Var = this.f557008d;
        if (e1Var != null) {
            bundle.putFloat("param_zoom_ratio", e1Var.f298535d);
            zs5.y yVar = this.f557009e;
            at5.b bVar = yVar.f557056x;
            if (bVar != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = yVar.f557041i;
                bVar.a(d1Var != null ? d1Var.f298518d : 0L, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
