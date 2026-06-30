package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes4.dex */
public final class f0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f267305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ee f267306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267307f;

    public f0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.ee eeVar, int i17) {
        this.f267305d = abstractActivityC21394xb3d2c0cf;
        this.f267306e = eeVar;
        this.f267307f = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        nw4.n nVar;
        nw4.n nVar2;
        r45.ee eeVar = this.f267306e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f267305d;
        if (i18 != -1) {
            db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3u));
            if (!(abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) || (nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) abstractActivityC21394xb3d2c0cf).f265377p0) == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eeVar);
            nVar.E(eeVar.f454874f, "canceled");
            return;
        }
        db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        if ((abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && (nVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) abstractActivityC21394xb3d2c0cf).f265377p0) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eeVar);
            nVar2.E(eeVar.f454874f, ya.b.f77504xbb80cbe3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x0 x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.y0.f267367k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eeVar);
        java.lang.String videoVid = eeVar.f454874f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoVid, "videoVid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eeVar);
        java.lang.String mpUrl = eeVar.f454872d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mpUrl, "mpUrl");
        x0Var.d(2, 101, videoVid, mpUrl, 0, this.f267307f);
    }
}
