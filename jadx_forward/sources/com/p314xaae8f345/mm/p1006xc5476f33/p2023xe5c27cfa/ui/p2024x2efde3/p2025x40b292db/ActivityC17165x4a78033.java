package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db;

@db5.a(m123858x6ac9171 = 1)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.RepairerRefreshLayoutDemoDetailUI */
/* loaded from: classes15.dex */
public final class ActivityC17165x4a78033 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public int f239609d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cf8;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c17171xe93814d3;
        super.onCreate(bundle);
        this.f239609d = getIntent().getIntExtra("KEY_SHOW_TYPE", 0);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        switch (this.f239609d) {
            case 1:
                mo54450xbf7c1df6("RecyclerView Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17171xe93814d3();
                break;
            case 2:
                mo54450xbf7c1df6("NestScrollView Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17175x32f0e2b9();
                break;
            case 3:
                mo54450xbf7c1df6("CoordinatorLayout Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17174xcfb9c8cb();
                break;
            case 4:
                mo54450xbf7c1df6("ListView Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17169xebd2a739();
                break;
            case 5:
                mo54450xbf7c1df6("Stagger Layout Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17168xdb4644c5();
                break;
            case 6:
                mo54450xbf7c1df6("PageSnapHelper Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17173x786fe74f();
                break;
            case 7:
                mo54450xbf7c1df6("NoMoreData Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17172x7ec144d1();
                break;
            case 8:
                mo54450xbf7c1df6("属性设置 Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17167x4c932bc();
                break;
            case 9:
                mo54450xbf7c1df6("横向滑动 Demo");
                c17171xe93814d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17170x7687e6c5();
                break;
            default:
                new com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2026x9da2e250.C17171xe93814d3();
                c17171xe93814d3 = new p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670();
                break;
        }
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, c17171xe93814d3, null, 1);
        m7630xb2c12e75.d();
    }
}
