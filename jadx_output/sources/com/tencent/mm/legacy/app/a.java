package com.tencent.mm.legacy.app;

/* loaded from: classes4.dex */
public class a implements com.tencent.mm.legacy.app.f {
    @Override // com.tencent.mm.legacy.app.f
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccidentallyQuitMonitor", "[+] Report [%s] process accidentally quit.", bm5.f1.a());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1182L, 0L, 1L, true);
    }

    @Override // com.tencent.mm.legacy.app.f
    public boolean b() {
        return com.tencent.mm.sdk.platformtools.x2.n();
    }
}
