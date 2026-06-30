package eo3;

/* loaded from: classes8.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16747x5b999322 f337122d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16747x5b999322 activityC16747x5b999322) {
        this.f337122d = activityC16747x5b999322;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16747x5b999322 activityC16747x5b999322 = this.f337122d;
        if (activityC16747x5b999322.B3) {
            activityC16747x5b999322.o9();
            return true;
        }
        activityC16747x5b999322.finish();
        return true;
    }
}
