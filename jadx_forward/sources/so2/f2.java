package so2;

/* loaded from: classes.dex */
public final class f2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final long f491876d;

    public f2(long j17) {
        this.f491876d = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.f2) && ((so2.f2) obj).f491876d == this.f491876d) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491876d;
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46367x9a5fb795;
    }

    /* renamed from: toString */
    public java.lang.String m164874x9616526c() {
        return "ItemId=" + this.f491876d + ",ItemType=2015";
    }
}
