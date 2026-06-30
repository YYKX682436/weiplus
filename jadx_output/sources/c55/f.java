package c55;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f38731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38734g;

    public f(android.widget.ProgressBar progressBar, com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f38731d = progressBar;
        this.f38732e = recoveryToolsUI;
        this.f38733f = textView;
        this.f38734g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ProgressBar progressBar = this.f38731d;
        progressBar.setVisibility(0);
        nz5.b.a(false, false, null, "recovery-io", 0, new c55.e(this.f38732e, this.f38733f, this.f38734g, progressBar), 23, null);
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
