package n21;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static n21.o f415809e;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f415810a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f415811b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f415812c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f415813d;

    public o() {
        n21.i iVar = new n21.i(this);
        this.f415810a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "speex_worker", 1);
        this.f415812c = new byte[0];
        this.f415813d = new n21.n(this);
        iVar.m43071x58998cd();
    }

    public static n21.o b() {
        if (f415809e == null) {
            f415809e = new n21.o();
        }
        return f415809e;
    }

    public final com.p314xaae8f345.mm.vfs.r6 a(int i17, int i18) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n21.c.a());
        if (!r6Var.m() || !r6Var.y()) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = null;
        for (int i19 = 0; G != null && i19 < G.length; i19++) {
            r6Var2 = G[i19];
            if (r6Var2 != null && r6Var2.A()) {
                r6Var2.u();
                java.lang.String u17 = r6Var2.u();
                long C = r6Var2.C();
                if (r6Var2.m82467xfb82e301().endsWith(".spx")) {
                    if (C >= i17 && C <= i18) {
                        break;
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(u17);
                }
                r6Var2 = null;
            }
        }
        return r6Var2;
    }

    public void c() {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new n21.m(this), 100L);
        }
    }
}
