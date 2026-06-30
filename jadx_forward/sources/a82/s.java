package a82;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83693d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f83695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.m f83696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.t f83697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o72.e2 e2Var, dn.m mVar, a82.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83695f = e2Var;
        this.f83696g = mVar;
        this.f83697h = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a82.s sVar = new a82.s(this.f83695f, this.f83696g, this.f83697h, interfaceC29045xdcb5ca57);
        sVar.f83694e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83693d;
        dn.m task = this.f83696g;
        o72.e2 e2Var = this.f83695f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f83694e;
            if (e2Var.y0()) {
                a82.g2 g2Var = a82.g2.f83533a;
                java.lang.String field_cdnUrl = e2Var.f67084xf47770e7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_cdnUrl, "field_cdnUrl");
                int i18 = e2Var.f67086x886617a9;
                this.f83694e = y0Var;
                this.f83693d = 1;
                if (g2Var.b(task, field_cdnUrl, i18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    throw new jz5.d();
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ((java.lang.Number) obj).longValue();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 d76 = aj6 != null ? aj6.d7(task) : null;
        a82.t tVar = this.f83697h;
        if (d76 != null) {
            a82.r rVar = new a82.r(tVar, e2Var);
            this.f83694e = null;
            this.f83693d = 2;
            if (d76.a(rVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        v65.h c76 = tVar.c7();
        java.lang.String field_dataId = e2Var.f67085xf604e54a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_dataId, "field_dataId");
        this.f83694e = null;
        this.f83693d = 3;
        obj = c76.d(field_dataId, this);
        if (obj == aVar) {
            return aVar;
        }
        ((java.lang.Number) obj).longValue();
        return jz5.f0.f384359a;
    }
}
