package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class xg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f155858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155859e;

    public xg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f155859e = activityC11466x7d774b0;
        this.f155858d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155859e;
        java.lang.String trim = activityC11466x7d774b0.f155162d.getText().toString().trim();
        java.lang.String trim2 = activityC11466x7d774b0.f155163e.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            db5.e1.i(activityC11466x7d774b0, com.p314xaae8f345.mm.R.C30867xcad56011.f574967k60, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        activityC11466x7d774b0.mo48674x36654fab();
        int V6 = activityC11466x7d774b0.V6();
        java.lang.String U6 = activityC11466x7d774b0.U6();
        gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60875xf35223e, activityC11466x7d774b0);
        r61.m1 m1Var = new r61.m1(U6, activityC11466x7d774b0.f155170o, V6, trim, trim2, ((r61.l1) ((r61.m1) this.f155858d).f474439d).f474431b.f474536a.f467417f, activityC11466x7d774b0.f155175t.m78854x2bc566b5());
        gm0.j1.d().g(m1Var);
        activityC11466x7d774b0.f155165g = db5.e1.Q(activityC11466x7d774b0, activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11466x7d774b0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wg(this, m1Var));
    }
}
