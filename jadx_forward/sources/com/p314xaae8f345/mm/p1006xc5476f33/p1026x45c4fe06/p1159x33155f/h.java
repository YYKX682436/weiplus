package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f167486a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f167487b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167488c;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.g gVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s1
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_CopyShortLink", "onReturnUrl %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(this.f167486a, this.f167487b, 47, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), str.isEmpty() ? 2 : 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vf.f165052a.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d1.f162264d, this);
        if (str.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = this.f167488c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new kj1.k0(pageView, str, null), 2, null);
    }
}
