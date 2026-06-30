package ws2;

/* loaded from: classes3.dex */
public final class o extends ws2.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f530641d;

    /* renamed from: e, reason: collision with root package name */
    public at2.u1 f530642e;

    /* renamed from: f, reason: collision with root package name */
    public zi2.w f530643f;

    /* renamed from: g, reason: collision with root package name */
    public at2.y1 f530644g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f530645h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, yz5.p playerGenerator) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerGenerator, "playerGenerator");
        this.f530641d = playerGenerator;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0119 A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:75:0x00fc, B:77:0x0102, B:80:0x010d, B:85:0x0119, B:86:0x0122, B:88:0x012e, B:90:0x0140, B:92:0x0143, B:95:0x0146, B:96:0x014a, B:98:0x0150), top: B:74:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122 A[Catch: Exception -> 0x0183, TryCatch #0 {Exception -> 0x0183, blocks: (B:75:0x00fc, B:77:0x0102, B:80:0x010d, B:85:0x0119, B:86:0x0122, B:88:0x012e, B:90:0x0140, B:92:0x0143, B:95:0x0146, B:96:0x014a, B:98:0x0150), top: B:74:0x00fc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.o.e(boolean, boolean):void");
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar;
        at2.u1 u1Var = this.f530642e;
        if (u1Var != null) {
            u1Var.x1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f530626c;
        if (k0Var != null && (faVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa.class)) != null) {
            faVar.K0(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = faVar.f194061s;
            if (c14932xfc4acec9 != null) {
                zl2.r4.f555483a.Q2(c14932xfc4acec9);
            }
            faVar.f194059q.setImageDrawable(null);
        }
        je2.y yVar = (je2.y) c(je2.y.class);
        yVar.O6(false);
        if (yVar.f380821m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.N6(), "set lastScreenShareMode:false");
        }
        yVar.f380821m = false;
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 baseRouter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRouter, "baseRouter");
        gk2.e m57654xd7793f26 = baseRouter.m57654xd7793f26();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m57654xd7793f26, "<set-?>");
        this.f101142a = m57654xd7793f26;
        this.f530626c = baseRouter;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f530625b;
        boolean booleanExtra = activityC0065xcd7aa112.getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
        activityC0065xcd7aa112.getIntent().removeExtra("LAUNCH_WITH_ANIM");
        if (booleanExtra) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f530626c;
            if (k0Var == null) {
                return;
            }
            k0Var.setAlpha(0.0f);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = this.f530626c;
        if (k0Var2 == null) {
            return;
        }
        k0Var2.setAlpha(1.0f);
    }

    public final void h(int i17, int i18) {
        if (((mm2.c1) c(mm2.c1.class)).S7()) {
            return;
        }
        ((mm2.o4) c(mm2.o4.class)).f410857s.clear();
        ((mm2.o4) c(mm2.o4.class)).f410860v.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f530626c;
        if (k0Var != null) {
            qo0.c.a(k0Var, qo0.b.P3, null, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = this.f530626c;
        if (k0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(k0Var2, new org.json.JSONObject(), new org.json.JSONObject(), new org.json.JSONObject(), false, null, 24, null);
        }
        ws2.k1.t(ws2.k1.f530599r.a(), 3, new org.json.JSONObject(), new org.json.JSONObject(), new org.json.JSONObject(), false, 16, null);
    }

    public final void i(int i17, mn2.g4 data, boolean z17, boolean z18, int i18) {
        dt2.a0 a0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#replay_data#:startPlay url:");
        r45.mb4 mb4Var = data.f411535e;
        sb6.append(mb4Var.m75945x2fec8307(0));
        sb6.append(" source:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayBaseUIC", sb6.toString());
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            zl2.r4.f555483a.f3(this.f530625b, "startPlay but url is empty!");
        }
        at2.u1 u1Var = this.f530642e;
        if (u1Var != null) {
            r45.i72 i72Var = (r45.i72) ((ct2.j) c(ct2.j.class)).P6().m75936x14adae67(44);
            java.lang.String m75945x2fec83072 = i72Var != null ? i72Var.m75945x2fec8307(11) : null;
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88();
            c14989xf862ae88.m59177xa32537ab(((ct2.j) c(ct2.j.class)).A);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = ((mm2.e1) c(mm2.e1.class)).f410524u;
            java.lang.String m76944x730bcac6 = c19793xceab7f56 != null ? c19793xceab7f56.m76944x730bcac6() : null;
            if (m76944x730bcac6 == null) {
                m76944x730bcac6 = "replay-" + c14989xf862ae88.hashCode();
            }
            c14989xf862ae88.m59157x9713e3a(m76944x730bcac6);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) c(mm2.c1.class)).f410379n;
            java.lang.String m76801x8010e5e4 = c19792x256d2725 != null ? c19792x256d2725.m76801x8010e5e4() : null;
            c14989xf862ae88.m59173x7ababb10(m76801x8010e5e4 != null ? m76801x8010e5e4 : "");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindMediaInfo:pos:");
            sb7.append(c14989xf862ae88.getPosition());
            sb7.append(",desc:");
            sb7.append(c14989xf862ae88.getDescription());
            sb7.append(",nickname:");
            sb7.append(c14989xf862ae88.getNickName());
            sb7.append(",player:");
            dt2.a0 a0Var2 = u1Var.f95295q;
            sb7.append(a0Var2 != null ? a0Var2.hashCode() : 0);
            sb7.append(",fromFloat:");
            sb7.append(z18);
            sb7.append(", isPlaying:");
            sb7.append(u1Var.u1());
            sb7.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerPlugin", sb7.toString());
            if (!z18 && (a0Var = u1Var.f95295q) != null) {
                a0Var.a(data, m75945x2fec83072, z17, c14989xf862ae88);
            }
        }
        at2.u1 u1Var2 = this.f530642e;
        if (u1Var2 != null) {
            u1Var2.v1(java.lang.Integer.valueOf(i17), z18);
        }
    }
}
