package dm3;

/* loaded from: classes10.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm3.u f323266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f323267b;

    public q(dm3.u uVar, android.widget.FrameLayout frameLayout) {
        this.f323266a = uVar;
        this.f323267b = frameLayout;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        if (((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2)) != null) {
            dm3.u uVar = this.f323266a;
            android.widget.FrameLayout frameLayout = this.f323267b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1);
            bu2.j.f106067a.n(a17, bu2.i.f106064l);
            uVar.f323274e = a17.m59299x6bf53a6c();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = a17.getFeedObject().m76760x76845fea();
            ((ku5.t0) ku5.t0.f394148d).B(new dm3.p(uVar, frameLayout, m76760x76845fea != null ? m76760x76845fea.m76175x6d346f39() : null));
        }
        return jz5.f0.f384359a;
    }
}
