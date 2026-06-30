package h71;

/* loaded from: classes15.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 f360936d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 activityC11392x4c96dbc1) {
        this.f360936d = activityC11392x4c96dbc1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 activityC11392x4c96dbc1 = this.f360936d;
        java.util.List list = activityC11392x4c96dbc1.f154745f;
        if (list != null && ((java.util.LinkedList) list).size() > 0) {
            activityC11392x4c96dbc1.f154744e = ~activityC11392x4c96dbc1.f154744e;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c c11393x5bd9875c : activityC11392x4c96dbc1.f154745f) {
                c11393x5bd9875c.N = activityC11392x4c96dbc1.f154744e;
                c11393x5bd9875c.M();
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC11392x4c96dbc1.f154743d).notifyDataSetChanged();
        }
        int i17 = activityC11392x4c96dbc1.f154744e;
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = activityC11392x4c96dbc1.f154753q;
        if (i17 == 1) {
            activityC11392x4c96dbc1.mo78491xd9193382(0, activityC11392x4c96dbc1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), onMenuItemClickListener);
        } else {
            activityC11392x4c96dbc1.mo78491xd9193382(0, activityC11392x4c96dbc1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7q), onMenuItemClickListener);
        }
        return true;
    }
}
