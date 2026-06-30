package k13;

/* loaded from: classes5.dex */
public final class i implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 f384754a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 activityC15560xcaaa67b0) {
        this.f384754a = activityC15560xcaaa67b0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        k13.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.f218862f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0 activityC15560xcaaa67b0 = this.f384754a;
        if (hVar != null) {
            m13.a aVar = (m13.a) hVar;
            boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(aVar.f404394b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission cancel, ok:" + Ui);
            if (activityC15560xcaaa67b0 != null) {
                activityC15560xcaaa67b0.finish();
            }
            aVar.f404393a.a(Ui);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.f218862f = null;
        activityC15560xcaaa67b0.finish();
    }
}
