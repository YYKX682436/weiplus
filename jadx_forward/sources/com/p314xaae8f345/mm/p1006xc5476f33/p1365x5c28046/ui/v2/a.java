package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes12.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179881d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6412x4f2fe452 f179882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f179881d = "MicroMsg.EmojiStoreDesignerReportUIC";
        this.f179882e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6412x4f2fe452();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBeforeFinish: ");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6412x4f2fe452 c6412x4f2fe452 = this.f179882e;
        sb6.append(c6412x4f2fe452.n());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179881d, sb6.toString());
        if (m158359x1e885992().getBooleanExtra("only_emoji_pack", false)) {
            return;
        }
        c6412x4f2fe452.k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f179881d = "MicroMsg.EmojiStoreDesignerReportUIC";
        this.f179882e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6412x4f2fe452();
    }
}
