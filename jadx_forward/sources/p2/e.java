package p2;

/* loaded from: classes14.dex */
public abstract class e {
    public static int a(p2.f fVar, float f17) {
        float R = fVar.R(f17);
        if (java.lang.Float.isInfinite(R)) {
            return Integer.MAX_VALUE;
        }
        return a06.d.b(R);
    }

    public static float b(p2.f fVar, int i17) {
        return i17 / fVar.mo7005x9a59d0b2();
    }

    public static long c(p2.f fVar, long j17) {
        int i17 = d1.k.f307176d;
        if (j17 != d1.k.f307175c) {
            return p2.i.b(fVar.o(d1.k.d(j17)), fVar.o(d1.k.b(j17)));
        }
        int i18 = p2.k.f432919d;
        return p2.k.f432918c;
    }

    public static float d(p2.f fVar, long j17) {
        if (p2.v.a(p2.t.b(j17), 4294967296L)) {
            return p2.t.c(j17) * fVar.mo7006xa2f3d785() * fVar.mo7005x9a59d0b2();
        }
        throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long e(p2.f fVar, long j17) {
        int i17 = p2.k.f432919d;
        if (j17 != p2.k.f432918c) {
            return d1.l.a(fVar.R(p2.k.b(j17)), fVar.R(p2.k.a(j17)));
        }
        int i18 = d1.k.f307176d;
        return d1.k.f307175c;
    }

    public static long f(p2.f fVar, float f17) {
        return p2.u.d(4294967296L, f17 / fVar.mo7006xa2f3d785());
    }
}
