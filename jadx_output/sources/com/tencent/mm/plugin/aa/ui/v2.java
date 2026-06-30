package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f72850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72851e;

    public v2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI, java.util.List list, java.util.Map map, java.util.List list2) {
        this.f72851e = launchAAByPersonAmountSelectUI;
        this.f72850d = null;
        this.f72850d = new java.util.ArrayList();
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.C;
        if (!launchAAByPersonAmountSelectUI.i7() || list2 == null || list2.size() <= 0 || list.size() != list2.size()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mm.plugin.aa.ui.w2 w2Var = new com.tencent.mm.plugin.aa.ui.w2(launchAAByPersonAmountSelectUI, null);
                w2Var.f72870a = str;
                if (map == null || !map.containsKey(str)) {
                    w2Var.f72871b = "";
                } else {
                    w2Var.f72871b = launchAAByPersonAmountSelectUI.getString(com.tencent.mm.R.string.f489716p, map.get(str));
                }
                this.f72850d.add(w2Var);
            }
            return;
        }
        for (int i18 = 0; i18 <= list.size() - 1; i18++) {
            java.lang.String str2 = (java.lang.String) list.get(i18);
            java.lang.String str3 = (java.lang.String) list2.get(i18);
            com.tencent.mm.plugin.aa.ui.w2 w2Var2 = new com.tencent.mm.plugin.aa.ui.w2(launchAAByPersonAmountSelectUI, null);
            w2Var2.f72870a = str2;
            w2Var2.f72872c = str3;
            if (map == null || !map.containsKey(str2)) {
                w2Var2.f72871b = "";
            } else {
                w2Var2.f72871b = launchAAByPersonAmountSelectUI.getString(com.tencent.mm.R.string.f489716p, map.get(str2));
            }
            this.f72850d.add(w2Var2);
        }
    }

    public void a(java.util.Map map) {
        java.util.List list = this.f72850d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.aa.ui.w2) it.next()).f72871b = "";
        }
        if (map == null || map.size() <= 0) {
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.aa.ui.w2 w2Var = (com.tencent.mm.plugin.aa.ui.w2) it6.next();
            if (map.containsKey(w2Var.f72870a)) {
                w2Var.f72871b = (java.lang.String) map.get(w2Var.f72870a);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f72850d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.aa.ui.w2) ((java.util.ArrayList) this.f72850d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.util.List list = this.f72850d;
        com.tencent.mm.plugin.aa.ui.w2 w2Var = (com.tencent.mm.plugin.aa.ui.w2) ((java.util.ArrayList) list).get(i17);
        if (w2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(w2Var.f72870a)) {
            return view;
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72851e;
        if (view == null) {
            view2 = com.tencent.mm.ui.id.b(launchAAByPersonAmountSelectUI).inflate(com.tencent.mm.R.layout.bnh, viewGroup, false);
            com.tencent.mm.plugin.aa.ui.u2 u2Var = new com.tencent.mm.plugin.aa.ui.u2(this, null);
            u2Var.f72823a = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.m7g);
            u2Var.f72824b = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.cgc);
            u2Var.f72826d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a9m);
            u2Var.f72827e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ove);
            u2Var.f72828f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f487163nr2);
            u2Var.f72829g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ovd);
            u2Var.f72825c = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f485970jq2);
            u2Var.f72831i = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view2.findViewById(com.tencent.mm.R.id.f485969jq1);
            u2Var.f72830h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hti);
            java.lang.String str = w2Var.f72870a;
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = u2Var.f72831i;
            com.tencent.mm.plugin.aa.ui.x2 x2Var = new com.tencent.mm.plugin.aa.ui.x2(launchAAByPersonAmountSelectUI, str, walletFormView);
            u2Var.f72832j = x2Var;
            walletFormView.b(x2Var);
            u2Var.f72831i.setAccessibilityDelegate(new com.tencent.mm.plugin.aa.ui.r2(this, u2Var));
            u2Var.f72831i.getContentEt().setImportantForAccessibility(2);
            view2.setTag(u2Var);
            launchAAByPersonAmountSelectUI.setEditFocusListener(u2Var.f72831i, 2, false, true);
        } else {
            view2 = view;
        }
        com.tencent.mm.plugin.aa.ui.u2 u2Var2 = (com.tencent.mm.plugin.aa.ui.u2) view2.getTag();
        com.tencent.mm.plugin.aa.ui.s2 s2Var = new com.tencent.mm.plugin.aa.ui.s2(this, w2Var, u2Var2);
        u2Var2.f72823a.setOnTouchListener(s2Var);
        u2Var2.f72826d.setOnTouchListener(s2Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(w2Var.f72870a)) {
            u2Var2.f72832j.f72882d = w2Var.f72870a;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(u2Var2.f72826d, w2Var.f72870a, null);
            android.widget.TextView textView = u2Var2.f72827e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = launchAAByPersonAmountSelectUI.getContext();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = w2Var.f72870a;
            java.lang.String str3 = launchAAByPersonAmountSelectUI.f72497z;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(str2, str3);
            float textSize = u2Var2.f72827e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, f17, textSize));
            if (c01.z1.r().equals(w2Var.f72870a)) {
                u2Var2.f72827e.setText(((java.lang.Object) u2Var2.f72827e.getText()) + launchAAByPersonAmountSelectUI.getString(com.tencent.mm.R.string.f489751ao));
            }
        }
        if (w2Var.f72871b != null && u2Var2.f72831i.getText() != null && !w2Var.f72871b.equals(u2Var2.f72831i.getText().toLowerCase())) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = u2Var2.f72831i;
            com.tencent.mm.plugin.aa.ui.x2 x2Var2 = u2Var2.f72832j;
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView2.f214161h;
            if (tenpaySecureEditText != null) {
                tenpaySecureEditText.removeTextChangedListener(x2Var2);
            }
            u2Var2.f72831i.setText(w2Var.f72871b);
            u2Var2.f72831i.b(u2Var2.f72832j);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w2Var.f72872c)) {
            u2Var2.f72829g.setVisibility(8);
            u2Var2.f72824b.setGravity(16);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) u2Var2.f72825c.getLayoutParams();
            layoutParams.gravity = 21;
            u2Var2.f72825c.setLayoutParams(layoutParams);
        } else {
            u2Var2.f72829g.setText(h61.o.j(60, w2Var.f72872c));
            u2Var2.f72829g.setVisibility(0);
            u2Var2.f72829g.post(new com.tencent.mm.plugin.aa.ui.t2(this, u2Var2));
            u2Var2.f72824b.setGravity(48);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) u2Var2.f72825c.getLayoutParams();
            layoutParams2.gravity = 53;
            u2Var2.f72825c.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = u2Var2.f72831i;
        if (walletFormView3 == null || walletFormView3.getText() == null || com.tencent.mm.wallet_core.ui.r1.h0(u2Var2.f72831i.getText(), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= launchAAByPersonAmountSelectUI.f72492u) {
            u2Var2.f72831i.setContentTextColorRes(com.tencent.mm.R.color.a0c);
        } else {
            u2Var2.f72831i.setContentTextColorRes(com.tencent.mm.R.color.f478532ac);
        }
        if (i17 == 0) {
            u2Var2.f72823a.setBackgroundResource(com.tencent.mm.R.drawable.aip);
        } else if (i17 == ((java.util.ArrayList) list).size() - 1) {
            u2Var2.f72823a.setBackgroundResource(com.tencent.mm.R.drawable.aiq);
        } else {
            u2Var2.f72823a.setBackgroundResource(com.tencent.mm.R.drawable.aio);
        }
        if (!com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.f7(launchAAByPersonAmountSelectUI, w2Var)) {
            u2Var2.f72826d.setAlpha(1.0f);
            u2Var2.f72827e.setAlpha(1.0f);
            u2Var2.f72830h.setAlpha(1.0f);
            u2Var2.f72830h.setVisibility(0);
            u2Var2.f72831i.setAlpha(1.0f);
            u2Var2.f72831i.setVisibility(0);
            u2Var2.f72829g.setAlpha(1.0f);
            u2Var2.f72826d.setAlpha(1.0f);
            u2Var2.f72827e.setAlpha(1.0f);
            u2Var2.f72830h.setAlpha(1.0f);
            u2Var2.f72831i.setAlpha(1.0f);
            u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setFocusable(true);
            u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setFocusableInTouchMode(true);
            u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setClickable(true);
            u2Var2.f72828f.setVisibility(4);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context2 = launchAAByPersonAmountSelectUI.getContext();
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = w2Var.f72870a;
            java.lang.String str5 = launchAAByPersonAmountSelectUI.f72497z;
            ((sg3.a) v0Var2).getClass();
            java.lang.String f18 = c01.a2.f(str4, str5);
            float textSize2 = u2Var2.f72827e.getTextSize();
            ((ke0.e) xVar2).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s", com.tencent.mm.pluginsdk.ui.span.c0.j(context2, f18, textSize2).toString(), w2Var.f72870a);
            return view2;
        }
        u2Var2.f72826d.setAlpha(0.3f);
        u2Var2.f72827e.setAlpha(0.3f);
        u2Var2.f72830h.setAlpha(0.3f);
        u2Var2.f72831i.setAlpha(0.15f);
        u2Var2.f72826d.setAlpha(0.3f);
        u2Var2.f72827e.setAlpha(0.3f);
        u2Var2.f72829g.setAlpha(0.3f);
        u2Var2.f72830h.setAlpha(0.3f);
        u2Var2.f72830h.setVisibility(8);
        u2Var2.f72831i.setAlpha(0.15f);
        u2Var2.f72831i.setVisibility(8);
        u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setFocusable(false);
        u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setFocusableInTouchMode(false);
        u2Var2.f72831i.findViewById(com.tencent.mm.R.id.pbn).setClickable(false);
        java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(w2Var.f72870a, true));
        u2Var2.f72828f.setVisibility(0);
        u2Var2.f72828f.setText(a17);
        u2Var2.f72828f.setAlpha(0.3f);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context3 = launchAAByPersonAmountSelectUI.getContext();
        tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str6 = w2Var.f72870a;
        java.lang.String str7 = launchAAByPersonAmountSelectUI.f72497z;
        ((sg3.a) v0Var3).getClass();
        java.lang.String f19 = c01.a2.f(str6, str7);
        float textSize3 = u2Var2.f72827e.getTextSize();
        ((ke0.e) xVar3).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "username：%s，data.username：%s,subName:%s", com.tencent.mm.pluginsdk.ui.span.c0.j(context3, f19, textSize3).toString(), w2Var.f72870a, a17);
        return view2;
    }
}
