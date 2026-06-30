package z63;

/* loaded from: classes5.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551974d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551974d = activityC16081x2d23fdab;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551974d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "send group solitaire(sending:%s)", java.lang.Boolean.valueOf(activityC16081x2d23fdab.N));
        if (activityC16081x2d23fdab.N) {
            return true;
        }
        java.lang.String str = activityC16081x2d23fdab.D;
        java.lang.String r17 = c01.z1.r();
        y63.a aVar = activityC16081x2d23fdab.B;
        kk.j jVar = x63.g.f533768a;
        x63.g.f(str, r17, aVar, c01.id.e(), true);
        if (activityC16081x2d23fdab.B.P) {
            db5.e1.A(activityC16081x2d23fdab.mo55332x76847179(), activityC16081x2d23fdab.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsv), "", activityC16081x2d23fdab.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsu), activityC16081x2d23fdab.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fst), new z63.q0(this), new z63.r0(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.V6(activityC16081x2d23fdab);
        }
        return true;
    }
}
