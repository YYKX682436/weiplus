package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class wk0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 f196487d;

    public wk0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 yk0Var) {
        this.f196487d = yk0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.j7 j7Var = (mm2.j7) obj;
        if (j7Var == null || j7Var.a()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 yk0Var = this.f196487d;
        if (!yk0Var.w1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - Plugin not available, skip");
            return;
        }
        if (!zl2.r4.f555483a.h2(yk0Var.S0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - songList closed");
            int i17 = ((mm2.m6) yk0Var.S0().a(mm2.m6.class)).f410781p ? com.p314xaae8f345.mm.R.C30867xcad56011.f573383ef3 : com.p314xaae8f345.mm.R.C30867xcad56011.p1n;
            android.view.ViewGroup viewGroup = yk0Var.f446856d;
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - songName=" + j7Var.f410716a + ", uniqueAddId=" + j7Var.f410717b);
        if (dk2.ef.f314917g) {
            return;
        }
        yk0Var.x1();
    }
}
