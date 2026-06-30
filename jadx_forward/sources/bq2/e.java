package bq2;

/* loaded from: classes2.dex */
public final class e extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f105099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedItem, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 belongRecyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedItem, "feedItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongRecyclerView, "belongRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongAdapter, "belongAdapter");
        this.f105099e = feedItem;
    }

    /* renamed from: toString */
    public java.lang.String m11031x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f105099e;
        sb6.append(c14994x9b99c079.getFeedObject().m76784x5db1b11());
        sb6.append(" nonceid: ");
        sb6.append(c14994x9b99c079.getFeedObject().m76803x6c285d75());
        sb6.append(" nickName: ");
        sb6.append(c14994x9b99c079.m59273x80025a04());
        sb6.append(" belongRecyclerView: ");
        sb6.append(this.f105094b);
        sb6.append(" belongAdapter: ");
        sb6.append(this.f105095c);
        return sb6.toString();
    }
}
