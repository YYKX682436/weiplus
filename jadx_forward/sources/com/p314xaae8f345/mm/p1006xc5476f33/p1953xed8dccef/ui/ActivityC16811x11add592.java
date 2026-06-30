package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI */
/* loaded from: classes15.dex */
public class ActivityC16811x11add592 extends com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079 {

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f234726e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 f234727f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f234728g;

    /* renamed from: h, reason: collision with root package name */
    public int f234729h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f234730i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T6() {
        /*
            r5 = this;
            java.util.List r0 = r5.f234728g
            r1 = 0
            java.lang.String r2 = "MicroMsg.MallGalleryUI"
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            int r3 = r5.f234729h
            int r4 = r3 + 1
            if (r0 >= r4) goto L12
            goto L1b
        L12:
            java.util.List r0 = r5.f234728g
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L21
        L1b:
            java.lang.String r0 = "data not ready.retransmit failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            r0 = r1
        L21:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 == 0) goto L2d
            java.lang.String r0 = "invoke error. No current url"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            return r1
        L2d:
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o.m(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16811x11add592.T6():java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ca8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.j9k);
        this.f234726e = c1190x18d3c3fe;
        c1190x18d3c3fe.m8322x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.j(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0(this);
        this.f234727f = b0Var;
        b0Var.f234806g = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k(this);
        this.f234726e.m8315x6cab2c8d(b0Var);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.l(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f234728g = getIntent().getStringArrayListExtra("keys_img_urls");
        m78531x8f8cf1fb();
        this.f234730i = false;
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 b0Var = this.f234727f;
        java.util.List list = this.f234728g;
        b0Var.getClass();
        if (list != null) {
            if (list.size() > 0) {
                b0Var.f234804e = list;
            }
            java.util.ArrayList arrayList = b0Var.f234805f;
            if (arrayList == null) {
                b0Var.f234805f = new java.util.ArrayList();
            } else {
                arrayList.clear();
            }
            java.util.Iterator it = b0Var.f234804e.iterator();
            while (it.hasNext()) {
                b0Var.f234805f.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.a0(b0Var, (java.lang.String) it.next()));
            }
        }
        this.f234727f.mo8343xced61ae5();
        java.util.List list2 = this.f234728g;
        if (list2 != null) {
            list2.size();
        }
    }
}
