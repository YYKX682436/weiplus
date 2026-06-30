package g72;

/* loaded from: classes14.dex */
public class t implements i72.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 f350778a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614) {
        this.f350778a = activityC13521xbef6f614;
    }

    @Override // i72.z
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onPreviewInitDone: %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = this.f350778a;
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614.f181602z;
            activityC13521xbef6f614.getClass();
            if (h72.s.e().f361007h) {
                h72.s.e().g(activityC13521xbef6f614.f181613q.m55277xa3f60eb9(), activityC13521xbef6f614.f181613q.m55275x924c04df(), activityC13521xbef6f614.f181613q.m55276x7da6b8b4(), false, 0, activityC13521xbef6f614.f181613q.m55274x71a61e67(), activityC13521xbef6f614.f181613q.m55276x7da6b8b4(), true, false);
            }
            activityC13521xbef6f614.f181613q.d(false, activityC13521xbef6f614.f181604e);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new g72.u(activityC13521xbef6f614), 500L);
            return;
        }
        if (i17 == 1) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614.f181602z;
            activityC13521xbef6f614.U6(4, 90016, "preview error", activityC13521xbef6f614.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jio));
        } else if (i17 == 2) {
            java.lang.String string = activityC13521xbef6f614.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614.f181602z;
            activityC13521xbef6f614.U6(4, 90008, "camera permission not granted", string);
        }
    }
}
