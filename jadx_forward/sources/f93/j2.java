package f93;

/* loaded from: classes11.dex */
public class j2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f341896d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f341896d = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341896d;
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224788v) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.c7();
            return true;
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.finish();
        return false;
    }
}
