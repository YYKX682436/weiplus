package com.p314xaae8f345.mm.ui.p2721x33323e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/mmec/NewCardPackageTipPreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.mmec.NewCardPackageTipPreference */
/* loaded from: classes8.dex */
public final class C22452xfeb68e00 extends com.p314xaae8f345.mm.ui.C21363x65d29512 {

    /* renamed from: m3, reason: collision with root package name */
    public boolean f290682m3;

    /* renamed from: n3, reason: collision with root package name */
    public java.lang.String f290683n3;

    /* renamed from: o3, reason: collision with root package name */
    public java.lang.String f290684o3;

    /* renamed from: p3, reason: collision with root package name */
    public long f290685p3;

    /* renamed from: q3, reason: collision with root package name */
    public java.lang.ref.WeakReference f290686q3;

    public C22452xfeb68e00(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f290683n3 = "";
        this.f290684o3 = "";
    }

    public static java.util.HashMap h1(com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            jbVar = null;
        }
        if ((i18 & 2) != 0) {
            jbVar2 = null;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        if ((i18 & 16) != 0) {
            z17 = false;
        }
        c22452xfeb68e00.getClass();
        r45.f03 I0 = jbVar2 != null ? jbVar2.I0("Card.Entrance.Right") : null;
        r45.f03 I02 = jbVar != null ? jbVar.I0("Card.Entrance.Left") : null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("expose_id", ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).f98286d);
        hashMap.put("page_id", "my_page");
        hashMap.put("element_id", "order_card");
        hashMap.put("click_session_id", str);
        hashMap.put("if_red_dot", java.lang.Integer.valueOf((I02 == null && I0 == null) ? 0 : 1));
        if (I0 != null) {
            c22452xfeb68e00.g1(hashMap, jbVar2, I0);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("card_name", ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai().f340081d);
        jSONObject.put("is_receive_after_enter", i17);
        if (I02 != null) {
            jSONObject.put("is_left_reddot", 1);
            java.util.Map hashMap2 = new java.util.HashMap();
            c22452xfeb68e00.g1(hashMap2, jbVar, I02);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            pm0.b0.f(hashMap2, jSONObject2);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            jSONObject.put("left_reddot_info", r26.i0.t(jSONObject3, ",", ";", false));
        }
        java.lang.String jSONObject4 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        hashMap.put("ext_info_1", r26.i0.t(jSONObject4, ",", ";", false));
        if (z17) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("font_size", j65.c.d(c22452xfeb68e00.Y1) + 1);
            jSONObject5.put("is_teen_mode", ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() ? 1 : 0);
            jSONObject5.put("is_care_mode", j65.e.b() ? 1 : 0);
            java.lang.String jSONObject6 = jSONObject5.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            hashMap.put("ext_info_2", r26.i0.t(jSONObject6, ",", ";", false));
        }
        return hashMap;
    }

    public final void g1(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        java.lang.String str;
        r45.vs2 vs2Var;
        java.lang.String str2 = jbVar != null ? jbVar.f65882x5364c75d : null;
        if (str2 == null) {
            str2 = "";
        }
        map.put("reddot_id", str2);
        map.put("reddot_type", java.lang.Integer.valueOf(jbVar != null ? jbVar.m55856xfb85f7b0() : 0));
        if (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null || (str = vs2Var.f470032t) == null) {
            str = "";
        }
        map.put("reddot_ext_info", str);
        java.lang.String str3 = f03Var.f455422f;
        if (str3 == null) {
            str3 = "";
        }
        map.put("reddot_show_title", str3);
        map.put("reddot_show_num", java.lang.Integer.valueOf(f03Var.f455421e));
        map.put("reddot_show_type", java.lang.Integer.valueOf(f03Var.f455420d));
        java.lang.String str4 = f03Var.f455425i;
        map.put("reddot_show_path", str4 != null ? str4 : "");
        map.put("reddot_rec_timestamp", java.lang.Long.valueOf(jbVar != null ? jbVar.f65879x2261f6f2 : 0L));
    }

    public final void i1(int i17) {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("Card.Entrance.Left");
        r45.f03 I0 = L0 != null ? L0.I0("Card.Entrance.Left") : null;
        if (L0 != null && I0 != null) {
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L0, I0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = nk6.L0("Card.Entrance.Right");
        r45.f03 I02 = L02 != null ? L02.I0("Card.Entrance.Right") : null;
        if (L02 != null && I02 != null) {
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L02, I02);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[report] action=");
        sb6.append(i17);
        sb6.append(" leftShowInfo=");
        sb6.append(I0 != null);
        sb6.append(" rightShowInfo=");
        sb6.append(I02 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", sb6.toString());
    }

    public final void j1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar) {
        if (aVar.f186860a && this.f290682m3) {
            java.lang.String str = aVar.f186864e;
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0(str);
            java.lang.String str2 = L0 != null ? L0.f65882x5364c75d : null;
            if (str2 == null) {
                str2 = "";
            }
            if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, this.f290683n3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, this.f290684o3))) {
                r45.f03 I0 = nk6.I0(str);
                if (L0 != null && I0 != null) {
                    ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(1, L0, I0);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportRedDotExpose] path=");
                sb6.append(str);
                sb6.append(" showInfo=");
                sb6.append(I0 != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", sb6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
            java.lang.String str3 = jbVar != null ? jbVar.f65882x5364c75d : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, this.f290683n3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, this.f290684o3)) || !((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
                return;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Card.Entrance.Left") ? h1(this, aVar.f186862c, null, null, 1, false, 22, null) : h1(this, null, aVar.f186862c, null, 1, false, 21, null), 12, false);
            i95.m c17 = i95.n0.c(c00.x3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c00.x3.m8((c00.x3) c17, bw5.n9.EXPOSE_WITH_REDDOT, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.C21363x65d29512, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21557x1753ef1b, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        yz5.l lVar;
        android.view.View u17 = super.u(viewGroup);
        u17.post(new hi5.d(this));
        f10.c Ai = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai();
        if (Ai.f340080c && Ai.f340078a == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", "[onCreateView] preloadEnvForMiniProgram...");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Rh(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.H);
        }
        boolean Ri = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", "bindViewExposeReportEvent isOrderAndCardEntrance:" + Ri);
        if (Ri) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(u17, "order_card");
            aVar.Tj(u17, 32, 12, false);
            aVar.Ai(u17, new hi5.a(this));
            aVar.Vj(u17, 160, new hi5.b(this));
            aVar.rj(u17);
        }
        ym5.a1.h(u17, new hi5.e(this));
        java.lang.ref.WeakReference weakReference = this.f290686q3;
        if (weakReference != null && (lVar = (yz5.l) weakReference.get()) != null) {
            lVar.mo146xb9724478(u17);
        }
        return u17;
    }

    public C22452xfeb68e00(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f290683n3 = "";
        this.f290684o3 = "";
    }

    public C22452xfeb68e00(android.content.Context context) {
        super(context, null);
        this.f290683n3 = "";
        this.f290684o3 = "";
    }
}
