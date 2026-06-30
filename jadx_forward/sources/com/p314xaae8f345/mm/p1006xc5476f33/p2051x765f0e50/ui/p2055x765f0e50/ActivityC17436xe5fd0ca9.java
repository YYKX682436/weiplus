package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI */
/* loaded from: classes5.dex */
public class ActivityC17436xe5fd0ca9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f242048e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f242049f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f242050g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f242051h = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570982cl4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ug(this));
        this.f242048e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.mpy);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mpz)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vg(this));
        java.util.List list = f14.j.f340220e;
        this.f242049f = list;
        if (list == null || list.isEmpty()) {
            this.f242051h = false;
            this.f242048e.removeAllViews();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasCheckUI", "conditions %s", java.lang.Integer.valueOf(this.f242049f.size()));
        this.f242048e.removeAllViews();
        this.f242051h = true;
        for (int i17 = 0; i17 < this.f242049f.size(); i17++) {
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.clq, null);
            ((java.util.ArrayList) this.f242050g).add(inflate);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jpk);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jpi);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jpj);
            textView.setText(((r45.e00) this.f242049f.get(i17)).f454419d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.e00) this.f242049f.get(i17)).f454420e)) {
                textView2.setText(((r45.e00) this.f242049f.get(i17)).f454420e);
                textView2.setVisibility(0);
            }
            textView3.setText(((r45.e00) this.f242049f.get(i17)).f454421f);
            if (((r45.e00) this.f242049f.get(i17)).f454422g) {
                textView3.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
            } else {
                textView3.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
            }
            if (i17 % 2 == 0) {
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.jpl);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jph);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jph);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f242048e.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
            this.f242051h = this.f242051h && ((r45.e00) this.f242049f.get(i17)).f454422g;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }
}
