package vc4;

/* loaded from: classes4.dex */
public final class g implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 f516814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc4.p f516815b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06, xc4.p pVar) {
        this.f516814a = c18258x7ccfbc06;
        this.f516815b = pVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("fail", jSONObject != null ? jSONObject.optString("status") : null)) {
            if (u46.l.e(jSONObject != null ? jSONObject.optString("err_msg") : null)) {
                z18 = true;
                java.lang.String str = "postSnsPhotoToBiz: hasClickPost=" + z18 + ", err_msg=" + err_msg + ", extraInfo=" + jSONObject;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06 = this.f516814a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.e(c18258x7ccfbc06, "MicroMsg.Improve.ItemFooter", str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.f(c18258x7ccfbc06, this.f516815b, z18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
            }
        }
        z18 = false;
        java.lang.String str2 = "postSnsPhotoToBiz: hasClickPost=" + z18 + ", err_msg=" + err_msg + ", extraInfo=" + jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc062 = this.f516814a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.e(c18258x7ccfbc062, "MicroMsg.Improve.ItemFooter", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06.f(c18258x7ccfbc062, this.f516815b, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$callback$1");
    }
}
