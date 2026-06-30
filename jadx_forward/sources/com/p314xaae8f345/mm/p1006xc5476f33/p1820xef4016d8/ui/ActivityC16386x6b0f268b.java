package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI */
/* loaded from: classes9.dex */
public final class ActivityC16386x6b0f268b extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public ym5.w1 B;
    public ym5.w1 C;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f227983g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f227984h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f227985i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f227986m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f227987n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 f227988o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f227989p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f227990q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227991r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f227992s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f227993t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f227994u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f227995v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f227996w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f227997x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f227998y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18987x98923a5a f227999z;

    public final void V6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18987x98923a5a c18987x98923a5a = this.f227999z;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.d(c18987x98923a5a.f259094m, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            android.widget.ImageView imageView = this.f227985i;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newYearGoodImg");
                throw null;
            }
            imageView.setVisibility(0);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f227995v;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f227985i;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newYearGoodImg");
            throw null;
        }
        imageView2.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f227995v;
        if (c22789xd23e9a9b2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
            throw null;
        }
        c22789xd23e9a9b2.setVisibility(0);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f227995v;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zi(str, d17, this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dn_;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cd  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16386x6b0f268b.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f227995v;
        if (c22789xd23e9a9b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
            throw null;
        }
        if (c22789xd23e9a9b.getVisibility() == 0) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f227995v;
            if (c22789xd23e9a9b2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
                throw null;
            }
            c22789xd23e9a9b2.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f227995v;
            if (c22789xd23e9a9b3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.o(c22789xd23e9a9b3, this.B, this.C);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagVideoView");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
