package bd4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 f100834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100835e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446, yz5.a aVar) {
        this.f100834d = c18267x4e51b446;
        this.f100835e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446 = this.f100834d;
        int height = c18267x4e51b446.m71001xe7297625().getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        c18267x4e51b446.A = height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        yz5.a aVar = this.f100835e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
    }
}
