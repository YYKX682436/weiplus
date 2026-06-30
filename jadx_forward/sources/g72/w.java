package g72;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f350781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g72.z f350782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 f350783f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614, android.graphics.Bitmap bitmap, g72.z zVar) {
        this.f350783f = activityC13521xbef6f614;
        this.f350781d = bitmap;
        this.f350782e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f350783f.f181604e, this.f350781d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new g72.v(this));
    }
}
