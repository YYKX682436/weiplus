package hb5;

/* loaded from: classes5.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 f361679d;

    public a(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 activityC21583x3a52b428) {
        this.f361679d = activityC21583x3a52b428;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21583x3a52b428 activityC21583x3a52b428 = this.f361679d;
        activityC21583x3a52b428.setResult(0);
        activityC21583x3a52b428.finish();
        return true;
    }
}
