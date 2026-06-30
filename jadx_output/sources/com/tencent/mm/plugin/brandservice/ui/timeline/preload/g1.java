package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "bundle", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class g1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.g1 f94244d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.g1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("openScene", 10000);
        java.lang.String string = bundle.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.eclipsesource.mmv8.Platform.UNKNOWN);
        kotlin.jvm.internal.o.d(string);
        is1.l lVar = is1.l.f294423a;
        synchronized (is1.l.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "checkTmpl logic start");
            if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "[checkTmpl] not check, because network is 2g");
                return;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getInt("preload_type", 1) == 3) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.w1.a("MicroMsg.Preload.TmplInfoManager", "use local file, ignore");
                return;
            }
            if (i17 == -1) {
                is1.l.f294428f.clear();
            }
            java.util.LinkedList h17 = is1.l.h(false);
            if (!h17.isEmpty()) {
                is1.l.a(h17, i17, string);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "checkTmpl getLocalTypeInfoList empty. expired time:" + com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().getLong("_check_time_colddown", is1.l.f294427e));
            }
        }
    }
}
