package df2;

/* loaded from: classes3.dex */
public final class yu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f313427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zu f313428e;

    public yu(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, df2.zu zuVar) {
        this.f313427d = c10850xc00cf614;
        this.f313428e = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetVideoLayout: animation end, scale=");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f313427d;
        sb6.append(c10850xc00cf614.getScaleX());
        sb6.append('x');
        sb6.append(c10850xc00cf614.getScaleY());
        sb6.append(", translationX=");
        sb6.append(c10850xc00cf614.getTranslationX());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", sb6.toString());
        df2.zu zuVar = this.f313428e;
        zuVar.f313533m = false;
        zuVar.f313534n = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: restore dim amount to 0.5f");
    }
}
