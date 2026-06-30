package rz1;

/* loaded from: classes.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI f483329d;

    public z(com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI viewLayoutSampleUI) {
        this.f483329d = viewLayoutSampleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f483329d.finish();
        return true;
    }
}
