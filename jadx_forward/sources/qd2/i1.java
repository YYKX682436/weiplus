package qd2;

/* loaded from: classes8.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f443310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 f443311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f443312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443314e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var, android.app.Activity activity, int i17, int i18) {
        this.f443310a = m8Var;
        this.f443311b = g9Var;
        this.f443312c = activity;
        this.f443313d = i17;
        this.f443314e = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doPreCheck] errType:");
        sb6.append(fVar.f152148a);
        sb6.append(" errCode:");
        sb6.append(fVar.f152149b);
        sb6.append(" errMsg:");
        sb6.append(fVar.f152150c);
        sb6.append(" finder_secret_data:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.l23) fVar.f152151d).m75934xbce7f2f(4);
        sb6.append(m75934xbce7f2f != null ? m75934xbce7f2f.i() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var = this.f443310a;
        if (m8Var != null) {
            m8Var.a(fVar);
        }
        qd2.h1 h1Var = new qd2.h1(m8Var, ((r45.l23) fVar.f152151d).m75934xbce7f2f(4));
        if (fVar.f152149b == -5002) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var = this.f443311b;
            if (!g9Var.f183742e) {
                if (g9Var.f183741d) {
                    h1Var.d(this.f443312c, this.f443313d, fVar.f152150c, this.f443314e);
                } else {
                    h1Var.f(7, false, false);
                }
                return jz5.f0.f384359a;
            }
        }
        h1Var.f(1, true, false);
        return jz5.f0.f384359a;
    }
}
