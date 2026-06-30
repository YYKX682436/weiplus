package j93;

/* loaded from: classes11.dex */
public final class u implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.w f380039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f380040b;

    public u(j93.w wVar, db5.f3 f3Var) {
        this.f380039a = wVar;
        this.f380040b = f3Var;
    }

    @Override // db5.d3
    public final void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateNewLabelUIC", "onTextChange() called with: charSequence = [" + ((java.lang.Object) charSequence) + ']');
        j93.w wVar = this.f380039a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = wVar.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
        db5.f3 f3Var = this.f380040b;
        f3Var.B();
        java.lang.String obj = charSequence.toString();
        if (f93.q5.f341974a.a(wVar.m80379x76847179(), obj)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = wVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            wVar.f380058d = ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
            r45.b4 b4Var = new r45.b4();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.f54 f54Var = new r45.f54();
            f54Var.f455554d = obj;
            linkedList.add(f54Var);
            b4Var.f452039e = linkedList;
            b4Var.f452038d = 1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518178e, vg3.c.f518201w, 0, null, 24, null));
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = kd1.c.f72435x366c91de;
            lVar.f152199c = "/cgi-bin/micromsg-bin/addcontactlabel";
            lVar.f152197a = b4Var;
            lVar.f152198b = new r45.c4();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().K(new j93.s(wVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateNewLabelUIC", "dealRenameLabel() called with: labelName = " + obj + " checkLabelNameValid fail");
        }
        b93.l.a(b93.l.f100129a, wVar.m158359x1e885992().getIntExtra("key_label_click_source", 0), 10, 1, 0, 0, 16, null);
        if (wVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = wVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            j93.r rVar = (j93.r) pf5.z.f435481a.a(activity2).a(j93.r.class);
            android.widget.Button nextBtn = f3Var.N;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nextBtn, "nextBtn");
            java.lang.String labelName = charSequence.toString();
            rVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelName, "labelName");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", nextBtn, kz5.c1.k(new jz5.l("view_id", "label_create_finish_btn"), new jz5.l("label_business_type", (java.lang.String) ((jz5.n) rVar.f380020e).mo141623x754a37bb()), new jz5.l("label_select_sessionid", rVar.O6()), new jz5.l("label_text_cnt", java.lang.Integer.valueOf(labelName.length()))), 33926);
        }
    }
}
