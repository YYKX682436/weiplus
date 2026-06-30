package uf5;

/* loaded from: classes4.dex */
public class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf5.p0 f508812e;

    public o0(uf5.p0 p0Var, java.lang.String str) {
        this.f508812e = p0Var;
        this.f508811d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f508811d);
        intent.putExtra("view_mode", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, this.f508812e.f508815d.mo55332x76847179());
    }
}
