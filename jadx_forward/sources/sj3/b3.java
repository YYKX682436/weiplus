package sj3;

/* loaded from: classes14.dex */
public final class b3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f489974d;

    public b3(sj3.g3 g3Var) {
        this.f489974d = g3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        uj3.b0 b0Var;
        uj3.a0 a0Var;
        java.lang.String str = (java.lang.String) obj;
        sj3.g3 g3Var = this.f489974d;
        wj3.a aVar = g3Var.f490072t;
        if (aVar != null && (b0Var = aVar.f528279e) != null && (a0Var = b0Var.f509753h) != null) {
            a0Var.e();
        }
        if (g3Var.f490070r.length() == 0) {
            ((android.widget.TextView) ((jz5.n) g3Var.f490068p).mo141623x754a37bb()).setText(str);
        }
    }
}
