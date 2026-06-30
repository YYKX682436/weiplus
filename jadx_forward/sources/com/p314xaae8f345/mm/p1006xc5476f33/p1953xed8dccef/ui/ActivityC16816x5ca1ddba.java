package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI */
/* loaded from: classes15.dex */
public class ActivityC16816x5ca1ddba extends com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079 implements y60.e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f234748t = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f234749e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f234750f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f234751g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f234752h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f234753i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ListView f234754m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 f234755n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r0 f234756o = null;

    /* renamed from: p, reason: collision with root package name */
    public wq3.j f234757p;

    /* renamed from: q, reason: collision with root package name */
    public wq3.t f234758q;

    /* renamed from: r, reason: collision with root package name */
    public wq3.l f234759r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w f234760s;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f234757p.e())) {
            return;
        }
        this.f234749e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.p0(this, bitmap));
    }

    public final void T6() {
        xq3.c cVar;
        wq3.t tVar = this.f234758q;
        if (tVar != null) {
            wq3.l lVar = this.f234759r;
            if (lVar == null || (cVar = tVar.f530132e) == null) {
                android.widget.TextView textView = this.f234751g;
                xq3.c cVar2 = tVar.f530132e;
                textView.setText(wq3.h.c(cVar2.f537595g, cVar2.f537596h, cVar2.f537608w));
            } else {
                this.f234751g.setText(wq3.h.c(lVar.f530102i, lVar.f530103m, cVar.f537608w));
            }
            xq3.c cVar3 = this.f234758q.f530132e;
            if (cVar3 != null) {
                this.f234750f.setText(cVar3.f537592d);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f234757p.e())) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o(this.f234757p.e());
            ((x60.e) fVar).getClass();
            this.f234749e.setImageBitmap(x51.w0.d(oVar));
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        }
        this.f234752h.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 c16815x2af38f74 = this.f234755n;
        int g17 = this.f234757p.g();
        int i17 = this.f234757p.f530082b.f530131d;
        if (g17 > i17) {
            c16815x2af38f74.f234744h = 3;
            c16815x2af38f74.f234743g = i17;
        } else {
            c16815x2af38f74.f234744h = 1;
            c16815x2af38f74.f234743g = g17;
        }
        c16815x2af38f74.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var = c16815x2af38f74.f234747n;
        if (k0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var).a(c16815x2af38f74.f234746m);
        }
        this.f234756o.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.caj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        xq3.c cVar;
        java.util.LinkedList linkedList;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.grz);
        this.f234749e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j_x);
        this.f234750f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567375ja1);
        this.f234751g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_z);
        this.f234752h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_w);
        this.f234753i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j_y);
        this.f234754m = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f567378ja4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 c16815x2af38f74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74) findViewById(com.p314xaae8f345.mm.R.id.f568334mi2);
        this.f234755n = c16815x2af38f74;
        c16815x2af38f74.m67605x406a75a(this.f234757p.f530086f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r0(this);
        this.f234756o = r0Var;
        wq3.t tVar = this.f234758q;
        if (tVar == null || (cVar = tVar.f530132e) == null || (linkedList = cVar.f537605t) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
        } else {
            r0Var.f234874e = linkedList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.r0 r0Var2 = this.f234756o;
        r0Var2.f234875f = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.m0(this);
        this.f234754m.setAdapter((android.widget.ListAdapter) r0Var2);
        this.f234755n.m67607x7be5de7d(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0(this));
        this.f234753i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o0(this));
        this.f234749e.setFocusable(true);
        this.f234749e.setFocusableInTouchMode(true);
        this.f234749e.requestFocus();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f234760s.b(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f234760s = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w(mo55332x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.l0(this));
        wq3.j Ai = vq3.e.wi().Ai();
        this.f234757p = Ai;
        this.f234758q = Ai.f530082b;
        mo43517x10010bd5();
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        this.f234760s.c();
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        this.f234760s.d();
        super.onStop();
    }
}
