package cm2;

/* loaded from: classes3.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f124888d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f124889e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f124890f;

    public j0(java.lang.String title, java.lang.String desc, java.lang.String subTitle, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        desc = (i17 & 2) != 0 ? "" : desc;
        subTitle = (i17 & 4) != 0 ? "" : subTitle;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitle, "subTitle");
        this.f124888d = title;
        this.f124889e = desc;
        this.f124890f = subTitle;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return cm2.k0.class.hashCode();
    }
}
