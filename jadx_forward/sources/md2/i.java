package md2;

/* loaded from: classes10.dex */
public final class i implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f407381d;

    /* renamed from: e, reason: collision with root package name */
    public final long f407382e;

    public i(android.content.Context context, gk2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f407381d = context;
        this.f407382e = 1L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363
    /* renamed from: getSelfFinderUsername */
    public void mo90641x9464277e(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xy2.c.e(context))));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.Companion.m90644x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363.Companion.m90644x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24409xb73e1363
    /* renamed from: openNativePage */
    public void mo90642x7bae7130(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24399x782a522f params) {
        java.lang.String m76197x6c03c64c;
        java.lang.String m90569x9c1637;
        java.lang.String m90569x9c16372;
        java.lang.Long m90571x7e9522c9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        long m90589xfb85f7b0 = params.m90589xfb85f7b0();
        if (m90589xfb85f7b0 != 0) {
            if (m90589xfb85f7b0 == this.f407382e) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24400xa9fa4620 m90587xbba97ac9 = params.m90587xbba97ac9();
                c19792x256d2725.mo11468x92b714fd(m90587xbba97ac9 != null ? m90587xbba97ac9.m90601xf48f93d0() : null);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
                if (m76760x76845fea == null || (m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c()) == null) {
                    return;
                }
                dk2.q4.j(dk2.q4.f315471a, this.f407381d, new gk2.e(null, 1, null), false, m76197x6c03c64c, null, false, null, 96, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24398x258b2250 m90586x49c282c7 = params.m90586x49c282c7();
        c19792x256d27252.mo11468x92b714fd(m90586x49c282c7 != null ? m90586x49c282c7.m90570xf48f93d0() : null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        long m76784x5db1b11 = c19792x256d27252.m76784x5db1b11();
        r45.nw1 m76794xd0557130 = c19792x256d27252.m76794xd0557130();
        long m75942xfb822ef2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
        r45.dm2 m76806xdef68064 = c19792x256d27252.m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        java.lang.String m76836x6c03c64c = c19792x256d27252.m76836x6c03c64c();
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24398x258b2250 m90586x49c282c72 = params.m90586x49c282c7();
        long longValue = (m90586x49c282c72 == null || (m90571x7e9522c9 = m90586x49c282c72.m90571x7e9522c9()) == null) ? 0L : m90571x7e9522c9.longValue();
        long m75939xb282bd08 = c19792x256d27252.m76794xd0557130() != null ? r9.m75939xb282bd08(1) : -1L;
        ml2.x1 x1Var = ml2.x1.f409740n;
        ml2.q1 q1Var = ml2.q1.f409345e;
        long m75939xb282bd082 = c19792x256d27252.m76794xd0557130() != null ? r9.m75939xb282bd08(2) : 0L;
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24398x258b2250 m90586x49c282c73 = params.m90586x49c282c7();
        java.lang.String str = "";
        java.lang.String str2 = (m90586x49c282c73 == null || (m90569x9c16372 = m90586x49c282c73.m90569x9c1637()) == null) ? "" : m90569x9c16372;
        ml2.j0 j0Var = (ml2.j0) zbVar;
        if (m76836x6c03c64c == null) {
            m76836x6c03c64c = "";
        }
        j0Var.wi(new ml2.v0(m76784x5db1b11, m75942xfb822ef2, m75945x2fec8307, m76836x6c03c64c, longValue, m75939xb282bd08, x1Var, "354", m75939xb282bd082, 0L, null, null, 0, "", "", str2, null, c19792x256d27252, 69120, null), null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, wk0Var.m75945x2fec8307(0));
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(java.lang.Integer.parseInt("354")));
        java.lang.String m76801x8010e5e4 = c19792x256d27252.m76801x8010e5e4();
        if (m76801x8010e5e4 == null) {
            m76801x8010e5e4 = "";
        }
        y74Var.set(2, m76801x8010e5e4);
        wk0Var.set(6, y74Var);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.C24398x258b2250 m90586x49c282c74 = params.m90586x49c282c7();
        if (m90586x49c282c74 != null && (m90569x9c1637 = m90586x49c282c74.m90569x9c1637()) != null) {
            str = m90569x9c1637;
        }
        intent.putExtra("key_chnl_extra", str);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(this.f407381d, intent, kz5.b0.c(c19792x256d27252), 0, wk0Var, null);
    }
}
