package ms2;

/* loaded from: classes2.dex */
public final class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vx0 f412501d;

    public b(r45.vx0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f412501d = item;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return !android.text.TextUtils.equals(((ms2.b) obj).f412501d.m75945x2fec8307(14), this.f412501d.m75945x2fec8307(14)) ? 1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.b.class.hashCode();
    }
}
