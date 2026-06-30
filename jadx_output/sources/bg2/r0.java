package bg2;

/* loaded from: classes3.dex */
public final class r0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cg2.a f20439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f20440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.i f20441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f20442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20443h;

    public r0(cg2.a aVar, wp.a aVar2, wp.i iVar, dk2.zf zfVar, bg2.x0 x0Var) {
        this.f20439d = aVar;
        this.f20440e = aVar2;
        this.f20441f = iVar;
        this.f20442g = zfVar;
        this.f20443h = x0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cg2.p bulletManager;
        this.f20439d.f41068d.setBackground(null);
        this.f20440e.f448353x = true;
        this.f20441f.f448347r = false;
        this.f20439d.g(this.f20442g);
        cg2.k kVar = this.f20443h.f20616h;
        if (kVar == null || (bulletManager = kVar.getBulletManager()) == null) {
            return;
        }
        bulletManager.a().f438852d.N1(this.f20440e, this.f20439d);
    }
}
