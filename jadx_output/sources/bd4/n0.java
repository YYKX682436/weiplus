package bd4;

/* loaded from: classes4.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout f19369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f19370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19371f;

    public n0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout, xc4.p pVar, int i17) {
        this.f19369d = improveInteractionLayout;
        this.f19370e = pVar;
        this.f19371f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p commentClickListener = this.f19369d.getCommentClickListener();
        if (commentClickListener != null) {
            kotlin.jvm.internal.o.d(view);
            java.lang.Object obj = this.f19370e.getCommentList().get(this.f19371f);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            commentClickListener.invoke(view, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$1");
    }
}
