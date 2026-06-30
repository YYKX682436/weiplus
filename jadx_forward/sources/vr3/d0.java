package vr3;

/* loaded from: classes3.dex */
public final class d0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.um f521159d;

    public d0(r45.um topicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        this.f521159d = topicInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof vr3.d0) && ((vr3.d0) obj).f521159d.f469009g == this.f521159d.f469009g) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f521159d.f469009g;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
