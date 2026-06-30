package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes11.dex */
public final class e implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94217a;

    public e(int i17) {
        this.f94217a = i17;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish, status: ");
        java.lang.Object obj = null;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f359531a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", sb6.toString());
        if (str != null) {
            int i17 = this.f94217a;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h hVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94249a;
            synchronized (com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94254f) {
                z17 = false;
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94251c.remove(str)) {
                    int i18 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94252d;
                    if (i18 > 0) {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94252d = i18 - 1;
                    } else {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94252d = 0;
                    }
                    java.util.LinkedList linkedList = com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94253e;
                    if ((!linkedList.isEmpty()) && (obj = linkedList.pollLast()) != null) {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94252d++;
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleDownloadComplete: ");
                    sb7.append(str);
                    sb7.append(", currentRequestCount: ");
                    sb7.append(com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94252d);
                    sb7.append(", queueSize: ");
                    sb7.append(linkedList.size());
                    sb7.append(", nextUrl: ");
                    java.lang.String str2 = (java.lang.String) obj;
                    sb7.append(str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", sb7.toString());
                    if (str2 != null) {
                        pm0.v.X(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.f(str2, i17));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadMgr", "handleDownloadComplete: url not pending (maybe cleared): ".concat(str));
                }
            }
            if (bVar != null && bVar.f359531a == 0) {
                z17 = true;
            }
            if (z17) {
                if (i17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2110L, 2L, 1L, false);
                } else {
                    if (i17 != 2) {
                        return;
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2110L, 3L, 1L, false);
                }
            }
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
