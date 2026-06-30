package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI */
/* loaded from: classes.dex */
public final class ActivityC14045x34601d2c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public r45.ke2 A;

    /* renamed from: v, reason: collision with root package name */
    public ky2.z f190977v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f190978w;

    /* renamed from: x, reason: collision with root package name */
    public long f190979x;

    /* renamed from: y, reason: collision with root package name */
    public int f190980y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f190981z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ank;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList m75941xfb821914;
        super.onCreate(bundle);
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78578x8b18f126(color);
        mo64405x4dab7448(color);
        getWindow().setStatusBarColor(color);
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejp));
        mo54451xb23a6b0d(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ef(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.p9r);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p9b);
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        ky2.z zVar = new ky2.z();
        this.f190977v = zVar;
        c22849x81a93d25.mo7960x6cab2c8d(zVar);
        java.lang.String stringExtra = getIntent().getStringExtra("finderlivedetailparamusername");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f190978w = stringExtra;
        this.f190979x = getIntent().getLongExtra("finderlivehistoryparamobjectid", 0L);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("finderlivehistoryparamvotinginfo");
        if (byteArrayExtra != null) {
            r45.ke2 ke2Var = new r45.ke2();
            try {
                ke2Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                ke2Var = null;
            }
            this.A = ke2Var;
            this.f190981z = ke2Var != null ? ke2Var.m75934xbce7f2f(1) : null;
            r45.ke2 ke2Var2 = this.A;
            this.f190980y = ke2Var2 != null ? ke2Var2.m75939xb282bd08(2) : 0;
            r45.ke2 ke2Var3 = this.A;
            if (((ke2Var3 == null || (m75941xfb821914 = ke2Var3.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size()) <= 0) {
                c22849x81a93d25.setVisibility(8);
                textView.setVisibility(0);
            } else {
                ky2.z zVar2 = this.f190977v;
                if (zVar2 != null) {
                    r45.ke2 ke2Var4 = this.A;
                    r4 = ke2Var4 != null ? ke2Var4.m75941xfb821914(0) : null;
                    java.util.ArrayList arrayList = zVar2.f395136d;
                    arrayList.clear();
                    if (r4 != null) {
                        arrayList.addAll(r4);
                        zVar2.m8146xced61ae5();
                    }
                }
                ky2.z zVar3 = this.f190977v;
                if (zVar3 != null) {
                    zVar3.f395137e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.bf(this);
                }
                c22849x81a93d25.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.df(this));
            }
            r4 = jz5.f0.f384359a;
        }
        if (r4 == null) {
            c22849x81a93d25.setVisibility(8);
            textView.setVisibility(0);
        }
    }
}
