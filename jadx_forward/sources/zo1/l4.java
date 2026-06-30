package zo1;

/* loaded from: classes5.dex */
public final class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f556219e;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, android.content.Intent intent) {
        this.f556218d = activityC12873xf94c39e;
        this.f556219e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f556218d.startActivityForResult(this.f556219e, 122);
    }
}
