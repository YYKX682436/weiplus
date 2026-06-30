package ty1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile ty1.a f504576c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f504577a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f504578b;

    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ty1.a.<init>():void");
    }

    public static ty1.a a() {
        if (f504576c == null) {
            synchronized (ty1.a.class) {
                if (f504576c == null) {
                    f504576c = new ty1.a();
                }
            }
        }
        return f504576c;
    }

    public final void b() {
        this.f504578b = new java.util.ArrayList();
        java.lang.String Zi = h62.d.vj().Zi(e42.d0.clicfg_data_report_filter_page_config, "sFinderMultiTaskRouterUI|ccom.tencent.mm.ui.LauncherUI|ccom.tencent.mm.ui.vas.VASCommonActivity|sAPMidasDistributeActivity|ccom.tencent.mm.ui.chatting.ChattingUI|sLiveEntranceFragment|sFinderLiveVisitorFragment|sWalletOfflineEntranceUI|sPermissionActivity|sGalleryEntryUI|sOccupyFinderUI2|sGameCenterUI|sAppBrandLaunchProxyUI|sAppBrandLauncherUI|sAlertActivity|sFinderHomeAnimUI|sEmptyActivity", true);
        if (u46.l.e(Zi)) {
            return;
        }
        for (java.lang.String str : Zi.split("\\|")) {
            if (!this.f504578b.contains(str)) {
                this.f504578b.add(str);
            }
        }
    }

    public boolean c(hz1.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f504578b == null) {
            b();
        }
        java.lang.String str = "s" + aVar.f367822c;
        java.lang.String str2 = "c" + aVar.f367823d;
        for (java.lang.String str3 : this.f504578b) {
            if (u46.l.c(str3, str) || u46.l.c(str3, str2)) {
                return true;
            }
        }
        return false;
    }
}
