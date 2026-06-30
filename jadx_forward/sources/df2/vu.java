package df2;

/* loaded from: classes3.dex */
public final class vu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f313163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zu f313164e;

    public vu(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, df2.zu zuVar) {
        this.f313163d = c10850xc00cf614;
        this.f313164e = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustVideoLayoutToRemainingSize: animation end, scale=");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f313163d;
        sb6.append(c10850xc00cf614.getScaleX());
        sb6.append('x');
        sb6.append(c10850xc00cf614.getScaleY());
        sb6.append(", translationX=");
        sb6.append(c10850xc00cf614.getTranslationX());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", sb6.toString());
        this.f313164e.f313533m = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "adjustVideoLayoutToRemainingSize: set dim amount to 0f");
    }
}
