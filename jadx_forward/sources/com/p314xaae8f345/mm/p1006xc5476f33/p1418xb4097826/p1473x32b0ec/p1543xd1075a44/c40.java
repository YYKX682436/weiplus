package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public abstract class c40 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 f199488h;

    /* renamed from: i, reason: collision with root package name */
    public final dk2.qf f199489i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f199490m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r30 f199491n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f199492o;

    /* renamed from: p, reason: collision with root package name */
    public int f199493p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f199494q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f199495r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199496s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40 params) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f199488h = params.f199586a;
        this.f199489i = params.f199587b;
        this.f199490m = params.f199588c;
        this.f199496s = true;
    }

    public abstract java.lang.String A();

    public abstract dk2.na B(r45.jt1 jt1Var);

    public abstract void C(dk2.na naVar);

    public final void D(dk2.rf micReplayInfo, t40.d galleryScene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfo, "micReplayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryScene, "galleryScene");
        java.lang.String str = micReplayInfo.f315572d;
        if (str == null) {
            return;
        }
        java.lang.String A = A();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFinderPostGallery: mediaId = ");
        sb6.append(str);
        sb6.append(",coverImageUrl = ");
        java.lang.String str2 = micReplayInfo.f315574f;
        sb6.append(str2);
        sb6.append(",micReplayUrl = ");
        java.lang.String str3 = micReplayInfo.f315573e;
        sb6.append(str3);
        sb6.append(",duration = ");
        dk2.qf qfVar = this.f199489i;
        sb6.append(qfVar.f315512p);
        sb6.append(",liveId = ");
        sb6.append(qfVar.f315503d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A, sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646();
        c10598x47b4a646.f148136d = 1;
        c10598x47b4a646.f148137e = str;
        c10598x47b4a646.f148138f = str2;
        c10598x47b4a646.f148139g = str3;
        c10598x47b4a646.f148140h = micReplayInfo.f315575g;
        c10598x47b4a646.f148141i = java.lang.String.valueOf(micReplayInfo.f315579n);
        arrayList.add(c10598x47b4a646);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ((ci5.h) ((s40.x0) i95.n0.c(s40.x0.class))).wi(this.f199914d, new t40.b("task_FinderCdnDownloader", 2, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183671g, galleryScene, i17), arrayList);
    }

    public final void E(boolean z17) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f199492o;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w30(this, z17, null), 3, null);
        }
    }

    public final void F(long j17) {
        if (j17 <= 0) {
            j17 = 5000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A(), "requestMicReplayStatusAfterDelay: nextPollTimeMs = " + j17);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f199495r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f199492o;
        this.f199495r = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x30(j17, this, null), 3, null) : null;
    }

    public abstract void G();

    public final void H() {
        if (this.f199491n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A(), "init VisitorMicReplayHeatTip");
            this.f199491n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r30(this.f199914d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A(), "showVisitorMicReplayHeatTip");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r30 r30Var = this.f199491n;
        if (r30Var != null) {
            r30Var.w();
        }
    }

    public abstract void I();

    public final void J(dk2.na status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        dk2.qf qfVar = this.f199489i;
        dk2.na naVar = qfVar.f315519w;
        qfVar.getClass();
        qfVar.f315519w = status;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A(), "updateGenLayout: nextStatus = " + status + ",oldStatus = " + naVar);
        if (naVar != status || this.f199496s) {
            this.f199496s = false;
            C(status);
        }
    }

    public abstract void K();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        this.f199489i.f315520x = false;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f199492o;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "closePanel", null, 2, null);
        }
        this.f199492o = null;
        yz5.a aVar = this.f199490m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 s30Var;
        super.w();
        G();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f199492o;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "openPanel", null, 2, null);
        }
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f199492o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        dk2.qf qfVar = this.f199489i;
        qfVar.f315520x = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 s30Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30.f201249d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 s30Var3 = this.f199488h;
        if (s30Var3 != s30Var2 && (s30Var3 != (s30Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30.f201250e) || !qfVar.f315521y)) {
            if (s30Var3 == s30Var) {
                K();
                if (qfVar.f315519w == dk2.na.f315342h) {
                    F(10L);
                    return;
                }
                return;
            }
            return;
        }
        qfVar.f315512p = 0L;
        qfVar.f315513q = 0L;
        qfVar.f315514r = 0L;
        qfVar.f315515s = 0L;
        qfVar.f315516t = false;
        qfVar.f315517u = false;
        qfVar.f315518v = 0L;
        qfVar.G.clear();
        qfVar.f315519w = dk2.na.f315340f;
        this.f199493p = 0;
        this.f199496s = true;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f199492o;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a40(this, null), 3, null);
        }
    }

    public abstract int y();

    public abstract long z();
}
