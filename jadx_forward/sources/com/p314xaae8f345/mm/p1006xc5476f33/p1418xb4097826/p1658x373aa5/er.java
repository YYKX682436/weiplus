package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class er implements zy2.cc {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.br f213585f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.br(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f213586a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f213588c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f213589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f213590e;

    public er(android.content.Context context, java.lang.String str, int i17, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213586a = context;
        this.f213587b = str;
        this.f213588c = i17;
        this.f213589d = z17;
        this.f213590e = j17;
    }

    public final java.lang.String b(int i17, long j17) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        cl0.g gVar = new cl0.g();
        android.content.Context context = this.f213586a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && (intent = abstractActivityC21394xb3d2c0cf.getIntent()) != null && (stringExtra = intent.getStringExtra("key_extra_info")) != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLogoAssistant", "getChnlExtra origin chnl_extra:".concat(stringExtra));
                gVar = new cl0.g(r26.i0.t(stringExtra, ";", ",", false));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiveLogoAssistant", th6, "", new java.lang.Object[0]);
            }
        }
        try {
            java.lang.String a17 = so2.o2.f492050f.a().a(j17);
            if (a17.length() > 0) {
                gVar.h("feed_ad_report_info", a17);
            }
            gVar.o("icon_type", i17);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            return gVar2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiveLogoAssistant", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public void c(boolean z17, boolean z18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17) {
        r45.dm2 m76806xdef68064;
        r45.x31 x31Var;
        java.lang.String str = this.f213587b;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLogoAssistant", "[LiveLogoAssistant]click live icon but username is empty!");
            return;
        }
        android.content.Context context = this.f213586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).f216913n;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 5);
        int i19 = qs5.z.f448011a;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 2);
        long j17 = this.f213590e;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", j17);
        intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", z18);
        java.lang.String b17 = b(i17, j17);
        intent.putExtra("key_chnl_extra", b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLogoAssistant", "set fromObjectId:" + pm0.v.u(j17) + ", chnlExtra:" + b17);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.valueOf(z17));
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(i18));
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        java.lang.String str2 = null;
        ta4Var.set(2, c19792x256d2725 != null ? c19792x256d2725.m76829x97edf6c0() : null);
        if (c19792x256d2725 != null && (m76806xdef68064 = c19792x256d2725.m76806xdef68064()) != null && (x31Var = (r45.x31) m76806xdef68064.m75936x14adae67(7)) != null) {
            str2 = x31Var.m75945x2fec8307(0);
        }
        ta4Var.set(3, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLogoAssistant", "fromObjectId:" + pm0.v.u(j17) + ", jumperSessionBuffer:" + ta4Var.m75945x2fec8307(2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderForwardSource:");
        sb6.append(ta4Var.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLogoAssistant", sb6.toString());
        wk0Var.set(7, ta4Var);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Di(this.f213586a, intent, this.f213587b, null, wk0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cr(this, intent, i18, c19792x256d2725, b17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
    
        if (r3.equals("999") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        r1 = "25";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        if (r3.equals("102") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014c, code lost:
    
        if (r3.equals("101") == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r42, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r43, int r44, boolean r45, long r46, java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.er.d(java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject, int, boolean, long, java.lang.String):void");
    }

    public /* synthetic */ er(android.content.Context context, java.lang.String str, int i17, boolean z17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, str, i17, z17, (i18 & 16) != 0 ? 0L : j17);
    }
}
