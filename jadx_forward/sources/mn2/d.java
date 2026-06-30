package mn2;

/* loaded from: classes15.dex */
public abstract class d extends com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e {

    /* renamed from: b, reason: collision with root package name */
    public static final lt0.a f411468b;

    /* renamed from: a, reason: collision with root package name */
    public final jt0.i f411469a;

    static {
        lt0.a aVar = new lt0.a();
        aVar.f402697b = "FinderBitmapMemoryGlobalCache";
        aVar.f402696a = java.lang.Math.max(41943040, aVar.f402696a * 2);
        kt0.g b17 = kt0.g.b();
        kt0.e eVar = new kt0.e(aVar);
        b17.f393448b.put(aVar.f402697b, eVar);
        if (aVar.m146309xb2c87fbf(kt0.g.f393446d)) {
            b17.f393447a = eVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultBitmapMemoryCache", "cacheConfigure maxSize=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(aVar.f402696a));
        f411468b = aVar;
    }

    public d(int i17) {
        this.f411469a = new jt0.i(i17, mn2.c.f411453a, f411468b, getClass());
        ki.i.f389634c.c(new mn2.b(i17, this));
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void c(ip0.a key, dp0.a aVar, java.lang.Object obj) {
        android.graphics.Bitmap value = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f411469a.put(b(key, aVar), value);
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public void d(ip0.a key, dp0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f411469a.mo141381xc84af884(b(key, aVar));
    }
}
