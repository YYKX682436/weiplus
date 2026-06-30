package vc4;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f516811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 f516812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk.p f516813f;

    public f(xc4.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06, tk.p pVar2) {
        this.f516811d = pVar;
        this.f516812e = c18258x7ccfbc06;
        this.f516813f = pVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ed4 a17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadBizPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wa4.l lVar = wa4.l.f525788a;
        android.content.Context context = this.f516812e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        xc4.p snsInfo = this.f516811d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        tk.p callback = this.f516813f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        wa4.f0 b17 = wa4.b0.f525736a.b(snsInfo.W0());
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List<wa4.c0> b18 = b17.b();
            if (b18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
            } else {
                for (wa4.c0 c0Var : b18) {
                    c0Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    java.lang.String str = c0Var.f525740a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLivePhoto", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLivePhoto", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    if (c0Var.f525742c) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                        if (c0Var.f525741b != null) {
                            z17 = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                            arrayList2.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(str, null, null, null, null, java.lang.Boolean.valueOf(z17), c0Var.f525741b, null, null, null, null, null, null, null, null, null, 65438, null));
                        }
                    }
                    z17 = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    arrayList2.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(str, null, null, null, null, java.lang.Boolean.valueOf(z17), c0Var.f525741b, null, null, null, null, null, null, null, null, null, 65438, null));
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("mpPublishAction", 2);
                jSONObject.put("publishScene", "poi");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1385");
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("content", snsInfo.Y0());
                wa4.f0 b19 = wa4.b0.f525736a.b(snsInfo.W0());
                if (b19 != null && (a17 = b19.a()) != null) {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, a17.f454847g);
                    jSONObject4.put("address", a17.f454848h);
                    jSONObject4.put("longitude", java.lang.Float.valueOf(a17.f454844d));
                    jSONObject4.put("latitude", java.lang.Float.valueOf(a17.f454845e));
                    jSONObject4.put("poiid", a17.f454849i);
                    jSONObject3.put("poiInfo", jSONObject4);
                }
                jSONObject2.put("nativeExtraData", jSONObject3);
                jSONObject.put("weAppParam", jSONObject2);
                ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(context, jSONObject, arrayList2, callback);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadBizPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$1");
    }
}
