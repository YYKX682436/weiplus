package z;

/* loaded from: classes14.dex */
public abstract class s {
    public static z.r a(float f17, float f18, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        return new z.r(z.q3.f550334a, java.lang.Float.valueOf(f17), new z.t((i17 & 2) != 0 ? 0.0f : f18), (i17 & 4) != 0 ? Long.MIN_VALUE : j17, (i17 & 8) == 0 ? j18 : Long.MIN_VALUE, (i17 & 16) != 0 ? false : z17);
    }

    public static z.r b(z.r rVar, float f17, float f18, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        float floatValue = (i17 & 1) != 0 ? ((java.lang.Number) rVar.mo128745x754a37bb()).floatValue() : f17;
        float f19 = (i17 & 2) != 0 ? ((z.t) rVar.f550345f).f550364a : f18;
        long j19 = (i17 & 4) != 0 ? rVar.f550346g : j17;
        long j27 = (i17 & 8) != 0 ? rVar.f550347h : j18;
        boolean z18 = (i17 & 16) != 0 ? rVar.f550348i : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rVar, "<this>");
        return new z.r(rVar.f550343d, java.lang.Float.valueOf(floatValue), new z.t(f19), j19, j27, z18);
    }

    public static final z.w c(z.w2 w2Var, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(w2Var, "<this>");
        z.w wVar = (z.w) ((z.x2) w2Var).f550406a.mo146xb9724478(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        return wVar.c();
    }
}
