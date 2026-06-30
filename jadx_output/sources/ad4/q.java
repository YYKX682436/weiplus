package ad4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f3197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3198e;

    public q(xc4.p pVar, int i17) {
        this.f3197d = pVar;
        this.f3198e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f3206d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        com.tencent.mm.autogen.events.SnsInputEvent snsInputEvent = new com.tencent.mm.autogen.events.SnsInputEvent();
        am.zv zvVar = snsInputEvent.f54817g;
        zvVar.f8609a = this.f3197d;
        zvVar.f8610b = this.f3198e;
        snsInputEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$2");
    }
}
