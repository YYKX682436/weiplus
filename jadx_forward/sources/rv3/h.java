package rv3;

/* loaded from: classes5.dex */
public class h implements in5.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f481928d;

    /* renamed from: e, reason: collision with root package name */
    public rv3.v f481929e;

    /* renamed from: f, reason: collision with root package name */
    public rv3.g f481930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f481931g;

    /* renamed from: h, reason: collision with root package name */
    public rv3.z f481932h;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f481928d = item;
        this.f481929e = rv3.w.f481950a;
        this.f481930f = rv3.g.f481925d;
        this.f481932h = rv3.z.f481953d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((rv3.h) obj).f481928d.f237244e == this.f481928d.f237244e ? 0 : 1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
