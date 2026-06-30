package hb5;

/* loaded from: classes11.dex */
public class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 f361800d;

    public y(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4) {
        this.f361800d = activityC21585x4f340ac4;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4 = this.f361800d;
        long j17 = activityC21585x4f340ac4.f279453i;
        activityC21585x4f340ac4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "deleteFromFav");
        s01.h z07 = r01.q3.Ui().z0(j17);
        int i18 = z07.f69167x6e664fd4 & (-9);
        z07.f69167x6e664fd4 = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "deleteFromFav:bitFlag %s", java.lang.Integer.valueOf(i18));
        r45.pj pjVar = new r45.pj();
        pjVar.f464618d = z07.f69169xf75e5c37;
        pjVar.f464623i = z07.f69167x6e664fd4;
        activityC21585x4f340ac4.f279457p = db5.e1.Q(activityC21585x4f340ac4, "", "", true, false, new hb5.r(activityC21585x4f340ac4, r01.q3.Ni().n(z07.f69170x75756b18, pjVar, activityC21585x4f340ac4)));
    }
}
