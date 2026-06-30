package a31;

/* loaded from: classes14.dex */
public class o implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 f82526d;

    public o(com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924) {
        this.f82526d = c11154x38c1a924;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82526d;
        z21.q qVar = c11154x38c1a924.f153294n;
        if (qVar == null) {
            return true;
        }
        int i17 = c11154x38c1a924.f153298r;
        int[] iArr = com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924.f153286v;
        if (i17 < 5) {
            c11154x38c1a924.f153298r = i17 + 1;
            c11154x38c1a924.m48302x1c425879(iArr[i17]);
            return true;
        }
        int i18 = qVar.f551196e;
        qVar.f551196e = 0;
        if (i18 > z21.q.f551194v) {
            z21.q.f551194v = i18;
        }
        int i19 = (i18 * 100) / z21.q.f551194v;
        int i27 = c11154x38c1a924.f153295o;
        int i28 = c11154x38c1a924.f153296p;
        if (i27 == i28) {
            if (i19 <= 10) {
                int i29 = c11154x38c1a924.f153297q + 1;
                c11154x38c1a924.f153297q = i29;
                int[] iArr2 = com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924.f153285u;
                if (i29 >= 10) {
                    c11154x38c1a924.f153297q = 0;
                }
                c11154x38c1a924.m48302x1c425879(iArr2[c11154x38c1a924.f153297q]);
                return true;
            }
            int i37 = i19 / 5;
            int[] iArr3 = com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924.f153284t;
            if (i37 >= 14) {
                i37 = 13;
            }
            c11154x38c1a924.f153296p = i37;
        } else if (i27 > i28) {
            c11154x38c1a924.f153295o = i27 - 1;
        } else {
            c11154x38c1a924.f153295o = i27 + 1;
        }
        c11154x38c1a924.m48302x1c425879(com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924.f153284t[i27]);
        return true;
    }
}
