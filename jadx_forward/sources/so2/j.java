package so2;

/* loaded from: classes2.dex */
public final class j implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 f491970d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.la0 localItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localItem, "localItem");
        this.f491970d = localItem;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.j) && ((so2.j) obj).f491970d.a(this.f491970d)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return ((java.lang.Number) ((jz5.n) this.f491970d.f208658b).mo141623x754a37bb()).longValue();
    }

    @Override // in5.c
    public int h() {
        return this.f491970d.f208657a.m75939xb282bd08(0);
    }

    /* renamed from: toString */
    public java.lang.String m164903x9616526c() {
        return "ItemId=" + mo2128x1ed62e84() + ",ItemType=" + h() + ' ';
    }
}
