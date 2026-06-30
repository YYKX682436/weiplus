package j93;

/* loaded from: classes11.dex */
public final class u0 implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f380041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f380042b;

    public u0(j93.x0 x0Var, db5.f3 f3Var) {
        this.f380041a = x0Var;
        this.f380042b = f3Var;
    }

    @Override // db5.d3
    public final void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReNameLabelDialogUIC", "onTextChange() called with: charSequence = [" + ((java.lang.Object) charSequence) + ']');
        j93.x0 x0Var = this.f380041a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x0Var.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
        this.f380042b.B();
        java.lang.String obj = charSequence.toString();
        if (f93.q5.f341974a.a(x0Var.m80379x76847179(), obj)) {
            x0Var.f380064d = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReNameLabelDialogUIC", "dealRenameLabel() called");
            java.lang.String stringExtra = x0Var.m158359x1e885992().getStringExtra("label_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            x0Var.f380066f = ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
            r45.es6 es6Var = new r45.es6();
            r45.f54 f54Var = new r45.f54();
            f54Var.f455554d = obj;
            f54Var.f455555e = java.lang.Integer.parseInt(stringExtra);
            es6Var.f455248d = f54Var;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518178e, vg3.c.f518203y, 0, null, 24, null));
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 636;
            lVar.f152199c = "/cgi-bin/micromsg-bin/updatecontactlabel";
            lVar.f152197a = es6Var;
            lVar.f152198b = new r45.fs6();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().K(new j93.s0(x0Var, stringExtra));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReNameLabelDialogUIC", "dealRenameLabel() called with: labelName = " + obj + " checkLabelNameValid fail");
        }
        b93.l.a(b93.l.f100129a, x0Var.m158359x1e885992().getIntExtra("key_label_click_source", 0), 15, 0, 0, 0, 28, null);
    }
}
