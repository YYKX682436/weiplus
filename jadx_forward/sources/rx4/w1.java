package rx4;

/* loaded from: classes8.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f482854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f482855f;

    public w1(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f482853d = h2Var;
        this.f482854e = scrollView;
        this.f482855f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2.T6(this.f482853d, this.f482854e, this.f482855f);
    }
}
