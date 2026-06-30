package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable[] f77653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.os.Parcelable[] parcelableArr) {
        super(0);
        this.f77653d = parcelableArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (android.os.Parcelable parcelable : this.f77653d) {
            com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo consoleDebugLogImpl$LogInfo = parcelable instanceof com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo ? (com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo) parcelable : null;
            if (consoleDebugLogImpl$LogInfo != null) {
                java.lang.String msg = consoleDebugLogImpl$LogInfo.f77642e;
                int i17 = consoleDebugLogImpl$LogInfo.f77641d;
                if (i17 == 2) {
                    boolean z17 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
                        com.tencent.mm.plugin.appbrand.debugger.console.f0 a17 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.a();
                        a17.getClass();
                        a17.b("[V]" + msg + '\n', b3.l.getColor(a17.getContext(), com.tencent.mm.R.color.FG_2));
                    }
                } else if (i17 == 3) {
                    boolean z18 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
                        com.tencent.mm.plugin.appbrand.debugger.console.f0 a18 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.a();
                        a18.getClass();
                        a18.b("[D]" + msg + '\n', b3.l.getColor(a18.getContext(), com.tencent.mm.R.color.FG_0));
                    }
                } else if (i17 == 4) {
                    boolean z19 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
                        com.tencent.mm.plugin.appbrand.debugger.console.f0 a19 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.a();
                        a19.getClass();
                        a19.b("[I]" + msg + '\n', b3.l.getColor(a19.getContext(), com.tencent.mm.R.color.FG_0));
                    }
                } else if (i17 == 5) {
                    boolean z27 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
                        com.tencent.mm.plugin.appbrand.debugger.console.f0 a27 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.a();
                        a27.getClass();
                        a27.b("[W]" + msg + '\n', b3.l.getColor(a27.getContext(), com.tencent.mm.R.color.Orange_80_CARE));
                    }
                } else if (i17 == 6) {
                    boolean z28 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (com.tencent.mm.plugin.appbrand.debugger.console.r0.f77708a) {
                        com.tencent.mm.plugin.appbrand.debugger.console.f0 a28 = com.tencent.mm.plugin.appbrand.debugger.console.r0.f77710c.a();
                        a28.getClass();
                        a28.b("[E]" + msg + '\n', b3.l.getColor(a28.getContext(), com.tencent.mm.R.color.Red_80_CARE));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
