package bg2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f101929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f101930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.a f101931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.a f101932g;

    public q0(bg2.x0 x0Var, dk2.zf zfVar, cg2.a aVar, wp.a aVar2) {
        this.f101929d = x0Var;
        this.f101930e = zfVar;
        this.f101931f = aVar;
        this.f101932g = aVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cg2.p bulletManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertDanmakuController$initView$1$1$3$onClickEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.x0 x0Var = this.f101929d;
        dk2.zf zfVar = this.f101930e;
        x0Var.Z6(zfVar);
        cg2.a aVar = this.f101931f;
        aVar.g(zfVar);
        cg2.k kVar = x0Var.f102149h;
        if (kVar != null && (bulletManager = kVar.getBulletManager()) != null) {
            bulletManager.a().f520385d.N1(this.f101932g, aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertDanmakuController$initView$1$1$3$onClickEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
