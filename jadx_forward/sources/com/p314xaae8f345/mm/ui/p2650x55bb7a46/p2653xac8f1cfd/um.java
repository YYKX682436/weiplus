package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class um implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm f281625e;

    public um(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar, int i17) {
        this.f281625e = xmVar;
        this.f281624d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = this.f281625e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) xmVar.f280113d.f542241c.a(sb5.z.class));
        int i17 = this.f281624d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(i17);
        if (mo75871xfb80e389 != null) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) xmVar.f280113d.f542241c.a(sb5.k2.class))).o0(mo75871xfb80e389.m124847x74d37ac6())) {
                yb5.d dVar = xmVar.f280113d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TransformComponent$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/TransformComponent$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            xmVar.f281793o = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) xmVar.f280113d.f542241c.a(sb5.z.class))).P0(i17);
        }
    }
}
