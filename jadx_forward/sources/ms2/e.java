package ms2;

/* loaded from: classes2.dex */
public final class e implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dg4 f412506d;

    public e(r45.dg4 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f412506d = item;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return !android.text.TextUtils.equals(((ms2.e) obj).f412506d.f453950d, this.f412506d.f453950d) ? 1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.e.class.hashCode();
    }
}
