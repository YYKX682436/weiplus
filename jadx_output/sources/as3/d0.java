package as3;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f13500e;

    public d0(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f13499d = bizProfileTopicFlowView;
        this.f13500e = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView = this.f13499d;
        boolean z17 = bizProfileTopicFlowView.isFold;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f13500e;
        if (z17) {
            weImageView.setScaleY(1.0f);
        } else {
            weImageView.setScaleY(-1.0f);
        }
        bizProfileTopicFlowView.setFold(!bizProfileTopicFlowView.isFold);
        as3.a0 presenter = bizProfileTopicFlowView.getPresenter();
        if (presenter != null && (lVar = presenter.f13488g) != null) {
            lVar.invoke(java.lang.Boolean.valueOf(bizProfileTopicFlowView.isFold));
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView.a(bizProfileTopicFlowView, bizProfileTopicFlowView.isFold);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
