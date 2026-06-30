package hr3;

/* loaded from: classes11.dex */
public class ia implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f365185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365187f;

    public ia(hr3.va vaVar, android.app.ProgressDialog progressDialog, java.lang.String str) {
        this.f365187f = vaVar;
        this.f365185d = progressDialog;
        this.f365186e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        hr3.va vaVar = this.f365187f;
        g0Var.d(14553, 2, 3, vaVar.f365642e.L.d1());
        this.f365185d.show();
        vaVar.f365641d = false;
        vaVar.d(this.f365186e);
    }
}
