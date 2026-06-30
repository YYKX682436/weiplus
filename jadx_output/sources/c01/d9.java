package c01;

/* loaded from: classes11.dex */
public final class d9 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c01.d9 f37105b;

    /* renamed from: a, reason: collision with root package name */
    public final c01.f f37106a = new c01.f();

    public d9() {
        com.tencent.mm.modelbase.r2.f70789q = new c01.c9(this);
    }

    public static boolean a() {
        return gm0.j1.a();
    }

    public static c01.f b() {
        return d().f37106a;
    }

    public static c01.z7 c() {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (w7Var.f53905e == null) {
            w7Var.f53905e = com.tencent.mm.booter.b.d();
        }
        return w7Var.f53905e;
    }

    public static c01.d9 d() {
        if (f37105b == null) {
            synchronized (c01.d9.class) {
                if (f37105b == null) {
                    f37105b = new c01.d9();
                }
            }
        }
        return f37105b;
    }

    public static com.tencent.mm.modelbase.r1 e() {
        gm0.j1.i();
        return gm0.j1.n().f273288b;
    }

    public static c01.m8 f() {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        return ((bt.c1) i95.n0.c(bt.c1.class)).wi();
    }

    public static com.tencent.mm.storage.j3 g() {
        gm0.j1.i();
        return gm0.j1.u().f273148a;
    }

    public static boolean h() {
        return gm0.j1.b().n();
    }

    public static void i() {
        gm0.m.o();
    }
}
