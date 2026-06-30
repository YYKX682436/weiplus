package zw1;

/* loaded from: classes9.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 f558285d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85) {
        this.f558285d = activityC13141xbbc9be85;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < 0 || i17 >= adapterView.getAdapter().getCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(adapterView.getAdapter().getCount()));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85 activityC13141xbbc9be85 = this.f558285d;
        activityC13141xbbc9be85.f177900q.b(view, i17, j17, activityC13141xbbc9be85, activityC13141xbbc9be85.C);
        return true;
    }
}
