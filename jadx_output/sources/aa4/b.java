package aa4;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout f2637d;

    public b(com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout) {
        this.f2637d = snsCoverContainerLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$replaceBackView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout$replaceBackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a coverClickListener = this.f2637d.getCoverClickListener();
        if (coverClickListener != null) {
            coverClickListener.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout$replaceBackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$replaceBackView$1");
    }
}
