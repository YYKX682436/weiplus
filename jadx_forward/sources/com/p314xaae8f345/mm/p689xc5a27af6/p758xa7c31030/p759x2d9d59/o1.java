package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public class o1 extends com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f148989m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f148990n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe f148991o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f148992p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f148993q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String policyName, java.util.List<java.lang.String> bindingUiList, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe compositeFgStatus) {
        super(policyName, kz5.p0.f395529d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policyName, "policyName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindingUiList, "bindingUiList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositeFgStatus, "compositeFgStatus");
        this.f148989m = policyName;
        this.f148990n = bindingUiList;
        this.f148991o = compositeFgStatus;
        this.f148992p = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.n1.f148985d);
        this.f148993q = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.m1.f148982d);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 c(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return this.f148991o.mo40960xab2f7f06() ? a() ? new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(2, source, "bounded") : ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148993q).mo141623x754a37bb()).mo40960xab2f7f06() ? new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(1, source, "emergency") : ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5) ((jz5.n) this.f148992p).mo141623x754a37bb()).mo40960xab2f7f06() ? new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(3, source, "restricted") : new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(2, source, "fg") : new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0(1, source, null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public java.util.List d() {
        return this.f148990n;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public java.lang.String e() {
        return this.f148989m;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public void h() {
        this.f148991o.mo40970xb5bdeb7a(this);
        ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5) ((jz5.n) this.f148992p).mo141623x754a37bb()).mo40970xb5bdeb7a(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148993q).mo141623x754a37bb()).mo40970xb5bdeb7a(this);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", this.f148989m + " startScheduling");
        this.f148991o.mo40966xc74540ab(this);
        ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4663xe8a96ff5) ((jz5.n) this.f148992p).mo141623x754a37bb()).mo40966xc74540ab(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) ((jz5.n) this.f148993q).mo141623x754a37bb()).mo40966xc74540ab(this);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        g(this.f148989m);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        g(this.f148989m);
    }

    public /* synthetic */ o1(java.lang.String str, java.util.List list, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe interfaceC4662x21f4acfe, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? kz5.p0.f395529d : list, interfaceC4662x21f4acfe);
    }
}
