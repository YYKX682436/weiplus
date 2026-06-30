package z12;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 {

    /* renamed from: g, reason: collision with root package name */
    public static int f550815g;

    /* renamed from: h, reason: collision with root package name */
    public static z12.e f550816h;

    /* renamed from: i, reason: collision with root package name */
    public static z12.w f550817i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p944x882e457a.u0 f550818j = new z12.c();

    public e(boolean z17) {
        super(new z12.d(), z17);
    }

    public static final z12.e f() {
        z12.e eVar = f550816h;
        if (eVar == null) {
            synchronized (z12.e.class) {
                if (f550816h == null) {
                    f550816h = new z12.e(true);
                }
            }
        } else {
            eVar.d();
        }
        return f550816h;
    }

    public static void g() {
        if (f550817i != null) {
            gm0.j1.n().f354821b.d(f550817i);
        }
        gm0.j1.n().f354821b.q(413, f550818j);
    }

    public void h() {
        f550815g = 0;
        f550817i = new z12.w("com.tencent.xin.emoticon.tusiji", 1);
        gm0.j1.n().f354821b.g(f550817i);
        gm0.j1.n().f354821b.a(413, f550818j);
    }
}
