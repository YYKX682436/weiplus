package b10;

/* loaded from: classes9.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b10.a f98551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.u8 f98552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f98553f;

    public c(b10.a aVar, bw5.u8 u8Var, bw5.x7 x7Var) {
        this.f98551d = aVar;
        this.f98552e = u8Var;
        this.f98553f = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardListController$bindOne$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ls lsVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ls) this.f98551d;
        lsVar.getClass();
        bw5.u8 shareObject = this.f98552e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        long j17 = shareObject.f115313n;
        int indexOf = lsVar.f286065a.indexOf(shareObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardWholeCtrl", "kf product item click, productId=" + j17 + ", viewIndex=" + indexOf);
        ((b00.a0) lsVar.f286066b).c("view_clk", lsVar.f286067c, "ecs_kf_card_template_product_item", indexOf);
        bw5.x7 x7Var = this.f98553f;
        if (x7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductCardWholeCtrl", "kf product item click: jumpInfo is null, productId=" + j17);
        } else {
            lsVar.f286068d.a(x7Var, lsVar.f286069e);
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardListController$bindOne$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
