package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes11.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272176e;

    public s4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, java.lang.String str) {
        this.f272176e = c19666xfd6e2f33;
        this.f272175d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$96", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String targetUsername = this.f272175d;
        boolean J4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(targetUsername);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272176e;
        if (J4) {
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            android.app.Activity g17 = c19666xfd6e2f33.f271488a3.a().g();
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = c19666xfd6e2f33.Y2;
            fr4.g0 g0Var = (fr4.g0) fVar;
            g0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
            java.lang.String str = g0Var.f347358i.f68903xdec927b;
            if (str == null) {
                str = "";
            }
            java.lang.String z07 = g0Var.Vi().z0(targetUsername);
            java.lang.String m78394x7e63ed49 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_scene") : null;
            if (m78394x7e63ed49 == null) {
                m78394x7e63ed49 = "0";
            }
            java.lang.String str2 = m78394x7e63ed49;
            java.lang.String m78394x7e63ed492 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_scene_note") : null;
            java.lang.String str3 = m78394x7e63ed492 == null ? "" : m78394x7e63ed492;
            java.lang.String m78394x7e63ed493 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_session_id") : null;
            java.lang.String str4 = m78394x7e63ed493 != null ? m78394x7e63ed493 : "";
            boolean b17 = abstractViewOnAttachStateChangeListenerC21400xb429b010 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractViewOnAttachStateChangeListenerC21400xb429b010.m78383x21a1233e("key_w1w_conv_is_hello", false), java.lang.Boolean.TRUE) : false;
            q80.d0 d0Var = new q80.d0();
            d0Var.f442182a = "wxalite2fd372f050eecd471a4392786dfae78c";
            d0Var.f442183b = "pages/midway-step/entry";
            d0Var.f442185d = java.lang.Boolean.TRUE;
            d0Var.f442190i = 0;
            d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea;
            d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = new fr4.b0(sVar, g17, abstractViewOnAttachStateChangeListenerC21400xb429b010, z07);
            d0Var.f442205x = sVar;
            java.lang.String b18 = mr4.a.b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.lang.Integer h17 = r26.h0.h(str2);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, h17 != null ? h17.intValue() : 0);
                jSONObject.put("sceneNote", str3);
                jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str4);
                fr4.s[] sVarArr = fr4.s.f347393d;
                jSONObject.put("referrerPagePath", "w1w-personal-msg-chat");
                jSONObject.put("referrerClickId", b18);
                fr4.o[] oVarArr = fr4.o.f347383d;
                jSONObject.put("type", 6);
                jSONObject.put("fromUsername", str);
                jSONObject.put("toUsername", z07);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "Failed to create query JSON for identity change", e17);
            }
            d0Var.f442184c = jSONObject.toString();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(g17, d0Var, new fr4.c0(g0Var, str2, str3, abstractViewOnAttachStateChangeListenerC21400xb429b010, b18, targetUsername, b17));
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            final android.app.Activity context = c19666xfd6e2f33.f271488a3.a().g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
            e3Var.g(android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.due, null), new android.widget.FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, -2));
            e3Var.a();
            e3Var.c(true);
            android.view.View view2 = e3Var.f213492f;
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.obc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            final android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.c9z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view2.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
            c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderWxProfileApi$openIdHalf$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cn(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jn(textView2, context, arrayList2, c22849x81a93d25));
                }
            }, arrayList2, false));
            int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214054b = m75939xb282bd08;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214055c = m75939xb282bd08;
            for (r45.of1 of1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a()) {
                java.lang.String m75945x2fec8307 = of1Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                int m75939xb282bd082 = of1Var.m75939xb282bd08(2);
                java.lang.String m75945x2fec83072 = of1Var.m75945x2fec8307(1);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dn(m75945x2fec8307, m75939xb282bd082, m75945x2fec83072));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            textView2.setEnabled(false);
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ln(context, e3Var, targetUsername));
            e3Var.i();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$96", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
