package hr3;

/* loaded from: classes11.dex */
public class m1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365320d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f365320d = activityC16840x4302a3e2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365320d;
        gr3.e.c(activityC16840x4302a3e2.f235194n.d1(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, activityC16840x4302a3e2.f235206z, activityC16840x4302a3e2.getIntent(), 0, activityC16840x4302a3e2.f235192i);
        t25.a aVar = activityC16840x4302a3e2.f235188e;
        if ((aVar instanceof t25.b) && ((t25.b) aVar).mo67617x4ceae47d()) {
            return true;
        }
        activityC16840x4302a3e2.finish();
        return true;
    }
}
