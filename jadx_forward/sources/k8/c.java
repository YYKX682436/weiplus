package k8;

/* loaded from: classes15.dex */
public class c implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f386386d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f386387e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f386388f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.OrientationEventListener f386389g;

    /* renamed from: h, reason: collision with root package name */
    public int f386390h = -1;

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f386386d == null) {
            result.mo65718x5c4d208("NO_ACTIVITY", "OrientationPlugin requires a foreground activity.", null);
            return;
        }
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        java.lang.Object obj = c28687x4bb242ff.f71609x86ac7956;
        if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
            java.util.List list = (java.util.List) obj;
            int i17 = 7942;
            for (int i18 = 0; i18 < list.size(); i18++) {
                if (list.get(i18).equals("SystemUiOverlay.top")) {
                    i17 &= -5;
                } else if (list.get(i18).equals("SystemUiOverlay.bottom")) {
                    i17 &= -3;
                }
            }
            this.f386386d.getWindow().getDecorView().setSystemUiVisibility(i17);
            result.mo65720x90b54003(null);
            return;
        }
        if (!str.equals("SystemChrome.setPreferredOrientations")) {
            if (!str.equals("SystemChrome.forceOrientation")) {
                result.mo65719xbc9fa82f();
                return;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (str2.equals("DeviceOrientation.portraitUp")) {
                this.f386386d.setRequestedOrientation(1);
            } else if (str2.equals("DeviceOrientation.portraitDown")) {
                this.f386386d.setRequestedOrientation(9);
            } else if (str2.equals("DeviceOrientation.landscapeLeft")) {
                this.f386386d.setRequestedOrientation(0);
            } else if (str2.equals("DeviceOrientation.landscapeRight")) {
                this.f386386d.setRequestedOrientation(8);
            } else {
                this.f386386d.setRequestedOrientation(-1);
            }
            result.mo65720x90b54003(null);
            return;
        }
        java.util.List list2 = (java.util.List) obj;
        int i19 = 0;
        for (int i27 = 0; i27 < list2.size(); i27++) {
            if (list2.get(i27).equals("DeviceOrientation.portraitUp")) {
                i19 |= 1;
            } else if (list2.get(i27).equals("DeviceOrientation.landscapeLeft")) {
                i19 |= 2;
            } else if (list2.get(i27).equals("DeviceOrientation.portraitDown")) {
                i19 |= 4;
            } else if (list2.get(i27).equals("DeviceOrientation.landscapeRight")) {
                i19 |= 8;
            }
        }
        switch (i19) {
            case 0:
                this.f386386d.setRequestedOrientation(-1);
                break;
            case 1:
                this.f386386d.setRequestedOrientation(1);
                break;
            case 2:
                this.f386386d.setRequestedOrientation(0);
                break;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                this.f386386d.setRequestedOrientation(13);
                break;
            case 4:
                this.f386386d.setRequestedOrientation(9);
                break;
            case 5:
                this.f386386d.setRequestedOrientation(12);
                break;
            case 8:
                this.f386386d.setRequestedOrientation(8);
                break;
            case 10:
                this.f386386d.setRequestedOrientation(11);
                break;
            case 11:
                this.f386386d.setRequestedOrientation(2);
                break;
            case 15:
                this.f386386d.setRequestedOrientation(13);
                break;
        }
        result.mo65720x90b54003(null);
    }
}
