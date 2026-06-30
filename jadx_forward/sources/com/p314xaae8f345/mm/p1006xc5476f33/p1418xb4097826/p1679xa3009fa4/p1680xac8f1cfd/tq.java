package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class tq implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f217585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f217586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217587f;

    public tq(so2.j5 j5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var) {
        this.f217585d = j5Var;
        this.f217586e = hsVar;
        this.f217587f = s0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.al2 al2Var = (r45.al2) obj;
        if (al2Var == null) {
            return;
        }
        kr2.q a17 = kr2.q.f392850h.a();
        so2.j5 j5Var = this.f217585d;
        a17.c(al2Var, true, j5Var.mo2128x1ed62e84());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f217586e;
        if (hsVar.f216192o == j5Var.mo2128x1ed62e84()) {
            in5.s0 s0Var = this.f217587f;
            hsVar.v7(s0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fs(hsVar, s0Var, 1, true));
        }
    }
}
