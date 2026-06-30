package zw1;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 f558317d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85) {
        this.f558317d = activityC13141xbbc9be85;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85 = this.f558317d;
            ww1.g gVar = (ww1.g) activityC13141xbbc9be85.f177890d.getItemAtPosition(adapterContextMenuInfo.position);
            if (gVar != null) {
                java.lang.String str = gVar.f531720a;
                long j17 = gVar.f531722c;
                activityC13141xbbc9be85.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "do delete, billid: %s, timestamp: %s", str, java.lang.Long.valueOf(j17));
                ww1.w1 w1Var = new ww1.w1(str, activityC13141xbbc9be85.f177906w, j17);
                activityC13141xbbc9be85.f177904u = true;
                activityC13141xbbc9be85.m83096xe7b1ccf7(w1Var);
            }
        }
    }
}
