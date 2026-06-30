package cw1;

/* loaded from: classes12.dex */
public final class r2 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f304820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f304821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f304822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f304824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f304826h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304827i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f304828j;

    public r2(java.util.List list, byte[] bArr, long j17, long j18, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, cw1.o0 o0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d, boolean z17) {
        this.f304819a = list;
        this.f304820b = bArr;
        this.f304821c = j17;
        this.f304822d = j18;
        this.f304823e = i17;
        this.f304824f = u3Var;
        this.f304825g = o0Var;
        this.f304826h = h0Var;
        this.f304827i = activityC13111x890e232d;
        this.f304828j = z17;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
    }

    @Override // aw1.w
    public void b(boolean z17, long j17, int i17) {
        if (z17) {
            return;
        }
        if (!this.f304819a.isEmpty()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Aa(this.f304819a);
        }
        if (this.f304820b[6] != Byte.MAX_VALUE) {
            ft.w3 w3Var = (ft.w3) i95.n0.c(ft.w3.class);
            w3Var.getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0) w3Var).wi("ACTION_CLEAN_APPBRAND_COMMON_SPACE", false);
            ft.w3 w3Var2 = (ft.w3) i95.n0.c(ft.w3.class);
            w3Var2.getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0) w3Var2).wi("ACTION_CLEAN_ALL_APPBRAND_SPACE", false);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d c5156x300e729d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d();
        c5156x300e729d.f135505g.f88735a = this.f304823e;
        c5156x300e729d.e();
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.q2(this.f304824f, this.f304825g, this.f304820b, this.f304826h, this.f304827i, this.f304822d, this.f304828j));
        mt1.b0.s(4, java.lang.System.currentTimeMillis() - this.f304821c, java.lang.Long.valueOf(this.f304822d));
    }
}
