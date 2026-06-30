package b0;

/* loaded from: classes16.dex */
public final class f4 extends qz5.l implements yz5.p {
    public int L;
    public /* synthetic */ boolean M;
    public final /* synthetic */ b0.h4 N;
    public final /* synthetic */ android.view.View P;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc Q;
    public final /* synthetic */ pk2.o9 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(b0.h4 h4Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.N = h4Var;
        this.P = view;
        this.Q = c15371xf336b8cc;
        this.R = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.f4 f4Var = new b0.f4(this.N, this.P, this.Q, this.R, interfaceC29045xdcb5ca57);
        f4Var.M = ((java.lang.Boolean) obj).booleanValue();
        return f4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.f4) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.L;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.M;
        android.view.View view = this.P;
        java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okv)).getText().toString();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hvi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        b0.h4 h4Var = this.N;
        h4Var.v(obj2, findViewById, this.Q);
        qk2.f.f(h4Var, false, 1, null);
        boolean z18 = !z17;
        boolean n17 = h4Var.n();
        this.L = 1;
        h4Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        pk2.o9 o9Var = this.R;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchVisitorAnonymous isEnable:" + z18 + ", isLiving:" + n17);
        if (z18) {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(1);
            mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
            int i18 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i18 | 8192);
        } else {
            ((mm2.g1) o9Var.c(mm2.g1.class)).W6(0);
            mm2.c1 c1Var2 = (mm2.c1) o9Var.c(mm2.c1.class);
            int i19 = (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            c1Var2.p8(i19 & (-8193));
        }
        if (n17) {
            java.lang.Integer num = new java.lang.Integer(1);
            int i27 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 6);
            num.intValue();
            jSONObject.put("type", num.intValue());
            jSONObject.put("sub_element", 5);
            jSONObject.put("sub_type", i27);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            java.lang.Integer num2 = new java.lang.Integer(1);
            int i28 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 6);
            num2.intValue();
            jSONObject2.put("type", num2.intValue());
            jSONObject2.put("sub_element", 5);
            jSONObject2.put("sub_type", i28);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var3 = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        if (n17) {
            b0.g4 g4Var = new b0.g4(o9Var, nVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("VisitorAnonymous", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
            dk2.xf f17 = o9Var.f();
            if (f17 != null) {
                dk2.xf.h(f17, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o9Var.c(mm2.e1.class)).f410516m, ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 8192L, 0, g4Var, 16, null);
            }
        } else {
            nVar.a(java.lang.Boolean.TRUE);
        }
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
