package zj2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zj2.b f554819d;

    public a(zj2.b bVar) {
        this.f554819d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBannerWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ck2.o) this.f554819d.f554821b).f7(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBannerWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
