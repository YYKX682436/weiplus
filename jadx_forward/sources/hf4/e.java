package hf4;

/* loaded from: classes4.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xe6 f362757d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362758e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f362759f;

    public e(r45.xe6 mediaObj, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.s7 fromscene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromscene, "fromscene");
        this.f362757d = mediaObj;
        this.f362758e = str;
        this.f362759f = fromscene;
    }

    @Override // ip0.c
    public java.lang.String n() {
        r45.xe6 xe6Var = this.f362757d;
        java.lang.String str = xe6Var.f471558h;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.f362759f;
        if (z17) {
            return xe6Var.f471554d + '_' + s7Var.f276845a;
        }
        return xe6Var.f471558h + '_' + s7Var.f276845a;
    }
}
