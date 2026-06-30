package pk2;

/* loaded from: classes3.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437528e;

    /* renamed from: f, reason: collision with root package name */
    public int f437529f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437531h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.n4 f437532i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437534n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(pk2.o9 o9Var, pk2.n4 n4Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437531h = o9Var;
        this.f437532i = n4Var;
        this.f437533m = view;
        this.f437534n = c15371xf336b8cc;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.m4 m4Var = new pk2.m4(this.f437531h, this.f437532i, this.f437533m, this.f437534n, interfaceC29045xdcb5ca57);
        m4Var.f437530g = ((java.lang.Boolean) obj).booleanValue();
        return m4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.m4) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437529f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f437530g;
        pk2.o9 o9Var = this.f437531h;
        if (z17) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
                ya2.o1.F2((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class), o9Var.f437611d, false, 2, null);
                return java.lang.Boolean.FALSE;
            }
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308697o, pk2.k4.f437441a)) {
                return java.lang.Boolean.FALSE;
            }
        }
        android.view.View view = this.f437533m;
        java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.rvw)).getText().toString();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.rtc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        pk2.n4 n4Var = this.f437532i;
        n4Var.v(obj2, findViewById, this.f437534n);
        ((mm2.o4) o9Var.c(mm2.o4.class)).G = z17;
        this.f437527d = o9Var;
        this.f437528e = n4Var;
        this.f437530g = z17;
        this.f437529f = 1;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        boolean z18 = pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 134217728);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "enable/disable show location isOpenShowLocation: " + z18);
        int i18 = z18 ? 11 : 10;
        if (n4Var.n()) {
            java.lang.Integer num = new java.lang.Integer(2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            num.intValue();
            jSONObject.put("type", num.intValue());
            jSONObject.put("sub_element", 10);
            jSONObject.put("sub_type", i18);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num2 = new java.lang.Integer(2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            num2.intValue();
            jSONObject2.put("type", num2.intValue());
            jSONObject2.put("sub_element", 10);
            jSONObject2.put("sub_type", i18);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        o9Var.i(134217728, z17, n4Var.n(), new pk2.l4(o9Var, z17, n4Var, nVar));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
