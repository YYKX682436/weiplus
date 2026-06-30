package ms2;

/* loaded from: classes2.dex */
public final class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ig4 f412502d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.dg4 f412503e;

    /* renamed from: f, reason: collision with root package name */
    public int f412504f;

    /* renamed from: g, reason: collision with root package name */
    public int f412505g;

    public c(r45.ig4 item, r45.dg4 dg4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f412502d = item;
        this.f412503e = dg4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof ms2.c)) {
            return 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.ig4 ig4Var = ((ms2.c) obj).f412502d;
        sb6.append(ig4Var.f458550d);
        r45.gg4 gg4Var = ig4Var.B;
        sb6.append(gg4Var != null ? gg4Var.f456754d : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        r45.ig4 ig4Var2 = this.f412502d;
        sb8.append(ig4Var2.f458550d);
        r45.gg4 gg4Var2 = ig4Var2.B;
        sb8.append(gg4Var2 != null ? gg4Var2.f456754d : null);
        return !android.text.TextUtils.equals(sb7, sb8.toString()) ? 1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.c.class.hashCode();
    }
}
