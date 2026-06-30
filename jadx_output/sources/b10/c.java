package b10;

/* loaded from: classes9.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b10.a f17018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.u8 f17019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f17020f;

    public c(b10.a aVar, bw5.u8 u8Var, bw5.x7 x7Var) {
        this.f17018d = aVar;
        this.f17019e = u8Var;
        this.f17020f = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardListController$bindOne$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.ls lsVar = (com.tencent.mm.ui.chatting.viewitems.ls) this.f17018d;
        lsVar.getClass();
        bw5.u8 shareObject = this.f17019e;
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        long j17 = shareObject.f33780n;
        int indexOf = lsVar.f204532a.indexOf(shareObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardWholeCtrl", "kf product item click, productId=" + j17 + ", viewIndex=" + indexOf);
        ((b00.a0) lsVar.f204533b).c("view_clk", lsVar.f204534c, "ecs_kf_card_template_product_item", indexOf);
        bw5.x7 x7Var = this.f17020f;
        if (x7Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardWholeCtrl", "kf product item click: jumpInfo is null, productId=" + j17);
        } else {
            lsVar.f204535d.a(x7Var, lsVar.f204536e);
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardListController$bindOne$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
