package h33;

/* loaded from: classes.dex */
public final class c extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f359988d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f359989e;

    public c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        this.f359988d = i17;
        this.f359989e = mediaItem;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        h33.c other = (h33.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f359988d == other.f359988d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359989e.f219963e, other.f359989e.f219963e);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        h33.c other = (h33.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f359988d, other.f359988d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f359989e.f219963e + '_' + this.f359988d;
    }
}
