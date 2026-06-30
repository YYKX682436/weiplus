package yw0;

/* loaded from: classes5.dex */
public final class l implements yw0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw0.n f548102a;

    public l(yw0.n nVar) {
        this.f548102a = nVar;
    }

    public void a() {
        this.f548102a.f548104a.invalidate();
    }

    public void b(java.lang.Integer num) {
        yw0.n nVar = this.f548102a;
        com.p314xaae8f345.mm.ui.kk.f(nVar.f548105b, num != null ? num.intValue() - nVar.f548105b.getHeight() : (int) nVar.f548107d);
        android.widget.TextView textView = nVar.f548105b;
        textView.setLayoutParams(textView.getLayoutParams());
    }

    public void c(java.lang.String text, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        yw0.n nVar = this.f548102a;
        nVar.f548105b.setVisibility(z17 ? 0 : 8);
        nVar.f548105b.setText(text);
    }
}
