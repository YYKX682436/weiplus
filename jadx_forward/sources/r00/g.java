package r00;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f449543a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f449544b = new kk.l(100);

    public static final void a(java.lang.String url, r00.b getType, android.graphics.Bitmap bitmap, r00.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getType, "getType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        java.lang.String str = url + '_' + getType.name();
        r00.a aVar = (r00.a) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) f449544b).get(str);
        if (aVar != null) {
            pm0.v.X(new r00.c(hVar, aVar));
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r00.d(str, getType, bitmap, hVar), "MicroMsg.EcsGetImgColorMgr");
        }
    }
}
