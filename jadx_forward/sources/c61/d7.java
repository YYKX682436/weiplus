package c61;

/* loaded from: classes10.dex */
public final class d7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.a6 f120471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f120472b;

    public d7(zy2.a6 a6Var, long j17) {
        this.f120471a = a6Var;
        this.f120472b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        zy2.a6 a6Var = this.f120471a;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                bu2.j.f106067a.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1), bu2.i.f106064l);
                if (a6Var != null) {
                    a6Var.a(c19792x256d2725, fVar.f152148a, fVar.f152149b);
                }
            }
        } else if (a6Var != null) {
            a6Var.a(null, fVar.f152148a, fVar.f152149b);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f120472b + ", finish");
        return jz5.f0.f384359a;
    }
}
