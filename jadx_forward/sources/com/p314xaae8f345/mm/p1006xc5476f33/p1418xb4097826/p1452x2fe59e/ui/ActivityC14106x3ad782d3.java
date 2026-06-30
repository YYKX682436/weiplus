package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI */
/* loaded from: classes2.dex */
public final class ActivityC14106x3ad782d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afu;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        super.onCreate(bundle);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.un(this), com.p314xaae8f345.mm.R.raw.f79678x41464de0);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ec7);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vn(this));
        java.lang.String stringExtra = getIntent().getStringExtra("SWITCH_TO_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("Contact_Finder_Buffer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileShowUI", "username:" + stringExtra + ", contactBuffer:" + byteArrayExtra);
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.crb, stringExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ec6)).setText(string);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565996ec5);
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.mo11468x92b714fd(byteArrayExtra);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.e7n);
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(c19782x23db1cfa.m76175x6d346f39(), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
            java.lang.String str = m76184x8010e5e4 != null ? m76184x8010e5e4 : "";
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.e7v);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
            i17 = 0;
        } else {
            i17 = 4;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
