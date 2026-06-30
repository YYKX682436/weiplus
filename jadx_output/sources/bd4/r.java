package bd4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19383d;

    public r(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19383d = improveContentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = this.f19383d;
        improveContentView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        android.content.Intent intent = new android.content.Intent();
        xc4.p pVar = improveContentView.f169131w;
        intent.putExtra("sns_text_show", (pVar == null || (h17 = pVar.h1()) == null) ? null : h17.ContentDesc);
        xc4.p pVar2 = improveContentView.f169131w;
        intent.putExtra("sns_local_id", pVar2 != null ? pVar2.W0() : null);
        intent.putExtra("sns_content_source", 1);
        intent.setClass(improveContentView.getContext(), com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.class);
        android.content.Context context = improveContentView.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView", "singleContentJumpUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView", "singleContentJumpUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$singleContentJumpUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
    }
}
