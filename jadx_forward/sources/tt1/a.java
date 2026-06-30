package tt1;

/* loaded from: classes3.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 f503342d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875) {
        this.f503342d = abstractActivityC13036x7f885875;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f503342d.finish();
        return true;
    }
}
