package za3;

/* loaded from: classes3.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16284xdd776c9c f552502d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16284xdd776c9c c16284xdd776c9c) {
        this.f552502d = c16284xdd776c9c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16284xdd776c9c c16284xdd776c9c = this.f552502d;
        intent.putExtra("rawUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16284xdd776c9c.f226160f) ? c16284xdd776c9c.f226159e : c16284xdd776c9c.f226160f);
        intent.putExtra("showShare", false);
        j45.l.u(c16284xdd776c9c.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
