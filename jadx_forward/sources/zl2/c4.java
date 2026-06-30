package zl2;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555231d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ba4 f555234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(gk2.e eVar, r45.ba4 ba4Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555233f = eVar;
        this.f555234g = ba4Var;
        this.f555235h = context;
        this.f555236i = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zl2.c4 c4Var = new zl2.c4(this.f555233f, this.f555234g, this.f555235h, this.f555236i, interfaceC29045xdcb5ca57);
        c4Var.f555232e = obj;
        return c4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.c4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555231d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f555232e;
            oz5.l f93115e = y0Var.getF93115e();
            zl2.b4 b4Var = new zl2.b4(this.f555233f, this.f555234g, null);
            this.f555232e = y0Var;
            this.f555231d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(f93115e, b4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                if (i17 == 3) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f555232e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        r45.ba4 ba4Var = (r45.ba4) lVar.f384367e;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        if (ba4Var == null) {
            oz5.l f93115e2 = y0Var.getF93115e();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            oz5.l mo7096x348d9a = f93115e2.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
            zl2.y3 y3Var = new zl2.y3(this.f555235h, null);
            this.f555232e = null;
            this.f555231d = 2;
            return p3325xe03a0797.p3326xc267989b.l.g(mo7096x348d9a, y3Var, this) == aVar ? aVar : f0Var;
        }
        oz5.l f93115e3 = y0Var.getF93115e();
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        oz5.l mo7096x348d9a2 = f93115e3.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
        zl2.a4 a4Var = new zl2.a4(booleanValue, ba4Var, this.f555235h, this.f555236i, this.f555233f, null);
        this.f555232e = null;
        this.f555231d = 3;
        return p3325xe03a0797.p3326xc267989b.l.g(mo7096x348d9a2, a4Var, this) == aVar ? aVar : f0Var;
    }
}
