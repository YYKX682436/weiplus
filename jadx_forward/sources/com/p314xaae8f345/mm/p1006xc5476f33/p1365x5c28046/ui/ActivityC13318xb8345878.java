package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortUI */
/* loaded from: classes12.dex */
public final class ActivityC13318xb8345878 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f179372f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f179373d = android.view.View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f179374e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.l3(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        return (android.widget.FrameLayout) ((jz5.n) this.f179374e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c13317xbf909954;
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra == null) {
            stringExtra = "type_sort_all";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("ip_set_key");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "type_sort_all")) {
            c13317xbf909954 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.n(gr.v.f356229a.c() && ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4.class)).Di()));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "type_list_ip_set") && stringExtra2 != null) {
            c13317xbf909954 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13306x6efad547(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.m(stringExtra2), stringExtra2);
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "type_sort_ip_set") || stringExtra2 == null) {
                finish();
                return;
            }
            c13317xbf909954 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.m(stringExtra2));
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.k(this.f179373d, c13317xbf909954, null);
        m7630xb2c12e75.d();
    }
}
