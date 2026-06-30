package or1;

/* loaded from: classes.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 f429129d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 activityC12977xe43db9b8) {
        this.f429129d = activityC12977xe43db9b8;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f429129d.f175529f == 1 ? 186 : 6;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsType", 33554499);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, false, 33554499);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.lang.String f17 = su4.r2.f(i17);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        hashMap.put("subSessionId", f17);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        a17.putExtra("key_preload_biz", 4);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        j45.l.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, a17, null);
        su4.k2.a(i17, f17, f17, false, "", 33554499, "", false, "");
    }
}
