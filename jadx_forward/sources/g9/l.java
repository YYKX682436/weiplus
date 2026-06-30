package g9;

/* loaded from: classes15.dex */
public final class l implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f351156a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.o f351157b;

    public l(g9.o oVar, int i17) {
        this.f351157b = oVar;
        this.f351156a = i17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        g9.o oVar = this.f351157b;
        if (oVar.u()) {
            return -3;
        }
        java.util.LinkedList linkedList = oVar.f351168p;
        if (!linkedList.isEmpty()) {
            while (true) {
                boolean z18 = true;
                if (linkedList.size() <= 1) {
                    break;
                }
                int i17 = ((g9.i) linkedList.getFirst()).f351118j;
                int i18 = 0;
                while (true) {
                    d9.f0[] f0VarArr = oVar.f351171s;
                    if (i18 >= f0VarArr.length) {
                        break;
                    }
                    if (oVar.C[i18]) {
                        d9.c0 c0Var = f0VarArr[i18].f308872c;
                        if ((c0Var.f() ? c0Var.f308827b[c0Var.e(c0Var.f308837l)] : c0Var.f308843r) == i17) {
                            z18 = false;
                            break;
                        }
                    }
                    i18++;
                }
                if (!z18) {
                    break;
                }
                linkedList.removeFirst();
            }
            g9.i iVar = (g9.i) linkedList.getFirst();
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = iVar.f331855c;
            if (!c1601x7dc4e417.m17150xb2c87fbf(oVar.f351176x)) {
                int i19 = oVar.f351159d;
                int i27 = iVar.f331856d;
                java.lang.Object obj = iVar.f331857e;
                long j17 = iVar.f331858f;
                d9.g gVar2 = oVar.f351166n;
                if (gVar2.f308883b != null) {
                    gVar2.f308882a.post(new d9.e(gVar2, i19, c1601x7dc4e417, i27, obj, j17));
                }
            }
            oVar.f351176x = c1601x7dc4e417;
        }
        return oVar.f351171s[this.f351156a].k(sVar, gVar, z17, oVar.I, oVar.E);
    }

    @Override // d9.g0
    public void b() {
        g9.o oVar = this.f351157b;
        oVar.f351165m.b();
        g9.f fVar = oVar.f351161f;
        java.io.IOException iOException = fVar.f351110j;
        if (iOException != null) {
            throw iOException;
        }
        h9.a aVar = fVar.f351111k;
        if (aVar != null) {
            h9.i iVar = (h9.i) fVar.f351105e.f361194g.get(aVar);
            iVar.f361181e.b();
            java.io.IOException iOException2 = iVar.f361189p;
            if (iOException2 != null) {
                throw iOException2;
            }
        }
    }

    @Override // d9.g0
    public void c(long j17) {
        long j18;
        g9.o oVar = this.f351157b;
        d9.f0 f0Var = oVar.f351171s[this.f351156a];
        if (oVar.I) {
            d9.c0 c0Var = f0Var.f308872c;
            synchronized (c0Var) {
                j18 = c0Var.f308839n;
            }
            if (j17 > j18) {
                d9.c0 c0Var2 = f0Var.f308872c;
                synchronized (c0Var2) {
                    if (c0Var2.f()) {
                        c0Var2.f308837l = c0Var2.f308834i;
                        return;
                    }
                    return;
                }
            }
        }
        f0Var.e(j17, true, true);
    }

    @Override // d9.g0
    /* renamed from: isReady */
    public boolean mo123736x7b5e8699() {
        g9.o oVar = this.f351157b;
        return oVar.I || (!oVar.u() && oVar.f351171s[this.f351156a].f308872c.f());
    }
}
