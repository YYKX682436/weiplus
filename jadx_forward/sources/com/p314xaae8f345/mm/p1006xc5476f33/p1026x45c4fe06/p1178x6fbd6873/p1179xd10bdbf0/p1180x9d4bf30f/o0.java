package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class o0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.qk f169162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 f169163g;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var, int i17, android.view.View view, com.p314xaae8f345.mm.ui.qk qkVar) {
        this.f169163g = n0Var;
        this.f169160d = i17;
        this.f169161e = view;
        this.f169162f = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        synchronized (this.f169163g.f169141b) {
            this.f169163g.f169145f[this.f169160d] = this.f169161e.getRootWindowInsets();
            this.f169163g.f169144e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.e(windowInsets);
        }
        this.f169162f.d(this);
        return windowInsets;
    }
}
