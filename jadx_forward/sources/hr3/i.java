package hr3;

/* loaded from: classes11.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365175d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f) {
        this.f365175d = activityC16833xebe5488f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f = this.f365175d;
        activityC16833xebe5488f.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", activityC16833xebe5488f.f235179y);
        activityC16833xebe5488f.setResult(-1, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.U6(activityC16833xebe5488f, true);
        activityC16833xebe5488f.mo48674x36654fab();
        return false;
    }
}
