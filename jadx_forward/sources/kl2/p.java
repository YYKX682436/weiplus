package kl2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.q f390336d;

    public p(kl2.q qVar) {
        this.f390336d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeLicensePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.q qVar = this.f390336d;
        qVar.getClass();
        il2.s.f373619a.b(zl2.e5.f555282s, qVar.f390340n);
        ((il2.r) qVar.f390337h).n(new il2.a(3, qVar.f390341o, qVar.f390342p, new kl2.o(qVar)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeLicensePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
