package c61;

/* loaded from: classes10.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120433e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120434f;

    /* renamed from: g, reason: collision with root package name */
    public int f120435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.h0 f120436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120437i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f120438m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f120439n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(kv.h0 h0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120436h = h0Var;
        this.f120437i = str;
        this.f120438m = c0Var;
        this.f120439n = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.ba(this.f120436h, this.f120437i, this.f120438m, this.f120439n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ba) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f120435g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kv.h0 h0Var = this.f120436h;
            this.f120432d = h0Var;
            java.lang.String str = this.f120437i;
            this.f120433e = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f120438m;
            this.f120434f = c0Var;
            this.f120435g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            ((com.p314xaae8f345.mm.p943x351df9c2.m0) h0Var).a(str, new c61.z9(c0Var, str, this.f120439n, rVar));
            rVar.m(new c61.aa(c0Var));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
