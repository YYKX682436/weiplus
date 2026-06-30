package bg2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f20397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.a f20398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.a f20399g;

    public q0(bg2.x0 x0Var, dk2.zf zfVar, cg2.a aVar, wp.a aVar2) {
        this.f20396d = x0Var;
        this.f20397e = zfVar;
        this.f20398f = aVar;
        this.f20399g = aVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cg2.p bulletManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertDanmakuController$initView$1$1$3$onClickEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.x0 x0Var = this.f20396d;
        dk2.zf zfVar = this.f20397e;
        x0Var.Z6(zfVar);
        cg2.a aVar = this.f20398f;
        aVar.g(zfVar);
        cg2.k kVar = x0Var.f20616h;
        if (kVar != null && (bulletManager = kVar.getBulletManager()) != null) {
            bulletManager.a().f438852d.N1(this.f20399g, aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertDanmakuController$initView$1$1$3$onClickEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
