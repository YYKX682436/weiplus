package yf0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f543157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f543158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f543159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f543160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f543161i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f543162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yf0.k0 k0Var, zf0.v0 v0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3325xe03a0797.p3326xc267989b.z zVar, p3325xe03a0797.p3326xc267989b.z zVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543157e = k0Var;
        this.f543158f = v0Var;
        this.f543159g = f0Var;
        this.f543160h = f0Var2;
        this.f543161i = zVar;
        this.f543162m = zVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf0.z(this.f543157e, this.f543158f, this.f543159g, this.f543160h, this.f543161i, this.f543162m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543156d;
        p3325xe03a0797.p3326xc267989b.z zVar = this.f543161i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yf0.y yVar = new yf0.y(zVar);
            this.f543156d = 1;
            obj = yf0.k0.U6(this.f543157e, this.f543158f, yVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        this.f543159g.f391649d = intValue;
        this.f543160h.f391649d = intValue2;
        boolean A = ((p3325xe03a0797.p3326xc267989b.c3) zVar).A();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!A) {
            ((p3325xe03a0797.p3326xc267989b.a0) zVar).U(f0Var);
        }
        ((p3325xe03a0797.p3326xc267989b.a0) this.f543162m).U(f0Var);
        return f0Var;
    }
}
