package so2;

/* loaded from: classes2.dex */
public final class t4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f492140d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f492141e;

    /* renamed from: f, reason: collision with root package name */
    public final long f492142f;

    /* renamed from: g, reason: collision with root package name */
    public int f492143g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f492144h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f492145i;

    /* renamed from: m, reason: collision with root package name */
    public final int f492146m;

    public t4(java.lang.String title, java.lang.String subTitle, long j17, int i17, java.util.List objectList, java.lang.String byPass, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subTitle, "subTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectList, "objectList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byPass, "byPass");
        this.f492140d = title;
        this.f492141e = subTitle;
        this.f492142f = j17;
        this.f492143g = i17;
        this.f492144h = objectList;
        this.f492145i = byPass;
        this.f492146m = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.t4)) {
            return -1;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f492142f, ((so2.t4) obj).f492142f);
    }

    /* renamed from: equals */
    public boolean m164949xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.t4)) {
            return false;
        }
        so2.t4 t4Var = (so2.t4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492140d, t4Var.f492140d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492141e, t4Var.f492141e) && this.f492142f == t4Var.f492142f && this.f492143g == t4Var.f492143g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492144h, t4Var.f492144h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492145i, t4Var.f492145i) && this.f492146m == t4Var.f492146m;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f492142f;
    }

    @Override // in5.c
    public int h() {
        return so2.t4.class.hashCode();
    }

    /* renamed from: hashCode */
    public int m164950x8cdac1b() {
        return (((((((((((this.f492140d.hashCode() * 31) + this.f492141e.hashCode()) * 31) + java.lang.Long.hashCode(this.f492142f)) * 31) + java.lang.Integer.hashCode(this.f492143g)) * 31) + this.f492144h.hashCode()) * 31) + this.f492145i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492146m);
    }

    /* renamed from: toString */
    public java.lang.String m164951x9616526c() {
        return "FinderPostPlaySquareContainerData(title=" + this.f492140d + ", subTitle=" + this.f492141e + ", topicId=" + this.f492142f + ", favStatus=" + this.f492143g + ", objectList=" + this.f492144h + ", byPass=" + this.f492145i + ", tabId=" + this.f492146m + ')';
    }
}
