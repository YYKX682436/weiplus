package bm2;

/* loaded from: classes3.dex */
public final class r3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f103806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f103807e;

    public r3(bm2.a4 a4Var, ce2.i iVar) {
        this.f103806d = a4Var;
        this.f103807e = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        tg2.h hVar = this.f103806d.f103301h;
        if (hVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            java.lang.String field_rewardProductId = this.f103807e.f67814x2c488eb6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
            hVar.c((android.view.ViewGroup) view, field_rewardProductId);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
