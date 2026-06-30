package kj4;

/* loaded from: classes2.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f389985d;

    /* renamed from: e, reason: collision with root package name */
    public final pj4.b2 f389986e;

    public b(java.lang.String statusId, pj4.b2 likeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeInfo, "likeInfo");
        this.f389985d = statusId;
        this.f389986e = likeInfo;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
