package un;

/* loaded from: classes11.dex */
public final class p extends un.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f510852n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f510853o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f510854p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510852n = jz5.h.b(new un.n(this));
        this.f510853o = jz5.h.b(new un.o(this));
        this.f510854p = jz5.h.b(new un.m(this));
    }

    @Override // un.h
    public void O6(boolean z17) {
        super.O6(z17);
        if (this.f510806d != null) {
            if (W6().getBoolean("room_placed_to_the_top", false)) {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(false, d7(), true);
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).Ai(false, d7(), false);
            }
        }
    }

    @Override // un.h
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 R6() {
        return ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(d7());
    }

    @Override // un.h
    public boolean S6() {
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d76 = d7();
        ((py.a) iVar).getClass();
        return c01.v1.y(d76);
    }

    @Override // un.h
    public boolean T6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f510806d;
        return Di.K(z3Var != null ? z3Var.d1() : null);
    }

    @Override // un.h
    public java.lang.String U6() {
        return d7();
    }

    @Override // un.h
    public java.lang.String X6() {
        return "MicroMsg.ChatRoomOperationUIC";
    }

    @Override // un.h
    public boolean a7(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        return a3Var != null && super.a7(str, a3Var);
    }

    public final void c7(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        lk5.s.e(intent, true);
        intent.putExtra("RoomInfo_Id", d7());
        intent.putExtra("room_operation_session_id", d7());
        intent.setClass(m158354x19263085(), com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0.class);
        if (z17) {
            intent.putExtra("only_show_special_follow", true);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/chatroom/ui/uic/ChatRoomOperationUIC", "dealJumpToStillNotifyMessageManagerUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/chatroom/ui/uic/ChatRoomOperationUIC", "dealJumpToStillNotifyMessageManagerUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        un.l lVar = (un.l) pf5.z.f435481a.a(activity).a(un.l.class);
        lVar.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", lVar.m158354x19263085(), kz5.c1.k(new jz5.l("view_id", "still_notify_setting_cell"), new jz5.l("chat_name", lVar.O6()), new jz5.l("chatroom_info_sid", lVar.P6())), 34574);
    }

    public final java.lang.String d7() {
        return (java.lang.String) ((jz5.n) this.f510852n).mo141623x754a37bb();
    }

    public final void e7(boolean z17) {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) V6()).m("room_special_follow_member", z17);
        if (z17) {
            return;
        }
        ((java.lang.Boolean) ((jz5.n) this.f510854p).mo141623x754a37bb()).booleanValue();
    }

    public final void f7(boolean z17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10385xd04b2d51 c10385xd04b2d51;
        java.lang.String str;
        r45.ya4 ya4Var;
        java.util.LinkedList linkedList;
        if (!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) V6()).q("room_still_notify_message") && !z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((un.l) pf5.z.f435481a.a(activity).a(un.l.class)).Q6();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) V6()).m("room_still_notify_message", z17);
        if (z17 || (c10385xd04b2d51 = (com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10385xd04b2d51) ((jz5.n) this.f510853o).mo141623x754a37bb()) == null) {
            return;
        }
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d76 = d7();
        ((py.a) iVar).getClass();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c01.v1.K(d76));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(c01.v1.J(d7()));
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(c01.v1.I(d7()));
        boolean booleanValue = valueOf.booleanValue();
        boolean booleanValue2 = valueOf2.booleanValue();
        boolean booleanValue3 = valueOf3.booleanValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String d77 = d7();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = "";
        if (d77 == null) {
            d77 = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(d77);
        boolean z19 = ((z07 == null || (ya4Var = z07.f69097x5eaef643) == null || (linkedList = ya4Var.f472460e) == null) ? 0 : linkedList.size()) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOperationUIC", "ChatroomMuteRefine: needNotifyAtMe: " + booleanValue + ", needNotifyAtAll: " + booleanValue2 + ", needNotifyAnnouncement: " + booleanValue3 + ", watchMembers: " + z19);
        if (!booleanValue && !booleanValue2 && !booleanValue3 && !z19) {
            str = null;
        } else if (!z19 || booleanValue || booleanValue2 || booleanValue3) {
            java.util.List b17 = kz5.b0.b();
            if (booleanValue) {
                ((lz5.e) b17).add(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574434og1));
            }
            if (booleanValue2) {
                ((lz5.e) b17).add(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574433og0));
            }
            if (booleanValue3) {
                ((lz5.e) b17).add(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574436og3));
            }
            if (z19) {
                ((lz5.e) b17).add(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofw));
            }
            java.util.List a18 = kz5.b0.a(b17);
            int d17 = ((kz5.l) a18).d();
            if (d17 == 1) {
                str2 = (java.lang.String) ((lz5.e) a18).get(0);
            } else if (d17 == 2) {
                lz5.e eVar = (lz5.e) a18;
                str2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6m, eVar.get(0), eVar.get(1));
            } else if (d17 == 3) {
                lz5.e eVar2 = (lz5.e) a18;
                str2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6n, eVar2.get(0), eVar2.get(1), eVar2.get(2));
            } else if (d17 == 4) {
                lz5.e eVar3 = (lz5.e) a18;
                str2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6o, eVar3.get(0), eVar3.get(1), eVar3.get(2), eVar3.get(3));
            }
            str = str2;
        } else {
            str = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p6l);
        }
        c10385xd04b2d51.M = str;
        c10385xd04b2d51.M();
    }

    public void g7(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
        c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", U6(), true);
        c6363x8f18fad7.f137132e = z17 ? 11 : 10;
        c6363x8f18fad7.k();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((un.l) pf5.z.f435481a.a(activity).a(un.l.class)).R6(z17, un.i.f510816e);
    }

    public final void h7(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOperationUIC", "updateStillNotifyMessagePreference: " + z17 + ", " + z18);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(d7())) {
            com.p314xaae8f345.mm.p648x55baa833.ui.b9 b9Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.f145388u;
            if (!(!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeComWatchMemberEntry"), 0) == 1) && c01.e2.E(d7()))) {
                if (z18) {
                    e7(true);
                    f7(true);
                    return;
                }
                Y6(!z17);
                if (z17) {
                    Y6(false);
                    if (W6().getBoolean("room_set_to_conv_box", false)) {
                        e7(false);
                        f7(true);
                    } else {
                        e7(true);
                        f7(false);
                    }
                } else {
                    Y6(true);
                    e7(true);
                    f7(true);
                }
                if (c01.v1.v()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRoomOperationUIC", "ChatroomMuteRefine: not enable, should not show!");
                f7(true);
                return;
            }
        }
        Y6(true);
        e7(true);
        f7(true);
    }
}
