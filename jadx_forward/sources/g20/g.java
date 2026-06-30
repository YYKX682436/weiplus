package g20;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements c00.x3 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f349308f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f349309g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f349306d = "";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f349307e = jz5.h.b(g20.e.f349301d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f349310h = jz5.h.b(g20.d.f349300d);

    public f10.c Ai() {
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (!((java.lang.Boolean) ((jz5.n) h00.h.f359354b).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use finder logic");
            return wi();
        }
        h00.a aVar = h00.a.f359341a;
        aVar.getClass();
        bw5.c6 c6Var = (bw5.c6) h00.a.f359343c.b(aVar, h00.a.f359342b[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c6Var);
        if (Ni(c6Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use new logic, but info null, fallback to finder logic");
            return wi();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use new logic,showType:" + c6Var.f107470d + ",titleType:" + c6Var.f107474h);
        return new f10.c(c6Var.f107470d, c6Var.f107475i[4] ? c6Var.f107473g : "", c6Var.f107472f, c6Var.f107474h);
    }

    public final x02.h Bi() {
        return (x02.h) ((jz5.n) this.f349310h).mo141623x754a37bb();
    }

    public java.lang.String Di(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getTitleWithType titleType:" + i17);
        switch (i17) {
            case 1:
                java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.okv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                return string;
            case 2:
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                return string2;
            case 3:
                java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                return string3;
            case 4:
                java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
                return string4;
            case 5:
                java.lang.String string5 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.phq);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
                return string5;
            case 6:
                java.lang.String string6 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.php);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string6);
                return string6;
            default:
                java.lang.String string7 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.isr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string7);
                return string7;
        }
    }

    public final boolean Ni(bw5.c6 c6Var) {
        if (c6Var.f107470d != 2) {
            return false;
        }
        return c6Var.b() == null || c6Var.b().f() == null || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6Var.b().f().m13091x74292946()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6Var.b().f().b()));
    }

    public boolean Ri() {
        return Ai().f340078a == 2;
    }

    public final int Ui(android.content.Context context) {
        r45.vt vtVar = ((oh3.q) ((p90.j) i95.n0.c(p90.j.class))).f426989i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = vtVar.f470045e;
        if (c19786x6a1e2862 != null) {
            new java.util.HashMap().put(ya.b.f77502x92235c1b, 1);
            r45.l34 l34Var = new r45.l34();
            l34Var.set(6, java.lang.Boolean.TRUE);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534771c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        return vtVar.f470045e != null ? 2 : 1;
    }

    public boolean Vi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_data_manager_switch_android, 0) == 1;
        boolean Ri = Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "nativeDataManagerSwitchOn " + z17 + " isOrderAndCardEntrance:" + Ri);
        return Ri && z17;
    }

    public void Zi(bw5.n9 preloadTiming, android.os.Bundle bundle) {
        r45.ez2 D0;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadTiming, "preloadTiming");
        if (Vi()) {
            if (this.f349308f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsOrderService", "not preload for preloadTiming:" + preloadTiming + " when weapp running!");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Card.Entrance.Right");
            java.lang.String str = L0 != null ? L0.f65882x5364c75d : null;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            if (L0 != null && (D0 = L0.D0()) != null && (m75934xbce7f2f = D0.m75934xbce7f2f(4)) != null) {
                try {
                    str2 = new org.json.JSONObject(m75934xbce7f2f.i()).optString("general_reddot_digest");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsOrderService", e17.getMessage());
                    byte[] encode = android.util.Base64.encode(m75934xbce7f2f.g(), 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
                    java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                    str2 = new java.lang.String(encode, UTF_8);
                }
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f349307e).mo141623x754a37bb()).mo50293x3498a0(new g20.f(this, preloadTiming, str, str2));
            if (preloadTiming == bw5.n9.SHOP_ENTRANCE_CLICK) {
                aj(true);
            }
        }
    }

    public final void aj(boolean z17) {
        if (this.f349308f != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "orderAndCardWeAppClick from " + this.f349308f + " to " + z17);
        }
        this.f349308f = z17;
    }

    public boolean bj() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_touch_preload_switch_android, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "touchPreloadSwitchOn:" + z17);
        return z17;
    }

    public final f10.c wi() {
        r45.vt vtVar = ((oh3.q) ((p90.j) i95.n0.c(p90.j.class))).f426989i;
        int i17 = vtVar.f470044d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = vtVar.f470045e;
        return new f10.c(i17, c19786x6a1e2862 != null ? c19786x6a1e2862.m76497x4fe38a1f() : null, vtVar.f470046f, 0);
    }
}
