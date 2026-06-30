package zb2;

/* loaded from: classes2.dex */
public final class d implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fl5 f552793d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f552794e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f552795f;

    /* renamed from: g, reason: collision with root package name */
    public final long f552796g;

    /* renamed from: h, reason: collision with root package name */
    public final int f552797h;

    public d(r45.fl5 fl5Var, boolean z17, java.lang.String dividerTitle, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dividerTitle, "dividerTitle");
        this.f552793d = fl5Var;
        this.f552794e = z17;
        this.f552795f = dividerTitle;
        this.f552796g = j17;
        this.f552797h = i17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        r45.fl5 fl5Var = this.f552793d;
        return fl5Var != null ? fl5Var.m75942xfb822ef2(0) : this.f552796g;
    }

    @Override // in5.c
    public int h() {
        return this.f552794e ? 2 : 1;
    }
}
