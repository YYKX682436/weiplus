package e33;

/* loaded from: classes10.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328848d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328848d = activityC15653x403456cd;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "backBtn");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328848d;
        activityC15653x403456cd.J7();
        activityC15653x403456cd.T7(-2, activityC15653x403456cd.getIntent().putExtra("send_raw_img", activityC15653x403456cd.D));
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = activityC15653x403456cd.f220073r;
        if (c15655x4db85b14 == null || !c15655x4db85b14.f220098m) {
            activityC15653x403456cd.getClass();
            activityC15653x403456cd.finish();
            return true;
        }
        c15655x4db85b14.d();
        activityC15653x403456cd.m78547xfde6309c();
        return true;
    }
}
