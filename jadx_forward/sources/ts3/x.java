package ts3;

/* loaded from: classes.dex */
public class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 f503236d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152) {
        this.f503236d = activityC16956x7944e152;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.f503236d;
        y7Var.l(intent.putExtra("Contact_User", activityC16956x7944e152.f236596n).putExtra("reportSessionId", activityC16956x7944e152.f236595m), activityC16956x7944e152);
        return true;
    }
}
