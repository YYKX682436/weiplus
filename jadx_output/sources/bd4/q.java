package bd4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19380d;

    public q(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19380d = improveContentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        this.f19380d.q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$2");
    }
}
