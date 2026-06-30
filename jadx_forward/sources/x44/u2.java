package x44;

/* loaded from: classes4.dex */
public final class u2 implements x54.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f533436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e f533437b;

    public u2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e c17904x74018d8e) {
        this.f533436a = context;
        this.f533437b = c17904x74018d8e;
    }

    @Override // x54.a
    /* renamed from: onActivityResult */
    public final void mo142005x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChatting$1$2$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.ServiceChat", "the result observer is called!!");
        ((x54.b) this.f533436a).K3(i17);
        if (i17 == 1) {
            this.f533437b.x();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChatting$1$2$1");
    }
}
