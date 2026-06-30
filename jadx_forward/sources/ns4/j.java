package ns4;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421084d;

    public j(ns4.s sVar) {
        this.f421084d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.s sVar = this.f421084d;
        sVar.f421173e.P6();
        ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
        if (sVar.f421170b.f383084i != null) {
            sVar.f421180l = true;
            ns4.v vVar = sVar.f421172d;
            if (vVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("buyCoinView");
                throw null;
            }
            vVar.h();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = sVar.f421171c;
            if (y1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                throw null;
            }
            y1Var.q();
        }
        js4.j jVar = sVar.f421181m;
        if (jVar != null) {
            jVar.a(sVar, java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
