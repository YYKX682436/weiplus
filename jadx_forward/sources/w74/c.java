package w74;

/* loaded from: classes4.dex */
public class c implements g74.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f525056a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f525057b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f525058c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f525059d;

    /* renamed from: e, reason: collision with root package name */
    public final e74.h f525060e;

    public c(android.app.Activity activity, android.widget.TextView textView, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (activity != null) {
            this.f525056a = new java.lang.ref.WeakReference(activity);
            this.f525060e = new f74.a(activity);
        }
        this.f525057b = textView;
        this.f525058c = c1163xf1deaba4;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        try {
            b(c17933xe8d1b226, z17);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.TopicCardDynamic", "doDynamicRequest failed!!!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17) {
        android.app.Activity activity;
        java.lang.String T;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "Are you OK??? The input sns info or listener is null!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        e74.h hVar = this.f525060e;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "Are you OK??? I think the activity is null, which is input in constructor!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        java.lang.String T2 = ca4.z0.T(c17933xe8d1b226);
        if (android.text.TextUtils.isEmpty(T2) || "0".equals(T2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "the sns id is empty!! Are you sure?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        java.lang.ref.WeakReference weakReference = this.f525056a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            activity = null;
        } else {
            activity = (android.app.Activity) weakReference.get();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        }
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "the context is null! Is activity destroyed?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea.a(activity);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "OK, i fu le you!!! the activity is not life cycle owner!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        g74.b bVar = a17.f244722d;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            if (android.text.TextUtils.isEmpty(T2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            } else {
                java.util.HashMap hashMap = (java.util.HashMap) bVar.f350878a;
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap.get(T2);
                if (weakReference2 == null || weakReference2.get() != this) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            str = null;
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (entry != null && entry.getValue() == this) {
                            str = (java.lang.String) entry.getKey();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            break;
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str) && !str.equals(T2)) {
                        hashMap.remove(str);
                    }
                    hashMap.put(T2, new java.lang.ref.WeakReference(this));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        e74.i f17 = e74.i.f();
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.TopicCardDynamic", "OK, i fule you!!! the request manager is null. Isn't the RequestManager singleton?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        this.f525059d = c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "the sns info or request action is null, please check it !!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            try {
                T = ca4.z0.T(c17933xe8d1b226);
            } catch (java.lang.Throwable unused) {
            }
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                f74.a aVar = (f74.a) hVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                if (f17.g(T, 3, m70354x74235b3e.f38170xa22e5cd3, z17)) {
                    aVar.b(0, c17933xe8d1b226);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "the request is too frequently, snsId is " + T);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "the sns id is empty, is it right?");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w74.c.c(java.lang.String, java.lang.Object):void");
    }
}
