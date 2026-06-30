package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class j1 extends com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f148965m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f148966n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f148967o;

    /* JADX WARN: Multi-variable type inference failed */
    public j1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 c(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        jz5.g gVar = this.f148966n;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) gVar).mo141623x754a37bb()).mo40960xab2f7f06() || ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148967o).mo141623x754a37bb()).mo40960xab2f7f06()) {
            return new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(2, source, ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) gVar).mo141623x754a37bb()).mo40960xab2f7f06() ? "fg" : "idle-charging");
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(1, source, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public java.util.List d() {
        return this.f148965m;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public void h() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148966n).mo141623x754a37bb()).mo40970xb5bdeb7a(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148967o).mo141623x754a37bb()).mo40970xb5bdeb7a(this);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public void k() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148966n).mo141623x754a37bb()).mo40966xc74540ab(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148967o).mo141623x754a37bb()).mo40966xc74540ab(this);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        g(this.f149044d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        g(this.f149044d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedCritical", bindingUiList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindingUiList, "bindingUiList");
        this.f148965m = bindingUiList;
        this.f148966n = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.h1.f148958d);
        this.f148967o = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.i1.f148961d);
    }

    public /* synthetic */ j1(java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list);
    }
}
