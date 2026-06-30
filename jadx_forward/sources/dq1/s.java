package dq1;

/* loaded from: classes8.dex */
public final class s implements ab0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f323889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dq1.t f323890b;

    public s(java.lang.ref.WeakReference weakReference, dq1.t tVar) {
        this.f323889a = weakReference;
        this.f323890b = tVar;
    }

    @Override // ab0.f0
    /* renamed from: onResult */
    public final void mo952x57429edc(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        java.lang.ref.WeakReference weakReference = this.f323889a;
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) weakReference.get();
        if (activityC12955x181c0197 != null && (u3Var = activityC12955x181c0197.f175410h) != null) {
            u3Var.dismiss();
        }
        if (z17) {
            this.f323890b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeWWProfile", "jumpToProfile success!");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c01972 = (com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197) weakReference.get();
            if (activityC12955x181c01972 != null) {
                activityC12955x181c01972.Z6();
            }
        }
    }
}
