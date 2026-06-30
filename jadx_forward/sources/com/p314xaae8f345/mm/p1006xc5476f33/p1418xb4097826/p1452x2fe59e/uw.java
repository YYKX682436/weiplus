package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class uw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f192370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(2);
        this.f192370d = pzVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String invokeSource = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.lang.String str3 = this.f192370d.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetFirstFeed ");
        sb6.append(invokeSource);
        sb6.append(' ');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = feed.getFeedObject().getFeedObject();
        if (feedObject != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = feedObject.m76802x2dd01666();
            java.lang.String str4 = "";
            if (m76802x2dd01666 == null || (str2 = m76802x2dd01666.m76944x730bcac6()) == null) {
                str2 = "";
            }
            java.lang.String u17 = pm0.v.u(feedObject.m76784x5db1b11());
            if (!android.text.TextUtils.isEmpty(str2)) {
                str4 = str2.substring(0, java.lang.Math.min(4, str2.length()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "substring(...)");
            }
            str = u17 + '.' + str4;
        } else {
            str = "INVALID-FEED";
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        return jz5.f0.f384359a;
    }
}
