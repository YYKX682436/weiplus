package l9;

/* loaded from: classes15.dex */
public final class b implements i9.d {

    /* renamed from: d, reason: collision with root package name */
    public final i9.a[] f398783d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f398784e;

    public b(i9.a[] aVarArr, long[] jArr) {
        this.f398783d = aVarArr;
        this.f398784e = jArr;
    }

    @Override // i9.d
    public long a(int i17) {
        t9.a.a(i17 >= 0);
        long[] jArr = this.f398784e;
        t9.a.a(i17 < jArr.length);
        return jArr[i17];
    }

    @Override // i9.d
    public int h() {
        return this.f398784e.length;
    }

    @Override // i9.d
    public int i(long j17) {
        long[] jArr = this.f398784e;
        int b17 = t9.d0.b(jArr, j17, false, false);
        if (b17 < jArr.length) {
            return b17;
        }
        return -1;
    }

    @Override // i9.d
    public java.util.List j(long j17) {
        i9.a aVar;
        int c17 = t9.d0.c(this.f398784e, j17, true, false);
        return (c17 == -1 || (aVar = this.f398783d[c17]) == null) ? java.util.Collections.emptyList() : java.util.Collections.singletonList(aVar);
    }
}
