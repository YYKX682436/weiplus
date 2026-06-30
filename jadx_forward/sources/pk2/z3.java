package pk2;

/* loaded from: classes3.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.b4 f437953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f437954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(boolean z17, pk2.o9 o9Var, pk2.b4 b4Var, v65.n nVar, android.view.View view) {
        super(2);
        this.f437951d = z17;
        this.f437952e = o9Var;
        this.f437953f = b4Var;
        this.f437954g = nVar;
        this.f437955h = view;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String m75945x2fec8307;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.cv2 cv2Var = (r45.cv2) obj2;
        pk2.o9 o9Var = this.f437952e;
        boolean z17 = this.f437951d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dht) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhp));
        boolean z18 = false;
        if (booleanValue) {
            pk2.b4 b4Var = this.f437953f;
            if (!z17) {
                b4Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
                r45.i82 i82Var = (r45.i82) ((mm2.f7) o9Var.c(mm2.f7.class)).f410591f.mo3195x754a37bb();
                if (i82Var != null && i82Var.m75933x41a8a7f2(0)) {
                    z18 = true;
                }
                if (z18) {
                    ((mm2.f7) o9Var.c(mm2.f7.class)).f410594i.mo7808x76db6cb1(new mm2.z6());
                }
            }
            android.view.View view = this.f437955h;
            ym5.a1.f(new pk2.w3(o9Var, z17, view));
            ym5.a1.f(new pk2.x3(b4Var, o9Var, view, z17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.H : ml2.t1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(b4Var.n() ? ml2.s1.f409449f : ml2.s1.f409448e), null, null, null, null, false, 124, null);
            if (o9Var.f437609c == 1) {
                if (b4Var.n()) {
                    java.lang.Integer num = 1;
                    int i17 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("element", 6);
                    if (num != null) {
                        num.intValue();
                        jSONObject.put("type", num.intValue());
                    }
                    jSONObject.put("sub_element", 3);
                    jSONObject.put("sub_type", i17);
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c19;
                    ml2.z4 z4Var = ml2.z4.f409927z;
                    ml2.g2[] g2VarArr = ml2.g2.f409010d;
                    zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(z17 ? 2 : 1), null, 4, null);
                } else {
                    java.lang.Integer num2 = 1;
                    int i18 = z17 ? 2 : 3;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("element", 6);
                    if (num2 != null) {
                        num2.intValue();
                        jSONObject2.put("type", num2.intValue());
                    }
                    jSONObject2.put("sub_element", 3);
                    jSONObject2.put("sub_type", i18);
                    i95.m c27 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c27;
                    ml2.c1 c1Var = ml2.c1.f408858e;
                    zy2.zb.j5(zbVar2, 37L, jSONObject2.toString(), null, 4, null);
                    i95.m c28 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                    zy2.zb zbVar3 = (zy2.zb) c28;
                    ml2.c2[] c2VarArr = ml2.c2.f408863d;
                    zy2.zb.j5(zbVar3, 16L, java.lang.String.valueOf(z17 ? 2 : 1), null, 4, null);
                }
            }
        } else if (z17 && cv2Var != null && (m75945x2fec8307 = cv2Var.m75945x2fec8307(2)) != null) {
            if (!(m75945x2fec8307.length() > 0)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(o9Var.f437611d, 2, 2, true, true);
                z2Var.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                z2Var.x(6);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
                android.widget.TextView textView = new android.widget.TextView(abstractActivityC21394xb3d2c0cf);
                textView.setPaddingRelative((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, 0, 0);
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.dxc);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                textView.setTextSize(17.0f);
                z2Var.s(textView);
                android.widget.TextView textView2 = new android.widget.TextView(abstractActivityC21394xb3d2c0cf);
                textView2.setText(m75945x2fec8307);
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                textView2.setTextSize(15.0f);
                z2Var.j(textView2);
                z2Var.F = new pk2.y3(z2Var);
                z2Var.C();
            }
        }
        this.f437954g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
