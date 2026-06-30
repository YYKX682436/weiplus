package c06;

/* loaded from: classes10.dex */
public abstract class f {
    public static final c06.e a(long j17) {
        return new c06.g((int) j17, (int) (j17 >> 32));
    }

    public static final java.lang.String b(java.lang.Object from, java.lang.Object until) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final int c(c06.e eVar, e06.k range) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        if (range.mo126615x7aab3243()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i17 = range.f327742d;
        int i18 = range.f327743e;
        return i18 < Integer.MAX_VALUE ? eVar.e(i17, i18 + 1) : i17 > Integer.MIN_VALUE ? eVar.e(i17 - 1, i18) + 1 : eVar.c();
    }

    public static final long d(c06.e eVar, e06.n range) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        if (range.mo126615x7aab3243()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        long j17 = range.f327751e;
        long j18 = range.f327750d;
        return j17 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? eVar.h(j18, j17 + 1) : j18 > Long.MIN_VALUE ? eVar.h(j18 - 1, j17) + 1 : eVar.f();
    }
}
