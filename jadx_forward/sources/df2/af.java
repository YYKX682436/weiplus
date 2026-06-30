package df2;

/* loaded from: classes3.dex */
public final class af extends if2.b implements if2.e {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f311243p;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311244m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 f311245n;

    /* renamed from: o, reason: collision with root package name */
    public long f311246o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311244m = "LiveChooseRoleController";
    }

    public final void Z6(boolean z17, jz5.l lVar, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        android.app.Dialog dialog;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2;
        android.app.Dialog dialog2;
        if (((mm2.n0) getStore().getLiveRoomData().a(mm2.n0.class)).f410806r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311244m, "chooseRole: skip for coLive invitee anchor, scene=" + i17 + ", isFromInput=" + z17);
            return;
        }
        if (this.f311245n == null) {
            android.content.Context O6 = O6();
            gk2.e liveRoomData = getStore().getLiveRoomData();
            r45.s02 s02Var = new r45.s02();
            s02Var.set(3, java.lang.Integer.valueOf(i17));
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            this.f311245n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9(O6, liveRoomData, null, s02Var);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var = this.f311245n;
            if (x9Var != null && (y1Var2 = x9Var.B) != null && (dialog2 = y1Var2.f293558d) != null) {
                dialog2.getWindow().setDimAmount(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var2 = this.f311245n;
            if (x9Var2 != null) {
                x9Var2.S = new df2.xe(this);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var3 = this.f311245n;
            if (x9Var3 != null && (y1Var = x9Var3.B) != null && (dialog = y1Var.f293558d) != null) {
                dialog.getWindow().setDimAmount(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var4 = this.f311245n;
            if (x9Var4 != null) {
                x9Var4.S = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var5 = this.f311245n;
        if (x9Var5 != null) {
            x9Var5.T = lVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(x9Var5, null, false, 0, 7, null);
        }
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var;
        java.lang.String stringExtra;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311244m, "requestCode:" + i17 + ",resultCode:" + i18 + ",data:" + intent);
            if (i18 == -1) {
                java.lang.String str3 = "";
                if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                    str = "";
                }
                if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                    str2 = "";
                }
                if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                    str3 = stringExtra;
                }
                r45.of1 of1Var = new r45.of1();
                of1Var.set(0, str);
                of1Var.set(1, str2);
                of1Var.set(3, str3);
                of1Var.set(2, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x9 x9Var2 = this.f311245n;
                if ((x9Var2 != null && x9Var2.P()) && (x9Var = this.f311245n) != null) {
                    pm0.v.d0(x9Var.L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g9(x9Var));
                    x9Var.L.addLast(of1Var);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j9) ((jz5.n) x9Var.W).mo141623x754a37bb()).m8146xced61ae5();
                }
                java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
                pm0.v.d0(a17, df2.ye.f313391d);
                a17.addLast(of1Var);
                zl2.r4.f555483a.U2(a17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        r45.vw1 vw1Var;
        r45.up1 up1Var;
        super.mo14863x39a513b7(hc1Var);
        long m75942xfb822ef2 = (hc1Var == null || (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? 0L : up1Var.m75942xfb822ef2(8);
        this.f311246o = m75942xfb822ef2;
        if (pm0.v.A(m75942xfb822ef2, 2L)) {
            if (hc1Var != null && (ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85)) != null && (vw1Var = (r45.vw1) ic1Var.m75936x14adae67(4)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311244m, "self_joinlive_msg_ext_info = " + pm0.b0.g(vw1Var));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.ch1 ch1Var = new r45.ch1();
                ch1Var.set(1, 1000068);
                ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(vw1Var.mo14344x5f01b1f6()));
                linkedList.add(new dk2.sc(ch1Var));
                ((mm2.x4) m56788xbba4bfc0(mm2.x4.class)).f411063h.addAll(linkedList);
                if (f311243p) {
                    pm0.v.V(1000L, new df2.ze(this));
                }
            }
            f311243p = false;
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f311245n = null;
    }
}
