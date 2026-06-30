package av5;

/* loaded from: classes16.dex */
public final class o0 {
    public int A;
    public int B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final av5.n0 f95957a;

    /* renamed from: b, reason: collision with root package name */
    public final av5.n0 f95958b;

    /* renamed from: c, reason: collision with root package name */
    public final av5.n0 f95959c;

    /* renamed from: d, reason: collision with root package name */
    public final av5.n0 f95960d;

    /* renamed from: e, reason: collision with root package name */
    public final av5.n0 f95961e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.n0 f95962f;

    /* renamed from: g, reason: collision with root package name */
    public final av5.n0 f95963g;

    /* renamed from: h, reason: collision with root package name */
    public final av5.n0 f95964h;

    /* renamed from: i, reason: collision with root package name */
    public final av5.n0 f95965i;

    /* renamed from: j, reason: collision with root package name */
    public final av5.n0 f95966j;

    /* renamed from: k, reason: collision with root package name */
    public final av5.n0 f95967k;

    /* renamed from: l, reason: collision with root package name */
    public final av5.n0 f95968l;

    /* renamed from: m, reason: collision with root package name */
    public final av5.n0 f95969m;

    /* renamed from: n, reason: collision with root package name */
    public final av5.n0 f95970n;

    /* renamed from: o, reason: collision with root package name */
    public final av5.n0 f95971o;

    /* renamed from: p, reason: collision with root package name */
    public final av5.n0 f95972p;

    /* renamed from: q, reason: collision with root package name */
    public final av5.n0 f95973q;

    /* renamed from: r, reason: collision with root package name */
    public final av5.n0 f95974r;

    /* renamed from: s, reason: collision with root package name */
    public final av5.n0 f95975s;

    /* renamed from: t, reason: collision with root package name */
    public final av5.n0 f95976t;

    /* renamed from: u, reason: collision with root package name */
    public final av5.n0[] f95977u;

    /* renamed from: v, reason: collision with root package name */
    public int f95978v;

    /* renamed from: w, reason: collision with root package name */
    public int f95979w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f95980x;

    /* renamed from: y, reason: collision with root package name */
    public int f95981y;

    /* renamed from: z, reason: collision with root package name */
    public int f95982z;

    public o0() {
        av5.n0 n0Var = new av5.n0(0, true);
        this.f95957a = n0Var;
        av5.n0 n0Var2 = new av5.n0(1, true);
        this.f95958b = n0Var2;
        av5.n0 n0Var3 = new av5.n0(2, true);
        this.f95959c = n0Var3;
        av5.n0 n0Var4 = new av5.n0(3, true);
        this.f95960d = n0Var4;
        av5.n0 n0Var5 = new av5.n0(4, true);
        this.f95961e = n0Var5;
        av5.n0 n0Var6 = new av5.n0(5, true);
        this.f95962f = n0Var6;
        av5.n0 n0Var7 = new av5.n0(6, true);
        this.f95963g = n0Var7;
        av5.n0 n0Var8 = new av5.n0(7, true);
        this.f95964h = n0Var8;
        av5.n0 n0Var9 = new av5.n0(8, true);
        this.f95965i = n0Var9;
        av5.n0 n0Var10 = new av5.n0(4096, true);
        this.f95966j = n0Var10;
        av5.n0 n0Var11 = new av5.n0(4097, true);
        this.f95967k = n0Var11;
        av5.n0 n0Var12 = new av5.n0(4098, true);
        this.f95968l = n0Var12;
        av5.n0 n0Var13 = new av5.n0(4099, true);
        this.f95969m = n0Var13;
        av5.n0 n0Var14 = new av5.n0(8192, false);
        this.f95970n = n0Var14;
        av5.n0 n0Var15 = new av5.n0(8193, true);
        this.f95971o = n0Var15;
        av5.n0 n0Var16 = new av5.n0(8194, false);
        this.f95972p = n0Var16;
        av5.n0 n0Var17 = new av5.n0(8195, false);
        this.f95973q = n0Var17;
        av5.n0 n0Var18 = new av5.n0(8196, false);
        this.f95974r = n0Var18;
        av5.n0 n0Var19 = new av5.n0(8197, false);
        this.f95975s = n0Var19;
        av5.n0 n0Var20 = new av5.n0(8198, true);
        this.f95976t = n0Var20;
        this.f95977u = new av5.n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var10, n0Var8, n0Var9, n0Var11, n0Var12, n0Var13, n0Var14, n0Var15, n0Var16, n0Var17, n0Var18, n0Var19, n0Var20};
        this.f95978v = 13;
        this.f95980x = new byte[20];
    }

    public void a() {
        int i17 = this.f95981y;
        av5.n0[] n0VarArr = this.f95977u;
        for (int length = n0VarArr.length - 1; length >= 0; length--) {
            av5.n0 n0Var = n0VarArr[length];
            int i18 = n0Var.f95954g;
            if (i18 != -1) {
                if (i18 > i17) {
                    throw new av5.z("Map is unsorted at " + n0Var);
                }
                n0Var.f95955h = i17 - i18;
                i17 = i18;
            }
        }
        int i19 = this.f95957a.f95955h + this.f95958b.f95955h + this.f95959c.f95955h + this.f95960d.f95955h + this.f95961e.f95955h + this.f95962f.f95955h + this.f95963g.f95955h;
        this.C = i19;
        this.B = this.f95981y - i19;
    }
}
