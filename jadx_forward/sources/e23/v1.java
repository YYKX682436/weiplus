package e23;

/* loaded from: classes12.dex */
public class v1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.x1 f328506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(e23.x1 x1Var, int i17) {
        super(x1Var);
        this.f328506b = x1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View inflate;
        int i17;
        e23.x1 x1Var = (e23.x1) gVar;
        e23.w1 w1Var = (e23.w1) eVar;
        e23.x1 x1Var2 = this.f328506b;
        h45.v vVar = x1Var2.f328524t;
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSWXPayNotifyMsgContentDataItem", "template is not init");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f360490d)) {
                w1Var.f328509a.setVisibility(8);
            } else {
                w1Var.f328509a.setVisibility(0);
                w1Var.f328510b.m75396xca029dad(x1Var2.f328524t.f360494h);
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e(w1Var.f328511c, x1Var2.f328524t.f360490d, x1Var2.f505295e), w1Var.f328511c);
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(x1Var.f328523s, w1Var.f328512d);
            }
            h45.v vVar2 = x1Var2.f328524t;
            if (vVar2.f360493g || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar2.f360491e)) {
                w1Var.f328513e.setVisibility(8);
            } else {
                w1Var.f328513e.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e(w1Var.f328514f, x1Var2.f328524t.f360491e, x1Var2.f505295e), w1Var.f328514f);
                java.lang.String str = x1Var2.f328524t.f360492f;
                if (str == null) {
                    str = "";
                }
                java.lang.String lowerCase = str.toLowerCase();
                java.lang.String i18 = x1Var.i();
                if (i18 == null) {
                    i18 = "";
                }
                boolean contains = lowerCase.contains(i18.toLowerCase());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x1Var2.f328524t.f360492f) || !contains) {
                    w1Var.f328515g.setVisibility(8);
                } else {
                    w1Var.f328515g.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(e(w1Var.f328515g, x1Var2.f328524t.f360492f, x1Var2.f505295e), w1Var.f328515g);
                }
            }
        }
        java.lang.String i19 = x1Var.i();
        java.util.List list = x1Var2.f328524t.f360498l;
        if (list == null || ((java.util.ArrayList) list).isEmpty() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i19)) {
            w1Var.f328516h.removeAllViews();
            w1Var.f328516h.setVisibility(8);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) x1Var2.f328524t.f360498l).iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = ((h45.u) it.next()).f360484a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i17 = 0;
            } else {
                int i28 = 0;
                i17 = 0;
                while (i28 < str2.length()) {
                    int i29 = i28 + 1;
                    i17 = str2.substring(i28, i29).matches("[Α-￥]") ? i17 + 2 : i17 + 1;
                    i28 = i29;
                }
            }
            i27 = java.lang.Math.max((i17 + 1) / 2, i27);
        }
        int min = java.lang.Math.min(i27, 8);
        java.util.Iterator it6 = ((java.util.ArrayList) x1Var2.f328524t.f360498l).iterator();
        int i37 = 0;
        while (it6.hasNext()) {
            h45.u uVar = (h45.u) it6.next();
            boolean z17 = uVar.f360486c;
            java.lang.String str3 = uVar.f360485b;
            if (str3 == null) {
                str3 = "";
            }
            boolean contains2 = str3.toLowerCase().contains((i19 == null ? "" : i19).toLowerCase());
            if (z17 || contains2) {
                if (i37 < w1Var.f328516h.getChildCount()) {
                    inflate = w1Var.f328516h.getChildAt(i37);
                } else {
                    inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfa, (android.view.ViewGroup) null);
                    w1Var.f328516h.addView(inflate);
                }
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.q86);
                textView.setText(e(textView, uVar.f360484a + "：" + uVar.f360485b, x1Var2.f505295e));
                textView.setEms(min);
                i37++;
            }
        }
        if (i37 < w1Var.f328516h.getChildCount()) {
            android.widget.LinearLayout linearLayout = w1Var.f328516h;
            linearLayout.removeViews(i37, linearLayout.getChildCount() - i37);
        }
        w1Var.f328516h.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.df_, viewGroup, false);
        e23.w1 w1Var = this.f328506b.f328526v;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.q7m);
        float b17 = i65.a.b(context, 8);
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout != null) {
            linearLayout.setClipToOutline(true);
        }
        w1Var.f328509a = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhp);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        w1Var.f328510b = c19659x677e0913;
        float b18 = i65.a.b(context, 20);
        if (c19659x677e0913 != null) {
            c19659x677e0913.setOutlineProvider(new zl5.a(true, true, b18));
        }
        if (c19659x677e0913 != null) {
            c19659x677e0913.setClipToOutline(true);
        }
        w1Var.f328511c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        w1Var.f328512d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxw);
        w1Var.f328513e = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hjo);
        w1Var.f328514f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        w1Var.f328515g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nrm);
        w1Var.f328516h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i2b);
        inflate.setTag(w1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.x1 x1Var = (e23.x1) gVar;
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("Chat_User", "gh_3dfda90e39d6");
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_service_notify_content_search", true);
        intent.putExtra("need_hight_item", true);
        intent.putExtra("chat_from_scene", 8);
        intent.putExtra("msg_local_id", x1Var.f328522r);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27229, 1, 7, this.f328506b.i(), 0, 0, java.lang.Long.valueOf(x1Var.f328521q.f432721f / 1000));
        return true;
    }

    public final java.lang.CharSequence e(android.widget.TextView textView, java.lang.CharSequence charSequence, p13.r rVar) {
        p13.i b17 = p13.i.b(charSequence, rVar);
        b17.f432633h = textView.getPaint();
        return o13.q.e(b17).f432638a;
    }
}
