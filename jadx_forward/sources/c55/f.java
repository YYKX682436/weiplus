package c55;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f120264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120267g;

    public f(android.widget.ProgressBar progressBar, com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f120264d = progressBar;
        this.f120265e = activityC19821xb90ad83a;
        this.f120266f = textView;
        this.f120267g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ProgressBar progressBar = this.f120264d;
        progressBar.setVisibility(0);
        nz5.b.a(false, false, null, "recovery-io", 0, new c55.e(this.f120265e, this.f120266f, this.f120267g, progressBar), 23, null);
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
