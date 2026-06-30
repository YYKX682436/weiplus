package lj4;

/* loaded from: classes3.dex */
public final class h implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400520e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400521f;

    public h(java.lang.String name, java.lang.String desc, java.lang.String topicId, java.lang.String statusId, java.lang.String headImgUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicId, "topicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headImgUrl, "headImgUrl");
        this.f400519d = name;
        this.f400520e = topicId;
        this.f400521f = statusId;
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
