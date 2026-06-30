package l72;

/* loaded from: classes14.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f398393e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7, int i17) {
        this.f398393e = activityC13534x1dc4b4e7;
        this.f398392d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz2.c.h(this.f398392d);
        this.f398393e.finish();
    }
}
