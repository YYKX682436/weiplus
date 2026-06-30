package fs3;

/* loaded from: classes15.dex */
public class c implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347833a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        this.f347833a = activityC16925x87b5f55d;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public void mo14305x341c20(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347833a;
        if (!booleanValue) {
            activityC16925x87b5f55d.finish();
            return;
        }
        i11.e eVar = activityC16925x87b5f55d.f236285d;
        if (eVar != null) {
            ((i11.h) eVar).k(activityC16925x87b5f55d.f236295p0, true);
        }
    }
}
