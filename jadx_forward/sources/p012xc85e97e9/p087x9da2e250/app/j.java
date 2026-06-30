package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.b3 f92895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f92897f;

    public j(p012xc85e97e9.p087x9da2e250.app.p pVar, p012xc85e97e9.p087x9da2e250.app.b3 b3Var, android.view.View view, android.graphics.Rect rect) {
        this.f92895d = b3Var;
        this.f92896e = view;
        this.f92897f = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92895d.i(this.f92896e, this.f92897f);
    }
}
