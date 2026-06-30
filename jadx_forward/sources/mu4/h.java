package mu4;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f412948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f412949b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412950c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f412951d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f412952e;

    public h(java.lang.Class stubService, java.lang.String name, java.lang.String appId, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stubService, "stubService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f412948a = stubService;
        this.f412949b = name;
        this.f412950c = appId;
        this.f412951d = c19775x58fd37b3;
        this.f412952e = "MicroMsg.JsApiHandlerBuilder";
    }

    public final nw4.n a() {
        int hashCode = hashCode();
        nw4.n nVar = new nw4.n(null, null, hashCode);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f412949b);
        bundle.putString("appId", this.f412950c);
        nVar.H = this.f412951d;
        nVar.I = bundle;
        nVar.f422419J = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a.a(true, this.f412948a, new mu4.g(nVar, hashCode, this));
        return nVar;
    }
}
