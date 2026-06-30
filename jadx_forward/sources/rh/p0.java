package rh;

/* loaded from: classes12.dex */
public class p0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.k1 f477022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f477023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477024c;

    public p0(rh.c1 c1Var, rh.k1 k1Var, rh.d2 d2Var) {
        this.f477024c = c1Var;
        this.f477022a = k1Var;
        this.f477023b = d2Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.x0 x0Var;
        boolean z17;
        rh.c3 c3Var = (rh.c3) obj;
        int[] p17 = wh.m.p();
        rh.c1 c1Var = this.f477024c;
        rh.k1 k1Var = this.f477022a;
        if (k1Var != null && k1Var.y() && (x0Var = c1Var.f476866o) != null && x0Var.a(k1Var.f476968k)) {
            rh.x0 x0Var2 = c1Var.f476866o;
            x0Var2.getClass();
            for (int i17 = 0; i17 < p17.length; i17++) {
                int i18 = p17[i17];
                int[] iArr = (int[]) x0Var2.f477079a.get(i17);
                int i19 = iArr[0];
                java.util.List list = x0Var2.f477080b;
                if (i18 < i19) {
                    int[] iArr2 = (int[]) ((java.util.ArrayList) list).get(i17);
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= iArr.length) {
                            z17 = false;
                            break;
                        }
                        if (i18 <= iArr[i27]) {
                            int[] iArr3 = (int[]) ((java.util.ArrayList) list).get(i17);
                            iArr3[i27] = iArr3[i27] + 1;
                            z17 = true;
                            break;
                        }
                        i27++;
                    }
                    if (!z17 && i18 > iArr[iArr.length - 1]) {
                        int[] iArr4 = (int[]) ((java.util.ArrayList) list).get(i17);
                        int length = iArr.length - 1;
                        iArr4[length] = iArr4[length] + 1;
                    }
                }
            }
        }
        java.util.List list2 = this.f477023b.l(p17).f477071d.f477093a;
        oj.j.c("Matrix.battery.CompositeMonitors", c1Var.hashCode() + " #onSampling: " + c1Var.f476870s, new java.lang.Object[0]);
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + list2, new java.lang.Object[0]);
        if (list2.isEmpty()) {
            return rh.c3.f476872o;
        }
        java.util.Iterator it = list2.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((java.lang.Integer) ((rh.x2) it.next()).f477085a).intValue();
        }
        return java.lang.Long.valueOf(j17);
    }
}
