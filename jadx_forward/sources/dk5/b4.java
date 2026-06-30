package dk5;

/* loaded from: classes9.dex */
public class b4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316061d;

    public b4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316061d = activityC22571x51759e93;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316061d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.w7(activityC22571x51759e93, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeWxwork);
        } else {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.w7(activityC22571x51759e93, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType.WwAppTypeLocal);
        }
    }
}
