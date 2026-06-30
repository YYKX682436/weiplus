package t21;

@j95.b
/* loaded from: classes4.dex */
public class i2 extends i95.w implements wf0.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f496327d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f496328e = new java.util.HashMap();

    public static t21.i2 wi() {
        return (t21.i2) i95.n0.c(t21.i2.class);
    }

    public int Ai(wf0.l1 l1Var) {
        boolean z17;
        t21.h2 h2Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f527051a)) {
            if (l1Var.f527052b != bm5.f0.f104094f) {
                z17 = true;
                if (z17 || (h2Var = (t21.h2) this.f496327d.get(l1Var)) == null) {
                    return 0;
                }
                return h2Var.f496319h;
            }
        }
        z17 = false;
        if (z17) {
            return 0;
        }
        return h2Var.f496319h;
    }

    public void Bi(int i17, dn.h hVar, int i18) {
        if (hVar == null) {
            return;
        }
        java.lang.String str = hVar.f69524x419c440e;
        java.lang.String str2 = i17 + "";
        java.util.HashMap hashMap = this.f496328e;
        t21.h2 h2Var = (t21.h2) hashMap.get(str2);
        if (h2Var == null) {
            h2Var = new t21.h2(this);
        }
        h2Var.f496315d = "";
        h2Var.f496314c = "";
        h2Var.f496312a = "";
        h2Var.f496319h = i18;
        h2Var.f496318g = 1;
        h2Var.f496317f = hVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        h2Var.f496320i = java.lang.System.currentTimeMillis();
        hashMap.put(str2, h2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMediaRpt", "note sns video sendScene %d snsKey[%s] url[%s]", java.lang.Integer.valueOf(i18), str2, str);
    }

    public void Di(java.lang.String str, java.lang.String str2, wf0.l1 l1Var, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        java.util.HashMap hashMap = this.f496327d;
        t21.h2 h2Var = (t21.h2) hashMap.get(l1Var);
        if (h2Var == null) {
            h2Var = new t21.h2(this);
        }
        h2Var.f496312a = str;
        h2Var.f496313b = str2;
        h2Var.f496314c = str3;
        h2Var.f496315d = str4;
        h2Var.f496316e = str5;
        int i19 = h2Var.f496319h;
        if (i19 == 0) {
            i19 = i17;
        }
        h2Var.f496319h = i19;
        h2Var.f496318g = i18;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        h2Var.f496320i = java.lang.System.currentTimeMillis();
        hashMap.put(l1Var, h2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreMediaRpt", "note video upload path[%s, %s] toUser %s msgSource %s snsInfoId %s sendScene %d cpStatus %d", str, l1Var, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void Ni(int i17, java.lang.String str, java.lang.String str2, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        t21.h2 h2Var = (t21.h2) this.f496327d.get(i17 + "");
        if (h2Var != null) {
            h2Var.f496316e = j17 + "";
            h2Var.f496313b = str2;
            gm0.j1.e().j(new t21.f2(this, h2Var, h2Var.f496317f, j17, ""));
        }
    }

    public void Ri(dn.h hVar, wf0.l1 l1Var, java.lang.String str, long j17) {
        boolean z17;
        t21.h2 h2Var;
        if (hVar != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f527051a)) {
                if (l1Var.f527052b != bm5.f0.f104094f) {
                    z17 = true;
                    if (z17 || (h2Var = (t21.h2) this.f496327d.remove(l1Var)) == null) {
                        return;
                    }
                    gm0.j1.e().j(new t21.f2(this, h2Var, hVar, j17, str));
                }
            }
            z17 = false;
            if (z17) {
                return;
            }
            gm0.j1.e().j(new t21.f2(this, h2Var, hVar, j17, str));
        }
    }
}
