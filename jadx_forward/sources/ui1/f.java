package ui1;

/* loaded from: classes7.dex */
public class f extends ui1.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ui1.a0 f509580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ui1.t tVar, ui1.r rVar, ui1.a0 a0Var) {
        super(rVar);
        this.f509580b = a0Var;
    }

    @Override // ui1.q, ui1.r
    public void a() {
        super.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onConfirm " + d());
    }

    @Override // ui1.q, ui1.r
    public void c(int i17, java.lang.String str) {
        super.c(i17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onDeny errno[%d] errMsg[%s] %s", java.lang.Integer.valueOf(i17), str, d());
    }

    public final java.lang.String d() {
        ui1.a0 a0Var = this.f509580b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = a0Var.f509558a;
        return java.lang.String.format(java.util.Locale.ENGLISH, "component[%s %d], api[%s] callbackId[%d]", yVar.mo48798x74292566(), java.lang.Integer.valueOf(yVar.mo50260x9f1221c2()), a0Var.f509559b, java.lang.Integer.valueOf(a0Var.f509561d));
    }

    @Override // ui1.q, ui1.r
    /* renamed from: onCancel */
    public void mo32123x3d6f0539() {
        super.mo32123x3d6f0539();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onCancel " + d());
    }
}
