package wu3;

/* loaded from: classes5.dex */
public final class g2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f531280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.content.Context context) {
        super(context);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.z0.b();
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dxr, this);
        setGravity(1);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s_e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(m174459x534f0d39());
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s_d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2q));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.s_c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f531280d = (android.widget.LinearLayout) findViewById3;
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        java.util.ArrayList<qu3.e> arrayList = null;
        if (e0Var != null && (Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_806b4baf", "SecondCutPromotionItems")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRSecondCutPromotionItems", "Resource info: %s", Ui.toString());
            java.lang.String c17 = Ui.c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRSecondCutPromotionItems", "resource.postPath is null");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c17, "resource");
                if (r6Var.m() && r6Var.y()) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l("config.json", false, true);
                    com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
                    if (l17 != null && !l17.isEmpty()) {
                        java.lang.String str = z7Var.f294812f;
                        z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
                    }
                    com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
                    if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                        try {
                            java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(z7Var.m82499x9616526c());
                            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? "description_zh_Hans" : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? "description_zh_Hant" : "description_en";
                            try {
                                org.json.JSONArray jSONArray = new org.json.JSONArray(M);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                c75.c.d(jSONArray, new qu3.f(r6Var, str2, arrayList2));
                                arrayList = arrayList2;
                            } catch (java.lang.ClassCastException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRSecondCutPromotionItems", "ClassCastException: " + e17.getMessage());
                            } catch (org.json.JSONException e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRSecondCutPromotionItems", "Parse config json error: " + e18.getMessage());
                            }
                        } catch (java.io.IOException unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRSecondCutPromotionItems", "Read config file %s failed", z7Var.m82499x9616526c());
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UDRSecondCutPromotionItems", "Config file doesn't exist");
                    }
                }
            }
        }
        android.widget.LinearLayout linearLayout = this.f531280d;
        if (arrayList == null) {
            android.content.Context context2 = linearLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            zu3.q qVar = new zu3.q(context2);
            qVar.a(com.p314xaae8f345.mm.R.raw.f80131x34336bc8, com.p314xaae8f345.mm.R.C30867xcad56011.n0u);
            linearLayout.addView(qVar);
            android.content.Context context3 = linearLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            zu3.q qVar2 = new zu3.q(context3);
            qVar2.a(com.p314xaae8f345.mm.R.raw.f80072xebd30fe8, com.p314xaae8f345.mm.R.C30867xcad56011.n0t);
            linearLayout.addView(qVar2);
            android.content.Context context4 = linearLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            zu3.q qVar3 = new zu3.q(context4);
            qVar3.a(com.p314xaae8f345.mm.R.raw.f80050x253c5999, com.p314xaae8f345.mm.R.C30867xcad56011.n0s);
            linearLayout.addView(qVar3);
        } else {
            for (qu3.e eVar : arrayList) {
                android.content.Context context5 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                zu3.q qVar4 = new zu3.q(context5);
                java.lang.String iconPath = eVar.f448354a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconPath, "iconPath");
                java.lang.String text = eVar.f448355b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
                ((wo0.b) dw3.w0.f325824a.i(iconPath)).c(qVar4.f557357d);
                qVar4.f557358e.setText(text);
                linearLayout.addView(qVar4);
            }
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "video_edit_other_miaojian_jump");
        ((cy1.a) aVar.ik(this, 32, 32337)).fk(this, "post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
    }

    /* renamed from: getSpannableString */
    private final android.text.SpannableString m174459x534f0d39() {
        java.lang.String r17 = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.n2r);
        android.text.SpannableString spannableString = new android.text.SpannableString(r17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        int K = r26.n0.K(r17, '~', 0, false, 6, null);
        int O = r26.n0.O(r17, '~', 0, false, 6, null);
        if (K != -1 && K != O) {
            wu3.f2 f2Var = new wu3.f2(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aih) / 2);
            int i17 = K + 1;
            spannableString.setSpan(f2Var, K, i17, 17);
            spannableString.setSpan(f2Var, O, O + 1, 17);
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80165xc56c5cce, -16777216);
            int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
            e17.setBounds(0, 0, h17, h17);
            spannableString.setSpan(new wu3.e2(e17), K, i17, 33);
        }
        return spannableString;
    }
}
