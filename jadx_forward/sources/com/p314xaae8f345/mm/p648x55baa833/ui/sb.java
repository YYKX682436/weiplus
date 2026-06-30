package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class sb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c f146046d;

    public sb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c) {
        this.f146046d = activityC10365x4886147c;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c = this.f146046d;
        if (activityC10365x4886147c.f145481t) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC10365x4886147c.f145469e.getItem(i17).f146225b;
            if (z3Var == null) {
                return true;
            }
            if (activityC10365x4886147c.f145470f.f69107x5be1edb3.equals(z3Var.d1())) {
                return true;
            }
            db5.e1.u(activityC10365x4886147c, activityC10365x4886147c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4b), "", new com.p314xaae8f345.mm.p648x55baa833.ui.qb(this, i17), new com.p314xaae8f345.mm.p648x55baa833.ui.rb(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
        }
        return true;
    }
}
