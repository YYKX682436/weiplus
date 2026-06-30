package pk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437325d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f437326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.j f437327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pk2.j jVar, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437327f = jVar;
        this.f437328g = view;
        this.f437329h = c15371xf336b8cc;
        this.f437330i = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.h hVar = new pk2.h(this.f437327f, this.f437328g, this.f437329h, this.f437330i, interfaceC29045xdcb5ca57);
        hVar.f437326e = ((java.lang.Boolean) obj).booleanValue();
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.h) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437325d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f437326e;
        pk2.j jVar = this.f437327f;
        int i18 = jVar.n() ? com.p314xaae8f345.mm.R.id.okv : com.p314xaae8f345.mm.R.id.qqx;
        android.view.View view = this.f437328g;
        java.lang.String obj2 = ((android.widget.TextView) view.findViewById(i18)).getText().toString();
        android.view.View findViewById = view.findViewById(jVar.n() ? com.p314xaae8f345.mm.R.id.hvi : com.p314xaae8f345.mm.R.id.qlg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        jVar.v(obj2, findViewById, this.f437329h);
        qk2.f.f(jVar, false, 1, null);
        boolean z18 = !z17;
        boolean n17 = jVar.n();
        this.f437325d = 1;
        jVar.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        pk2.o9 o9Var = this.f437330i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchVisitorAnonymous isEnable:" + z18 + ", isLiving:" + n17);
        if (z18) {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(1);
            mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
            int i19 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i19 | 8192);
        } else {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(0);
            mm2.c1 c1Var2 = (mm2.c1) o9Var.c(mm2.c1.class);
            int i27 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            c1Var2.p8(i27 & (-8193));
        }
        if (n17) {
            java.lang.Integer num = new java.lang.Integer(1);
            int i28 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            num.intValue();
            jSONObject.put("type", num.intValue());
            jSONObject.put("sub_element", 5);
            jSONObject.put("sub_type", i28);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num2 = new java.lang.Integer(1);
            int i29 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            num2.intValue();
            jSONObject2.put("type", num2.intValue());
            jSONObject2.put("sub_element", 5);
            jSONObject2.put("sub_type", i29);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var3 = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        if (n17) {
            pk2.i iVar = new pk2.i(o9Var, nVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("VisitorAnonymous", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
            dk2.xf f17 = o9Var.f();
            if (f17 != null) {
                dk2.xf.h(f17, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o9Var.c(mm2.e1.class)).f410516m, ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 8192L, 0, iVar, 16, null);
            }
        } else {
            nVar.a(java.lang.Boolean.TRUE);
        }
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
