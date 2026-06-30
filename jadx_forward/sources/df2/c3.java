package df2;

/* loaded from: classes3.dex */
public final class c3 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.g3 f311386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f311387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f311388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f311389d;

    public c3(df2.g3 g3Var, int i17, yz5.p pVar, int i18) {
        this.f311386a = g3Var;
        this.f311387b = i17;
        this.f311388c = pVar;
        this.f311389d = i18;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        df2.g3 g3Var = this.f311386a;
        mm2.c1 c1Var = (mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class);
        int i19 = this.f311389d;
        c1Var.p8(i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("commonAnchorFlagClick failed, lastAnchorStateFlag:" + i19, (int) ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).f410399q);
        yz5.p pVar = this.f311388c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        df2.g3 g3Var = this.f311386a;
        ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).q8(j17);
        ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).Z9(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commonAnchorFlagClick succ, anchorStateFlag:");
        int i17 = this.f311387b;
        sb6.append(i17);
        n2Var.e(sb6.toString(), (int) ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).f410399q);
        yz5.p pVar = this.f311388c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, cv2Var);
        }
        int i18 = (int) j17;
        if (!pm0.v.z(i18, 64) || pm0.v.z(i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicSettingModeController", "commonAnchorFlagClick succ,is not enable link mic, anchorStateFlag:" + i17);
            if2.b.Y6(g3Var, qo0.b.R3, null, 2, null);
        }
    }
}
