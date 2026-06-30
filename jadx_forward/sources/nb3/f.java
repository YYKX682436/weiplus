package nb3;

/* loaded from: classes9.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d f417582d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d) {
        this.f417582d = activityC16324x5371571d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d = this.f417582d;
        android.content.Intent intent = activityC16324x5371571d.f226549m;
        if (intent != null) {
            activityC16324x5371571d.setResult(0, intent);
        } else {
            activityC16324x5371571d.setResult(-1, null);
        }
        activityC16324x5371571d.finish();
        return true;
    }
}
