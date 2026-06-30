package bd4;

/* loaded from: classes4.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView f19378d;

    public p(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView) {
        this.f19378d = improveContentView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f19378d.getContentTv().performLongClick();
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
        return false;
    }
}
