package hr3;

/* loaded from: classes5.dex */
public final class w1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public iy1.c f365662d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f365663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f365662d = iy1.c.WeChatNotesandTabsPage;
        this.f365663e = jz5.h.b(new hr3.v1(activity));
    }

    public final void O6() {
        int i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        gc0.e1 e1Var = ((gc0.p2) zVar.a(activity).a(gc0.p2.class)).f351781m;
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", e1Var.f351678d ? "friend_verificate_finish" : "notesand_tabs_finish");
        lVarArr[1] = new jz5.l("add_username", (java.lang.String) ((jz5.n) e1Var.f351677c).mo141623x754a37bb());
        int i18 = 2;
        lVarArr[2] = new jz5.l("note_sid", (java.lang.String) ((jz5.n) e1Var.f351676b).mo141623x754a37bb());
        java.lang.String chooseData = e1Var.f351682h;
        java.util.List finishData = e1Var.f351688n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseData, "chooseData");
        if (java.lang.Boolean.valueOf(!r26.n0.N(chooseData)).booleanValue()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishData, "finishData");
            i17 = java.lang.Boolean.valueOf(((java.util.ArrayList) finishData).contains(chooseData)).booleanValue() ? 1 : 2;
        } else {
            i17 = 0;
        }
        lVarArr[3] = new jz5.l("is_reedit_photo", java.lang.Integer.valueOf(i17));
        java.util.List chooseData2 = e1Var.f351681g;
        java.util.List list = e1Var.f351687m;
        gc0.a1 a1Var = gc0.a1.f351621d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseData2, "chooseData");
        lVarArr[4] = new jz5.l("is_reedit_phone", java.lang.Integer.valueOf(java.lang.Boolean.valueOf(((java.util.ArrayList) chooseData2).isEmpty() ^ true).booleanValue() ? ((java.lang.Boolean) a1Var.mo149xb9724478(list, chooseData2)).booleanValue() ? 1 : 2 : 0));
        java.util.List chooseData3 = e1Var.f351680f;
        java.lang.String str = e1Var.f351686l;
        gc0.b1 b1Var = gc0.b1.f351634d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chooseData3, "chooseData");
        if (!java.lang.Boolean.valueOf(!((java.util.ArrayList) chooseData3).isEmpty()).booleanValue()) {
            i18 = 0;
        } else if (((java.lang.Boolean) b1Var.mo149xb9724478(str, chooseData3)).booleanValue()) {
            i18 = 1;
        }
        lVarArr[5] = new jz5.l("is_reedit_note", java.lang.Integer.valueOf(i18));
        lVarArr[6] = new jz5.l("is_note_set_origin_nickname", java.lang.Integer.valueOf(e1Var.f351684j ? 1 : 0));
        lVarArr[7] = new jz5.l("default_note_type", java.lang.Integer.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae()) == 1 ? 1 : 0));
        lVarArr[8] = new jz5.l("note_input_has_clk", java.lang.Integer.valueOf(e1Var.f351683i ? 1 : 0));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(e1Var.f351679e);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        j93.n nVar = (j93.n) zVar.a(activity2).a(j93.n.class);
        java.util.Map l18 = kz5.c1.l(new jz5.l("main_tag_adopt_cnt", java.lang.String.valueOf(nVar.f379980m)), new jz5.l("list_tag_adopt_cnt", java.lang.String.valueOf(nVar.f379981n)), new jz5.l("main_tag_select_cnt", java.lang.String.valueOf(nVar.f379984q.size())));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(l17);
        linkedHashMap.putAll(l18);
        int ordinal = this.f365662d.ordinal();
        linkedHashMap.put("view_id", ordinal != 196 ? ordinal != 197 ? ordinal != 202 ? "" : "friend_apply_send" : "notesand_tabs_finish" : "friend_verificate_finish");
        pm0.v.K(null, new hr3.u1(linkedHashMap));
    }

    public final void P6(iy1.c id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f365662d = id6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactModInfoReportUIC", "set currentPageId: " + id6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("Contact_User");
        int intExtra = m158359x1e885992().getIntExtra("Contact_Scene", 9);
        int i17 = 3;
        if (intExtra == 3) {
            i17 = 4;
        } else if (intExtra == 30) {
            i17 = 2;
        } else if (intExtra == 14) {
            i17 = 1;
        } else if (intExtra != 15) {
            i17 = intExtra != 17 ? intExtra != 18 ? 0 : 6 : 5;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.ak(m158354x19263085(), this.f365662d);
            aVar.dk(m158354x19263085(), this.f365662d.name());
            aVar.ik(m158354x19263085(), 4, 33926);
            aVar.Ai(m158354x19263085(), new hr3.s1(this, stringExtra, i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactModInfoReportUIC", "generate page=" + this.f365662d + " note_sid: " + ((java.lang.String) ((jz5.n) this.f365663e).mo141623x754a37bb()) + " username: " + stringExtra + ", addScene: " + i17);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cd8);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Mj(linearLayout);
        aVar2.pk(linearLayout, "contact_add_tag");
        aVar2.Ai(linearLayout, new hr3.t1(this, stringExtra));
        aVar2.ik(linearLayout, 8, 33926);
    }
}
