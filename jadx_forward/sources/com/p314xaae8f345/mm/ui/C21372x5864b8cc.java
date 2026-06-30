package com.p314xaae8f345.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.GlobalAlertMgr$1 */
/* loaded from: classes11.dex */
public class C21372x5864b8cc extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5629x57faa6c1> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f278269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21372x5864b8cc(com.p314xaae8f345.mm.ui.o7 o7Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f278269d = o7Var;
        this.f39173x3fe91575 = 1638723793;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5629x57faa6c1 c5629x57faa6c1) {
        am.zg zgVar;
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5629x57faa6c1 c5629x57faa6c12 = c5629x57faa6c1;
        if (c5629x57faa6c12 == null || (zgVar = c5629x57faa6c12.f135957g) == null || zgVar.f90094a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event is illegal event[%s]", c5629x57faa6c12);
        } else {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus activityStatus = ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) this.f278269d.f290984b).f278290p;
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus activityStatus2 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_RESUME;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event launcherUI isResumeStatus[%b], tid[%d]", java.lang.Boolean.valueOf(activityStatus == activityStatus2), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.mm.ui.o7 o7Var = this.f278269d;
            if (((com.p314xaae8f345.mm.ui.C21374x812c2fd3) o7Var.f290984b).f278290p == activityStatus2) {
                o7Var.f290985c = null;
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.GlobalAlertMgr$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.C21372x5864b8cc c21372x5864b8cc = com.p314xaae8f345.mm.ui.C21372x5864b8cc.this;
                        c21372x5864b8cc.getClass();
                        c21372x5864b8cc.f278269d.f(c5629x57faa6c12.f135957g);
                    }
                });
            } else {
                o7Var.f290985c = c5629x57faa6c12.f135957g;
            }
        }
        return false;
    }
}
