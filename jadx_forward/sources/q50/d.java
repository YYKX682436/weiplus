package q50;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10608xcce92520 f441673d;

    public d(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10608xcce92520 activityC10608xcce92520) {
        this.f441673d = activityC10608xcce92520;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j75.f m67437x4bd5310 = this.f441673d.m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new wg5.d());
        }
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
