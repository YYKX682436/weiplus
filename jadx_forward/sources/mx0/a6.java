package mx0;

/* loaded from: classes5.dex */
public final class a6 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f413361d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413362e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413364g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f413364g = c10977x8e40eced;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mx0.a6 a6Var = new mx0.a6(this.f413364g, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        a6Var.f413362e = (java.lang.String) obj;
        a6Var.f413363f = (rx0.k) obj2;
        return a6Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413361d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String resultMediaFilePath = (java.lang.String) this.f413362e;
            rx0.k kVar = (rx0.k) this.f413363f;
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMediaFilePath, "resultMediaFilePath");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.r5(m7Var, null), 3, null);
            m7Var.hj("Completed", resultMediaFilePath);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_clip");
            ((cy1.a) rVar).yj("sc_asset_generate_clip", null, Ai, 6, false);
            nu3.i.f421751a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0));
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413364g;
            java.util.ArrayList d17 = kz5.c0.d(resultMediaFilePath);
            r45.q23 q23Var = kVar.f482470d;
            java.lang.String str = kVar.f482471e;
            yx0.u uVar = kVar.f482472f;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = kVar.f482473g;
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = kVar.f482469c;
            java.util.List list = c3981x30b9dbd5 != null ? c3981x30b9dbd5.f129356g : null;
            if (list == null) {
                list = kz5.p0.f395529d;
            }
            java.util.List list2 = list;
            this.f413362e = null;
            this.f413361d = 1;
            int i18 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.f151074d2;
            if (c10977x8e40eced.F0(d17, q23Var, str, uVar, c4128x879fba0a, false, list2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.z5 z5Var = new mx0.z5(this.f413364g, null);
        this.f413361d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, z5Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
