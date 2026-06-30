package e0;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f327147a = new o0.i(new e0.i[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = ((e0.i) r1[r2]).f327129b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 <= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r2 < r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r5 = this;
            o0.i r0 = r5.f327147a
            boolean r1 = r0.i()
            if (r1 != 0) goto L23
            java.lang.Object[] r1 = r0.f423383d
            r2 = 0
            r3 = r1[r2]
            e0.i r3 = (e0.i) r3
            int r3 = r3.f327129b
            int r0 = r0.f423385f
            if (r0 <= 0) goto L22
        L15:
            r4 = r1[r2]
            e0.i r4 = (e0.i) r4
            int r4 = r4.f327129b
            if (r4 <= r3) goto L1e
            r3 = r4
        L1e:
            int r2 = r2 + 1
            if (r2 < r0) goto L15
        L22:
            return r3
        L23:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "MutableVector is empty."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.a():int");
    }

    public final int b() {
        o0.i iVar = this.f327147a;
        if (iVar.i()) {
            throw new java.util.NoSuchElementException("MutableVector is empty.");
        }
        java.lang.Object[] objArr = iVar.f423383d;
        int i17 = ((e0.i) objArr[0]).f327128a;
        int i18 = iVar.f423385f;
        if (i18 > 0) {
            int i19 = 0;
            do {
                int i27 = ((e0.i) objArr[i19]).f327128a;
                if (i27 < i17) {
                    i17 = i27;
                }
                i19++;
            } while (i19 < i18);
        }
        if (i17 >= 0) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }
}
