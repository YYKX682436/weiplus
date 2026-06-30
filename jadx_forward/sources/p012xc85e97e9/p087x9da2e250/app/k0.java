package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class k0 extends p012xc85e97e9.p087x9da2e250.app.v0 implements p012xc85e97e9.p093xedfae76a.m1, p012xc85e97e9.p013x9d4bf30f.k, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i, p012xc85e97e9.p087x9da2e250.app.x1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f92905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        super(activityC1102x9ee2d9f, activityC1102x9ee2d9f, new android.os.Handler(), 0);
        this.f92905h = activityC1102x9ee2d9f;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.x1
    public void a(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f92905h.m7598x140dc774(componentCallbacksC1101xa17d4670);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public android.view.View b(int i17) {
        return this.f92905h.findViewById(i17);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public boolean c() {
        android.view.Window window = this.f92905h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.f92905h.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public java.lang.Object e() {
        return this.f92905h;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public android.view.LayoutInflater f() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f92905h;
        return activityC1102x9ee2d9f.getLayoutInflater().cloneInContext(activityC1102x9ee2d9f);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.i
    /* renamed from: getActivityResultRegistry */
    public p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h mo2507xfe541f5f() {
        return this.f92905h.mo2507xfe541f5f();
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f92905h.f3469xd3477d6a;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.k
    /* renamed from: getOnBackPressedDispatcher */
    public p012xc85e97e9.p013x9d4bf30f.i mo2510x96a7816d() {
        return this.f92905h.mo2510x96a7816d();
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f92905h.getViewModel();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public boolean h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        return !this.f92905h.isFinishing();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public boolean i(java.lang.String str) {
        return z2.h.b(this.f92905h, str);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void l() {
        this.f92905h.mo2548x55429c53();
    }
}
