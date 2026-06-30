package os3;

/* loaded from: classes8.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f429592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.e4 f429593e;

    public d4(os3.e4 e4Var, android.os.Bundle bundle) {
        this.f429593e = e4Var;
        this.f429592d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.e4 e4Var = this.f429593e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = e4Var.f429603d;
        android.os.Bundle bundle = this.f429592d;
        viewOnCreateContextMenuListenerC16941x4db497e1.F = bundle.getInt("download_status");
        float f17 = bundle.getFloat("download_progress");
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e12 = e4Var.f429603d;
        android.view.View view = viewOnCreateContextMenuListenerC16941x4db497e12.f236474w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        int i17 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (f17 == 1.0f) {
            viewOnCreateContextMenuListenerC16941x4db497e12.M.d();
            viewOnCreateContextMenuListenerC16941x4db497e12.V6();
            return;
        }
        viewOnCreateContextMenuListenerC16941x4db497e12.W6();
        int i18 = viewOnCreateContextMenuListenerC16941x4db497e12.H;
        if (i18 == 0) {
            viewOnCreateContextMenuListenerC16941x4db497e12.H = viewOnCreateContextMenuListenerC16941x4db497e12.f236474w.getWidth();
        } else {
            i17 = (int) (f17 * i18);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) viewOnCreateContextMenuListenerC16941x4db497e12.f236475x.getLayoutParams();
        layoutParams.width = i17;
        viewOnCreateContextMenuListenerC16941x4db497e12.f236475x.setLayoutParams(layoutParams);
        viewOnCreateContextMenuListenerC16941x4db497e12.M.c(500L, 500L);
    }
}
