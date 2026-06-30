package za3;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f552579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f552580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f552581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.ActivityC16287xcd305790 f552582g;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.ActivityC16287xcd305790 activityC16287xcd305790, android.content.Intent intent, double d17, double d18) {
        this.f552582g = activityC16287xcd305790;
        this.f552579d = intent;
        this.f552580e = d17;
        this.f552581f = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.ActivityC16287xcd305790 activityC16287xcd305790 = this.f552582g;
        android.content.Intent intent = this.f552579d;
        double d17 = this.f552580e;
        double d18 = this.f552581f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.ActivityC16287xcd305790.f226182o;
        activityC16287xcd305790.K6(intent, d17, d18);
    }
}
