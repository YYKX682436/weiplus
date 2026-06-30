package st2;

/* loaded from: classes3.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f493896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493899g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f493900h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f493901i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo f493902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ st2.j2 f493903n;

    public i2(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo, st2.j2 j2Var) {
        this.f493896d = context;
        this.f493897e = str;
        this.f493898f = str2;
        this.f493899g = str3;
        this.f493900h = i17;
        this.f493901i = z17;
        this.f493902m = customSubjectInfo;
        this.f493903n = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l81.b1 b1Var = new l81.b1();
        boolean z17 = this.f493901i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = this.f493902m;
        java.lang.String str = this.f493897e;
        b1Var.f398547b = str;
        b1Var.f398555f = this.f493898f;
        b1Var.f398565k = zl2.r4.f555483a.w1() ? 1176 : 1177;
        b1Var.f398567l = this.f493899g;
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, 0, this.f493900h == 0 ? k91.s2.f387293d : k91.s2.f387294e, false, null, false, null, z17 ? k91.t2.f387300e : k91.t2.f387301f, false, z17, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, customSubjectInfo, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -67109510, 2047, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        st2.j2 j2Var = this.f493903n;
        java.lang.String str2 = j2Var.f493910b;
        android.content.Context context = this.f493896d;
        b1Var.f398570o = new st2.j2(context, str, str2, j2Var.f493911c);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
    }
}
