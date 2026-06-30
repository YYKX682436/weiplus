package at2;

/* loaded from: classes3.dex */
public final class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f13675d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f13676e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f13677f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.k0 f13678g;

    public h0(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, gk2.e buContext, com.tencent.mm.plugin.finder.live.view.k0 basePluginLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(basePluginLayout, "basePluginLayout");
        this.f13675d = k0Var;
        this.f13676e = context;
        this.f13677f = buContext;
        this.f13678g = basePluginLayout;
    }

    public final void a(boolean z17, boolean z18) {
        android.content.Context context = this.f13676e;
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 0);
        r45.r02 r02Var = new r45.r02();
        r02Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (!z17) {
            r02Var.set(1, java.lang.Integer.valueOf(z18 ? 1 : 0));
        }
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(r02Var.toByteArray()));
        gk2.e eVar = this.f13677f;
        pm0.v.T(new ek2.r1(((ct2.j) eVar.a(ct2.j.class)).O6(), ((ct2.j) eVar.a(ct2.j.class)).Q6(), 1, hx0Var).l(), new at2.g0(f17, z18, this, z17));
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer num;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        ml2.z0 z0Var = ml2.z0.f328330a;
        android.content.Context context = this.f13676e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f13675d;
        gk2.e eVar = this.f13677f;
        if (valueOf == null) {
            k0Var = k0Var3;
            num = valueOf;
        } else {
            num = valueOf;
            if (valueOf.intValue() == 1) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n;
                if (finderObject != null) {
                    k0Var2 = k0Var3;
                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
                    a17.setEcSource(((mm2.c1) eVar.a(mm2.c1.class)).f328786c3);
                    i95.m c17 = i95.n0.c(c61.ub.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    c61.ub.ah((c61.ub) c17, (androidx.appcompat.app.AppCompatActivity) context, a17, null, 0, null, 28, null);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("object_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
                    jSONObject.put("share_des", "chat");
                    z0Var.a(jSONObject);
                    zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                    ml2.o3[] o3VarArr = ml2.o3.f327773d;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
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
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328846n;
            if (finderObject2 != null) {
                com.tencent.mm.plugin.finder.storage.FinderItem a18 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject2, 16384);
                a18.setEcSource(((mm2.c1) eVar.a(mm2.c1.class)).f328786c3);
                i95.m c18 = i95.n0.c(c61.ub.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                c61.ub.I2((c61.ub) c18, (androidx.appcompat.app.AppCompatActivity) context, new so2.h1(a18), null, 0, 0, 28, null);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("object_id", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
                jSONObject3.put("share_des", "moment");
                z0Var.a(jSONObject3);
                zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr2 = ml2.o3.f327773d;
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                ((ml2.j0) zbVar2).Wj("share_record_duration", jSONObject4);
            }
            if (k0Var != null) {
                k0Var.u();
            }
        } else {
            if (num == null || num.intValue() != 4) {
                if (num != null && num.intValue() == 9) {
                    com.tencent.mm.plugin.finder.live.util.y.n(this.f13678g, null, null, new at2.d0(this, null), 3, null);
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
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                k0Var4.t(true);
                kotlin.jvm.internal.o.g(context, "context");
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489272by3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
                textView.setGravity(17);
                textView.setText(mm2.g0.Q6((mm2.g0) eVar.a(mm2.g0.class), null, 1, null) ? context.getResources().getString(com.tencent.mm.R.string.eaj) : context.getResources().getString(com.tencent.mm.R.string.eai));
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
                textView.setTextSize(1, 14.0f);
                k0Var4.s(inflate, false);
                k0Var4.f211872n = new at2.e0(this);
                k0Var4.f211881s = new at2.f0(this);
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
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mars.xlog.Log.i("FinderExposeLogic", "liveRepalyExpose liveId:" + O6 + ",exposeUrl:https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=80,username:" + N6 + ",commentSeq:null");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=80", java.util.Arrays.copyOf(new java.lang.Object[]{62, java.lang.Long.valueOf(O6), N6, ""}, 4));
            kotlin.jvm.internal.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            if (k0Var != null) {
                k0Var.u();
            }
        }
    }
}
