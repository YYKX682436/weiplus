package kw2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public long f394428b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f394427a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f394429c = new java.util.HashSet();

    public c(r45.qt2 qt2Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r8 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011b, code lost:
    
        if (r8 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw2.c.a(long, com.tencent.mm.protocal.protobuf.FinderCommentInfo):void");
    }

    public final void b(long j17, int i17, dn.h hVar) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f394427a.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        if (i17 != 0) {
            bVar.f394406j = i17;
            bVar.f394413q = i17;
        }
        java.lang.String str = hVar != null ? hVar.f323302d : null;
        if (str == null) {
            str = "";
        }
        bVar.f394411o = str;
        bVar.f394412p = hVar != null ? hVar.f323303e : 0;
        bVar.f394416t = hVar != null ? hVar.f69505x1282dcdf : 0L;
        bVar.f394415s = hVar != null ? hVar.f69513x1966ddff : 0L;
        long j18 = hVar != null ? hVar.f69523x17c343e7 : 0L;
        if (j18 > 0) {
            bVar.f394402f = j18;
        }
    }

    public final void c(long j17, long j18) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f394427a.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        if (!(bVar.f394407k == 0)) {
            bVar = null;
        }
        if (bVar != null) {
            long c17 = c01.id.c();
            long j19 = c17 - j18;
            bVar.f394407k = j19;
            if (bVar.f394405i == -1) {
                long j27 = bVar.f394419w;
                bVar.f394405i = 1 <= j27 && j27 < c17 ? c17 - j27 : 0L;
            }
            if (bVar.f394400d == 2) {
                bVar.f394417u = j19;
            }
        }
    }

    public final void d(long j17) {
        kw2.b bVar;
        if (j17 == 0 || (bVar = (kw2.b) this.f394427a.get(java.lang.Long.valueOf(j17))) == null || bVar.f394422z <= 0) {
            return;
        }
        long c17 = c01.id.c();
        bVar.f394410n += c17;
        r45.t23 t23Var = new r45.t23();
        t23Var.set(2, java.lang.Integer.valueOf((int) c17));
        t23Var.set(1, java.lang.Integer.valueOf(bVar.A));
        if (bVar.f394408l == 0) {
            t23Var.set(0, 2);
        } else {
            t23Var.set(0, 0);
        }
        bVar.f394421y.add(t23Var);
        bVar.f394422z = 0L;
    }

    public final void e(long j17) {
        if (j17 == 0) {
            return;
        }
        kw2.b bVar = (kw2.b) this.f394427a.get(java.lang.Long.valueOf(j17));
        java.util.HashSet hashSet = this.f394429c;
        if (bVar != null) {
            if (!(bVar.f394419w == 0)) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.f394419w = c01.id.c();
                bVar.f394403g = hashSet.contains(java.lang.Long.valueOf(j17)) ? 0L : 1L;
            }
        }
        hashSet.add(java.lang.Long.valueOf(j17));
    }
}
