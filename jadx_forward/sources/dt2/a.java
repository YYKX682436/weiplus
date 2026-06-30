package dt2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.d f324690d;

    public a(dt2.d dVar) {
        this.f324690d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dt2.d dVar = this.f324690d;
        dt2.d.a(dVar, false, dVar.f324698e, dVar.m126194x74e7fabc());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 m126190xb4dbbcbe = dVar.m126190xb4dbbcbe();
        if (m126190xb4dbbcbe != null) {
            m126190xb4dbbcbe.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
