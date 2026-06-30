package vh;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final vh.t f518358a;

    /* renamed from: f, reason: collision with root package name */
    public vh.x f518363f;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f518360c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public int f518361d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f518362e = "";

    /* renamed from: b, reason: collision with root package name */
    public final int f518359b = 7;

    public y(vh.t tVar) {
        this.f518358a = tVar;
    }

    public vh.f a(int i17) {
        java.util.List list = this.f518358a.f518352d;
        for (int i18 = i17; i18 >= 0; i18--) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 < arrayList.size() && (arrayList.get(i18) instanceof vh.f)) {
                return (vh.f) arrayList.get(i18);
            }
        }
        return null;
    }

    public void b() {
        if (android.text.TextUtils.isEmpty(this.f518362e)) {
            oj.j.f("Matrix.battery.loader", "Call #reset first!", new java.lang.Object[0]);
        } else {
            ph.a.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class, new vh.u(this, this.f518361d));
        }
    }

    public vh.h c(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e abstractC4640xe4c2b89e) {
        java.lang.String str;
        if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90 c4644x40105a90 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90(abstractC4640xe4c2b89e);
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord procStatRecord = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord) abstractC4640xe4c2b89e;
            int i17 = procStatRecord.f134139f;
            if (i17 == 1) {
                str = "PROCESS_INIT";
            } else if (i17 != 2) {
                str = "PROCESS_ID_" + procStatRecord.f134139f;
            } else {
                str = "PROCESS_QUIT";
            }
            c4644x40105a90.f134161f = str + " (pid " + procStatRecord.f134140g + "）";
            return c4644x40105a90;
        }
        if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.AppStatRecord) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90 c4644x40105a902 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90(abstractC4640xe4c2b89e);
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.AppStatRecord appStatRecord = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.AppStatRecord) abstractC4640xe4c2b89e;
            int i18 = appStatRecord.f134134f;
            if (i18 == 1) {
                c4644x40105a902.f134161f = "App 切换到前台";
            } else if (i18 == 2) {
                c4644x40105a902.f134161f = "App 切换到后台";
            } else if (i18 == 3) {
                c4644x40105a902.f134161f = "App 切换到后台 (有前台服务)";
            } else if (i18 != 4) {
                c4644x40105a902.f134161f = "App 状态变化: " + appStatRecord.f134134f;
            } else {
                c4644x40105a902.f134161f = "App 切换到后台 (有浮窗)";
            }
            return c4644x40105a902;
        }
        if (!(abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.DevStatRecord)) {
            if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.SceneStatRecord) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211 c4645x401e7211 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211(abstractC4640xe4c2b89e);
                c4645x401e7211.f134162f = "UI: " + ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.SceneStatRecord) abstractC4640xe4c2b89e).f134153f;
                return c4645x401e7211;
            }
            if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord) {
                return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4643xdca56fd7((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord) abstractC4640xe4c2b89e);
            }
            if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord eventStatRecord = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord) abstractC4640xe4c2b89e;
                return "BATTERY_STAT".equals(eventStatRecord.f134137g) ? new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4642xcbf7010(eventStatRecord) : new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95(eventStatRecord);
            }
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211 c4645x401e72112 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211(abstractC4640xe4c2b89e);
            c4645x401e72112.f134162f = "Unknown: ".concat(abstractC4640xe4c2b89e.getClass().getName());
            return c4645x401e72112;
        }
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211 c4645x401e72113 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211(abstractC4640xe4c2b89e);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.DevStatRecord devStatRecord = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.DevStatRecord) abstractC4640xe4c2b89e;
        switch (devStatRecord.f134135f) {
            case 1:
                c4645x401e72113.f134162f = "CHARGE_ON";
                return c4645x401e72113;
            case 2:
                c4645x401e72113.f134162f = "CHARGE_OFF";
                return c4645x401e72113;
            case 3:
                c4645x401e72113.f134162f = "SCREEN_OFF";
                return c4645x401e72113;
            case 4:
                c4645x401e72113.f134162f = "待机模式(Standby) ON";
                return c4645x401e72113;
            case 5:
                c4645x401e72113.f134162f = "SCREEN_ON";
                return c4645x401e72113;
            case 6:
                c4645x401e72113.f134162f = "待机模式(Standby) OFF";
                return c4645x401e72113;
            case 7:
                c4645x401e72113.f134162f = "低电耗模式(Doze) ON";
                return c4645x401e72113;
            case 8:
                c4645x401e72113.f134162f = "低电耗模式(Doze) OFF";
                return c4645x401e72113;
            default:
                c4645x401e72113.f134162f = "设备状态变化: " + devStatRecord.f134135f;
                return c4645x401e72113;
        }
    }
}
