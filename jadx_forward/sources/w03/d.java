package w03;

/* loaded from: classes16.dex */
public final class d implements na5.b {

    /* renamed from: d, reason: collision with root package name */
    public final bj0.u f523411d;

    public d(bj0.u pageAnimObserver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAnimObserver, "pageAnimObserver");
        this.f523411d = pageAnimObserver;
    }

    @Override // na5.b
    /* renamed from: onPageEnterAnimBegin */
    public void mo81220x1a7a6dce() {
        this.f523411d.b();
    }

    @Override // na5.b
    /* renamed from: onPageEnterAnimEnd */
    public void mo68958x17bc8340() {
        this.f523411d.e();
    }

    @Override // na5.b
    /* renamed from: onPageExitAnimBegin */
    public void mo81221xf4beab2c() {
        this.f523411d.d();
    }

    @Override // na5.b
    /* renamed from: onPageExitAnimEnd */
    public void mo81222x460c801e() {
        this.f523411d.a();
    }

    @Override // na5.b
    /* renamed from: onPagePopEnterAnimBegin */
    public void mo81223x6668b263() {
        this.f523411d.h();
    }

    @Override // na5.b
    /* renamed from: onPagePopEnterAnimEnd */
    public void mo81224x3e2ce915() {
        this.f523411d.c();
    }

    @Override // na5.b
    /* renamed from: onPagePopExitAnimBegin */
    public void mo81225x9c5afff7() {
        this.f523411d.f();
    }

    @Override // na5.b
    /* renamed from: onPagePopExitAnimEnd */
    public void mo81226x15bd8ba9() {
        this.f523411d.g();
    }
}
