package j75;

/* loaded from: classes10.dex */
public final class k implements j75.f {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f379606d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f379607e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b f379608f;

    /* renamed from: g, reason: collision with root package name */
    public j75.a f379609g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0 f379610h;

    /* renamed from: i, reason: collision with root package name */
    public final j75.h f379611i;

    public k(j75.a initState, p012xc85e97e9.p093xedfae76a.y lifecycleOwner, java.lang.String logTag, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b lifecycleScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initState, "initState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logTag, "logTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        this.f379606d = lifecycleOwner;
        this.f379607e = logTag;
        this.f379608f = lifecycleScope;
        this.f379609g = initState;
        this.f379610h = new com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0();
        this.f379611i = new j75.h(this);
    }

    @Override // j75.f
    public void B3(j75.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        action.toString();
        v65.i.b(this.f379608f, null, new j75.g(this, action, null), 1, null);
    }

    @Override // j75.f
    public void L2(p012xc85e97e9.p093xedfae76a.y owner, final yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f379611i.m127126x9d92d11c(owner, new e75.a(observer) { // from class: j75.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f379604d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "function");
                this.f379604d = observer;
            }

            @Override // e75.a
            /* renamed from: onChanged */
            public final /* synthetic */ void mo2231x7bb163d5(java.lang.Object obj) {
                this.f379604d.mo146xb9724478(obj);
            }
        });
    }

    @Override // j75.f
    /* renamed from: getState */
    public j75.a mo140437x75286adb() {
        return this.f379609g;
    }

    @Override // j75.f
    public void m3(p012xc85e97e9.p093xedfae76a.y owner, e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f379611i.m127126x9d92d11c(owner, observer);
    }

    @Override // j75.f
    public void x(p012xc85e97e9.p093xedfae76a.y owner, j75.c processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f379610h.b(owner, processor);
    }

    @Override // j75.f
    public void z3(p012xc85e97e9.p093xedfae76a.y owner, final yz5.l processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f379610h.b(owner, new j75.c(processor) { // from class: j75.j

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f379605d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "function");
                this.f379605d = processor;
            }

            @Override // j75.c
            public final /* synthetic */ void a(j75.a aVar) {
                this.f379605d.mo146xb9724478(aVar);
            }
        });
    }

    public /* synthetic */ k(j75.a aVar, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String str, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b c20977x242e434b, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(aVar, yVar, (i17 & 4) != 0 ? "MicroMsg.State.StateCenter" : str, (i17 & 8) != 0 ? new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b("ServiceStateCenter.LifecycleScope", yVar) : c20977x242e434b);
    }
}
