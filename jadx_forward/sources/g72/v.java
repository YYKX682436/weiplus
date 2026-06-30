package g72;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g72.w f350780d;

    public v(g72.w wVar) {
        this.f350780d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g72.z zVar = this.f350780d.f350782e;
        if (zVar != null) {
            g72.x xVar = (g72.x) zVar;
            xVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "set result and return to FaceDetectPrepareUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = xVar.f350784a;
            activityC13521xbef6f614.f181619w = true;
            activityC13521xbef6f614.T6(0, 0, "collect data ok", null);
        }
    }
}
