package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI */
/* loaded from: classes11.dex */
public class ActivityC18539xe0826959 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f253953d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f253954e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f253955f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f253956g;

    static {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2s;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bkf);
        mo54448x9c8c0d33(new gg4.n(this));
        this.f253956g = new java.util.HashMap();
        this.f253953d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.m1s);
        this.f253953d.setEmptyView((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dez));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("result");
        int intExtra = getIntent().getIntExtra("add_more_friend_search_scene", 0);
        if (byteArrayExtra != null) {
            try {
                r45.iw5 iw5Var = (r45.iw5) new r45.iw5().mo11468x92b714fd(byteArrayExtra);
                if (iw5Var != null) {
                    this.f253954e = iw5Var.E;
                    this.f253955f = iw5Var.N;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactSearchResultUI", e17, "SearchContactResponse", new java.lang.Object[0]);
                try {
                    this.f253955f.add((r45.cx5) new r45.cx5().mo11468x92b714fd(byteArrayExtra));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactSearchResultUI", e18, "SearchOpenIMContactItem", new java.lang.Object[0]);
                }
            }
        }
        if (this.f253954e.size() == 0 && this.f253955f.isEmpty()) {
            return;
        }
        this.f253953d.setAdapter((android.widget.ListAdapter) new gg4.p(this, this));
        this.f253953d.setOnItemClickListener(new gg4.o(this, intExtra));
        this.f253953d.setOnScrollListener(new bb5.a());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().a();
        java.util.Map map = this.f253956g;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        super.onDestroy();
    }
}
