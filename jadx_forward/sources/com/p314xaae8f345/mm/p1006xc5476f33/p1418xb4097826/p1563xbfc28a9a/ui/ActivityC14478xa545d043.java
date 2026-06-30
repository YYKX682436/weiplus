package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberBanUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.member.ui.FinderMemberBanUI */
/* loaded from: classes3.dex */
public final class ActivityC14478xa545d043 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2o;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.o1.c(eo2.b.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        int intExtra = getIntent().getIntExtra("key_finder_member_status", 0);
        int intExtra2 = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_self_flag", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberBanUI", "create %s, status %d", stringExtra, java.lang.Integer.valueOf(intExtra));
        if (stringExtra == null || intExtra != 2) {
            finish();
            return;
        }
        if (intExtra2 == 0) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_w)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.elm));
            android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b2z);
            button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            button.setOnClickListener(new lo2.c(this));
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a3a)).setVisibility(8);
        } else if (intExtra2 != 2) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_w)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.elm));
            android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b2z);
            button2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            button2.setOnClickListener(new lo2.b(this));
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a3a)).setVisibility(8);
        } else {
            java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eln, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elo), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elp));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo55332x76847179())}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            arrayList.add(format);
            java.lang.String format2 = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?lang=%s&t=weixin_agreement&s=video_guide", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo55332x76847179())}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            arrayList.add(format2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elo));
            arrayList2.add(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elp));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.o_w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f(d8Var, mo55332x76847179, (android.widget.TextView) findViewById, "Finder.FinderMemberBanUI", string, arrayList, arrayList2, null, 64, null);
            android.widget.Button button3 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b2z);
            button3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            button3.setOnClickListener(new lo2.a(this));
            if (booleanExtra) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
                if (I0 != null && L0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("3", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("AuthorProfileMemberShipZone");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderMyTab", new int[]{32});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        }
        mo74406x9c8c0d33(new lo2.d(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
    }
}
