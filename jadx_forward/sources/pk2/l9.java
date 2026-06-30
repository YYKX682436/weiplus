package pk2;

/* loaded from: classes3.dex */
public final class l9 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f437498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f437499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437501e;

    public l9(pk2.o9 o9Var, int i17, yz5.p pVar, boolean z17, int i18) {
        this.f437497a = o9Var;
        this.f437498b = i17;
        this.f437499c = pVar;
        this.f437500d = z17;
        this.f437501e = i18;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        boolean z17 = this.f437500d;
        int i19 = this.f437501e;
        int i27 = this.f437498b;
        pk2.o9 o9Var = this.f437497a;
        if (z17) {
            mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i19 & (~i27));
        } else {
            mm2.c1 c1Var2 = (mm2.c1) o9Var.c(mm2.c1.class);
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            c1Var2.p8(i19 | i27);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("commonAnchorFlagClick failed, flag:" + i27, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
        yz5.p pVar = this.f437499c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f437497a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("commonAnchorFlagClick succ, flag:" + this.f437498b, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q);
        yz5.p pVar = this.f437499c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, cv2Var);
        }
    }
}
