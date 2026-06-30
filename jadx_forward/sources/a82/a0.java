package a82;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83491d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f83493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f83494g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f83495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, a82.d0 d0Var, o72.e2 e2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83493f = n2Var;
        this.f83494g = d0Var;
        this.f83495h = e2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a82.a0 a0Var = new a82.a0(this.f83493f, this.f83494g, this.f83495h, interfaceC29045xdcb5ca57);
        a0Var.f83492e = obj;
        return a0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83491d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((java.lang.Number) obj).longValue();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        o72.e2 e2Var = this.f83495h;
        a82.d0 d0Var = this.f83494g;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f83493f;
        if (n2Var != null) {
            a82.z zVar = new a82.z(d0Var, e2Var);
            this.f83491d = 1;
            if (n2Var.a(zVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        v65.h d76 = d0Var.d7();
        java.lang.String field_dataId = e2Var.f67085xf604e54a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_dataId, "field_dataId");
        this.f83491d = 2;
        obj = d76.d(field_dataId, this);
        if (obj == aVar) {
            return aVar;
        }
        ((java.lang.Number) obj).longValue();
        return jz5.f0.f384359a;
    }
}
