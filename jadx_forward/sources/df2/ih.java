package df2;

/* loaded from: classes3.dex */
public final class ih extends df2.de {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f311932p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311933q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f311934r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f311935s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f311936t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f311937u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Integer f311938v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f311939w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f311940x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Integer f311941y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311932p = "Micro.LiveEmojiMsgConfigController";
        this.f311936t = true;
    }

    public final void m7(java.lang.Long l17, java.lang.String str) {
        java.lang.String str2 = this.f311932p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[refreshCanSendEmoji-" + str + "] flag = " + l17);
        if (l17 != null) {
            long longValue = l17.longValue();
            qs5.h[] hVarArr = qs5.h.f447966d;
            boolean A = pm0.v.A(longValue, 4);
            if (A != this.f311933q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "canSendEmojiMsg set to " + A);
            }
            this.f311933q = A;
            qs5.h[] hVarArr2 = qs5.h.f447966d;
            boolean A2 = pm0.v.A(longValue, 16);
            if (A2 != this.f311934r) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "canShowEmojiPanel set to " + A2);
            }
            this.f311934r = A2;
            qs5.h[] hVarArr3 = qs5.h.f447966d;
            boolean A3 = pm0.v.A(longValue, 32);
            if (A3 != this.f311935s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "anchorEmojiSwitchGrayout set to " + A3);
            }
            this.f311935s = A3;
            qs5.h[] hVarArr4 = qs5.h.f447966d;
            boolean A4 = pm0.v.A(longValue, 8);
            if (A4 != this.f311936t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "anchorEmojiSwitchHide set to " + A4);
            }
            this.f311936t = A4;
            qs5.h[] hVarArr5 = qs5.h.f447966d;
            boolean A5 = pm0.v.A(longValue, 128);
            if (A5 != this.f311937u) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "canShowEmojiRecommend set to " + A5);
            }
            this.f311937u = A5;
        }
    }

    @Override // df2.de, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.up1 up1Var;
        super.mo14867x5aa1c816(r71Var);
        m7((r71Var == null || (up1Var = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)), "onLiveMsg");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        r45.dp1 dp1Var;
        r45.up1 up1Var;
        super.mo14863x39a513b7(hc1Var);
        m7((hc1Var == null || (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)), "onLiveStart");
        if (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) == null || (dp1Var = (r45.dp1) ic1Var.m75936x14adae67(18)) == null) {
            return;
        }
        this.f311938v = java.lang.Integer.valueOf((int) (dp1Var.m75938x746dc8a6(0) * O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        this.f311939w = java.lang.Integer.valueOf((int) (dp1Var.m75938x746dc8a6(1) * O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        this.f311940x = dp1Var.m75933x41a8a7f2(2);
        this.f311941y = java.lang.Integer.valueOf((int) (dp1Var.m75938x746dc8a6(3) * O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        java.lang.String str = "isInLine = " + this.f311940x + ", barrageMaxSize = " + this.f311941y;
        java.lang.String str2 = this.f311932p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Q7).mo141623x754a37bb()).r()).intValue();
        java.lang.Integer valueOf = intValue > 0 ? java.lang.Integer.valueOf(O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * intValue) : this.f311941y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "syncBarrageMaxSizeToDanmakuSlice: fakeConfigValue=" + intValue + ", barrageMaxSize=" + this.f311941y + ", finalSize=" + valueOf);
        ((mm2.j2) getStore().getLiveRoomData().a(mm2.j2.class)).E = valueOf;
    }
}
