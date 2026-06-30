package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f211150d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2) {
        this.f211150d = activityC15025x361cfff2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211150d;
        int intExtra = activityC15025x361cfff2.getIntent().getIntExtra("KEY_ENTRANCE_TYPE", 0);
        long longExtra = activityC15025x361cfff2.getIntent().getLongExtra("KEY_ENTRANCE_ID", 0L);
        if (intExtra > 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.qd((zy2.zb) c17, 20, intExtra, longExtra, null, 8, null);
        }
        if (activityC15025x361cfff2.f210074p0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5 w5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w5.f184185d;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15025x361cfff2.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            if (!w5Var.c(mo55332x76847179, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o3(activityC15025x361cfff2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn,bind phone return");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "doClick create contact btn,prepareResp = null");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6479xf8fba029 c6479xf8fba029 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6479xf8fba029();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6479xf8fba029.f138226d = c6479xf8fba029.b("SessionId", Ri, true);
        c6479xf8fba029.f138234l = activityC15025x361cfff2.V;
        java.lang.String string = activityC15025x361cfff2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = activityC15025x361cfff2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.er6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = activityC15025x361cfff2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574619iy4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String string4 = activityC15025x361cfff2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1;
        java.lang.String str4 = activityC15025x361cfff2.F;
        if (str4 == null) {
            str4 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1 = str4;
        android.widget.EditText editText = activityC15025x361cfff2.f210079w;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickEdt");
            throw null;
        }
        android.text.Editable text = editText.getText();
        if (text == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.J1 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.S1 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) ((jz5.n) activityC15025x361cfff2.A1).mo141623x754a37bb()).f292896x;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.J1) > activityC15025x361cfff2.f210081x0) {
            arrayList2.add(string2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1.length() == 0) {
            arrayList3.add(string);
        } else {
            c6479xf8fba029.f138230h = 1L;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.J1.length() == 0) {
            arrayList3.add(string2);
        } else {
            c6479xf8fba029.f138231i = 1L;
        }
        if (!activityC15025x361cfff2.D1) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.K1.length() == 0) {
                arrayList3.add(string3);
            } else {
                c6479xf8fba029.f138232j = 1L;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.P1)) {
                arrayList3.add(string4);
            } else {
                c6479xf8fba029.f138233k = 1L;
            }
        }
        if (!arrayList2.isEmpty()) {
            str2 = "android/view/View$OnClickListener";
            str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
            java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572882cu1));
            java.lang.String string5 = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0z, c18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string5, null, null, 6, null);
            c6479xf8fba029.f138227e = 2L;
            c6479xf8fba029.f138228f = 1L;
            c6479xf8fba029.f138229g = c6479xf8fba029.b("FailReasonWording", activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0z, c18), true);
        } else if (arrayList3.isEmpty()) {
            android.widget.CheckBox checkBox = activityC15025x361cfff2.S;
            if (checkBox == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsCheckCB");
                throw null;
            }
            if (checkBox.isChecked()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 31L, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "createContact avatarPath " + activityC15025x361cfff2.F + " length=" + (com.p314xaae8f345.mm.vfs.w6.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1) / 1024), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1);
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1);
                int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1);
                java.lang.String a17 = a3Var.a(p17, k17);
                java.lang.String str5 = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.U1.get(a17);
                if ((a17.length() == 0) || str5 == null) {
                    i95.m c19 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    cq.j1.j((cq.k) c19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.I1, 1, (r18 & 4) != 0 ? null : p17, (r18 & 8) != 0 ? 0 : k17, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d3(activityC15025x361cfff2), (r18 & 64) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f3(activityC15025x361cfff2));
                } else {
                    activityC15025x361cfff2.g7(str5);
                }
                str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
                str2 = "android/view/View$OnClickListener";
                activityC15025x361cfff2.U = db5.e1.Q(activityC15025x361cfff2, "", activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, null);
                c6479xf8fba029.f138227e = 1L;
            } else {
                str2 = "android/view/View$OnClickListener";
                str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "not check agreement");
                java.lang.String string6 = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckk);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string6, null, null, 6, null);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
                android.view.View view2 = activityC15025x361cfff2.Q;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsContainer");
                    throw null;
                }
                view2.startAnimation(loadAnimation);
                c6479xf8fba029.f138227e = 2L;
                c6479xf8fba029.f138228f = 3L;
                c6479xf8fba029.f138229g = c6479xf8fba029.b("FailReasonWording", activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckk), true);
            }
        } else {
            str2 = "android/view/View$OnClickListener";
            str3 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initCreateBtn$2";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "empty attr " + arrayList3);
            java.lang.String c110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572882cu1));
            java.lang.String string7 = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0y, c110);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string7, null, null, 6, null);
            c6479xf8fba029.f138227e = 2L;
            c6479xf8fba029.f138228f = 2L;
            c6479xf8fba029.f138229g = c6479xf8fba029.b("FailReasonWording", activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0y, c110), true);
        }
        c6479xf8fba029.k();
        java.lang.String n17 = c6479xf8fba029.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "report19815 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.c7(activityC15025x361cfff2, 1);
        yj0.a.h(this, str3, str2, "onClick", "(Landroid/view/View;)V");
    }
}
