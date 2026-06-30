package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class p8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f217067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f217069f;

    public p8(java.util.LinkedList linkedList, in5.s0 s0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f217067d = linkedList;
        this.f217068e = s0Var;
        this.f217069f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Object obj = this.f217067d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderDebugUIC", "onClickOk spec:".concat(str));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.a();
        cu2.x.f303982a.a();
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        ek6.getClass();
        ek6.E = str;
        in5.s0 s0Var = this.f217068e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f.getPlayInfo() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15196x85976f5f.m61471xe56ce956(), "retryFindSpecPlay return for playInfo null");
        } else {
            cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo);
            cw2.h8 playInfo2 = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo2);
            java.lang.Object obj2 = playInfo.f305282e.get(playInfo2.f305281d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            r45.mb4 mb4Var = (r45.mb4) obj2;
            cw2.h8 playInfo3 = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo3);
            long m59127x5db1b11 = playInfo3.f305278a.m59127x5db1b11();
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            mn2.g4 A = c15196x85976f5f.A(m59127x5db1b11, m75945x2fec8307, mb4Var);
            cw2.h8 playInfo4 = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo4.f305278a;
            java.lang.String n17 = A.n();
            cw2.h8 playInfo5 = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo5);
            int i18 = playInfo5.f305281d;
            java.util.LinkedList linkedList = c15196x85976f5f.f212259z;
            cw2.h8 playInfo6 = c15196x85976f5f.getPlayInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(playInfo6);
            boolean z17 = playInfo6.f305283f;
            r45.mb4 mb4Var2 = A.f411535e;
            c15196x85976f5f.m61502xe6894884(new cw2.h8(c14989xf862ae88, n17, A, i18, linkedList, z17, true, false, false, mb4Var2.m75933x41a8a7f2(13) ? (r45.dd4) mb4Var2.m75936x14adae67(14) : null, false, 1408, null));
            c15196x85976f5f.m61481x6966400a().performClick();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) this.f217069f.f391656d;
        if (j0Var != null) {
            j0Var.setTitle(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q8.Q6(s0Var));
        }
        yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        ek7.getClass();
        ek7.E = "";
    }
}
