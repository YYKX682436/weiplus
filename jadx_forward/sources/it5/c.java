package it5;

/* loaded from: classes13.dex */
public final class c extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f376160s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f376161t;

    /* renamed from: d, reason: collision with root package name */
    public int f376162d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f376163e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f376164f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f376165g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f376166h = 0;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f376167i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f376168m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f376169n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f376170o = 0;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f376171p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f376172q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f376173r = 0;

    static {
        f376160s = r1;
        byte[] bArr = {0};
        f376161t = r0;
        byte[] bArr2 = {0};
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: newInit */
    public com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0() {
        return new it5.c();
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f376162d = c2859xe10ac61e.m21299x355996(this.f376162d, 0, false);
        this.f376163e = c2859xe10ac61e.m21299x355996(this.f376163e, 1, false);
        this.f376164f = c2859xe10ac61e.m21299x355996(this.f376164f, 2, false);
        this.f376165g = c2859xe10ac61e.m21299x355996(this.f376165g, 3, false);
        this.f376166h = c2859xe10ac61e.m21299x355996(this.f376166h, 4, false);
        this.f376167i = c2859xe10ac61e.m21306x355996(f376160s, 5, false);
        this.f376168m = c2859xe10ac61e.m21299x355996(this.f376168m, 6, false);
        this.f376169n = c2859xe10ac61e.m21299x355996(this.f376169n, 7, false);
        this.f376170o = c2859xe10ac61e.m21300x355996(this.f376170o, 8, false);
        this.f376171p = c2859xe10ac61e.m21306x355996(f376161t, 9, false);
        this.f376172q = c2859xe10ac61e.m21299x355996(this.f376172q, 10, false);
        this.f376173r = c2859xe10ac61e.m21299x355996(this.f376173r, 11, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        int i17 = this.f376162d;
        if (i17 != 0) {
            c2860x6de9642d.m21338x6c257df(i17, 0);
        }
        c2860x6de9642d.m21338x6c257df(this.f376163e, 1);
        c2860x6de9642d.m21338x6c257df(this.f376164f, 2);
        int i18 = this.f376165g;
        if (i18 != 0) {
            c2860x6de9642d.m21338x6c257df(i18, 3);
        }
        int i19 = this.f376166h;
        if (i19 != 0) {
            c2860x6de9642d.m21338x6c257df(i19, 4);
        }
        byte[] bArr = this.f376167i;
        if (bArr != null) {
            c2860x6de9642d.m21354x6c257df(bArr, 5);
        }
        int i27 = this.f376168m;
        if (i27 != 0) {
            c2860x6de9642d.m21338x6c257df(i27, 6);
        }
        int i28 = this.f376169n;
        if (i28 != 0) {
            c2860x6de9642d.m21338x6c257df(i28, 7);
        }
        long j17 = this.f376170o;
        if (j17 != 0) {
            c2860x6de9642d.m21339x6c257df(j17, 8);
        }
        byte[] bArr2 = this.f376171p;
        if (bArr2 != null) {
            c2860x6de9642d.m21354x6c257df(bArr2, 9);
        }
        int i29 = this.f376172q;
        if (i29 != 0) {
            c2860x6de9642d.m21338x6c257df(i29, 10);
        }
        int i37 = this.f376173r;
        if (i37 != 0) {
            c2860x6de9642d.m21338x6c257df(i37, 11);
        }
    }
}
