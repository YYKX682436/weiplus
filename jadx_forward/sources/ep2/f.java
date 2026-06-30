package ep2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, int i17) {
        super(2);
        this.f337244d = context;
        this.f337245e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        java.lang.String username = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        cq2.s.f302978a.a(this.f337244d, feed.getFeedObject(), username, this.f337245e);
        return jz5.f0.f384359a;
    }
}
