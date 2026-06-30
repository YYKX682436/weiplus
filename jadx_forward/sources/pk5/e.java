package pk5;

/* loaded from: classes14.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f438081d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f438082e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f438083f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f438084g;

    public e(p012xc85e97e9.p093xedfae76a.o fragmentLifeCycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentLifeCycle, "fragmentLifeCycle");
        this.f438081d = fragmentLifeCycle;
        this.f438082e = true;
        this.f438083f = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f438084g = jz5.h.b(new pk5.b(this));
        fragmentLifeCycle.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.ui.vas.fragment.VASFragmentLifeCycle$lifecycleObserver$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onCreate */
            public void mo7794x3e5a77bb(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e.this.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e eVar = pk5.e.this;
                eVar.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
                eVar.f438081d.c(this);
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onPause */
            public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e.this.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onResume */
            public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e.this.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onStart */
            public void mo7797xb05099c3(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e eVar = pk5.e.this;
                eVar.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
                if (eVar.f438082e) {
                    ((jz5.n) eVar.f438084g).mo141623x754a37bb();
                }
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onStop */
            public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                pk5.e.this.f438083f.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
            }
        });
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f438083f;
    }
}
