package dl4;

/* loaded from: classes3.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f316969a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f316970b = new kk.l(500);

    public static final void a(java.lang.String imageKey, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, ff0.x xVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        ff0.z zVar = (ff0.z) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) f316970b).get(imageKey);
        if (zVar != null) {
            pm0.v.X(new dl4.h1(xVar, zVar));
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new dl4.i1(imageKey, bitmap, w1Var, xVar), "MicroMsg.TingPickImageColorManager");
        }
    }
}
