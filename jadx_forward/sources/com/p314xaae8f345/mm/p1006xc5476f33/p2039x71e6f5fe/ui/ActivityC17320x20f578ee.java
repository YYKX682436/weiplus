package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactUI */
/* loaded from: classes15.dex */
public class ActivityC17320x20f578ee extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f241021g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static int f241022h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f241023i = 1;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2 f241024d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241025e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r4 f241026f;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17320x20f578ee activityC17320x20f578ee, android.content.Intent intent) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var;
        activityC17320x20f578ee.getClass();
        intent.setFlags(268435456);
        java.lang.String a17 = activityC17320x20f578ee.f241024d.f240583a.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.VardContactUI", "no contact user name");
        } else {
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, a17);
        }
        java.util.List list = activityC17320x20f578ee.f241024d.f240592j;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            i17 = 1;
        } else {
            i17 = 2;
            activityC17320x20f578ee.X6(list, intent, 2, 1);
        }
        java.util.List list2 = activityC17320x20f578ee.f241024d.f240593k;
        if (list2 != null && ((java.util.ArrayList) list2).size() > 0) {
            activityC17320x20f578ee.X6(list2, intent, 1, i17);
            i17++;
        }
        java.util.List list3 = activityC17320x20f578ee.f241024d.f240594l;
        if (list3 != null && ((java.util.ArrayList) list3).size() > 0) {
            activityC17320x20f578ee.X6(list3, intent, 3, i17);
            i17++;
        }
        java.util.List list4 = activityC17320x20f578ee.f241024d.f240596n;
        if (list4 != null && ((java.util.ArrayList) list4).size() > 0) {
            activityC17320x20f578ee.X6(list4, intent, 7, i17);
            i17++;
        }
        java.util.List list5 = activityC17320x20f578ee.f241024d.f240595m;
        if (list5 != null && ((java.util.ArrayList) list5).size() > 0) {
            activityC17320x20f578ee.X6(list5, intent, 0, i17);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17320x20f578ee.f241024d.f240603u)) {
            intent.putExtra("company", activityC17320x20f578ee.f241024d.f240603u);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17320x20f578ee.f241024d.f240601s)) {
            intent.putExtra("notes", activityC17320x20f578ee.f241024d.f240601s);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17320x20f578ee.f241024d.f240597o)) {
            intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, activityC17320x20f578ee.f241024d.f240597o);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17320x20f578ee.f241024d.f240598p)) {
            intent.putExtra("job_title", activityC17320x20f578ee.f241024d.f240598p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2 t2Var = activityC17320x20f578ee.f241024d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var2 = t2Var.f240589g;
        if (q2Var2 == null || q2Var2.a().length() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var3 = t2Var.f240590h;
            if (q2Var3 == null || q2Var3.a().length() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var4 = t2Var.f240591i;
                if (q2Var4 == null || q2Var4.a().length() <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var5 = t2Var.f240588f;
                    q2Var = (q2Var5 == null || q2Var5.a().length() <= 0) ? null : t2Var.f240588f;
                } else {
                    q2Var = t2Var.f240591i;
                }
            } else {
                q2Var = t2Var.f240590h;
            }
        } else {
            q2Var = t2Var.f240589g;
        }
        if (q2Var == null || q2Var.a().length() <= 0) {
            return;
        }
        intent.putExtra("postal", q2Var.a());
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced(this);
        c21554xcdf33ced.L(str2);
        c21554xcdf33ced.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        c21554xcdf33ced.O(false);
        c21554xcdf33ced.H(str);
        c21554xcdf33ced.P = false;
        c21554xcdf33ced.T = true;
        c21554xcdf33ced.V = 49;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).d(c21554xcdf33ced, f241023i);
    }

    public final void X6(java.util.List list, android.content.Intent intent, int i17, int i18) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (i18 == 1) {
                intent.putExtra("phone", str);
                intent.putExtra("phone_type", i17);
            } else if (i18 == 2) {
                intent.putExtra("secondary_phone", str);
                intent.putExtra("phone_type", i17);
            } else if (i18 == 3) {
                intent.putExtra("tertiary_phone", str);
                intent.putExtra("phone_type", i17);
            }
        }
    }

    public final void Y6(java.util.List list, java.lang.String str, java.lang.String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef c17319xba09bef = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef(this);
            c17319xba09bef.C(str + java.lang.String.valueOf(str3));
            java.util.ArrayList arrayList = f241021g;
            if (!arrayList.contains(str + java.lang.String.valueOf(str3))) {
                arrayList.add(str + java.lang.String.valueOf(str3));
            }
            c17319xba09bef.L(str2);
            c17319xba09bef.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
            c17319xba09bef.H(str3);
            c17319xba09bef.O(false);
            c17319xba09bef.P = true;
            c17319xba09bef.T = true;
            c17319xba09bef.V = 49;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).d(c17319xba09bef, f241022h);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2 t2Var;
        this.f241026f = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r4(this);
        this.f241025e = m79336x8b97809d();
        this.f241024d = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2.f240582v;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n4(this));
        mo54450xbf7c1df6("");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).g(com.p314xaae8f345.mm.R.xml.f576500cw);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17321x12a1292d c17321x12a1292d = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17321x12a1292d) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_header");
        if (c17321x12a1292d != null && (t2Var = this.f241024d) != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t2Var.f240583a.a())) {
                c17321x12a1292d.P = t2Var.f240583a.a();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t2Var.f240584b)) {
                c17321x12a1292d.Q = t2Var.f240584b;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t2Var.f240599q)) {
                c17321x12a1292d.R = t2Var.f240599q;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t2Var.f240598p)) {
                c17321x12a1292d.S = t2Var.f240598p;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("c_contact_info_wx_id");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240585c)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_photo_uri");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_category_photo_uri");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef c17319xba09bef = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_photo_uri");
            if (c17319xba09bef != null) {
                c17319xba09bef.H(this.f241024d.f240585c);
                c17319xba09bef.O(false);
                c17319xba09bef.P = false;
                f241022h += 2;
                f241023i += 2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var = this.f241024d.f240590h;
        if (q2Var != null && q2Var.a().length() > 0) {
            W6(q2Var.a(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5h));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var2 = this.f241024d.f240591i;
        if (q2Var2 != null && q2Var2.a().length() > 0) {
            W6(q2Var2.a(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5u));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var3 = this.f241024d.f240588f;
        if (q2Var3 != null && q2Var3.a().length() > 0) {
            W6(q2Var3.a(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5c));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 q2Var4 = this.f241024d.f240589g;
        if (q2Var4 != null && q2Var4.a().length() > 0) {
            W6(q2Var4.a(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5c));
        }
        java.util.List list = this.f241024d.f240594l;
        if (list != null && ((java.util.ArrayList) list).size() > 0) {
            Y6(list, "WorkTel", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5v));
        }
        java.util.List list2 = this.f241024d.f240593k;
        if (list2 != null && ((java.util.ArrayList) list2).size() > 0) {
            Y6(list2, "HomeTel", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5j));
        }
        java.util.List list3 = this.f241024d.f240595m;
        if (list3 != null && ((java.util.ArrayList) list3).size() > 0) {
            Y6(list3, "VideoTEL", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5s));
        }
        java.util.List list4 = this.f241024d.f240596n;
        if (list4 != null && ((java.util.ArrayList) list4).size() > 0) {
            Y6(list4, "NormalTel", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5m));
        }
        java.util.List list5 = this.f241024d.f240592j;
        if (list5 != null && ((java.util.ArrayList) list5).size() > 0) {
            Y6(list5, "CellTel", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5f));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240603u)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_org");
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_org");
            if (c21554xcdf33ced != null) {
                c21554xcdf33ced.H(this.f241024d.f240603u);
                c21554xcdf33ced.O(false);
                c21554xcdf33ced.P = true;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240600r)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_agent");
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_agent");
            if (c21554xcdf33ced2 != null) {
                c21554xcdf33ced2.H(this.f241024d.f240600r);
                c21554xcdf33ced2.O(false);
                c21554xcdf33ced2.P = true;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240602t)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_home_page");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_category_home_page");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef c17319xba09bef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_home_page");
            if (c17319xba09bef2 != null) {
                c17319xba09bef2.H(this.f241024d.f240602t);
                c17319xba09bef2.O(false);
                c17319xba09bef2.P = true;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240597o)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_email");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef c17319xba09bef3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_email");
            if (c17319xba09bef3 != null) {
                c17319xba09bef3.H(this.f241024d.f240597o);
                c17319xba09bef3.O(false);
                c17319xba09bef3.P = true;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240587e)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_birthday");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_category_birthday");
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_birthday");
            if (c21554xcdf33ced3 != null) {
                c21554xcdf33ced3.H(this.f241024d.f240587e);
                c21554xcdf33ced3.O(false);
                c21554xcdf33ced3.P = true;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241024d.f240601s)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_remark");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_category_remark");
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_remark");
            if (c21554xcdf33ced4 != null) {
                c21554xcdf33ced4.H(this.f241024d.f240601s);
                c21554xcdf33ced4.O(false);
                c21554xcdf33ced4.P = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s2 s2Var = this.f241024d.f240586d;
        if (s2Var == null || !s2Var.f240576a.contains("uri")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_contact_info_logo");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).w("v_category_logo");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef c17319xba09bef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17319xba09bef) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241025e).h("v_contact_info_logo");
            c17319xba09bef4.H(this.f241024d.f240586d.f240577b);
            c17319xba09bef4.P = false;
            c17319xba09bef4.O(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.equals("add_vcard_contact")) {
            db5.e1.e(this, "", new java.lang.String[]{getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5b), getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5a)}, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o4(this));
            return true;
        }
        if (c21560x1fce98fb.f279313q.equals("v_contact_info_photo_uri") || c21560x1fce98fb.f279313q.equals("v_contact_info_home_page") || c21560x1fce98fb.f279313q.equals("v_contact_info_logo")) {
            java.lang.String charSequence = c21560x1fce98fb.n().toString();
            if (charSequence != null && charSequence.length() > 0 && android.webkit.URLUtil.isNetworkUrl(charSequence)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r4 r4Var = this.f241026f;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = r4Var.f241160h;
                if (!b4Var.e()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
                } else if (charSequence.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
                } else {
                    r4Var.f241157e = charSequence;
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(46, null);
                    if (str == null || str.length() == 0) {
                        r4Var.a(charSequence, o45.cg.a(), new byte[0]);
                    } else {
                        gm0.j1.d().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, r4Var);
                        r4Var.f241158f = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(charSequence, null, 4, 0, o45.cg.a(), new byte[0]);
                        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) r4Var.f241158f);
                        b4Var.c(3000L, 3000L);
                    }
                }
                return true;
            }
        } else if (f241021g.contains(c21560x1fce98fb.f279313q) && !c21560x1fce98fb.f279313q.toLowerCase().contains("fax")) {
            java.lang.String trim = c21560x1fce98fb.n().toString().trim();
            if (trim != null && trim.length() > 0) {
                db5.e1.e(this, "", new java.lang.String[]{getString(com.p314xaae8f345.mm.R.C30867xcad56011.bd7)}, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.l4(this, trim));
                return true;
            }
        } else if (c21560x1fce98fb.f279313q.equals("v_contact_info_email")) {
            db5.e1.e(this, "", new java.lang.String[]{mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihw), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihv)}, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m4(this, c21560x1fce98fb.n().toString()));
        }
        return false;
    }
}
