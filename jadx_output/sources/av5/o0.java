package av5;

/* loaded from: classes16.dex */
public final class o0 {
    public int A;
    public int B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final av5.n0 f14424a;

    /* renamed from: b, reason: collision with root package name */
    public final av5.n0 f14425b;

    /* renamed from: c, reason: collision with root package name */
    public final av5.n0 f14426c;

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f14427d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.n0 f14428e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.n0 f14429f;

    /* renamed from: g, reason: collision with root package name */
    public final av5.n0 f14430g;

    /* renamed from: h, reason: collision with root package name */
    public final av5.n0 f14431h;

    /* renamed from: i, reason: collision with root package name */
    public final av5.n0 f14432i;

    /* renamed from: j, reason: collision with root package name */
    public final av5.n0 f14433j;

    /* renamed from: k, reason: collision with root package name */
    public final av5.n0 f14434k;

    /* renamed from: l, reason: collision with root package name */
    public final av5.n0 f14435l;

    /* renamed from: m, reason: collision with root package name */
    public final av5.n0 f14436m;

    /* renamed from: n, reason: collision with root package name */
    public final av5.n0 f14437n;

    /* renamed from: o, reason: collision with root package name */
    public final av5.n0 f14438o;

    /* renamed from: p, reason: collision with root package name */
    public final av5.n0 f14439p;

    /* renamed from: q, reason: collision with root package name */
    public final av5.n0 f14440q;

    /* renamed from: r, reason: collision with root package name */
    public final av5.n0 f14441r;

    /* renamed from: s, reason: collision with root package name */
    public final av5.n0 f14442s;

    /* renamed from: t, reason: collision with root package name */
    public final av5.n0 f14443t;

    /* renamed from: u, reason: collision with root package name */
    public final av5.n0[] f14444u;

    /* renamed from: v, reason: collision with root package name */
    public int f14445v;

    /* renamed from: w, reason: collision with root package name */
    public int f14446w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f14447x;

    /* renamed from: y, reason: collision with root package name */
    public int f14448y;

    /* renamed from: z, reason: collision with root package name */
    public int f14449z;

    public o0() {
        av5.n0 n0Var = new av5.n0(0, true);
        this.f14424a = n0Var;
        av5.n0 n0Var2 = new av5.n0(1, true);
        this.f14425b = n0Var2;
        av5.n0 n0Var3 = new av5.n0(2, true);
        this.f14426c = n0Var3;
        av5.n0 n0Var4 = new av5.n0(3, true);
        this.f14427d = n0Var4;
        av5.n0 n0Var5 = new av5.n0(4, true);
        this.f14428e = n0Var5;
        av5.n0 n0Var6 = new av5.n0(5, true);
        this.f14429f = n0Var6;
        av5.n0 n0Var7 = new av5.n0(6, true);
        this.f14430g = n0Var7;
        av5.n0 n0Var8 = new av5.n0(7, true);
        this.f14431h = n0Var8;
        av5.n0 n0Var9 = new av5.n0(8, true);
        this.f14432i = n0Var9;
        av5.n0 n0Var10 = new av5.n0(4096, true);
        this.f14433j = n0Var10;
        av5.n0 n0Var11 = new av5.n0(4097, true);
        this.f14434k = n0Var11;
        av5.n0 n0Var12 = new av5.n0(4098, true);
        this.f14435l = n0Var12;
        av5.n0 n0Var13 = new av5.n0(4099, true);
        this.f14436m = n0Var13;
        av5.n0 n0Var14 = new av5.n0(8192, false);
        this.f14437n = n0Var14;
        av5.n0 n0Var15 = new av5.n0(8193, true);
        this.f14438o = n0Var15;
        av5.n0 n0Var16 = new av5.n0(8194, false);
        this.f14439p = n0Var16;
        av5.n0 n0Var17 = new av5.n0(8195, false);
        this.f14440q = n0Var17;
        av5.n0 n0Var18 = new av5.n0(8196, false);
        this.f14441r = n0Var18;
        av5.n0 n0Var19 = new av5.n0(8197, false);
        this.f14442s = n0Var19;
        av5.n0 n0Var20 = new av5.n0(8198, true);
        this.f14443t = n0Var20;
        this.f14444u = new av5.n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var10, n0Var8, n0Var9, n0Var11, n0Var12, n0Var13, n0Var14, n0Var15, n0Var16, n0Var17, n0Var18, n0Var19, n0Var20};
        this.f14445v = 13;
        this.f14447x = new byte[20];
    }

    public void a() {
        int i17 = this.f14448y;
        av5.n0[] n0VarArr = this.f14444u;
        for (int length = n0VarArr.length - 1; length >= 0; length--) {
            av5.n0 n0Var = n0VarArr[length];
            int i18 = n0Var.f14421g;
            if (i18 != -1) {
                if (i18 > i17) {
                    throw new av5.z("Map is unsorted at " + n0Var);
                }
                n0Var.f14422h = i17 - i18;
                i17 = i18;
            }
        }
        int i19 = this.f14424a.f14422h + this.f14425b.f14422h + this.f14426c.f14422h + this.f14427d.f14422h + this.f14428e.f14422h + this.f14429f.f14422h + this.f14430g.f14422h;
        this.C = i19;
        this.B = this.f14448y - i19;
    }
}
