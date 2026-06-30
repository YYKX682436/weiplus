package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f169799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f169800i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f169801m;

    public q0(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, int i28) {
        this.f169795d = str;
        this.f169796e = i17;
        this.f169797f = i18;
        this.f169798g = str2;
        this.f169799h = i19;
        this.f169800i = i27;
        this.f169801m = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0.f169846m).get(this.f169795d);
        if (t0Var == null) {
            return;
        }
        java.util.Map map = t0Var.f169854g;
        int i18 = this.f169796e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i18));
        int i19 = 0;
        int i27 = 1;
        ((java.util.HashMap) map).put(valueOf, java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
        boolean b17 = gf.l0.f352648a.b();
        int i28 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) t0Var.f169853f;
            if (i28 >= arrayList.size()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s0 s0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s0) arrayList.get(i28);
            int i29 = s0Var.f169810a;
            switch (i29) {
                case 1:
                    i17 = i27;
                    break;
                case 2:
                    i17 = 2;
                    break;
                case 3:
                    i17 = 3;
                    break;
                case 4:
                    i17 = 4;
                    break;
                case 5:
                    i17 = 5;
                    break;
                case 6:
                    i17 = 6;
                    break;
                case 7:
                    i17 = 7;
                    break;
                default:
                    i17 = i19;
                    break;
            }
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[28];
            objArr[i19] = t0Var.f169848a;
            objArr[i27] = t0Var.f169849b;
            objArr[2] = t0Var.f169850c;
            objArr[3] = t0Var.f169852e;
            objArr[4] = java.lang.Integer.valueOf(i18);
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i18));
            objArr[5] = java.lang.Integer.valueOf(num2 == null ? i19 : num2.intValue());
            objArr[6] = java.lang.Integer.valueOf(i29);
            objArr[7] = java.lang.Integer.valueOf(s0Var.f169811b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.k1.f169748a;
            n1Var.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - n1Var.f169780d > 1000) {
                n1Var.a();
                n1Var.f169780d = currentTimeMillis;
            }
            int i37 = i17;
            objArr[8] = java.lang.Integer.valueOf(n1Var.b(i37).f169776d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.m1 b18 = n1Var.b(i37);
            objArr[9] = java.lang.Integer.valueOf(b18.f169773a / b18.f169775c);
            objArr[10] = java.lang.Integer.valueOf(n1Var.b(i37).f169774b);
            objArr[11] = java.lang.Integer.valueOf(n1Var.b(i37).f169775c);
            objArr[12] = java.lang.Integer.valueOf(this.f169797f);
            objArr[13] = java.lang.Integer.valueOf(t0Var.f169855h);
            objArr[14] = t0Var.f169856i;
            objArr[15] = this.f169798g;
            objArr[16] = java.lang.Integer.valueOf(b17 ? 1 : 0);
            objArr[17] = java.lang.Integer.valueOf(this.f169799h);
            objArr[18] = java.lang.Integer.valueOf(this.f169800i);
            objArr[19] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0.f169845l.f169903d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.i0.f169738f.getClass();
            int i38 = 0;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.i0 i0Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.i0.m52454xcee59d22()) {
                if (i0Var.f169741e.mo52442xdac2174d()) {
                    i38 |= i0Var.f169740d;
                }
            }
            objArr[20] = java.lang.Integer.valueOf(i38);
            objArr[21] = java.lang.Integer.valueOf(this.f169801m);
            objArr[22] = java.lang.Integer.valueOf(ak0.o.f() ? 1 : 0);
            objArr[23] = t0Var.f169851d;
            objArr[24] = 2;
            objArr[25] = 0;
            objArr[26] = t0Var.f169857j;
            objArr[27] = t0Var.f169858k;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f169357a.b(19941, java.lang.String.format(locale, "%s,%s,%s,%s,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%s,%s", objArr));
            i28++;
            i19 = 0;
            i27 = 1;
        }
    }
}
