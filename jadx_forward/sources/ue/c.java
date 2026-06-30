package ue;

/* loaded from: classes7.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f508299a;

    public c(cl.j1 j1Var) {
        this.f508299a = j1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        cl.j1 j1Var = this.f508299a;
        if (j1Var != null) {
            j1Var.a(str, new cl.k1());
        }
    }
}
