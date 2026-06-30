package tt2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f503372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f503374h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(tt2.e1 e1Var, so2.j5 j5Var, ut2.s3 s3Var, r45.bd5 bd5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503371e = e1Var;
        this.f503372f = j5Var;
        this.f503373g = s3Var;
        this.f503374h = bd5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tt2.b1(this.f503371e, this.f503372f, this.f503373g, this.f503374h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar;
        dk2.xf W0;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503370d;
        so2.j5 j5Var = this.f503372f;
        tt2.e1 e1Var = this.f503371e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            st2.c2 c2Var = st2.c2.f493782a;
            android.content.Context context = e1Var.f503413h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f503370d = 1;
            obj = c2Var.g((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, e1Var.f503415m, (cm2.m0) j5Var, this);
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
            java.lang.String str = "";
            if (e1Var.f503414i) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                java.lang.String str2 = b1Var.f398547b;
                y4Var.getClass();
                if (str2 == null) {
                    str2 = "";
                }
                y4Var.f409825d = str2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = b1Var.f398574s;
            if (c11812xa040dc98 == null) {
                c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            cm2.m0 m0Var = (cm2.m0) j5Var;
            java.lang.String m75945x2fec83072 = m0Var.f124901v.m75945x2fec8307(26);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            jSONObject.put("cookies", m75945x2fec83072);
            c11812xa040dc98.f158855d = 1;
            c11812xa040dc98.f158858g = jSONObject.toString();
            b1Var.f398574s = c11812xa040dc98;
            ut2.s3 s3Var = this.f503373g;
            android.content.Context context2 = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.v9.class))).U6(((mm2.e1) e1Var.f503415m.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), b1Var);
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context3 = e1Var.f503413h;
            r4Var.h3(context3, true);
            st2.h1 h1Var = e1Var.f503424v;
            if (h1Var != null && (lVar = h1Var.f493870h) != null && (W0 = lVar.W0()) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((dk2.r4) W0).l0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3, m0Var, new tt2.a1(e1Var, b1Var, j5Var));
            }
            ml2.f4 f4Var = ml2.f4.f408970m;
            jz5.l[] lVarArr = new jz5.l[1];
            r45.bd5 bd5Var = this.f503374h;
            if (bd5Var != null && (m75945x2fec8307 = bd5Var.m75945x2fec8307(0)) != null) {
                str = m75945x2fec8307;
            }
            lVarArr[0] = new jz5.l("buy_btn_word", str);
            e1Var.V(f4Var, m0Var, 1, b1Var, s3Var, kz5.c1.l(lVarArr));
        }
        return jz5.f0.f384359a;
    }
}
