package mt1;

/* loaded from: classes12.dex */
public final class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f412756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f412757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f412758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f412759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f412760i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f412761m;

    public i(java.lang.String str, java.util.ArrayList arrayList, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3) {
        this.f412755d = str;
        this.f412756e = arrayList;
        this.f412757f = c26987xeef691ab;
        this.f412758g = z17;
        this.f412759h = g0Var;
        this.f412760i = g0Var2;
        this.f412761m = g0Var3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String u07;
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f412760i;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = this.f412759h;
        java.util.ArrayList arrayList2 = this.f412756e;
        java.lang.String str = this.f412755d;
        boolean z17 = true;
        try {
            mt1.q0.f412791a.b();
            if (mt1.b0.e(mt1.b0.f412724a, str)) {
                int size = arrayList2.size();
                long j17 = -1;
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    java.lang.String str2 = ((mt1.a) arrayList2.get(i17)).f412721b;
                    long j18 = ((mt1.a) arrayList2.get(i17)).f412720a;
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f412757f;
                    if (c26987xeef691ab != null && c26987xeef691ab.m108008xc9602be3()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CalcWxNewService", "cs isCanceled, stop linkify");
                        mt1.b0.f412733j = z17;
                        break;
                    }
                    mt1.b0 b0Var = mt1.b0.f412724a;
                    if (mt1.b0.e(b0Var, str2) && (u07 = ot1.h.u0(str2)) != null) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, u07)) {
                            arrayList = arrayList2;
                            j17 = j18;
                        } else {
                            arrayList = arrayList2;
                            int f17 = mt1.q0.f412791a.f(str, u07, this.f412758g);
                            if (f17 < 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "Linkify Failed ret = " + f17);
                                throw new java.lang.RuntimeException("Linkify Failed ret = " + f17);
                            }
                            if (f17 != 2) {
                                if (f17 == 200 || f17 == 2000) {
                                    g0Var2.f391654d++;
                                    g0Var.f391654d += this.f412761m.f391654d;
                                    b0Var.n().D0(kz5.c0.i(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17)));
                                }
                            } else if (j17 >= 0) {
                                b0Var.n().D0(kz5.b0.c(java.lang.Long.valueOf(j17)));
                            }
                        }
                        i17++;
                        arrayList2 = arrayList;
                        z17 = true;
                    }
                    arrayList = arrayList2;
                    i17++;
                    arrayList2 = arrayList;
                    z17 = true;
                }
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("LinkifyError", true);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(26980, java.lang.Integer.valueOf(org.p3343x72743996.net.InterfaceC29524x4f65168b.f73913x76158116), 0, 0, e17.getMessage(), "", 0);
            fVar.d(26980, 201, java.lang.Long.valueOf(g0Var2.f391654d), java.lang.Long.valueOf(g0Var.f391654d), this.f412755d, "", 0);
            throw e17;
        }
    }
}
