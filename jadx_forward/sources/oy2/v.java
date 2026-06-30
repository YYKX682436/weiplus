package oy2;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.a0 f431537d;

    public v(oy2.a0 a0Var) {
        this.f431537d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oy2.a0 a0Var = this.f431537d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = a0Var.f431480l;
        if (abstractC15503x81b4b9ca instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) abstractC15503x81b4b9ca).m();
        } else {
            a0Var.f431469a.a().dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
