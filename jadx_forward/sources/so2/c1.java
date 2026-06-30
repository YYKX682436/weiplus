package so2;

/* loaded from: classes2.dex */
public final class c1 implements in5.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.s21 f491821d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f491822e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tl6 f491823f;

    /* renamed from: g, reason: collision with root package name */
    public r45.t11 f491824g;

    public c1(r45.s21 favInfo, java.lang.String feedID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favInfo, "favInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedID, "feedID");
        this.f491821d = favInfo;
        this.f491822e = feedID;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491821d.f466961f != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
