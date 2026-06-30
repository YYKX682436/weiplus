package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f66720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f66722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f66724i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f66726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66727o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66728p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66729q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f66730r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f66731s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(java.lang.String str, long j17, java.lang.String str2, boolean z17, android.content.Context context, android.content.Intent intent, com.tencent.mm.feature.finder.live.v4 v4Var, java.lang.Long l17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, long j18) {
        super(0);
        this.f66719d = str;
        this.f66720e = j17;
        this.f66721f = str2;
        this.f66722g = z17;
        this.f66723h = context;
        this.f66724i = intent;
        this.f66725m = v4Var;
        this.f66726n = l17;
        this.f66727o = str3;
        this.f66728p = str4;
        this.f66729q = str5;
        this.f66730r = num;
        this.f66731s = j18;
    }

    public static final void a(java.lang.String str, boolean z17, android.content.Context context, android.content.Intent intent, com.tencent.mm.feature.finder.live.v4 v4Var, long j17, java.lang.Long l17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, long j18, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z18) {
        if (finderObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveFeatureService", "enterFinderProfileUI requestFinderObject null");
            if (z18) {
                pm0.v.X(new com.tencent.mm.feature.finder.live.e3(context));
                return;
            }
            return;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(str);
        if (z17 && sl2.h.f409251a.c(context, finderObject)) {
            return;
        }
        pm0.v.X(new com.tencent.mm.feature.finder.live.f3(intent, finderObject, context, v4Var, j17, l17, str2, str3, str, str4, str5, num, j18));
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f66719d;
        if ((str.length() > 0) && !kotlin.jvm.internal.o.b(java.lang.String.valueOf(this.f66720e), str)) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            long j17 = this.f66720e;
            java.lang.String str2 = this.f66719d;
            com.tencent.mm.protocal.protobuf.FinderObject ml6 = ((c61.l7) b6Var).ml(j17, str2, 0, false, true, "", new com.tencent.mm.feature.finder.live.d3(this.f66721f, this.f66722g, this.f66723h, this.f66724i, this.f66725m, j17, this.f66726n, str2, this.f66727o, this.f66728p, this.f66729q, this.f66730r, this.f66731s));
            java.lang.String str3 = this.f66721f;
            boolean z17 = this.f66722g;
            android.content.Context context = this.f66723h;
            android.content.Intent intent = this.f66724i;
            com.tencent.mm.feature.finder.live.v4 v4Var = this.f66725m;
            long j18 = this.f66720e;
            java.lang.Long l17 = this.f66726n;
            java.lang.String str4 = this.f66719d;
            java.lang.String str5 = this.f66727o;
            java.lang.String str6 = this.f66728p;
            java.lang.String str7 = this.f66729q;
            java.lang.Integer num = this.f66730r;
            long j19 = this.f66731s;
            if (ml6 == null) {
                ml6 = null;
            }
            a(str3, z17, context, intent, v4Var, j18, l17, str4, str5, str6, str7, num, j19, ml6, false);
        }
        return jz5.f0.f302826a;
    }
}
