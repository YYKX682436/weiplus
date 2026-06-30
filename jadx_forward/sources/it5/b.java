package it5;

/* loaded from: classes13.dex */
public final class b extends com.qq.taf.jce.AbstractC2861x7aec4921 {
    public static final byte[] A;
    public static final java.util.ArrayList B;
    public static final java.util.ArrayList C;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f376140z;

    /* renamed from: d, reason: collision with root package name */
    public int f376141d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f376142e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376143f = "";

    /* renamed from: g, reason: collision with root package name */
    public byte[] f376144g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f376145h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376146i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f376147m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376148n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f376149o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376150p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f376151q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f376152r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f376153s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f376154t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f376155u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f376156v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f376157w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f376158x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f376159y = null;

    static {
        f376140z = r1;
        byte[] bArr = {0};
        A = r1;
        byte[] bArr2 = {0};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        B = arrayList;
        arrayList.add(0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        C = arrayList2;
        arrayList2.add(new byte[]{0});
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: newInit */
    public com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0() {
        return new it5.b();
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f376141d = c2859xe10ac61e.m21299x355996(this.f376141d, 0, true);
        this.f376142e = c2859xe10ac61e.m21306x355996(f376140z, 1, false);
        this.f376143f = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f376144g = c2859xe10ac61e.m21306x355996(A, 3, false);
        this.f376145h = c2859xe10ac61e.m21300x355996(this.f376145h, 4, false);
        this.f376146i = c2859xe10ac61e.m21321xe22f9d47(5, false);
        this.f376147m = c2859xe10ac61e.m21299x355996(this.f376147m, 6, false);
        this.f376148n = c2859xe10ac61e.m21321xe22f9d47(7, false);
        this.f376149o = c2859xe10ac61e.m21299x355996(this.f376149o, 8, false);
        this.f376150p = c2859xe10ac61e.m21321xe22f9d47(9, false);
        this.f376151q = c2859xe10ac61e.m21299x355996(this.f376151q, 10, false);
        this.f376152r = c2859xe10ac61e.m21299x355996(this.f376152r, 11, false);
        this.f376153s = c2859xe10ac61e.m21299x355996(this.f376153s, 12, false);
        this.f376154t = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) B, 13, false);
        this.f376155u = c2859xe10ac61e.m21299x355996(this.f376155u, 14, false);
        this.f376156v = c2859xe10ac61e.m21305x355996(this.f376156v, 15, false);
        this.f376157w = c2859xe10ac61e.m21299x355996(this.f376157w, 16, false);
        this.f376158x = c2859xe10ac61e.m21299x355996(this.f376158x, 17, false);
        this.f376159y = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) C, 18, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f376141d, 0);
        byte[] bArr = this.f376142e;
        if (bArr != null) {
            c2860x6de9642d.m21354x6c257df(bArr, 1);
        }
        java.lang.String str = this.f376143f;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 2);
        }
        byte[] bArr2 = this.f376144g;
        if (bArr2 != null) {
            c2860x6de9642d.m21354x6c257df(bArr2, 3);
        }
        long j17 = this.f376145h;
        if (j17 != 0) {
            c2860x6de9642d.m21339x6c257df(j17, 4);
        }
        java.lang.String str2 = this.f376146i;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 5);
        }
        int i17 = this.f376147m;
        if (i17 != 0) {
            c2860x6de9642d.m21338x6c257df(i17, 6);
        }
        java.lang.String str3 = this.f376148n;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 7);
        }
        int i18 = this.f376149o;
        if (i18 != 0) {
            c2860x6de9642d.m21338x6c257df(i18, 8);
        }
        java.lang.String str4 = this.f376150p;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 9);
        }
        c2860x6de9642d.m21338x6c257df(this.f376151q, 10);
        int i19 = this.f376152r;
        if (i19 != 0) {
            c2860x6de9642d.m21338x6c257df(i19, 11);
        }
        int i27 = this.f376153s;
        if (i27 != 0) {
            c2860x6de9642d.m21338x6c257df(i27, 12);
        }
        java.util.ArrayList arrayList = this.f376154t;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 13);
        }
        int i28 = this.f376155u;
        if (i28 != 0) {
            c2860x6de9642d.m21338x6c257df(i28, 14);
        }
        c2860x6de9642d.m21353x6c257df(this.f376156v, 15);
        int i29 = this.f376157w;
        if (i29 != 0) {
            c2860x6de9642d.m21338x6c257df(i29, 16);
        }
        c2860x6de9642d.m21338x6c257df(this.f376158x, 17);
        java.util.ArrayList arrayList2 = this.f376159y;
        if (arrayList2 != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList2, 18);
        }
    }
}
