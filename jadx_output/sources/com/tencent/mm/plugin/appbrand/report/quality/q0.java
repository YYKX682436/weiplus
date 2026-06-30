package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f88263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f88266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f88268m;

    public q0(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, int i28) {
        this.f88262d = str;
        this.f88263e = i17;
        this.f88264f = i18;
        this.f88265g = str2;
        this.f88266h = i19;
        this.f88267i = i27;
        this.f88268m = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.report.quality.t0 t0Var = (com.tencent.mm.plugin.appbrand.report.quality.t0) ((java.util.HashMap) com.tencent.mm.plugin.appbrand.report.quality.t0.f88313m).get(this.f88262d);
        if (t0Var == null) {
            return;
        }
        java.util.Map map = t0Var.f88321g;
        int i18 = this.f88263e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i18));
        int i19 = 0;
        int i27 = 1;
        ((java.util.HashMap) map).put(valueOf, java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
        boolean b17 = gf.l0.f271115a.b();
        int i28 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) t0Var.f88320f;
            if (i28 >= arrayList.size()) {
                return;
            }
            com.tencent.mm.plugin.appbrand.report.quality.s0 s0Var = (com.tencent.mm.plugin.appbrand.report.quality.s0) arrayList.get(i28);
            int i29 = s0Var.f88277a;
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
            objArr[i19] = t0Var.f88315a;
            objArr[i27] = t0Var.f88316b;
            objArr[2] = t0Var.f88317c;
            objArr[3] = t0Var.f88319e;
            objArr[4] = java.lang.Integer.valueOf(i18);
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i18));
            objArr[5] = java.lang.Integer.valueOf(num2 == null ? i19 : num2.intValue());
            objArr[6] = java.lang.Integer.valueOf(i29);
            objArr[7] = java.lang.Integer.valueOf(s0Var.f88278b);
            com.tencent.mm.plugin.appbrand.report.quality.n1 n1Var = com.tencent.mm.plugin.appbrand.report.quality.k1.f88215a;
            n1Var.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - n1Var.f88247d > 1000) {
                n1Var.a();
                n1Var.f88247d = currentTimeMillis;
            }
            int i37 = i17;
            objArr[8] = java.lang.Integer.valueOf(n1Var.b(i37).f88243d);
            com.tencent.mm.plugin.appbrand.report.quality.m1 b18 = n1Var.b(i37);
            objArr[9] = java.lang.Integer.valueOf(b18.f88240a / b18.f88242c);
            objArr[10] = java.lang.Integer.valueOf(n1Var.b(i37).f88241b);
            objArr[11] = java.lang.Integer.valueOf(n1Var.b(i37).f88242c);
            objArr[12] = java.lang.Integer.valueOf(this.f88264f);
            objArr[13] = java.lang.Integer.valueOf(t0Var.f88322h);
            objArr[14] = t0Var.f88323i;
            objArr[15] = this.f88265g;
            objArr[16] = java.lang.Integer.valueOf(b17 ? 1 : 0);
            objArr[17] = java.lang.Integer.valueOf(this.f88266h);
            objArr[18] = java.lang.Integer.valueOf(this.f88267i);
            objArr[19] = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.report.quality.t0.f88312l.f88370d);
            com.tencent.mm.plugin.appbrand.report.quality.i0.f88205f.getClass();
            int i38 = 0;
            for (com.tencent.mm.plugin.appbrand.report.quality.i0 i0Var : com.tencent.mm.plugin.appbrand.report.quality.i0.values()) {
                if (i0Var.f88208e.isEnable()) {
                    i38 |= i0Var.f88207d;
                }
            }
            objArr[20] = java.lang.Integer.valueOf(i38);
            objArr[21] = java.lang.Integer.valueOf(this.f88268m);
            objArr[22] = java.lang.Integer.valueOf(ak0.o.f() ? 1 : 0);
            objArr[23] = t0Var.f88318d;
            objArr[24] = 2;
            objArr[25] = 0;
            objArr[26] = t0Var.f88324j;
            objArr[27] = t0Var.f88325k;
            com.tencent.mm.plugin.appbrand.report.d.f87824a.b(19941, java.lang.String.format(locale, "%s,%s,%s,%s,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%s,%s", objArr));
            i28++;
            i19 = 0;
            i27 = 1;
        }
    }
}
