package so2;

/* loaded from: classes2.dex */
public final class s extends in5.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f492115d;

    /* renamed from: e, reason: collision with root package name */
    public int f492116e;

    /* renamed from: f, reason: collision with root package name */
    public int f492117f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f492118g;

    /* renamed from: h, reason: collision with root package name */
    public int f492119h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f492120i;

    public s(java.lang.CharSequence tipStr, int i17, int i18, java.lang.Object obj, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i19 & 1) != 0) {
            tipStr = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tipStr, "getString(...)");
        }
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        obj = (i19 & 8) != 0 ? null : obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipStr, "tipStr");
        this.f492115d = tipStr;
        this.f492116e = i17;
        this.f492117f = i18;
        this.f492118g = obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -1;
    }
}
