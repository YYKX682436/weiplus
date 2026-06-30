package vd2;

/* loaded from: classes3.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f517413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f517417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f517419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f517420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f517421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517423k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f517425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f517426n;

    public r3(long j17, java.lang.String str, java.lang.String str2, android.content.Intent intent, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, java.lang.String str4, vd2.g5 g5Var, vd2.g5 g5Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.util.Map map) {
        this.f517413a = j17;
        this.f517414b = str;
        this.f517415c = str2;
        this.f517416d = intent;
        this.f517417e = h0Var;
        this.f517418f = str3;
        this.f517419g = c0Var;
        this.f517420h = z17;
        this.f517421i = g0Var;
        this.f517422j = str4;
        this.f517423k = g5Var;
        this.f517424l = g5Var2;
        this.f517425m = h0Var2;
        this.f517426n = map;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        long j17;
        boolean z17;
        boolean z18;
        vd2.g5 g5Var;
        r45.rp1 rp1Var;
        long j18;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && c19792x256d2725 != null) {
            vd2.t3 t3Var = vd2.t3.f517454a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUI liveId: ");
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            long j19 = this.f517413a;
            sb6.append(m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : j19);
            sb6.append(", username:");
            java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
            java.lang.String str = this.f517414b;
            if (m76836x6c03c64c == null) {
                m76836x6c03c64c = str == null ? "" : str;
            }
            sb6.append(m76836x6c03c64c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtilApi", sb6.toString());
            java.lang.String str2 = this.f517415c;
            boolean z19 = str2 == null || str2.length() == 0;
            android.content.Intent intent = this.f517416d;
            if (z19) {
                j17 = j19;
            } else {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                if (m76794xd05571302 != null) {
                    j18 = m76794xd05571302.m75942xfb822ef2(0);
                    j17 = j19;
                } else {
                    j17 = j19;
                    j18 = 0;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Ck(intent, str2, j18);
            }
            n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f517417e;
            java.lang.String str3 = (java.lang.String) h0Var.f391656d;
            ((m30.m) qVar).getClass();
            a52.a.d(str3);
            java.lang.Object obj2 = h0Var.f391656d;
            ml2.q1 q1Var = ml2.q1.f409345e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "temp_37")) {
                ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                java.lang.String str4 = (java.lang.String) h0Var.f391656d;
                y4Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                y4Var.f409819a = str4;
            }
            android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
            java.lang.String str5 = this.f517418f;
            intent2.putExtra("key_extra_info", str5);
            r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", m76794xd05571303 != null ? java.lang.Integer.valueOf(m76794xd05571303.m75939xb282bd08(42)) : null);
            if (this.f517419g.f391645d) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 8);
            } else if (this.f517420h) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 6);
            }
            long j27 = this.f517421i.f391654d;
            if (j27 > 0) {
                intent2.putExtra("KEY_PRODUCT_ID", j27);
            }
            r45.nw1 m76794xd05571304 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571304 != null && (rp1Var = (r45.rp1) m76794xd05571304.m75936x14adae67(45)) != null) {
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.mo14344x5f01b1f6());
            }
            int i17 = intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO") ? -1 : 1;
            java.lang.String str6 = str5.length() > 0 ? str5 : null;
            if (str6 != null) {
                java.lang.String m76836x6c03c64c2 = c19792x256d2725.m76836x6c03c64c();
                if (m76836x6c03c64c2 != null) {
                    str = m76836x6c03c64c2;
                } else if (str == null) {
                    str = "";
                }
                p52.h.f433549a.f(str6, str);
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(xy2.c.e(context), c19792x256d2725.m76836x6c03c64c());
            java.lang.String str7 = this.f517422j;
            if (D0) {
                if (intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2a), 0).show();
                    intent.removeExtra("KEY_MINI_APP_AD_FLOW_INFO");
                } else {
                    s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    r45.nw1 m76794xd05571305 = c19792x256d2725.m76794xd0557130();
                    if (m76794xd05571305 != null) {
                        j17 = m76794xd05571305.m75942xfb822ef2(0);
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).oj(intent2, context3, m76784x5db1b11, valueOf, m76803x6c285d75 == null ? "" : m76803x6c285d75, "", this.f517422j, c19792x256d2725.m76829x97edf6c0(), "");
                }
            } else {
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, str7);
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, java.lang.Integer.valueOf(i17));
                r45.ta4 ta4Var = new r45.ta4();
                byte[] bytes = ((java.lang.String) this.f517425m.f391656d).getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                ta4Var.set(1, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
                java.util.Map map = this.f517426n;
                java.lang.Object obj3 = map != null ? map.get("key_open_live_h5_buffer") : null;
                byte[] bArr = obj3 instanceof byte[] ? (byte[]) obj3 : null;
                if (bArr != null) {
                    ta4Var.set(36, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
                }
                wk0Var.set(7, ta4Var);
                r45.u74 u74Var = new r45.u74();
                r45.ta4 ta4Var2 = (r45.ta4) wk0Var.m75936x14adae67(7);
                u74Var.set(0, ta4Var2 != null ? ta4Var2.m75934xbce7f2f(1) : null);
                wk0Var.set(8, u74Var);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                ((vd2.f1) e0Var).Ni(context4, intent2, kz5.b0.c(c19792x256d2725), 0, wk0Var, null);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                z17 = false;
                z18 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[4];
                if (str7 == null) {
                    str7 = "";
                }
                z17 = false;
                objArr[0] = str7;
                z18 = true;
                objArr[1] = str5;
                objArr[2] = java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11());
                objArr[3] = "";
                g0Var.d(21140, objArr);
            }
            if (intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO") == z18) {
                z17 = z18;
            }
            if (!z17 && (g5Var = this.f517423k) != null) {
                g5Var.a(null);
            }
        } else {
            vd2.g5 g5Var2 = this.f517424l;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f152149b));
            }
        }
        return jz5.f0.f384359a;
    }
}
