package bd4;

/* loaded from: classes4.dex */
public final class o0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout f19374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f19375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19376f;

    public o0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout, xc4.p pVar, int i17) {
        this.f19374d = improveInteractionLayout;
        this.f19375e = pVar;
        this.f19376f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p commentLongClickListener = this.f19374d.getCommentLongClickListener();
        if (commentLongClickListener != null) {
            kotlin.jvm.internal.o.d(view);
            java.lang.Object obj = this.f19375e.getCommentList().get(this.f19376f);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            commentLongClickListener.invoke(view, obj);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupSingleCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$2");
        return true;
    }
}
