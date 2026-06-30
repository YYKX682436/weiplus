package com.tencent.mm.plugin.crashfix.patch.killself;

/* loaded from: classes5.dex */
public class b implements vx1.f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f96670a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f96671b = {"com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.app.WorkerProfile$", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI"};

    @Override // vx1.f
    public boolean a(int i17) {
        return true;
    }

    @Override // vx1.f
    public boolean b() {
        com.tencent.mm.app.w.INSTANCE.a(new com.tencent.mm.plugin.crashfix.patch.killself.a(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KillSelfEvent>(a0Var) { // from class: com.tencent.mm.plugin.crashfix.patch.killself.KillSelfMonitor$2
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.KillSelfEvent killSelfEvent) {
                boolean z17 = false;
                if (killSelfEvent.f54453g.f6358a != 0) {
                    return false;
                }
                com.tencent.mm.plugin.crashfix.patch.killself.b bVar = com.tencent.mm.plugin.crashfix.patch.killself.b.this;
                if (bVar.f96670a) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1453L, 0L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1453L, 1L, 1L, false);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.KillSelfMonitor", "killSelf!" + bVar.f96670a);
                java.lang.String str = "";
                for (java.lang.StackTraceElement stackTraceElement : new java.lang.Exception().getStackTrace()) {
                    str = str + stackTraceElement.toString() + "\n";
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.KillSelfMonitor", "stack:" + str);
                java.lang.String[] strArr = bVar.f96671b;
                int length = strArr.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (str.contains(strArr[i17])) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if (!z17) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.RE, true)) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20683, bm5.f1.a(), str, java.lang.Integer.valueOf(bVar.f96670a ? 1 : -1));
                    }
                }
                return true;
            }
        }.alive();
        return true;
    }
}
