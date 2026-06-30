package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class l implements ym0.j {
    public l(com.tencent.mm.plugin.appbrand.service.j jVar) {
    }

    @Override // ym0.j
    public void idKeyReport(int i17, int i18, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(i17, i18, i19);
    }

    @Override // ym0.j
    public void kvReport(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }
}
