package fo0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f346334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fo0.f f346335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f346336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fo0.t f346337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f346338i;

    public d(int i17, android.view.View view, fo0.f fVar, boolean z17, fo0.t tVar, android.graphics.Point point) {
        this.f346333d = i17;
        this.f346334e = view;
        this.f346335f = fVar;
        this.f346336g = z17;
        this.f346337h = tVar;
        this.f346338i = point;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f346333d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f346334e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", valueOf, view);
        fo0.f fVar = this.f346335f;
        gp1.r rVar = fVar.f346340a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.I = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174578J = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.H = i17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.f174583h = view;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.F = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) rVar).f174665d.L = this.f346336g;
        fVar.f(this.f346337h);
        fVar.e(this.f346338i);
        fVar.f346340a.j();
    }
}
