package df2;

/* loaded from: classes3.dex */
public final class y1 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public int f313371m;

    /* renamed from: n, reason: collision with root package name */
    public int f313372n;

    /* renamed from: o, reason: collision with root package name */
    public long f313373o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f313374p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f313375q;

    /* renamed from: r, reason: collision with root package name */
    public final df2.x1 f313376r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        r45.q12 q12Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        this.f313371m = q12Var != null ? q12Var.m75939xb282bd08(0) : 0;
        r45.q12 q12Var2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        this.f313372n = q12Var2 != null ? q12Var2.m75939xb282bd08(1) : 0;
        this.f313376r = new df2.x1(store, this);
    }

    public static final void Z6(df2.y1 y1Var) {
        y1Var.getClass();
        if (zl2.r4.f555483a.x1() || !y1Var.f313375q) {
            return;
        }
        y1Var.f313375q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store = y1Var.getStore();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "<this>");
        if2.z.f372686a.i(store, new mf2.e(store));
        dk2.ef.f314905a.V(false);
    }

    public static void e7(df2.y1 y1Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            xh2.c cVar = (xh2.c) ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
            i17 = cVar != null ? cVar.f536067d : 0;
        }
        if ((i19 & 2) != 0) {
            xh2.c cVar2 = (xh2.c) ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
            i18 = cVar2 != null ? cVar2.f536068e : 0;
        }
        y1Var.d7(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r4.X() == true) goto L16;
     */
    @Override // mf2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M2(xh2.b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "micInfoData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            int r0 = r7.f536060f
            if (r0 == 0) goto L60
            int r1 = r6.f313371m
            java.lang.Class<ml2.r0> r2 = ml2.r0.class
            int r7 = r7.f536061g
            if (r1 != r0) goto L15
            int r3 = r6.f313372n
            if (r3 == r7) goto L4b
        L15:
            int r3 = r6.f313372n
            java.lang.String r4 = "FinderLiveCommonController"
            java.lang.String r5 = "onLiveModeChange"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            zl2.r4 r4 = zl2.r4.f555483a
            boolean r4 = r4.x1()
            if (r4 != 0) goto L3e
            tn0.w0 r4 = r6.Q6()
            if (r4 == 0) goto L34
            boolean r4 = r4.X()
            r5 = 1
            if (r4 != r5) goto L34
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 != 0) goto L38
            goto L3e
        L38:
            r6.d7(r1, r3)
            r6.f7()
        L3e:
            r6.f313371m = r0
            r6.f313372n = r7
            i95.m r1 = i95.n0.c(r2)
            ml2.r0 r1 = (ml2.r0) r1
            r1.fj(r0, r7)
        L4b:
            zl2.r4 r7 = zl2.r4.f555483a
            boolean r7 = r7.x1()
            if (r7 != 0) goto L60
            i95.m r7 = i95.n0.c(r2)
            ml2.r0 r7 = (ml2.r0) r7
            org.json.JSONObject r0 = r6.b7()
            r7.Rk(r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.y1.M2(xh2.b):void");
    }

    public final org.json.JSONObject a7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.q12 q12Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        jSONObject.put("live_mode_type", q12Var != null ? q12Var.m75939xb282bd08(0) : 0);
        r45.q12 q12Var2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        jSONObject.put("live_sub_mode_type", q12Var2 != null ? q12Var2.m75939xb282bd08(1) : 0);
        return jSONObject;
    }

    public final org.json.JSONObject b7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        jSONObject.put("live_mode_type", cVar != null ? cVar.f536067d : 0);
        xh2.c cVar2 = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        jSONObject.put("live_sub_mode_type", cVar2 != null ? cVar2.f536068e : 0);
        return jSONObject;
    }

    public final void c7() {
        if (zl2.r4.f555483a.x1()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ek(a7());
            return;
        }
        r45.q12 q12Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        this.f313371m = q12Var != null ? q12Var.m75939xb282bd08(0) : 0;
        r45.q12 q12Var2 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s;
        this.f313372n = q12Var2 != null ? q12Var2.m75939xb282bd08(1) : 0;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).fj(this.f313371m, this.f313372n);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Rk(a7());
    }

    public final void d7(int i17, int i18) {
        if (zl2.r4.f555483a.x1() || !this.f313374p) {
            return;
        }
        this.f313374p = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "onMicEnd currentSubSessionId: " + this.f313373o + " liveMode: " + i17 + " liveSubMode: " + i18);
        g7(2, i17, i18);
    }

    public final void f7() {
        if (zl2.r4.f555483a.x1() || this.f313374p) {
            return;
        }
        this.f313374p = true;
        this.f313373o = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "onMicStart currentSubSessionId: " + this.f313373o + " liveMode: " + b7());
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        int i17 = cVar != null ? cVar.f536067d : 0;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        g7(1, i17, cVar2 != null ? cVar2.f536068e : 0);
    }

    public final void g7(int i17, int i18, int i19) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("apply_type", ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410864x1);
        jSONObject.put("live_mode_type", i18);
        jSONObject.put("live_sub_mode_type", i19);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("SubSessionId", this.f313373o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonController", "reportMic21084 type: " + i17 + " json: " + jSONObject + " currentSubSessionId: " + this.f313373o);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.mj((ml2.r0) c17, ml2.b4.f408800t2, t17, 0L, null, null, jSONObject3.toString(), null, null, 220, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
        tn0.w0 Q6 = Q6();
        if (Q6 == null) {
            return;
        }
        Q6.f502296l1 = this.f313376r;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        tn0.w0 Q6 = Q6();
        if (Q6 != null) {
            Q6.f502296l1 = null;
        }
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        j0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveReport", "clearAnchorBaseChnlExtra");
        j0Var.f409120d = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        c7();
    }
}
