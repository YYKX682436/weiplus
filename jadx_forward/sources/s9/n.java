package s9;

/* loaded from: classes13.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f486491a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f486492b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.TreeSet f486493c = new java.util.TreeSet();

    /* renamed from: d, reason: collision with root package name */
    public long f486494d;

    public n(int i17, java.lang.String str, long j17) {
        this.f486491a = i17;
        this.f486492b = str;
        this.f486494d = j17;
    }

    public long a(long j17, long j18) {
        s9.s b17 = b(j17);
        boolean z17 = !b17.f486487g;
        long j19 = b17.f486486f;
        if (z17) {
            if (j19 == -1) {
                j19 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
            return -java.lang.Math.min(j19, j18);
        }
        long j27 = j17 + j18;
        long j28 = b17.f486485e + j19;
        if (j28 < j27) {
            for (s9.s sVar : this.f486493c.tailSet(b17, false)) {
                long j29 = sVar.f486485e;
                if (j29 > j28) {
                    break;
                }
                j28 = java.lang.Math.max(j28, j29 + sVar.f486486f);
                if (j28 >= j27) {
                    break;
                }
            }
        }
        return java.lang.Math.min(j28 - j17, j18);
    }

    public s9.s b(long j17) {
        s9.s sVar = new s9.s(this.f486492b, j17, -1L, -9223372036854775807L, null);
        java.util.TreeSet treeSet = this.f486493c;
        s9.s sVar2 = (s9.s) treeSet.floor(sVar);
        if (sVar2 != null && sVar2.f486485e + sVar2.f486486f > j17) {
            return sVar2;
        }
        s9.s sVar3 = (s9.s) treeSet.ceiling(sVar);
        return sVar3 == null ? new s9.s(this.f486492b, j17, -1L, -9223372036854775807L, null) : new s9.s(this.f486492b, j17, sVar3.f486485e - j17, -9223372036854775807L, null);
    }

    public s9.s c(s9.s sVar) {
        java.util.TreeSet treeSet = this.f486493c;
        t9.a.d(treeSet.remove(sVar));
        int i17 = this.f486491a;
        t9.a.d(sVar.f486487g);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.File d17 = s9.s.d(sVar.f486488h.getParentFile(), i17, sVar.f486485e, currentTimeMillis);
        s9.s sVar2 = new s9.s(sVar.f486484d, sVar.f486485e, sVar.f486486f, currentTimeMillis, d17);
        java.io.File file = sVar.f486488h;
        if (file.renameTo(d17)) {
            treeSet.add(sVar2);
            return sVar2;
        }
        throw new s9.a("Renaming of " + file + " to " + d17 + " failed.");
    }
}
