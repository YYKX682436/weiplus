package ic3;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.i f371941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371942f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7, xj.i iVar, java.lang.String str) {
        this.f371940d = activityC16419x510d00b7;
        this.f371941e = iVar;
        this.f371942f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371940d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        wj.w0 w0Var = wj.w0.f528075e;
        xj.i iVar = this.f371941e;
        ((wj.j0) iVar).mj(this.f371942f, w0Var, null);
        new android.os.Handler(activityC16419x510d00b7.getMainLooper()).postDelayed(new ic3.j(activityC16419x510d00b7, iVar), 1000L);
    }
}
