package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class zm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.an f281926d;

    public zm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.an anVar) {
        this.f281926d = anVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = this.f281926d.f280192f;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym.f281865u;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) ymVar.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        if (ymVar.f281871i || c19666xfd6e2f33.K0()) {
            ymVar.x0(ymVar.f281872m, 1, ymVar.w0(ymVar.f281869g));
            return;
        }
        if (ymVar.f281869g < 0) {
            ymVar.x0(ymVar.f281872m, 0, 0);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) ymVar.f280113d.f542241c.a(sb5.z.class))).mo75871xfb80e389(ymVar.f281869g + 1);
        if (!ymVar.y0(mo75871xfb80e389)) {
            ymVar.f281869g = -1;
            ymVar.x0(ymVar.f281872m, 0, 0);
            return;
        }
        ymVar.p0(mo75871xfb80e389, ymVar.f281869g + 1, false);
        int i17 = ymVar.f281869g;
        if (!ymVar.f281870h || i17 == -1) {
            return;
        }
        yb5.d dVar = ymVar.f280113d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
