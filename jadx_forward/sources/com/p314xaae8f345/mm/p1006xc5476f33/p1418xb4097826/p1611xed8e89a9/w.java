package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class w extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f205977a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f205978b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f205979c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f205980d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f205981e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 f205982f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14871xa985f898 f205983g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f205984h;

    /* renamed from: i, reason: collision with root package name */
    public int f205985i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f205986j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f205987k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f205988l;

    public w(android.app.Activity context, android.view.View header, r45.qt2 qt2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        qt2Var = (i17 & 4) != 0 ? null : qt2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        this.f205977a = context;
        this.f205978b = qt2Var;
        this.f205979c = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p(header));
        this.f205980d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.r(header));
        this.f205981e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.q(header));
        this.f205985i = -1;
        this.f205986j = "";
        this.f205987k = true;
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar, java.util.List list, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = null;
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        wVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        if (z18 && wVar.f205988l) {
            return;
        }
        if (!z18) {
            wVar.f205988l = true;
        }
        java.lang.String str = wVar.f205986j;
        if (str != null) {
            if (!(str.length() == 0)) {
                pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.v(list, str));
            }
        }
        wVar.i((r45.v96) ((r45.ro2) list.get(0)).m75936x14adae67(0));
        if (list.size() == 1) {
            return;
        }
        ((android.widget.RelativeLayout) ((jz5.n) wVar.f205981e).mo141623x754a37bb()).setVisibility(0);
        ((android.widget.LinearLayout) ((jz5.n) wVar.f205979c).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.l(wVar, z17, list));
    }

    @Override // ym5.q3
    public void b(int i17) {
        l(true);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var = this.f205982f;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = null;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = b0Var.f204847e;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00 = c22801x87cbdc002;
        }
        if (c22801x87cbdc00 == null) {
            return;
        }
        c22801x87cbdc00.m82688x390c1d00(z17);
    }

    public final android.widget.TextView g() {
        return (android.widget.TextView) ((jz5.n) this.f205980d).mo141623x754a37bb();
    }

    public final void i(r45.v96 v96Var) {
        java.lang.String str;
        r45.e95 e95Var;
        java.util.LinkedList linkedList;
        r45.t13 t13Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = v96Var;
        if (v96Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(this.f205986j);
            java.util.LinkedList<r45.v96> m75941xfb821914 = (l2Var == null || (t13Var = l2Var.f205454j) == null) ? null : t13Var.m75941xfb821914(0);
            if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList();
                for (r45.v96 v96Var2 : m75941xfb821914) {
                    r45.ro2 ro2Var = new r45.ro2();
                    ro2Var.set(0, v96Var2);
                    linkedList.add(ro2Var);
                }
            }
            if (linkedList == null || linkedList.isEmpty()) {
                return;
            } else {
                h0Var.f391656d = (r45.v96) ((r45.ro2) linkedList.get(0)).m75936x14adae67(0);
            }
        }
        if (h0Var.f391656d == null) {
            return;
        }
        boolean z17 = this.f205987k;
        jz5.g gVar = this.f205979c;
        if (!z17 || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
            return;
        }
        this.f205987k = false;
        ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
        android.widget.TextView g17 = g();
        r45.l95 l95Var = ((r45.v96) h0Var.f391656d).f469542d;
        g17.setText((l95Var == null || (e95Var = l95Var.f460774d) == null) ? null : e95Var.f454698e);
        ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.m(this, h0Var));
        java.lang.String str2 = this.f205986j;
        if (str2 != null) {
            if (!(str2.length() == 0)) {
                pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.o(str2, this));
            }
        }
        l(false);
        java.lang.CharSequence text = g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        k(0, str, this.f205986j);
    }

    public final void j(android.content.Context context, r45.e95 e95Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.n95 n95Var = e95Var != null ? e95Var.f454699f : null;
        if (n95Var == null) {
            return;
        }
        r45.f96 f96Var = new r45.f96();
        f96Var.set(2, e95Var.f454706p);
        f96Var.set(1, java.lang.Float.valueOf(n95Var.f462717e));
        f96Var.set(0, java.lang.Float.valueOf(n95Var.f462716d));
        f96Var.set(4, e95Var.f454701h);
        f96Var.set(3, e95Var.f454698e);
        f96Var.set(5, e95Var.f454697d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_location", f96Var.mo14344x5f01b1f6());
        intent.putExtra("key_from_type", zy2.o9.f559050e);
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        if (j62.e.g().c(c20298x46d4560a) == 1 || bm5.o1.f104252a.h(c20298x46d4560a) == 1 || ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.b1().r()).intValue() == 0) {
            java.lang.String m75945x2fec8307 = f96Var.m75945x2fec8307(5);
            if (!(m75945x2fec8307 != null && r26.i0.y(m75945x2fec8307, "foursquare_", false))) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                return;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Uk(context, intent);
    }

    public final void k(int i17, java.lang.String str, java.lang.String str2) {
        r45.qt2 qt2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("poi_name", str);
        jSONObject.put("finderusername", str2);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        r45.qt2 qt2Var2 = this.f205978b;
        if (qt2Var2 == null) {
            android.app.Activity context = this.f205977a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar == null) {
                qt2Var = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, i17, "channel_profile_poi", t17, qt2Var, null, 16, null);
            }
            qt2Var2 = nyVar.V6();
        }
        qt2Var = qt2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, i17, "channel_profile_poi", t17, qt2Var, null, 16, null);
    }

    public final void l(boolean z17) {
        if (!z17 || this.f205985i != 0) {
            new db2.b4(this.f205986j, this.f205984h).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.u(this, z17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestUserPoi] no load more");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var = this.f205982f;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = null;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = b0Var.f204847e;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.N(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var2 = this.f205982f;
        if (b0Var2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = b0Var2.f204847e;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00 = c22801x87cbdc003;
        }
        if (c22801x87cbdc00 == null) {
            return;
        }
        c22801x87cbdc00.m82688x390c1d00(false);
    }
}
