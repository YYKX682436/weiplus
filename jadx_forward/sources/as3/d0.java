package as3;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac f95032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f95033e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f95032d = c16917xf24b9dac;
        this.f95033e = c22699x3dcdb352;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac = this.f95032d;
        boolean z17 = c16917xf24b9dac.isFold;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f95033e;
        if (z17) {
            c22699x3dcdb352.setScaleY(1.0f);
        } else {
            c22699x3dcdb352.setScaleY(-1.0f);
        }
        c16917xf24b9dac.m67715x764a3b83(!c16917xf24b9dac.isFold);
        as3.a0 presenter = c16917xf24b9dac.getPresenter();
        if (presenter != null && (lVar = presenter.f95021g) != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(c16917xf24b9dac.isFold));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac.a(c16917xf24b9dac, c16917xf24b9dac.isFold);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
