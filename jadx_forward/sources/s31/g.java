package s31;

/* loaded from: classes5.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.FrameLayout f483985a;

    /* renamed from: b, reason: collision with root package name */
    public s31.h f483986b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f483985a == null) {
            this.f483985a = new android.widget.FrameLayout(context);
        }
        android.widget.FrameLayout frameLayout = this.f483985a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        return frameLayout;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        this.f483986b = (s31.h) pVar;
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f483986b;
    }
}
