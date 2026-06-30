package k13;

/* loaded from: classes8.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384724d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6) {
        this.f384724d = activityC15562xa7b84ac6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384724d;
        activityC15562xa7b84ac6.f218873i.clear();
        activityC15562xa7b84ac6.f218873i.addAll(((h13.l0) i95.n0.c(h13.l0.class)).Bi());
        activityC15562xa7b84ac6.runOnUiThread(new k13.z(activityC15562xa7b84ac6));
    }
}
