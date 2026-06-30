package mx0;

/* loaded from: classes5.dex */
public final class m7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413688d;

    /* renamed from: e, reason: collision with root package name */
    public int f413689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx0.k f413691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, rx0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413690f = c10977x8e40eced;
        this.f413691g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.m7(this.f413690f, this.f413691g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.m7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413689e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413690f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c10977x8e40eced.f151075J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
            str = c16993xacc19624.D;
            yx0.b8 b8Var = c10977x8e40eced.f151090v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            this.f413688d = str;
            this.f413689e = 1;
            b8Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.t7(b8Var, nVar, false, str, null), 3, null);
            a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            str = (java.lang.String) this.f413688d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        if (((java.lang.Boolean) a17).booleanValue()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            rx0.k kVar = this.f413691g;
            r45.q23 q23Var = kVar.f482470d;
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = kVar.f482469c;
            java.util.List list = c3981x30b9dbd5 != null ? c3981x30b9dbd5.f129356g : null;
            if (list == null) {
                list = kz5.p0.f395529d;
            }
            this.f413688d = null;
            this.f413689e = 2;
            if (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.h0(c10977x8e40eced, str, q23Var, list, this) == aVar) {
                return aVar;
            }
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            mx0.l7 l7Var = new mx0.l7(c10977x8e40eced, null);
            this.f413688d = null;
            this.f413689e = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, l7Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
