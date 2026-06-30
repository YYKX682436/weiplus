package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x f202323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vu1 f202324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x xVar, r45.vu1 vu1Var) {
        super(1);
        this.f202323d = xVar;
        this.f202324e = vu1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.z94 it = (r45.z94) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send gift: ");
        r45.kv1 kv1Var = (r45.kv1) it.m75936x14adae67(0);
        sb6.append(kv1Var != null ? kv1Var.m75945x2fec8307(0) : null);
        sb6.append(" name: ");
        r45.kv1 kv1Var2 = (r45.kv1) it.m75936x14adae67(0);
        sb6.append(kv1Var2 != null ? kv1Var2.m75945x2fec8307(8) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishAudiencePanelWidget", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x xVar = this.f202323d;
        kn2.d dVar = xVar.f202332o;
        r45.kv1 kv1Var3 = (r45.kv1) it.m75936x14adae67(0);
        if (kv1Var3 == null || (str = kv1Var3.m75945x2fec8307(0)) == null) {
            str = "";
        }
        java.lang.String m75945x2fec8307 = this.f202324e.m75945x2fec8307(6);
        java.lang.String str2 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0) dVar;
        wn0Var.getClass();
        boolean m76 = ((mm2.c1) wn0Var.P0(mm2.c1.class)).m7();
        r45.i82 i82Var = (r45.i82) ((mm2.f7) wn0Var.P0(mm2.f7.class)).f410591f.mo3195x754a37bb();
        boolean m75933x41a8a7f2 = i82Var != null ? i82Var.m75933x41a8a7f2(0) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "sendGift enableGiftSwitch: " + m76 + " isEnableWish: " + m75933x41a8a7f2);
        android.view.ViewGroup viewGroup = wn0Var.f446856d;
        if (!m76) {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk_));
        } else if (m75933x41a8a7f2) {
            qo0.c.a(wn0Var.f196506p, qo0.b.R1, null, 2, null);
            ((mm2.s2) wn0Var.P0(mm2.s2.class)).f410941m.mo7808x76db6cb1(new mm2.r2(str, str2));
        } else {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dka));
        }
        xVar.a();
        return jz5.f0.f384359a;
    }
}
