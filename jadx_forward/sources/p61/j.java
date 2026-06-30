package p61;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e f433826a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e) {
        this.f433826a = activityC11358x5a6f125e;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        if (!wi6.toLowerCase().startsWith("weixin://private/googlegetcode")) {
            return false;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.f154461s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433826a;
        activityC11358x5a6f125e.getClass();
        java.lang.String substring = wi6.substring(30);
        activityC11358x5a6f125e.X6();
        new p61.q(activityC11358x5a6f125e, substring).execute(new java.lang.Void[0]);
        return true;
    }
}
