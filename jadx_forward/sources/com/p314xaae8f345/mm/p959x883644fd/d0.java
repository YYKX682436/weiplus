package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public class d0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uj5 f153032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f153033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f153034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f153035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f153036h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f153037i;

    public d0(long j17, r45.uj5 uj5Var, java.lang.String[] strArr, float f17, float f18, int i17, long j18) {
        this.f153032d = uj5Var;
        this.f153033e = strArr;
        this.f153034f = f17;
        this.f153035g = f18;
        this.f153036h = i17;
        this.f153037i = j18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        java.lang.String str3 = this.f153032d.f468954m;
        if (i17 != 0 || i18 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p959x883644fd.i0.f153051h;
            if (currentTimeMillis > 600000 || currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String[] strArr = this.f153033e;
            sb6.append(strArr[0]);
            sb6.append("1,");
            sb6.append(this.f153034f);
            sb6.append(",");
            sb6.append(this.f153035g);
            sb6.append(",");
            sb6.append(this.f153036h);
            sb6.append(",");
            sb6.append(this.f153037i);
            sb6.append(",");
            if (z65.c.f551988a) {
                str2 = "1";
            } else {
                str2 = "" + currentTimeMillis;
            }
            sb6.append(str2);
            sb6.append(",");
            sb6.append(strArr[1]);
            sb6.append(",");
            sb6.append(strArr[2]);
            sb6.append(",");
            sb6.append(strArr[3]);
            fVar.mo68478xbd3cda5f(11747, sb6.toString());
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return 0;
    }
}
