package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class y implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase f91361d;

    public y(com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase, com.tencent.mm.plugin.appbrand.widget.input.autofill.t tVar) {
        this.f91361d = autoFillListPopupWindowBase;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase = this.f91361d;
        if (autoFillListPopupWindowBase.f91292d != null) {
            autoFillListPopupWindowBase.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 1) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase = this.f91361d;
            if (!(autoFillListPopupWindowBase.f91290b.getInputMethodMode() == 2) && autoFillListPopupWindowBase.f91290b.getContentView() != null) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = autoFillListPopupWindowBase.f91306r;
                com.tencent.mm.plugin.appbrand.widget.input.autofill.a0 a0Var = autoFillListPopupWindowBase.f91302n;
                n3Var.removeCallbacks(a0Var);
                a0Var.run();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
