package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be f233882d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be) {
        this.f233882d = activityC16731xe258a4be;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be = this.f233882d;
        g0Var.d(11138, "2", "0", activityC16731xe258a4be.f233810r);
        activityC16731xe258a4be.f233808p = db5.e1.Q(activityC16731xe258a4be.mo55332x76847179(), activityC16731xe258a4be.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9k), activityC16731xe258a4be.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9l), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.u(this));
        activityC16731xe258a4be.f233800e = activityC16731xe258a4be.f233804i.getText().toString();
        activityC16731xe258a4be.f233801f = activityC16731xe258a4be.f233806n.getText().toString();
        activityC16731xe258a4be.f233803h = activityC16731xe258a4be.f233805m.getText().toString();
        java.lang.String obj = ((android.widget.EditText) activityC16731xe258a4be.findViewById(com.p314xaae8f345.mm.R.id.f565771di1)).getText().toString();
        java.lang.String charSequence = ((android.widget.TextView) activityC16731xe258a4be.findViewById(com.p314xaae8f345.mm.R.id.f568987op1)).getText().toString();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = charSequence;
        du5Var.f454290e = true;
        linkedList.add(du5Var);
        activityC16731xe258a4be.f233809q = new dn3.j(activityC16731xe258a4be.f233800e, activityC16731xe258a4be.f233801f, activityC16731xe258a4be.f233803h, activityC16731xe258a4be.f233799d, linkedList.size(), linkedList, obj, null);
        c01.d9.e().g(activityC16731xe258a4be.f233809q);
        return true;
    }
}
