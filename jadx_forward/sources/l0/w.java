package l0;

/* loaded from: classes14.dex */
public final class w implements l0.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0.w f396098a = new l0.w();

    public long a(long j17, float f17, n0.o oVar, int i17) {
        l0.i iVar = (l0.i) ((n0.y0) oVar).i(l0.k.f395847a);
        if (java.lang.Float.compare(f17, 0) <= 0 || iVar.l()) {
            return j17;
        }
        int i18 = (i17 & 112) | (i17 & 14);
        n0.h3 h3Var = l0.f0.f395711a;
        return e1.a0.d(e1.y.b(l0.k.b(j17, oVar, i18 & 14), ((((float) java.lang.Math.log(f17 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), j17);
    }
}
