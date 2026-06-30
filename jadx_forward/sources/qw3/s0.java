package qw3;

/* loaded from: classes9.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448735e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7, int i17) {
        this.f448735e = activityC17105xa1fb9be7;
        this.f448734d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f448735e.f238051i.scrollBy(0, this.f448734d);
    }
}
