package sf2;

/* loaded from: classes10.dex */
public final class w1 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f488868m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f488869n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f488870o;

    /* renamed from: p, reason: collision with root package name */
    public long f488871p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f488872q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f488868m = jz5.h.b(new sf2.v1(this));
        this.f488869n = jz5.h.b(new sf2.q1(this));
        this.f488870o = jz5.h.b(new sf2.p1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(sf2.w1 r10, java.lang.String r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.w1.Z6(sf2.w1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mm2.e1 a7() {
        return (mm2.e1) ((jz5.n) this.f488869n).mo141623x754a37bb();
    }

    public final mm2.m6 b7() {
        return (mm2.m6) ((jz5.n) this.f488868m).mo141623x754a37bb();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f488872q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f488871p = 0L;
        b7().U6(mm2.g6.f410626a);
        b7().S6();
    }
}
