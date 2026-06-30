package bm2;

/* loaded from: classes3.dex */
public final class s3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f22290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f22291e;

    public s3(bm2.a4 a4Var, ce2.i iVar) {
        this.f22290d = a4Var;
        this.f22291e = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        tg2.h hVar = this.f22290d.f21768h;
        if (hVar != null) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            java.lang.String field_rewardProductId = this.f22291e.field_rewardProductId;
            kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
            hVar.c((android.view.ViewGroup) view, field_rewardProductId);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
