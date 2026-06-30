package oy2;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.i f431488d;

    public h(oy2.i iVar) {
        this.f431488d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5 c15501xbb059f5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) ((oy2.g) this.f431488d).c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca.d(c15501xbb059f5, c15501xbb059f5.peekHeight, false, 0, new oy2.a(c15501xbb059f5), 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
