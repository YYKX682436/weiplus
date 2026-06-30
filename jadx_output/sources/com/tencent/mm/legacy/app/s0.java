package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class s0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.legacy.app.WeChatSplashStartup f68522d;

    public s0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
        this.f68522d = weChatSplashStartup;
    }

    @Override // hm0.t
    public void b() {
        boolean z17;
        android.app.Application application = this.f68522d.f68486a;
        java.lang.String str = com.tencent.mm.legacy.app.g.f68496a;
        java.lang.String a17 = bm5.f1.a();
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.legacy.app.g.f68501f).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((com.tencent.mm.legacy.app.f) it.next()).b()) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AccidentallyQuitMonitor", "[!] Process [%s] is not targeted, skip rest logic.", a17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_AccidentiallyQuitMarks_");
        int indexOf = a17.indexOf(58);
        sb6.append(indexOf != -1 ? a17.substring(indexOf) : "");
        com.tencent.mm.legacy.app.g.f68496a = sb6.toString();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.legacy.app.e(application));
    }
}
