package jv2;

/* loaded from: classes10.dex */
public class d implements in5.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 {

    /* renamed from: d, reason: collision with root package name */
    public jv2.a f383740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383741e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f383742f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f383743g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f383744h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f383745i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f383746m;

    /* renamed from: n, reason: collision with root package name */
    public int f383747n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f383748o;

    public d(jv2.a commentObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentObj, "commentObj");
        this.f383740d = commentObj;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commentObj.D0());
        this.f383743g = true;
        this.f383744h = true;
        this.f383747n = this.f383740d.v0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f383740d.t0();
    }

    @Override // in5.c
    public int h() {
        return this.f383740d.A0() == 0 ? 1 : 2;
    }
}
