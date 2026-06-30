package com.p314xaae8f345.mm.ui.p2745x3238195a;

/* renamed from: com.tencent.mm.ui.voicesearch.SearchConversationResultUI */
/* loaded from: classes11.dex */
public class ActivityC22592xd42f1efc extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f292703d;

    /* renamed from: e, reason: collision with root package name */
    public yk5.e f292704e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f292705f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f292706g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4m;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f292703d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f569149p70);
        this.f292706g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dg6);
        yk5.e eVar = new yk5.e(getApplicationContext(), new yk5.f(this));
        this.f292704e = eVar;
        eVar.f544408o = new java.util.LinkedList();
        eVar.mo735xb0dfc7d8(null, null);
        this.f292703d.setAdapter((android.widget.ListAdapter) this.f292704e);
        this.f292706g.setVisibility(8);
        this.f292705f = getIntent().getStringExtra("SearchConversationResult_User");
        getIntent().getStringExtra("SearchConversationResult_Error");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_c));
        mo54448x9c8c0d33(new yk5.g(this));
        this.f292703d.setOnItemClickListener(new yk5.h(this));
        java.lang.String str = this.f292705f;
        this.f292706g.setVisibility(8);
        yk5.e eVar2 = this.f292704e;
        if (eVar2 != null) {
            eVar2.f544412s = str;
            eVar2.c();
            eVar2.q();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f292704e.c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }
}
