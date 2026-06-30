package dh4;

/* loaded from: classes11.dex */
public class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.t2 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.t2
    /* renamed from: cancel */
    public void mo43377xae7a2e7a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29.C18549xf106eed6.f253981a;
        android.app.PendingIntent b17 = jk.b.b(context, 107, new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29.C18549xf106eed6.class).putExtra("MMBoot_Bump", true), fp.g0.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965), true);
        if (b17 != null) {
            jk.b.a(context, 107, b17);
            b17.cancel();
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.t2
    /* renamed from: prepare */
    public void mo43378xed060d07() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29.C18549xf106eed6.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }
}
