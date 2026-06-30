package c55;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryToolsUI f38727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f38729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f38730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ProgressBar progressBar) {
        super(0);
        this.f38727d = recoveryToolsUI;
        this.f38728e = textView;
        this.f38729f = textView2;
        this.f38730g = progressBar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c55.d dVar;
        android.widget.TextView textView = this.f38729f;
        android.widget.TextView textView2 = this.f38728e;
        android.widget.ProgressBar progressBar = this.f38730g;
        com.tencent.mm.recovery.ui.RecoveryToolsUI recoveryToolsUI = this.f38727d;
        try {
            java.io.File a17 = p55.b.a((java.io.File) ((jz5.n) recoveryToolsUI.f192187d).getValue());
            if (a17 != null) {
                recoveryToolsUI.runOnUiThread(new c55.a(recoveryToolsUI, a17));
            }
            recoveryToolsUI.runOnUiThread(new c55.b(textView2, textView, a17, recoveryToolsUI));
            dVar = new c55.d(progressBar);
        } catch (java.lang.Throwable th6) {
            try {
                recoveryToolsUI.runOnUiThread(new c55.c(textView2, textView, recoveryToolsUI, jz5.a.b(th6)));
                dVar = new c55.d(progressBar);
            } catch (java.lang.Throwable th7) {
                recoveryToolsUI.runOnUiThread(new c55.d(progressBar));
                throw th7;
            }
        }
        recoveryToolsUI.runOnUiThread(dVar);
        return jz5.f0.f302826a;
    }
}
