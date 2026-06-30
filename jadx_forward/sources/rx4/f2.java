package rx4;

/* loaded from: classes8.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f482685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f482686f;

    public f2(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f482684d = h2Var;
        this.f482685e = scrollView;
        this.f482686f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2.T6(this.f482684d, this.f482685e, this.f482686f);
    }
}
