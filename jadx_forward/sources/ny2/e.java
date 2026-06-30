package ny2;

/* loaded from: classes.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ny2.h f422961a;

    public e(ny2.h hVar) {
        this.f422961a = hVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.HashSet hashSet;
        r45.me2 me2Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ny2.h hVar = this.f422961a;
        hVar.f422971n.b();
        boolean z17 = true;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ko1 ko1Var = (r45.ko1) fVar.f152151d;
            java.lang.String m75945x2fec8307 = (ko1Var == null || (me2Var = (r45.me2) ko1Var.m75936x14adae67(1)) == null) ? null : me2Var.m75945x2fec8307(5);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                gk2.e eVar = dk2.ef.I;
                if (eVar != null && (hashSet = ((mm2.c1) eVar.a(mm2.c1.class)).f410332e6) != null) {
                    hashSet.add(m75945x2fec8307);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f422964d, "createVote success, cache myCreatedVotingId=" + m75945x2fec8307);
            }
            db5.t7.h(hVar.m80379x76847179(), hVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejc));
            pm0.v.V(lk5.s.b(hVar.m158354x19263085()) ? 2000 : 0, new ny2.d(hVar));
        } else {
            java.lang.String str = fVar.f152150c;
            if (((str == null || str.length() == 0) ? 1 : 0) != 0) {
                db5.t7.g(hVar.m80379x76847179(), hVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejb));
            } else {
                db5.t7.g(hVar.m80379x76847179(), fVar.f152150c);
            }
        }
        return jz5.f0.f384359a;
    }
}
