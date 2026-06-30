package mn2;

/* loaded from: classes4.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f411669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f411671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f411672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f411673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f411674i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(mn2.x3 x3Var, java.lang.String str, long j17, long j18, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, boolean z17) {
        super(0);
        this.f411669d = x3Var;
        this.f411670e = str;
        this.f411671f = j17;
        this.f411672g = j18;
        this.f411673h = c0Var;
        this.f411674i = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mn2.x3 x3Var = this.f411669d;
        if (x3Var.f411695g.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.VideoDownloader", "has stop!");
        } else {
            pm0.c cVar = new pm0.c("onMoovReady");
            t21.h0 h0Var = x3Var.f411693e;
            boolean z17 = h0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a;
            long j17 = this.f411671f;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a c15198x17d381a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a) h0Var;
                boolean z18 = this.f411673h.f391645d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15198x17d381a.f271272e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s isPreparedMoovReadyResult:%s", c15198x17d381a.N(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(c15198x17d381a.A1), c15198x17d381a.f153183y0, java.lang.Boolean.valueOf(z18));
                if (c15198x17d381a.A1 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15198x17d381a.f271272e, "moov had callback, do nothing.");
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = c15198x17d381a.R;
                    if (e3Var.f272339m == 0) {
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        e3Var.f272339m = java.lang.System.currentTimeMillis();
                    }
                    try {
                        d61.f fVar = c15198x17d381a.f153185z1;
                        int i17 = 1;
                        if (fVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15198x17d381a.f271272e, "%s parser is null, thread is error.", c15198x17d381a.N());
                        } else {
                            if (!z18 && !fVar.a(c15198x17d381a.f153178l1, j17)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15198x17d381a.f271272e, "%s mp4 parse moov error. cdnMediaId %s", c15198x17d381a.N(), c15198x17d381a.f153183y0);
                                c15198x17d381a.f153181x0.a(c15198x17d381a.f153183y0, 0, -1);
                            }
                            c15198x17d381a.A1 = c15198x17d381a.f153185z1.c();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15198x17d381a.f271272e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", c15198x17d381a.N(), java.lang.Integer.valueOf(c15198x17d381a.A1), c15198x17d381a.f153183y0);
                            if (c15198x17d381a.b0(0)) {
                                c15198x17d381a.g0();
                            }
                            if (c15198x17d381a.B1 != -1) {
                                i17 = 2;
                            }
                            c15198x17d381a.f153184y1 = i17;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(c15198x17d381a.f271272e, e17, "%s deal moov ready error [%s]", c15198x17d381a.N(), c15198x17d381a.f153183y0);
                    }
                }
            }
            cw2.eb ebVar = x3Var.f411692d;
            if (ebVar != null) {
                ebVar.K((int) j17, (int) this.f411672g, x3Var.f411694f, this.f411674i);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "onMoovReady man " + cVar + " mediaId: " + this.f411670e);
        }
        return jz5.f0.f384359a;
    }
}
