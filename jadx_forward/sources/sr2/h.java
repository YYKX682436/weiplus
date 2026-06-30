package sr2;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f493106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sr2.o oVar) {
        super(1);
        this.f493106d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        sr2.o oVar = this.f493106d;
        y9.i iVar = oVar.f493184h;
        if (iVar != null) {
            iVar.hide();
        }
        android.app.ProgressDialog progressDialog = oVar.f493183g;
        if (progressDialog != null) {
            progressDialog.hide();
        }
        oVar.f493183g = null;
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            db5.e1.s(oVar.m80379x76847179(), oVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjz), "");
        }
        return jz5.f0.f384359a;
    }
}
