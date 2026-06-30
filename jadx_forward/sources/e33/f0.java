package e33;

/* loaded from: classes10.dex */
public class f0 implements e33.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328750a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328750a = activityC15653x403456cd;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328750a;
        if (z17) {
            if (activityC15653x403456cd.f220060l2) {
                activityC15653x403456cd.m78584xbdfaa6d9(false);
                return;
            }
            return;
        }
        if (activityC15653x403456cd.f220060l2 && !activityC15653x403456cd.f220073r.m63713xfd841089().equalsIgnoreCase(activityC15653x403456cd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fih))) {
            activityC15653x403456cd.m78584xbdfaa6d9(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = activityC15653x403456cd.f220047d2;
        if (c15630x7d8d0183 != null) {
            if (activityC15653x403456cd.G7(c15630x7d8d0183).booleanValue()) {
                activityC15653x403456cd.m78547xfde6309c();
            } else {
                activityC15653x403456cd.S7(activityC15653x403456cd.f220047d2);
            }
        }
    }
}
