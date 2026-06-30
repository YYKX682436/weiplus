package r02;

/* loaded from: classes8.dex */
public class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449842d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449842d = activityC13242xdf6880d5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5.f178904s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449842d;
        if ((activityC13242xdf6880d5.f178913o == 2) && (m0Var = activityC13242xdf6880d5.f178916r) != null && m0Var.m0(1)) {
            activityC13242xdf6880d5.T6();
            return true;
        }
        activityC13242xdf6880d5.finish();
        return true;
    }
}
