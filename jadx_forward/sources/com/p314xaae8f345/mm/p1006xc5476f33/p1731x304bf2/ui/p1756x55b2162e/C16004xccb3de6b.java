package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView */
/* loaded from: classes8.dex */
public class C16004xccb3de6b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 {

    /* renamed from: l2, reason: collision with root package name */
    public static final /* synthetic */ int f222655l2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f222656f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f222657g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f222658h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z f222659i2;

    /* renamed from: j2, reason: collision with root package name */
    public final l75.q0 f222660j2;

    /* renamed from: k2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f222661k2;

    public C16004xccb3de6b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222660j2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.u(this);
        this.f222661k2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.2
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b.f222655l2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b.this.l1();
                }
            }
        };
        h1();
    }

    public final void h1() {
        android.content.Context context = getContext();
        this.f222656f2 = context;
        this.f222657g2 = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f222658h2 = ((android.app.Activity) this.f222656f2).getIntent().getLongExtra("game_report_ssid", 0L);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f222656f2);
        c1162x665295de.Q(0);
        mo7967x900dcbe1(c1162x665295de);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z(this);
        this.f222659i2 = zVar;
        mo7960x6cab2c8d(zVar);
        l1();
    }

    public final void l1() {
        u53.a0 a0Var = (u53.a0) i95.n0.c(u53.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w(this);
        ((z53.q) a0Var).getClass();
        z53.o.f551794a.c(0, 15, new z53.p(wVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(this.f222660j2);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f222661k2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameHotMsgView", "onAttachedToWindow");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(this.f222660j2);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f222661k2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameHotMsgView", "onDetachedFromWindow");
    }

    public C16004xccb3de6b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f222660j2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.u(this);
        this.f222661k2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.2
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                    int i172 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b.f222655l2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b.this.l1();
                }
            }
        };
        h1();
    }
}
