package cy2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c f306278d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c c15439x83466e9c) {
        this.f306278d = c15439x83466e9c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c c15439x83466e9c = this.f306278d;
        c15439x83466e9c.animate().alpha(0.0f).setDuration(300L).setListener(new cy2.d(c15439x83466e9c, view)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
