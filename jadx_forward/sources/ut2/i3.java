package ut2;

/* loaded from: classes3.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512453e = s3Var;
        this.f512454f = eVar;
        this.f512455g = m0Var;
        this.f512456h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.i3(this.f512453e, this.f512454f, this.f512455g, this.f512456h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512452d;
        cm2.m0 m0Var = this.f512455g;
        gk2.e eVar = this.f512454f;
        ut2.s3 s3Var = this.f512453e;
        st2.c2 c2Var = st2.c2.f493782a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Context context = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f512452d = 1;
            obj = c2Var.h((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, eVar, m0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l81.b1 b1Var = (l81.b1) obj;
        if (b1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = b1Var.f398574s;
            if (c11812xa040dc98 == null) {
                c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String m75945x2fec8307 = m0Var.f124901v.m75945x2fec8307(26);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            jSONObject.put("cookies", m75945x2fec8307);
            c11812xa040dc98.f158855d = 1;
            c11812xa040dc98.f158858g = jSONObject.toString();
            b1Var.f398574s = c11812xa040dc98;
            c2Var.k(b1Var);
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context2 = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f512456h;
            q4Var.n(context2, eVar, b1Var, lVar != null ? lVar.Y0() : null);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                tt2.e1.W(e1Var, ml2.f4.f408968i, m0Var, 3, b1Var, s3Var, null, 32, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
