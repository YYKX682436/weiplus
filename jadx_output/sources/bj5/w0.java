package bj5;

/* loaded from: classes.dex */
public final class w0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21242d;

    public w0(int i17, bj5.d1 d1Var) {
        this.f21242d = d1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            bj5.d1 d1Var = this.f21242d;
            d1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.SelectLabelActionBarUIC", "dealDeleteLabel() called");
            b93.l.a(b93.l.f18596a, d1Var.getIntent().getIntExtra("key_label_click_source", 0), 16, 0, 0, 0, 28, null);
            com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(d1Var.getActivity().getIntent().getStringExtra("label_id"));
            if (n17.field_isTemporary) {
                if (b93.r.wi().delete(n17, "labelID")) {
                    d1Var.V6();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w(pf5.o.TAG, "cpan[doDeleteContactLabel] fail.");
                    d1Var.U6();
                    return;
                }
            }
            androidx.appcompat.app.AppCompatActivity activity = d1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            d1Var.f21178d = ((cj5.o) pf5.z.f353948a.a(activity).a(cj5.o.class)).T6();
            r45.yb0 yb0Var = new r45.yb0();
            yb0Var.f390945d = java.lang.String.valueOf(n17.field_labelID);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 637;
            lVar.f70666c = "/cgi-bin/micromsg-bin/delcontactlabel";
            lVar.f70664a = yb0Var;
            lVar.f70665b = new r45.zb0();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().K(new bj5.s0(yb0Var, d1Var));
        }
    }
}
