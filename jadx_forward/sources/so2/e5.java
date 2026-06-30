package so2;

/* loaded from: classes.dex */
public final class e5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f491863d;

    /* renamed from: e, reason: collision with root package name */
    public final int f491864e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f491865f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f491866g;

    public e5(r45.r03 topicInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        this.f491863d = topicInfo;
        this.f491864e = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.e5) && ((so2.e5) obj).f491863d.m75942xfb822ef2(1) == this.f491863d.m75942xfb822ef2(1)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491863d.m75942xfb822ef2(1);
    }

    @Override // in5.c
    public int h() {
        return this.f491864e;
    }
}
