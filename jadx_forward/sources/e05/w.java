package e05;

/* loaded from: classes9.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa f327727d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa activityC19558xb1674ffa) {
        this.f327727d = activityC19558xb1674ffa;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa activityC19558xb1674ffa = this.f327727d;
        activityC19558xb1674ffa.setResult(-1);
        activityC19558xb1674ffa.finish();
        return true;
    }
}
