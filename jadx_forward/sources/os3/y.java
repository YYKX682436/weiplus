package os3;

/* loaded from: classes8.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429785d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86) {
        this.f429785d = activityC16931x24037f86;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429785d;
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.T6(activityC16931x24037f86, false) && activityC16931x24037f86.M == 20) || activityC16931x24037f86.M == 21) {
            db5.e1.A(activityC16931x24037f86.mo55332x76847179(), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574248hk4), "", activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hk6), activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new os3.x(this), null);
            return true;
        }
        activityC16931x24037f86.setResult(0);
        activityC16931x24037f86.finish();
        return true;
    }
}
