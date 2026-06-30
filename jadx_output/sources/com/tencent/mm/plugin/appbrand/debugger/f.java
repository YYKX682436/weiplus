package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1 f77740a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.a();
            com.tencent.mm.plugin.appbrand.report.quality.w1.b();
        }
    };
}
