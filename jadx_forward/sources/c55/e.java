package c55;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f120263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ProgressBar progressBar) {
        super(0);
        this.f120260d = activityC19821xb90ad83a;
        this.f120261e = textView;
        this.f120262f = textView2;
        this.f120263g = progressBar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        c55.d dVar;
        android.widget.TextView textView = this.f120262f;
        android.widget.TextView textView2 = this.f120261e;
        android.widget.ProgressBar progressBar = this.f120263g;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120260d;
        try {
            java.io.File a17 = p55.b.a((java.io.File) ((jz5.n) activityC19821xb90ad83a.f273720d).mo141623x754a37bb());
            if (a17 != null) {
                activityC19821xb90ad83a.runOnUiThread(new c55.a(activityC19821xb90ad83a, a17));
            }
            activityC19821xb90ad83a.runOnUiThread(new c55.b(textView2, textView, a17, activityC19821xb90ad83a));
            dVar = new c55.d(progressBar);
        } catch (java.lang.Throwable th6) {
            try {
                activityC19821xb90ad83a.runOnUiThread(new c55.c(textView2, textView, activityC19821xb90ad83a, jz5.a.b(th6)));
                dVar = new c55.d(progressBar);
            } catch (java.lang.Throwable th7) {
                activityC19821xb90ad83a.runOnUiThread(new c55.d(progressBar));
                throw th7;
            }
        }
        activityC19821xb90ad83a.runOnUiThread(dVar);
        return jz5.f0.f384359a;
    }
}
