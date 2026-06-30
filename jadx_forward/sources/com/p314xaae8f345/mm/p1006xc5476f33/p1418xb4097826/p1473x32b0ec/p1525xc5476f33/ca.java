package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ca implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa f193661d;

    public ca(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar) {
        this.f193661d = faVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ca caVar;
        boolean z17;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        r45.ba4 ba4Var = (r45.ba4) obj;
        if (ba4Var != null) {
            if (zl2.r4.f555483a.l2(ba4Var)) {
                caVar = this;
                z17 = true;
            } else {
                caVar = this;
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fa faVar = caVar.f193661d;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(faVar.f194058p, "liveRoomImg invaild = " + pm0.b0.g(ba4Var));
                return;
            }
            faVar.getClass();
            java.lang.String str2 = "[showLiveRoomImg] info = " + pm0.b0.g(ba4Var);
            java.lang.String str3 = faVar.f194058p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            faVar.y1();
            int m75939xb282bd08 = ba4Var.m75939xb282bd08(2);
            str = "";
            android.widget.FrameLayout frameLayout = faVar.f194060r;
            if (m75939xb282bd08 == 0) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(8);
                faVar.f194059q.setVisibility(0);
                java.lang.String m75945x2fec83073 = ba4Var.m75945x2fec8307(0);
                faVar.v1(m75945x2fec83073 != null ? m75945x2fec83073 : "");
                return;
            }
            if (m75939xb282bd08 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[showLiveRoomImg] unknown img type");
                return;
            }
            r45.gg0 gg0Var = (r45.gg0) ba4Var.m75936x14adae67(1);
            if (gg0Var != null && (m75945x2fec83072 = gg0Var.m75945x2fec8307(1)) != null) {
                str = m75945x2fec83072;
            }
            faVar.v1(str);
            frameLayout.removeAllViews();
            if (faVar.f194063u) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "plugin has unmount, dont new player");
                return;
            }
            android.content.Context context = faVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9(context);
            c14932xfc4acec9.mo56708x764cf626(true);
            c14932xfc4acec9.mo56709x764d819b(true);
            c14932xfc4acec9.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            r45.mb4 mb4Var = new r45.mb4();
            r45.gg0 gg0Var2 = (r45.gg0) ba4Var.m75936x14adae67(1);
            mb4Var.set(0, gg0Var2 != null ? gg0Var2.m75945x2fec8307(0) : null);
            r45.gg0 gg0Var3 = (r45.gg0) ba4Var.m75936x14adae67(1);
            mb4Var.set(1, gg0Var3 != null ? gg0Var3.m75945x2fec8307(1) : null);
            mb4Var.set(9, kk.k.e(mb4Var.m75945x2fec8307(0)));
            mn2.g4 g4Var = new mn2.g4(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209890g, "xV0", 0, 0, null, false, null, 248, null);
            r45.gg0 gg0Var4 = (r45.gg0) ba4Var.m75936x14adae67(1);
            c14932xfc4acec9.n(g4Var, (gg0Var4 == null || (m75945x2fec8307 = gg0Var4.m75945x2fec8307(0)) == null || r26.i0.y(m75945x2fec8307, "http", false)) ? false : true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88());
            faVar.f194061s = c14932xfc4acec9;
            c14932xfc4acec9.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "playerView new " + faVar.f194061s);
            frameLayout.addView(faVar.f194061s);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec92 = faVar.f194061s;
            if (c14932xfc4acec92 != null) {
                c14932xfc4acec92.mo56716x4121a19(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec93 = faVar.f194061s;
            if (c14932xfc4acec93 != null) {
                zy2.g5.u(c14932xfc4acec93, null, 1, null);
            }
            frameLayout.setVisibility(0);
        }
    }
}
