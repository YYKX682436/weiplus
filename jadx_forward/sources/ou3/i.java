package ou3;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ou3.i f430490d = new ou3.i();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ou3.j.f430492b;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return;
        }
        ou3.j jVar = ou3.j.f430491a;
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        jVar.a(assets, "filters", str);
    }
}
