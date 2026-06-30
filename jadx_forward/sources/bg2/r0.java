package bg2;

/* loaded from: classes3.dex */
public final class r0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.a f101972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f101973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.i f101974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f101975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f101976h;

    public r0(cg2.a aVar, wp.a aVar2, wp.i iVar, dk2.zf zfVar, bg2.x0 x0Var) {
        this.f101972d = aVar;
        this.f101973e = aVar2;
        this.f101974f = iVar;
        this.f101975g = zfVar;
        this.f101976h = x0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cg2.p bulletManager;
        this.f101972d.f122601d.setBackground(null);
        this.f101973e.f529886x = true;
        this.f101974f.f529880r = false;
        this.f101972d.g(this.f101975g);
        cg2.k kVar = this.f101976h.f102149h;
        if (kVar == null || (bulletManager = kVar.getBulletManager()) == null) {
            return;
        }
        bulletManager.a().f520385d.N1(this.f101973e, this.f101972d);
    }
}
