package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailPreference */
/* loaded from: classes15.dex */
public class ActivityC13046xc6d7135c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f176290d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public tt1.j f176291e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f176292f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f176293g;

    public final void V6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(this, null), -1);
    }

    public final void W6(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(this, null);
        if (android.text.TextUtils.isEmpty(str)) {
            c21568x1a71b23b.L(" ");
        } else {
            c21568x1a71b23b.L(str);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(c21568x1a71b23b, -1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getFooterView */
    public android.view.View mo48671x42edd6d6() {
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvb, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ne6);
        this.f176293g = textView;
        textView.setVisibility(8);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576370k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView;
        tt1.j jVar = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        this.f176291e = jVar;
        if (jVar == null || jVar.s0() == null || this.f176291e.i0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(this.f176291e.s0().f470101y)) {
            sb6.append(this.f176291e.s0().f470101y);
        }
        sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.as7));
        mo54450xbf7c1df6(sb6.toString());
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n(this));
        this.f176292f = m79336x8b97809d();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f176290d;
        arrayList.clear();
        if (this.f176291e.i0().f466718h != null && this.f176291e.i0().f466718h.size() > 0) {
            arrayList.addAll(lu1.a0.c(this.f176291e.i0().f466718h));
        }
        if (this.f176291e.i0().f466719i != null && this.f176291e.i0().f466719i.size() > 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) lu1.a0.c(this.f176291e.i0().f466719i);
            ((xt1.b) arrayList2.get(0)).f537977u = true;
            arrayList.addAll(arrayList2);
        }
        V6();
        if (this.f176291e.s0().f470094t != null && this.f176291e.s0().f470094t != null) {
            for (int i17 = 0; i17 < this.f176291e.s0().f470094t.size(); i17++) {
                r45.w50 w50Var = (r45.w50) this.f176291e.s0().f470094t.get(i17);
                if (!android.text.TextUtils.isEmpty(w50Var.f470412e)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138 c13080xf8627138 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138(this);
                    c13080xf8627138.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                    c13080xf8627138.L(w50Var.f470412e);
                    c13080xf8627138.M(false);
                    c13080xf8627138.P = false;
                    W6(w50Var.f470411d);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(c13080xf8627138, -1);
                }
            }
            V6();
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            xt1.b bVar = (xt1.b) arrayList.get(i18);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
            c21560x1fce98fb.C(bVar.f461376d);
            c21560x1fce98fb.L(bVar.f461376d);
            if (!android.text.TextUtils.isEmpty(bVar.f461377e)) {
                c21560x1fce98fb.H(bVar.f461377e);
            }
            if (bVar.f537977u) {
                V6();
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(c21560x1fce98fb, -1);
        }
        if (!android.text.TextUtils.isEmpty(this.f176291e.s0().f470095u)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138 c13080xf86271382 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138(this);
            c13080xf86271382.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
            c13080xf86271382.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.auj));
            c13080xf86271382.C("key_pic_detail");
            c13080xf86271382.M(false);
            c13080xf86271382.P = false;
            V6();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(c13080xf86271382, -1);
        }
        if (!android.text.TextUtils.isEmpty(this.f176291e.s0().f470092r)) {
            V6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138 c13080xf86271383 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13080xf8627138(this);
            c13080xf86271383.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
            c13080xf86271383.C("card_phone");
            c13080xf86271383.J(com.p314xaae8f345.mm.R.C30867xcad56011.aty);
            c13080xf86271383.H(this.f176291e.s0().f470092r);
            int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
            c13080xf86271383.M = color;
            android.widget.TextView textView2 = c13080xf86271383.L;
            if (textView2 != null && color != 0) {
                textView2.setTextColor(color);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f176292f).d(c13080xf86271383, -1);
            W6("");
        }
        if (this.f176291e.s0() == null || android.text.TextUtils.isEmpty(this.f176291e.s0().f470097w) || (textView = this.f176293g) == null) {
            return;
        }
        textView.setText(this.f176291e.s0().f470097w);
        this.f176293g.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb.f279313q.equals("card_phone")) {
            java.lang.String str = this.f176291e.s0().f470092r;
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(android.net.Uri.parse("tel:" + str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/util/CardActivityHelper", "doDial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/card/util/CardActivityHelper", "doDial", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (!c21560x1fce98fb.f279313q.equals("key_pic_detail")) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f176290d;
                if (i17 >= arrayList2.size()) {
                    break;
                }
                xt1.b bVar = (xt1.b) arrayList2.get(i17);
                java.lang.String str2 = bVar.f461376d;
                if (str2 != null && str2.equals(c21560x1fce98fb.f279313q) && !android.text.TextUtils.isEmpty(bVar.f461379g)) {
                    if (lu1.d.d(this.f176291e.g(), bVar.f461384o, bVar.f461385p, 1028, 0)) {
                        return false;
                    }
                    lu1.d.j(this, bVar.f461379g, 1);
                }
                i17++;
            }
        } else {
            lu1.d.j(this, this.f176291e.s0().f470095u, 0);
        }
        return false;
    }
}
