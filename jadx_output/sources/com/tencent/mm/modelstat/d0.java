package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class d0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uj5 f71499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f71500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f71501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f71502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f71503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f71504i;

    public d0(long j17, r45.uj5 uj5Var, java.lang.String[] strArr, float f17, float f18, int i17, long j18) {
        this.f71499d = uj5Var;
        this.f71500e = strArr;
        this.f71501f = f17;
        this.f71502g = f18;
        this.f71503h = i17;
        this.f71504i = j18;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        java.lang.String str3 = this.f71499d.f387421m;
        if (i17 != 0 || i18 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.modelstat.i0.f71518h;
            if (currentTimeMillis > 600000 || currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String[] strArr = this.f71500e;
            sb6.append(strArr[0]);
            sb6.append("1,");
            sb6.append(this.f71501f);
            sb6.append(",");
            sb6.append(this.f71502g);
            sb6.append(",");
            sb6.append(this.f71503h);
            sb6.append(",");
            sb6.append(this.f71504i);
            sb6.append(",");
            if (z65.c.f470455a) {
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
            fVar.kvStat(11747, sb6.toString());
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_REPORTNETTYPE_LASTREPORT_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return 0;
    }
}
