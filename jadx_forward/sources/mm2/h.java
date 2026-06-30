package mm2;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c {
    public r45.ce2 A;
    public long B;
    public long C;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f410631t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f410632u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.p f410633v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f410634w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f410635x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f410636y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f410637z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void d(java.lang.String str) {
        yz5.a aVar = this.f410637z;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void e() {
        yz5.a aVar = this.f410635x;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: getCurLiveAdInfo */
    public final r45.ce2 m147935x5721a227() {
        return this.A;
    }

    /* renamed from: getCurStartPlayTime */
    public final long m147936x307afbb9() {
        return this.B;
    }

    /* renamed from: getOnFirstFrameRendered */
    public final yz5.a m147937xf2fa3927() {
        return this.f410632u;
    }

    /* renamed from: getOnProgressChange */
    public final yz5.p m147938x4995bb72() {
        return this.f410633v;
    }

    /* renamed from: getOnStateChange */
    public final yz5.p m147939x4f9988c() {
        return this.f410634w;
    }

    /* renamed from: getOnVideoBufferingStart */
    public final yz5.a m147940x4ae34526() {
        return this.f410637z;
    }

    /* renamed from: getOnVideoComplete */
    public final yz5.a m147941xe3cdb4ff() {
        return this.f410635x;
    }

    /* renamed from: getOnVideoError */
    public final yz5.a m147942xc6325402() {
        return this.f410636y;
    }

    /* renamed from: getOnVideoSizeChange */
    public final yz5.p m147943xace6c557() {
        return this.f410631t;
    }

    /* renamed from: getVideoTotalTime */
    public final long m147944xdf1112ec() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void i(rh3.o mp6, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        super.i(mp6, i17, i18);
        yz5.a aVar = this.f410636y;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void j(java.lang.String invokeSource, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        super.j(invokeSource, i17);
        yz5.a aVar = this.f410632u;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void l(rh3.o mp6, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        yz5.p pVar = this.f410633v;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void n(int i17, int i18) {
        yz5.p pVar = this.f410631t;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    /* renamed from: setCurLiveAdInfo */
    public final void m147945xe9f8089b(r45.ce2 ce2Var) {
        this.A = ce2Var;
    }

    /* renamed from: setCurStartPlayTime */
    public final void m147946xd47790c5(long j17) {
        this.B = j17;
    }

    /* renamed from: setMute */
    public final void m147947x764d819b(boolean z17) {
        m66744x2a55bdd7().mo162438xd0747cbc(z17);
    }

    /* renamed from: setOnFirstFrameRendered */
    public final void m147948x6d4d6833(yz5.a aVar) {
        this.f410632u = aVar;
    }

    /* renamed from: setOnProgressChange */
    public final void m147949xed92507e(yz5.p pVar) {
        this.f410633v = pVar;
    }

    /* renamed from: setOnStateChange */
    public final void m147950x97cfff00(yz5.p pVar) {
        this.f410634w = pVar;
    }

    /* renamed from: setOnVideoBufferingStart */
    public final void m147951x1af5f79a(yz5.a aVar) {
        this.f410637z = aVar;
    }

    /* renamed from: setOnVideoComplete */
    public final void m147952x1aa44e73(yz5.a aVar) {
        this.f410635x = aVar;
    }

    /* renamed from: setOnVideoError */
    public final void m147953xfc7b4f0e(yz5.a aVar) {
        this.f410636y = aVar;
    }

    /* renamed from: setOnVideoSizeChange */
    public final void m147954x887cd1cb(yz5.p pVar) {
        this.f410631t = pVar;
    }

    /* renamed from: setVideoTotalTime */
    public final void m147955xa7077af8(long j17) {
        this.C = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void t() {
        super.t();
        this.f410631t = null;
        this.f410632u = null;
        this.f410633v = null;
        this.f410634w = null;
        this.f410635x = null;
        this.f410636y = null;
        this.f410637z = null;
    }

    public final boolean u(r45.ce2 ce2Var, long j17, yz5.a onCreateView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCreateView, "onCreateView");
        if (ce2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "loadVideo return for loadVideo:" + ce2Var);
            return false;
        }
        java.lang.String m75945x2fec8307 = ce2Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        if (m75945x2fec8307.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "loadVideo return for url:".concat(m75945x2fec8307));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "loadVideo start play startPositionMs:" + j17 + " duration:" + ce2Var.m75942xfb822ef2(2) + " url:" + m75945x2fec8307);
        rh3.q qVar = new rh3.q();
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes());
        java.lang.String a17 = zz0.a.f559229a.a("", b17, m75945x2fec8307);
        wh3.c cVar = wh3.d.f527500d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        wh3.b dVar = new wh3.d(b17, m75945x2fec8307, cVar.a(b17, m75945x2fec8307, a17));
        qVar.d(dVar, ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Bi(qVar, dVar, b17, b17));
        onCreateView.mo152xb9724478();
        this.A = ce2Var;
        a(qVar, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.p(this, true, 0, 0, 0, 0, null, 62, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(this, null, j17, 1, null);
        return true;
    }
}
