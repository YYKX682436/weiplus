package zn2;

/* loaded from: classes2.dex */
public class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f556022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup.MarginLayoutParams f556023e;

    public b(java.lang.String desc, android.view.ViewGroup.MarginLayoutParams lp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lp6, "lp");
        this.f556022d = desc;
        this.f556023e = lp6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof zn2.b) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556022d, ((zn2.b) obj).f556022d) ? 0 : -1;
        }
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 11000;
    }
}
