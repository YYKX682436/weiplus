package uf;

/* loaded from: classes7.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f508638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf.v1 f508639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f508640g;

    public t1(uf.c2 c2Var, int i17, uf.v1 v1Var, int i18) {
        this.f508637d = c2Var;
        this.f508638e = i17;
        this.f508639f = v1Var;
        this.f508640g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        uf.c2 c2Var = this.f508637d;
        if (c2Var.f508543w != null) {
            boolean z17 = !c2Var.f508529f.f508518d.isEmpty();
            int i17 = this.f508640g;
            uf.v1 v1Var = this.f508639f;
            int i18 = this.f508638e;
            if (!z17 || i18 > c2Var.f508529f.f508518d.size()) {
                uf.c2.b(c2Var, v1Var.x(i18).f353101a, i17);
            } else {
                uf.c2.b(c2Var, v1Var.x(i18).f353101a, i17);
            }
        }
    }
}
