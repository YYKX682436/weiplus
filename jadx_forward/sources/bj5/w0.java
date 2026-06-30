package bj5;

/* loaded from: classes.dex */
public final class w0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f102775d;

    public w0(int i17, bj5.d1 d1Var) {
        this.f102775d = d1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bj5.d1 d1Var = this.f102775d;
            d1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "dealDeleteLabel() called");
            b93.l.a(b93.l.f100129a, d1Var.m158359x1e885992().getIntExtra("key_label_click_source", 0), 16, 0, 0, 0, 28, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(d1Var.m158354x19263085().getIntent().getStringExtra("label_id"));
            if (n17.f66584x284d1882) {
                if (b93.r.wi().mo9951xb06685ab(n17, "labelID")) {
                    d1Var.V6();
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "cpan[doDeleteContactLabel] fail.");
                    d1Var.U6();
                    return;
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            d1Var.f102711d = ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
            r45.yb0 yb0Var = new r45.yb0();
            yb0Var.f472478d = java.lang.String.valueOf(n17.f66585x70ce48ca);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 637;
            lVar.f152199c = "/cgi-bin/micromsg-bin/delcontactlabel";
            lVar.f152197a = yb0Var;
            lVar.f152198b = new r45.zb0();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().K(new bj5.s0(yb0Var, d1Var));
        }
    }
}
