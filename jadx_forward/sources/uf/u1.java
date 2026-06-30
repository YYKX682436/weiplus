package uf;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.s1 f508643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf.v1 f508645f;

    public u1(uf.s1 s1Var, uf.c2 c2Var, uf.v1 v1Var) {
        this.f508643d = s1Var;
        this.f508644e = c2Var;
        this.f508645f = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.s1 s1Var = this.f508643d;
        s1Var.f508634e.setVisibility(8);
        android.widget.TextView textView = s1Var.f508633d;
        uf.c2 c2Var = this.f508644e;
        boolean a17 = uf.c2.a(c2Var);
        uf.v1 v1Var = this.f508645f;
        textView.setText(a17 ? v1Var.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571873s9) : c2Var.f508529f.f508517c.isEmpty() ? v1Var.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571871s7) : v1Var.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571870s6));
    }
}
