package cw2;

/* loaded from: classes2.dex */
public final class h1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 f305271a;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 c15177x9c2650d3) {
        this.f305271a = c15177x9c2650d3;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15177x9c2650d3 c15177x9c2650d3 = this.f305271a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = c15177x9c2650d3.getFeed();
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((feed == null || (feedObject3 = feed.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed2 = c15177x9c2650d3.getFeed();
        if (feed2 == null || (feedObject = feed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (str2 = feedObject2.m76829x97edf6c0()) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        lVarArr[2] = new jz5.l("click_playpercent", java.lang.Float.valueOf(c15177x9c2650d3.getPlayPercent()));
        return kz5.c1.k(lVarArr);
    }
}
