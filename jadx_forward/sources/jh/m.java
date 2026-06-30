package jh;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static volatile jh.p f381257h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f381259b;

    /* renamed from: c, reason: collision with root package name */
    public jh.l f381260c;

    /* renamed from: d, reason: collision with root package name */
    public jh.k f381261d;

    /* renamed from: e, reason: collision with root package name */
    public jh.t f381262e;

    /* renamed from: f, reason: collision with root package name */
    public jh.c0 f381263f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f381258a = false;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f381264g = {false};

    public static jh.n a(jh.m mVar) {
        if (!mVar.f381258a) {
            return new jh.i(null);
        }
        jh.j jVar = new jh.j(mVar.f381259b);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("enable-logger", mVar.f381263f.f381217l);
        bundle.putString("path-of-xlog-so", mVar.f381263f.f381218m);
        if (jVar.b(mVar.f381263f.f381206a, bundle)) {
            return jVar;
        }
        return null;
    }

    public static boolean b(jh.m mVar, java.lang.String str, int i17) {
        boolean z17 = !(jh.z.a(mVar.f381263f.f381206a, jh.a0.k(str, i17)) < 3);
        if (z17) {
            oj.j.f("Matrix.WarmUpDelegate", "Elf file %s:%s has blocked and will not do warm-up.", str, java.lang.Integer.valueOf(i17));
        }
        return z17;
    }

    public static void c(jh.m mVar, jh.n nVar) {
        if (mVar.f381258a) {
            ((jh.j) nVar).f381246a.a(mVar.f381263f.f381206a);
        }
    }
}
