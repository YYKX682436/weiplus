package rx4;

/* loaded from: classes8.dex */
public final class c2 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f482655b;

    public c2(rx4.h2 h2Var, android.widget.ScrollView scrollView) {
        this.f482654a = h2Var;
        this.f482655b = scrollView;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        rx4.h2.U6(this.f482654a, this.f482655b);
        rx4.h2 h2Var = this.f482654a;
        if (h2Var.f482714w) {
            h2Var.f482714w = false;
            rx4.h2.r7(h2Var, vu4.a.L, "", "", false, null, 16, null);
        }
    }
}
