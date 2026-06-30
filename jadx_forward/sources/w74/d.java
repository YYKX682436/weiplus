package w74;

/* loaded from: classes4.dex */
public class d implements c94.a {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f525061e = new android.util.ArrayMap();

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f525062f = {0, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f525063a;

    /* renamed from: b, reason: collision with root package name */
    public s34.h0 f525064b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f525065c = f525062f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f525066d;

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (android.text.TextUtils.isEmpty(this.f525066d)) {
            this.f525066d = gm0.j1.b().j();
        }
        java.lang.String str = this.f525066d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        return str;
    }

    public int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            s34.h0 h0Var = this.f525064b;
            if (h0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            java.util.List list = h0Var.f484188e;
            if (list == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            int min = java.lang.Math.min(((java.util.ArrayList) list).size(), 3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return min;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "getItemCount error ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return 0;
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d c17817xd660a42d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            d(c17817xd660a42d, c17933xe8d1b226);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "injectAdapter error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2152x8ee44f23.C17817xd660a42d c17817xd660a42d, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        s34.h0 h0Var;
        int nextInt;
        int nextInt2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (c17817xd660a42d == null || c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "the input layout or sns information is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (android.text.TextUtils.isEmpty(T) || T.equals(this.f525063a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "the sns id is empty or same as last one!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "the sns info or ad xml is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            h0Var = null;
        } else {
            s34.h0 h0Var2 = c17933xe8d1b226.m70354x74235b3e().f38179x76826a54;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            h0Var = h0Var2;
        }
        if (h0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.Participants", "i think you are crazy!!!! Why is the topic-info null?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        this.f525063a = T;
        this.f525064b = h0Var;
        java.util.List list = h0Var.f484188e;
        int size = list == null ? 0 : ((java.util.ArrayList) list).size();
        a();
        java.lang.String a17 = a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        boolean isEmpty = android.text.TextUtils.isEmpty(T);
        int[] iArr = f525062f;
        if (isEmpty || android.text.TextUtils.isEmpty(a17) || size < 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        } else {
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) f525061e;
            int[] iArr2 = (int[]) arrayMap.get(T);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            int i18 = 1;
            boolean z17 = iArr2 == null || iArr2.length == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            if (z17) {
                java.lang.String str = T + a17 + size;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                if (str == null || size <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                } else {
                    java.util.Random random = new java.util.Random(str.hashCode());
                    int nextInt3 = random.nextInt(size);
                    int i19 = 0;
                    do {
                        nextInt = random.nextInt(size);
                        i19++;
                        if (nextInt3 != nextInt) {
                            break;
                        }
                    } while (i19 < 3);
                    if (i19 >= 3) {
                        nextInt = (nextInt3 + 1) % size;
                    }
                    int i27 = 0;
                    while (true) {
                        nextInt2 = random.nextInt(size);
                        i27 += i18;
                        if (nextInt2 != nextInt && nextInt2 != nextInt3) {
                            i17 = 3;
                            break;
                        }
                        i17 = 3;
                        if (i27 >= 3) {
                            break;
                        } else {
                            i18 = 1;
                        }
                    }
                    if (i27 >= i17) {
                        nextInt2 = (nextInt + 1) % size;
                    }
                    if (nextInt3 == nextInt || nextInt3 == nextInt2 || nextInt == nextInt2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    } else {
                        iArr = new int[]{nextInt3, nextInt, nextInt2};
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    }
                }
                arrayMap.put(T, iArr);
            } else {
                iArr = iArr2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        }
        this.f525065c = iArr;
        c17817xd660a42d.m69693x6cab2c8d(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }
}
