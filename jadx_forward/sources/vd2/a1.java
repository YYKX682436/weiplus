package vd2;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f517163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f517166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517167h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f517168i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f517169m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f517170n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, boolean z17, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, java.lang.Object obj, ss5.d0 d0Var, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        super(0);
        this.f517163d = c19792x256d2725;
        this.f517164e = z17;
        this.f517165f = context;
        this.f517166g = f1Var;
        this.f517167h = intent;
        this.f517168i = obj;
        this.f517169m = d0Var;
        this.f517170n = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ss5.d0 d0Var = this.f517169m;
        vd2.f1 f1Var = this.f517166g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f517163d;
        if (c19792x256d2725 != null) {
            boolean z17 = this.f517164e;
            android.content.Context context = this.f517165f;
            if (!z17 || !sl2.h.f490784a.c(context, c19792x256d2725)) {
                java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
                if ((m76836x6c03c64c == null || m76836x6c03c64c.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19792x256d2725.m76836x6c03c64c(), xy2.c.e(context))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveC2 visitor");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5();
                    q5Var.f206801a = java.lang.System.currentTimeMillis();
                    q5Var.f206806f = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206869b = q5Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1();
                    p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = p1Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 1L;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 1L;
                    p1Var.f206764b = 0L;
                    p1Var.f206765c = 0L;
                    p1Var.f206766d = 0L;
                    p1Var.f206767e = 0L;
                    p1Var.f206768f = 0L;
                    dk2.x4 x4Var = (dk2.x4) this.f517168i;
                    x4Var.f315848i = 0;
                    x4Var.A = c19792x256d2725.m76784x5db1b11();
                    x4Var.f315851l.clear();
                    x4Var.f315851l.add(zl2.l.c(zl2.l.f555398a, this.f517163d, 0, false, 6, null));
                    i95.m c17 = i95.n0.c(c61.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    int N8 = c61.zb.N8((c61.zb) c17, this.f517165f, x4Var, "", "", this.f517167h, false, null, 64, null);
                    if (N8 == 0) {
                        if (d0Var != null) {
                            d0Var.a();
                        }
                    } else if (d0Var != null) {
                        d0Var.mo125864x428b6afc(N8);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveC2 anchor");
                    s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Intent intent = this.f517167h;
                    android.content.Context context2 = this.f517165f;
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                    java.lang.Long valueOf = java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L);
                    java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                    if (m76803x6c285d75 == null) {
                        m76803x6c285d75 = "";
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).oj(intent, context2, m76784x5db1b11, valueOf, m76803x6c285d75, "", "", c19792x256d2725.m76829x97edf6c0(), "");
                }
            }
        } else {
            java.lang.String str = f1Var.f517258d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveC2 error ");
            com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f517170n;
            sb6.append(fVar.f152148a);
            sb6.append(", ");
            sb6.append(fVar.f152149b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
            if (d0Var != null) {
                d0Var.mo125864x428b6afc(-1);
            }
        }
        return jz5.f0.f384359a;
    }
}
