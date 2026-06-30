package ca4;

/* loaded from: classes4.dex */
public class l0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.d f39993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f39995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39996h;

    public l0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, ca4.d dVar, java.lang.String str4, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18) {
        this.f39989a = i17;
        this.f39990b = str;
        this.f39991c = str2;
        this.f39992d = str3;
        this.f39993e = dVar;
        this.f39994f = str4;
        this.f39995g = snsInfo;
        this.f39996h = i18;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        da4.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$5");
        java.lang.String str = this.f39992d;
        java.lang.String str2 = this.f39991c;
        java.lang.String str3 = this.f39990b;
        int i17 = this.f39989a;
        if (z17) {
            ca4.d dVar = this.f39993e;
            if (i17 != 2) {
                ca4.m0.B0(str3, str2, str, 2, "0");
                l44.z.c(dVar);
            }
            l44.z.f(dVar, 1);
            java.lang.String str4 = this.f39994f;
            java.lang.String str5 = this.f39990b;
            java.lang.String str6 = this.f39991c;
            java.lang.String str7 = this.f39992d;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f39995g;
            int i18 = dVar.f39863m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            try {
                iVar = new da4.i(str4, str5, str6, str7, snsInfo, true, i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.ApkWatcherInfo");
                iVar = null;
            }
            if (iVar != null) {
                if (this.f39996h == 4) {
                    iVar.f227797j = 2;
                }
                da4.h.i(iVar);
            }
        } else if (i17 != 2) {
            ca4.m0.B0(str3, str2, str, 2, "2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$5");
    }
}
