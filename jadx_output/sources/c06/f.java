package c06;

/* loaded from: classes10.dex */
public abstract class f {
    public static final c06.e a(long j17) {
        return new c06.g((int) j17, (int) (j17 >> 32));
    }

    public static final java.lang.String b(java.lang.Object from, java.lang.Object until) {
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final int c(c06.e eVar, e06.k range) {
        kotlin.jvm.internal.o.g(eVar, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i17 = range.f246209d;
        int i18 = range.f246210e;
        return i18 < Integer.MAX_VALUE ? eVar.e(i17, i18 + 1) : i17 > Integer.MIN_VALUE ? eVar.e(i17 - 1, i18) + 1 : eVar.c();
    }

    public static final long d(c06.e eVar, e06.n range) {
        kotlin.jvm.internal.o.g(eVar, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        long j17 = range.f246218e;
        long j18 = range.f246217d;
        return j17 < com.tencent.wcdb.core.Database.DictDefaultMatchValue ? eVar.h(j18, j17 + 1) : j18 > Long.MIN_VALUE ? eVar.h(j18 - 1, j17) + 1 : eVar.f();
    }
}
