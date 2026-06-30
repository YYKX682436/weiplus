package hr3;

/* loaded from: classes.dex */
public class wb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 f365686d;

    public wb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5) {
        this.f365686d = activityC16863xc0e4ffb5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5 = this.f365686d;
        activityC16863xc0e4ffb5.mo48674x36654fab();
        activityC16863xc0e4ffb5.setResult(-1, new android.content.Intent());
        activityC16863xc0e4ffb5.finish();
        return true;
    }
}
