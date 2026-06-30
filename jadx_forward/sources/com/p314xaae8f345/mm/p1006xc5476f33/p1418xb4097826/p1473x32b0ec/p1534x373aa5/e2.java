package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f197797p = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f197798h;

    /* renamed from: i, reason: collision with root package name */
    public final yi2.i0 f197799i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f197800m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 f197801n;

    /* renamed from: o, reason: collision with root package name */
    public long f197802o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(gk2.e liveData, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 plugin) {
        super(liveData, context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f197798h = plugin;
        this.f197802o = java.lang.System.currentTimeMillis();
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.eam, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tlb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197799i = new yi2.i0(liveData, (android.view.ViewGroup) findViewById, plugin);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void a(int i17) {
        boolean z17 = this.f197966f == i17;
        this.f197965e = z17;
        if (z17) {
            o();
        } else {
            n();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void c(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void d(int i17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x019f, TryCatch #1 {, blocks: (B:18:0x0077, B:20:0x007b, B:23:0x0082, B:25:0x008a, B:33:0x00af, B:34:0x00ba, B:36:0x00c3), top: B:17:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #1 {, blocks: (B:18:0x0077, B:20:0x007b, B:23:0x0082, B:25:0x008a, B:33:0x00af, B:34:0x00ba, B:36:0x00c3), top: B:17:0x0077 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e2.e():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void f() {
        this.f197967g = false;
        if (this.f197965e) {
            n();
        }
        m(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void g(boolean z17, int i17) {
    }

    /* renamed from: getAiAssistantId */
    public final java.lang.String m57585x94f3eb9b() {
        return this.f197800m;
    }

    /* renamed from: getOnAnchorApplyListListener */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 m57586xd8ff5836() {
        return this.f197801n;
    }

    /* renamed from: getOpenTime */
    public final long m57587x5dc5f5ad() {
        return this.f197802o;
    }

    /* renamed from: getPlugin */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 m57588x2a5e9229() {
        return this.f197798h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void h(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void j() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void k(boolean z17, km2.q qVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void l(gk2.e eVar) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.d2(eVar, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k2
    public void m(java.lang.String str, byte[] bArr) {
        this.f197800m = str;
        yi2.i0 i0Var = this.f197799i;
        if (i0Var != null) {
            i0Var.f544068x = str;
            i0Var.f544069y = bArr;
        }
    }

    public final void n() {
        fj2.s sVar;
        yi2.i0 i0Var = this.f197799i;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "onClose() called");
            i0Var.F.f();
            i0Var.L.removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.app.s2 s2Var = i0Var.K;
            if (s2Var != null) {
                s2Var.m43072x2efc64();
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) i0Var.f544070z;
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                sVar = fj2.s.f344716a;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                sVar.d(ml2.q2.Q, i0Var.f544068x, (hi2.a) entry.getValue());
            }
            linkedHashMap.clear();
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) i0Var.A;
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                sVar.d(ml2.q2.R, i0Var.f544068x, (hi2.a) entry2.getValue());
            }
            linkedHashMap2.clear();
            java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) i0Var.B;
            for (java.util.Map.Entry entry3 : linkedHashMap3.entrySet()) {
                sVar.d(ml2.q2.T, i0Var.f544068x, (hi2.a) entry3.getValue());
            }
            linkedHashMap3.clear();
            i0Var.C = true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f197802o;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.q2 q2Var = ml2.q2.f409351e;
        jSONObject.put("type", 59);
        jSONObject.put("stay_time", currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveApplyLinkAnchorView", "reportExitTab: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409923y, jSONObject.toString(), null, 4, null);
    }

    public final void o() {
        yi2.i0 i0Var = this.f197799i;
        if (i0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "onOpen() called");
            i0Var.F.b();
            com.p314xaae8f345.mm.app.s2 s2Var = i0Var.K;
            if (s2Var != null) {
                s2Var.m43071x58998cd();
            }
        }
        this.f197802o = java.lang.System.currentTimeMillis();
    }

    /* renamed from: setAiAssistantId */
    public final void m57589x27ca520f(java.lang.String str) {
        this.f197800m = str;
    }

    /* renamed from: setOnAnchorApplyListListener */
    public final void m57590x22cbb0aa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var) {
        this.f197801n = c2Var;
        yi2.i0 i0Var = this.f197799i;
        if (i0Var == null) {
            return;
        }
        i0Var.f544050J = c2Var;
    }

    /* renamed from: setOpenTime */
    public final void m57591x587e56b9(long j17) {
        this.f197802o = j17;
    }
}
