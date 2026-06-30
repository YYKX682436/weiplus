package vd2;

/* loaded from: classes3.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f517550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f517553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f517555i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f517557n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f517558o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, boolean z17, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, r45.wk0 wk0Var, android.content.Intent intent2, ss5.d0 d0Var, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        super(0);
        this.f517550d = c19792x256d2725;
        this.f517551e = z17;
        this.f517552f = context;
        this.f517553g = f1Var;
        this.f517554h = intent;
        this.f517555i = wk0Var;
        this.f517556m = intent2;
        this.f517557n = d0Var;
        this.f517558o = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m75945x2fec8307;
        java.lang.String m76944x730bcac6;
        vd2.f1 f1Var = this.f517553g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f517550d;
        if (c19792x256d2725 != null) {
            boolean z17 = this.f517551e;
            android.content.Context context = this.f517552f;
            if (!z17 || !sl2.h.f490784a.c(context, c19792x256d2725)) {
                java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
                if ((m76836x6c03c64c == null || m76836x6c03c64c.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19792x256d2725.m76836x6c03c64c(), xy2.c.e(context))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveC1 visitor");
                    this.f517553g.Ni(this.f517552f, this.f517556m, kz5.b0.c(c19792x256d2725), 0, this.f517555i, this.f517557n);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f517258d, "enterLiveC1 anchor");
                    s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Intent intent = this.f517554h;
                    android.content.Context context2 = this.f517552f;
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                    java.lang.Long valueOf = java.lang.Long.valueOf(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L);
                    java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                    java.lang.String str = m76803x6c285d75 == null ? "" : m76803x6c285d75;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                    java.lang.String str2 = (m76802x2dd01666 == null || (m76944x730bcac6 = m76802x2dd01666.m76944x730bcac6()) == null) ? "" : m76944x730bcac6;
                    java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
                    r45.y74 y74Var = (r45.y74) this.f517555i.m75936x14adae67(6);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).oj(intent, context2, m76784x5db1b11, valueOf, str, str2, "", m76829x97edf6c0, (y74Var == null || (m75945x2fec8307 = y74Var.m75945x2fec8307(8)) == null) ? "" : m75945x2fec8307);
                }
            }
        } else {
            java.lang.String str3 = f1Var.f517258d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveC1 error ");
            com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f517558o;
            sb6.append(fVar.f152148a);
            sb6.append(", ");
            sb6.append(fVar.f152149b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, sb6.toString());
            ss5.d0 d0Var = this.f517557n;
            if (d0Var != null) {
                d0Var.mo125864x428b6afc(-1);
            }
        }
        return jz5.f0.f384359a;
    }
}
