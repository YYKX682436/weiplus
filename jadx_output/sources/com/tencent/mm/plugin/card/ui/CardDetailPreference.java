package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardDetailPreference extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f94757d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public tt1.j f94758e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f94759f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f94760g;

    public final void V6() {
        ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(this, null), -1);
    }

    public final void W6(java.lang.String str) {
        com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(this, null);
        if (android.text.TextUtils.isEmpty(str)) {
            preferenceTitleCategory.L(" ");
        } else {
            preferenceTitleCategory.L(str);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(preferenceTitleCategory, -1);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getFooterView() {
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.cvb, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ne6);
        this.f94760g = textView;
        textView.setVisibility(8);
        return inflate;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494837k;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView;
        tt1.j jVar = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        this.f94758e = jVar;
        if (jVar == null || jVar.s0() == null || this.f94758e.i0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(this.f94758e.s0().f388568y)) {
            sb6.append(this.f94758e.s0().f388568y);
        }
        sb6.append(getString(com.tencent.mm.R.string.as7));
        setMMTitle(sb6.toString());
        setBackBtn(new com.tencent.mm.plugin.card.ui.n(this));
        this.f94759f = getPreferenceScreen();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f94757d;
        arrayList.clear();
        if (this.f94758e.i0().f385185h != null && this.f94758e.i0().f385185h.size() > 0) {
            arrayList.addAll(lu1.a0.c(this.f94758e.i0().f385185h));
        }
        if (this.f94758e.i0().f385186i != null && this.f94758e.i0().f385186i.size() > 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) lu1.a0.c(this.f94758e.i0().f385186i);
            ((xt1.b) arrayList2.get(0)).f456444u = true;
            arrayList.addAll(arrayList2);
        }
        V6();
        if (this.f94758e.s0().f388561t != null && this.f94758e.s0().f388561t != null) {
            for (int i17 = 0; i17 < this.f94758e.s0().f388561t.size(); i17++) {
                r45.w50 w50Var = (r45.w50) this.f94758e.s0().f388561t.get(i17);
                if (!android.text.TextUtils.isEmpty(w50Var.f388879e)) {
                    com.tencent.mm.plugin.card.widget.CardTextPreference cardTextPreference = new com.tencent.mm.plugin.card.widget.CardTextPreference(this);
                    cardTextPreference.G = com.tencent.mm.R.layout.byv;
                    cardTextPreference.L(w50Var.f388879e);
                    cardTextPreference.M(false);
                    cardTextPreference.P = false;
                    W6(w50Var.f388878d);
                    ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(cardTextPreference, -1);
                }
            }
            V6();
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            xt1.b bVar = (xt1.b) arrayList.get(i18);
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            preference.G = com.tencent.mm.R.layout.byv;
            preference.C(bVar.f379843d);
            preference.L(bVar.f379843d);
            if (!android.text.TextUtils.isEmpty(bVar.f379844e)) {
                preference.H(bVar.f379844e);
            }
            if (bVar.f456444u) {
                V6();
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(preference, -1);
        }
        if (!android.text.TextUtils.isEmpty(this.f94758e.s0().f388562u)) {
            com.tencent.mm.plugin.card.widget.CardTextPreference cardTextPreference2 = new com.tencent.mm.plugin.card.widget.CardTextPreference(this);
            cardTextPreference2.G = com.tencent.mm.R.layout.byv;
            cardTextPreference2.L(getString(com.tencent.mm.R.string.auj));
            cardTextPreference2.C("key_pic_detail");
            cardTextPreference2.M(false);
            cardTextPreference2.P = false;
            V6();
            ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(cardTextPreference2, -1);
        }
        if (!android.text.TextUtils.isEmpty(this.f94758e.s0().f388559r)) {
            V6();
            com.tencent.mm.plugin.card.widget.CardTextPreference cardTextPreference3 = new com.tencent.mm.plugin.card.widget.CardTextPreference(this);
            cardTextPreference3.G = com.tencent.mm.R.layout.byv;
            cardTextPreference3.C("card_phone");
            cardTextPreference3.J(com.tencent.mm.R.string.aty);
            cardTextPreference3.H(this.f94758e.s0().f388559r);
            int color = getResources().getColor(com.tencent.mm.R.color.f479308vo);
            cardTextPreference3.M = color;
            android.widget.TextView textView2 = cardTextPreference3.L;
            if (textView2 != null && color != 0) {
                textView2.setTextColor(color);
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f94759f).d(cardTextPreference3, -1);
            W6("");
        }
        if (this.f94758e.s0() == null || android.text.TextUtils.isEmpty(this.f94758e.s0().f388564w) || (textView = this.f94760g) == null) {
            return;
        }
        textView.setText(this.f94758e.s0().f388564w);
        this.f94760g.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("card_phone")) {
            java.lang.String str = this.f94758e.s0().f388559r;
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
        if (!preference.f197780q.equals("key_pic_detail")) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f94757d;
                if (i17 >= arrayList2.size()) {
                    break;
                }
                xt1.b bVar = (xt1.b) arrayList2.get(i17);
                java.lang.String str2 = bVar.f379843d;
                if (str2 != null && str2.equals(preference.f197780q) && !android.text.TextUtils.isEmpty(bVar.f379846g)) {
                    if (lu1.d.d(this.f94758e.g(), bVar.f379851o, bVar.f379852p, 1028, 0)) {
                        return false;
                    }
                    lu1.d.j(this, bVar.f379846g, 1);
                }
                i17++;
            }
        } else {
            lu1.d.j(this, this.f94758e.s0().f388562u, 0);
        }
        return false;
    }
}
