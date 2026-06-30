package so2;

/* loaded from: classes2.dex */
public final class f1 implements in5.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.md1 f491869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f491870e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f491871f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f491872g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f491873h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tl6 f491874i;

    /* renamed from: m, reason: collision with root package name */
    public r45.t11 f491875m;

    public f1(r45.md1 likeObj, java.lang.String feedID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeObj, "likeObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedID, "feedID");
        this.f491869d = likeObj;
        this.f491870e = feedID;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return java.lang.Long.hashCode(this.f491869d.m75942xfb822ef2(2));
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
