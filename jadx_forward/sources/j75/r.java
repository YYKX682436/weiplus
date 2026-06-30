package j75;

/* loaded from: classes10.dex */
public final class r extends p012xc85e97e9.p093xedfae76a.c1 implements j75.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f379619d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f379620e;

    /* renamed from: f, reason: collision with root package name */
    public j75.a f379621f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0 f379622g;

    /* renamed from: h, reason: collision with root package name */
    public final j75.o f379623h;

    public r(j75.a initState, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a lifecycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initState, "initState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        this.f379619d = lifecycleScope;
        java.lang.String str = "MicroMsg.State.StateCenter" + hashCode();
        this.f379620e = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init state center");
        this.f379621f = initState;
        this.f379622g = new com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0();
        this.f379623h = new j75.o(this);
    }

    @Override // j75.f
    public void B3(j75.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        action.toString();
        v65.i.b(this.f379619d, null, new j75.n(this, action, null), 1, null);
    }

    @Override // j75.f
    public void L2(p012xc85e97e9.p093xedfae76a.y owner, final yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f379623h.m127127x9d92d11c(owner, e75.g.f69659x9393ed43, new e75.a(observer) { // from class: j75.p

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f379617d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "function");
                this.f379617d = observer;
            }

            @Override // e75.a
            /* renamed from: onChanged */
            public final /* synthetic */ void mo2231x7bb163d5(java.lang.Object obj) {
                this.f379617d.mo146xb9724478(obj);
            }
        });
    }

    @Override // j75.f
    /* renamed from: getState */
    public j75.a mo140437x75286adb() {
        return this.f379621f;
    }

    @Override // j75.f
    public void m3(p012xc85e97e9.p093xedfae76a.y owner, e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f379623h.m127127x9d92d11c(owner, e75.g.f69659x9393ed43, observer);
    }

    @Override // j75.f
    public void x(p012xc85e97e9.p093xedfae76a.y owner, j75.c processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f379622g.b(owner, processor);
    }

    @Override // j75.f
    public void z3(p012xc85e97e9.p093xedfae76a.y owner, final yz5.l processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f379622g.b(owner, new j75.c(processor) { // from class: j75.q

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f379618d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "function");
                this.f379618d = processor;
            }

            @Override // j75.c
            public final /* synthetic */ void a(j75.a aVar) {
                this.f379618d.mo146xb9724478(aVar);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(j75.a initState, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        this(initState, new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("UIStateCenter.LifecycleScope", lifecycleOwner, 0, 4, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initState, "initState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
    }
}
