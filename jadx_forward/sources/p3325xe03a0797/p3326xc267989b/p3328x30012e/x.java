package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f391977d;

    /* renamed from: e, reason: collision with root package name */
    public int f391978e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f391980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.k f391981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f391980g = h0Var;
        this.f391981h = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.x xVar = new p3325xe03a0797.p3326xc267989b.p3328x30012e.x(this.f391980g, this.f391981h, interfaceC29045xdcb5ca57);
        xVar.f391979f = obj;
        return xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p3325xe03a0797.p3326xc267989b.p3328x30012e.x) mo148xaf65a0fc(new u26.c0(((u26.c0) obj).f505674a), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391978e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Object obj2 = ((u26.c0) this.f391979f).f505674a;
            boolean z17 = obj2 instanceof u26.b0;
            h0Var = this.f391980g;
            if (!z17) {
                h0Var.f391656d = obj2;
            }
            if (z17) {
                java.lang.Throwable a17 = u26.c0.a(obj2);
                if (a17 != null) {
                    throw a17;
                }
                java.lang.Object obj3 = h0Var.f391656d;
                if (obj3 != null) {
                    if (obj3 == v26.k0.f514553a) {
                        obj3 = null;
                    }
                    this.f391979f = obj2;
                    this.f391977d = h0Var;
                    this.f391978e = 1;
                    if (this.f391981h.mo771x2f8fd3(obj3, this) == aVar) {
                        return aVar;
                    }
                    h0Var2 = h0Var;
                }
                h0Var.f391656d = v26.k0.f514555c;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var2 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f391977d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h0Var = h0Var2;
        h0Var.f391656d = v26.k0.f514555c;
        return jz5.f0.f384359a;
    }
}
