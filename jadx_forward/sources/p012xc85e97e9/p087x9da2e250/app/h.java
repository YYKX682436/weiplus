package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class h implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f92855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f92856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.m f92857c;

    public h(p012xc85e97e9.p087x9da2e250.app.p pVar, android.view.View view, android.view.ViewGroup viewGroup, p012xc85e97e9.p087x9da2e250.app.m mVar) {
        this.f92855a = view;
        this.f92856b = viewGroup;
        this.f92857c = mVar;
    }

    @Override // j3.g
    /* renamed from: onCancel */
    public void mo7740x3d6f0539() {
        android.view.View view = this.f92855a;
        view.clearAnimation();
        this.f92856b.endViewTransition(view);
        this.f92857c.a();
    }
}
