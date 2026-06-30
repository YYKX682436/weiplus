package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: j, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.game.preload.j f78223j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f78224a;

    /* renamed from: b, reason: collision with root package name */
    public int f78225b;

    /* renamed from: c, reason: collision with root package name */
    public int f78226c;

    /* renamed from: d, reason: collision with root package name */
    public int f78227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f78228e;

    /* renamed from: f, reason: collision with root package name */
    public int f78229f;

    /* renamed from: g, reason: collision with root package name */
    public int f78230g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78231h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f78232i;

    public static com.tencent.mm.plugin.appbrand.game.preload.j a() {
        if (f78223j == null) {
            synchronized (com.tencent.mm.plugin.appbrand.game.preload.j.class) {
                if (f78223j == null) {
                    f78223j = new com.tencent.mm.plugin.appbrand.game.preload.j();
                }
            }
        }
        return f78223j;
    }

    public void b(int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78228e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f78224a)) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct weAppPreDownloadStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct();
        weAppPreDownloadStruct.f62346d = weAppPreDownloadStruct.b("SessionId", this.f78228e, true);
        weAppPreDownloadStruct.f62347e = weAppPreDownloadStruct.b("AppId", this.f78224a, true);
        weAppPreDownloadStruct.f62348f = this.f78225b;
        int i19 = this.f78226c;
        cm.m mVar = null;
        weAppPreDownloadStruct.f62349g = i19 != 1 ? i19 != 2 ? i19 != 3 ? null : cm.l.test : cm.l.debug : cm.l.release;
        int i27 = this.f78227d;
        if (i27 != 0) {
            switch (i27) {
                case 1000:
                    mVar = cm.m.normal;
                    break;
                case 1001:
                    mVar = cm.m.plugin;
                    break;
                case 1002:
                    mVar = cm.m.wxstore;
                    break;
                case 1003:
                    mVar = cm.m.merchant;
                    break;
                case 1004:
                    mVar = cm.m.wagame;
                    break;
                case 1005:
                    mVar = cm.m.gift;
                    break;
            }
        } else {
            mVar = cm.m.undefined;
        }
        weAppPreDownloadStruct.f62350h = mVar;
        weAppPreDownloadStruct.f62351i = this.f78229f;
        weAppPreDownloadStruct.f62352j = i17;
        weAppPreDownloadStruct.f62353k = i18;
        weAppPreDownloadStruct.f62354l = this.f78231h ? 1L : 0L;
        weAppPreDownloadStruct.f62355m = this.f78230g;
        weAppPreDownloadStruct.f62356n = this.f78232i;
        weAppPreDownloadStruct.k();
    }
}
