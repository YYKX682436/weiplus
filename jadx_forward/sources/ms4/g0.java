package ms4;

/* loaded from: classes8.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f412554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f412555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ js4.n f412556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gc5 f412560g;

    public g0(ms4.j0 j0Var, android.app.Activity activity, js4.n nVar, int i17, java.lang.String str, java.lang.String str2, r45.gc5 gc5Var) {
        this.f412554a = j0Var;
        this.f412555b = activity;
        this.f412556c = nVar;
        this.f412557d = i17;
        this.f412558e = str;
        this.f412559f = str2;
        this.f412560g = gc5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.f04 f04Var;
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        ms4.j0 j0Var = this.f412554a;
        j0Var.f412583d = null;
        android.app.Activity activity = this.f412555b;
        j0Var.f(activity, false);
        boolean h17 = os4.h.h(fVar);
        js4.n nVar = this.f412556c;
        if (h17) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            r45.hc5 hc5Var = (r45.hc5) resp;
            if (hc5Var == null || (f04Var = hc5Var.f457585h) == null) {
                ms4.a aVar = new ms4.a(fVar.f152148a, fVar.f152149b, fVar.f152150c, null, 8, null);
                js4.o oVar = nVar.f383079d;
                java.util.Objects.toString(aVar);
                os4.h.e(activity, aVar, new ms4.h0(aVar, oVar));
                this.f412554a.e(this.f412557d, this.f412558e, this.f412559f, 3, 3, fVar.f152149b, fVar.f152150c);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 22);
            } else {
                android.app.Activity activity2 = this.f412555b;
                java.lang.String str3 = this.f412559f;
                int i18 = this.f412557d;
                java.lang.String str4 = this.f412558e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                os4.h.k("MicroMsg.WeCoinMidasInitializer", resp);
                r45.ja7 ja7Var = new r45.ja7();
                ja7Var.f459212d = this.f412560g.f456617d;
                r45.hc5 hc5Var2 = (r45.hc5) fVar.f152151d;
                ms4.d dVar = new ms4.d(hc5Var2, ja7Var);
                js4.o oVar2 = nVar.f383079d;
                java.util.Objects.toString(dVar);
                if (hc5Var2 != null) {
                    str = str4;
                    i17 = i18;
                    str2 = str3;
                    os4.h.f(activity2, hc5Var2.f457585h, new ms4.d0(ja7Var.f459212d, j0Var, activity2, hc5Var2, nVar, str3, oVar2));
                } else {
                    str = str4;
                    i17 = i18;
                    str2 = str3;
                }
                j0Var.e(i17, str, str2, 3, 3, fVar.f152149b, f04Var.f455440d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(fe1.l.f69742x366c91de, 27);
                g0Var.A(fe1.l.f69742x366c91de, 22);
            }
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinMidasInitializer", "cgiBack.resp is null");
                ms4.a aVar2 = new ms4.a(3, -1, "", null, 8, null);
                js4.o oVar3 = nVar.f383079d;
                java.util.Objects.toString(aVar2);
                os4.h.e(activity, aVar2, new ms4.h0(aVar2, oVar3));
                this.f412554a.e(this.f412557d, this.f412558e, this.f412559f, 3, 3, 3, "callback resp is null");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 22);
            } else {
                r45.hc5 hc5Var3 = (r45.hc5) fVar2;
                ms4.j0 j0Var2 = this.f412554a;
                int i19 = this.f412557d;
                java.lang.String str5 = this.f412558e;
                java.lang.String str6 = this.f412559f;
                android.app.Activity activity3 = this.f412555b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge, product_id: " + nVar.f383081f);
                os4.h.k("MicroMsg.WeCoinMidasInitializer", hc5Var3);
                j0Var2.e(i19, str5, str6, 3, 3, 0, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 21);
                j0Var2.d(activity3, hc5Var3, "release", nVar, str6);
            }
        }
        return jz5.f0.f384359a;
    }
}
