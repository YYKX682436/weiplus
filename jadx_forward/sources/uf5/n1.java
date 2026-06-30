package uf5;

/* loaded from: classes10.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 f508809d;

    public n1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8) {
        this.f508809d = activityC22349xe6f834c8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508809d;
        if (activityC22349xe6f834c8.E == 16) {
            uf5.j1 j1Var = activityC22349xe6f834c8.R;
            java.lang.String stringExtra = activityC22349xe6f834c8.getIntent().getStringExtra("privacy_del_tips");
            uf5.m1 m1Var = new uf5.m1(this);
            android.content.Context context = j1Var.f508785a;
            db5.e1.B(context, stringExtra, "", context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571414ec), j1Var.f508785a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new uf5.g1(j1Var, m1Var), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
            return true;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.w7(activityC22349xe6f834c8);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC22349xe6f834c8.C.f508822r, ","));
        activityC22349xe6f834c8.setResult(-1, intent);
        activityC22349xe6f834c8.finish();
        return true;
    }
}
