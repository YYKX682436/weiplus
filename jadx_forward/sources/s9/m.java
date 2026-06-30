package s9;

/* loaded from: classes7.dex */
public abstract class m {
    public static void a(r9.n nVar, s9.c cVar, s9.h hVar, byte[] bArr, t9.s sVar, int i17, s9.l lVar, boolean z17) {
        s9.l lVar2 = lVar;
        hVar.getClass();
        bArr.getClass();
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        long j18 = -1;
        if (lVar2 != null) {
            java.lang.String str = nVar.f474921f;
            if (str == null) {
                str = nVar.f474916a.toString();
            }
            java.lang.String str2 = str;
            long j19 = nVar.f474918c;
            long j27 = nVar.f474920e;
            if (j27 == -1) {
                j27 = cVar.b(str2);
            }
            lVar2.f486490a = j27;
            long j28 = j19;
            long j29 = j27;
            while (j29 != 0) {
                java.lang.String str3 = str2;
                long q07 = cVar.q0(str2, j28, j29 != -1 ? j29 : Long.MAX_VALUE);
                if (q07 <= 0) {
                    q07 = -q07;
                    if (q07 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        break;
                    }
                }
                j28 += q07;
                if (j29 == -1) {
                    q07 = 0;
                }
                j29 -= q07;
                str2 = str3;
            }
        } else {
            lVar2 = new s9.l();
        }
        java.lang.String str4 = nVar.f474921f;
        if (str4 == null) {
            str4 = nVar.f474916a.toString();
        }
        java.lang.String str5 = str4;
        long j37 = nVar.f474918c;
        long j38 = nVar.f474920e;
        if (j38 == -1) {
            j38 = cVar.b(str5);
        }
        long j39 = j37;
        long j47 = j38;
        while (j47 != 0) {
            java.lang.String str6 = str5;
            long q08 = cVar.q0(str5, j39, j47 != j18 ? j47 : j17);
            if (q08 <= 0) {
                q08 = -q08;
                try {
                    if (java.lang.Thread.interrupted()) {
                        throw new java.lang.InterruptedException();
                    }
                    r9.n nVar2 = new r9.n(nVar.f474916a, nVar.f474917b, j39, (nVar.f474919d + j39) - nVar.f474918c, -1L, nVar.f474921f, nVar.f474922g | 2);
                    long b17 = hVar.b(nVar2);
                    if (lVar2.f486490a == -1 && b17 != -1) {
                        lVar2.f486490a = nVar2.f474918c + b17;
                    }
                    long j48 = 0;
                    while (true) {
                        if (j48 == q08) {
                            j18 = -1;
                            break;
                        }
                        if (java.lang.Thread.interrupted()) {
                            throw new java.lang.InterruptedException();
                        }
                        int a17 = hVar.a(bArr, 0, q08 != -1 ? (int) java.lang.Math.min(bArr.length, q08 - j48) : bArr.length);
                        if (a17 == -1) {
                            j18 = -1;
                            if (lVar2.f486490a == -1) {
                                lVar2.f486490a = nVar2.f474918c + j48;
                            }
                        } else {
                            j48 += a17;
                        }
                    }
                    if (j48 < q08) {
                        if (z17 && j47 != j18) {
                            throw new java.io.EOFException();
                        }
                        return;
                    }
                } finally {
                    t9.d0.e(hVar);
                }
            }
            j39 += q08;
            if (j47 == j18) {
                q08 = 0;
            }
            j47 -= q08;
            str5 = str6;
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
    }
}
