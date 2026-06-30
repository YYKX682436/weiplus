package at2;

/* loaded from: classes3.dex */
public final class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f95208d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f95209e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f95210f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f95211g;

    public h0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context, gk2.e buContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 basePluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePluginLayout, "basePluginLayout");
        this.f95208d = k0Var;
        this.f95209e = context;
        this.f95210f = buContext;
        this.f95211g = basePluginLayout;
    }

    public final void a(boolean z17, boolean z18) {
        android.content.Context context = this.f95209e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 0);
        r45.r02 r02Var = new r45.r02();
        r02Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (!z17) {
            r02Var.set(1, java.lang.Integer.valueOf(z18 ? 1 : 0));
        }
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r02Var.mo14344x5f01b1f6()));
        gk2.e eVar = this.f95210f;
        pm0.v.T(new ek2.r1(((ct2.j) eVar.a(ct2.j.class)).O6(), ((ct2.j) eVar.a(ct2.j.class)).Q6(), 1, hx0Var).l(), new at2.g0(f17, z18, this, z17));
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        ml2.z0 z0Var = ml2.z0.f409863a;
        android.content.Context context = this.f95209e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f95208d;
        gk2.e eVar = this.f95210f;
        if (valueOf == null) {
            k0Var = k0Var3;
            num = valueOf;
        } else {
            num = valueOf;
            if (valueOf.intValue() == 1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n;
                if (c19792x256d2725 != null) {
                    k0Var2 = k0Var3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
                    a17.m59367x7b6790db(((mm2.c1) eVar.a(mm2.c1.class)).f410319c3);
                    i95.m c17 = i95.n0.c(c61.ub.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    c61.ub.ah((c61.ub) c17, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, a17, null, 0, null, 28, null);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("object_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
                    jSONObject.put("share_des", "chat");
                    z0Var.a(jSONObject);
                    zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                    ml2.o3[] o3VarArr = ml2.o3.f409306d;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    ((ml2.j0) zbVar).Wj("share_record_duration", jSONObject2);
                } else {
                    k0Var2 = k0Var3;
                }
                if (k0Var2 != null) {
                    k0Var2.u();
                }
            }
            k0Var = k0Var3;
        }
        if (num != null && num.intValue() == 2) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n;
            if (c19792x256d27252 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d27252, 16384);
                a18.m59367x7b6790db(((mm2.c1) eVar.a(mm2.c1.class)).f410319c3);
                i95.m c18 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                c61.ub.I2((c61.ub) c18, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, new so2.h1(a18), null, 0, 0, 28, null);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("object_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
                jSONObject3.put("share_des", "moment");
                z0Var.a(jSONObject3);
                zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr2 = ml2.o3.f409306d;
                java.lang.String jSONObject4 = jSONObject3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                ((ml2.j0) zbVar2).Wj("share_record_duration", jSONObject4);
            }
            if (k0Var != null) {
                k0Var.u();
            }
        } else {
            if (num == null || num.intValue() != 4) {
                if (num != null && num.intValue() == 9) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(this.f95211g, null, null, new at2.d0(this, null), 3, null);
                    return;
                }
                if (num == null || num.intValue() != 8) {
                    if (num != null && num.intValue() == 6) {
                        a(true, false);
                        if (k0Var != null) {
                            k0Var.u();
                            return;
                        }
                        return;
                    }
                    if (num != null && num.intValue() == 7) {
                        a(false, false);
                        if (k0Var != null) {
                            k0Var.u();
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var4.t(true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570805by3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
                textView.setGravity(17);
                textView.setText(mm2.g0.Q6((mm2.g0) eVar.a(mm2.g0.class), null, 1, null) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaj) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eai));
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
                textView.setTextSize(1, 14.0f);
                k0Var4.s(inflate, false);
                k0Var4.f293405n = new at2.e0(this);
                k0Var4.f293414s = new at2.f0(this);
                if (k0Var != null) {
                    k0Var.u();
                }
                k0Var4.v();
                return;
            }
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            long O6 = ((ct2.j) eVar.a(ct2.j.class)).O6();
            java.lang.String N6 = ((ct2.j) eVar.a(ct2.j.class)).N6();
            ((c61.p2) ybVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "liveRepalyExpose liveId:" + O6 + ",exposeUrl:https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=80,username:" + N6 + ",commentSeq:null");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=80", java.util.Arrays.copyOf(new java.lang.Object[]{62, java.lang.Long.valueOf(O6), N6, ""}, 4));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            if (k0Var != null) {
                k0Var.u();
            }
        }
    }
}
