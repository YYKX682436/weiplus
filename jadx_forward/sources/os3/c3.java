package os3;

/* loaded from: classes8.dex */
public class c3 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 f429587a;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056) {
        this.f429587a = activityC16939x74e056;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        if (!wi6.startsWith("weixin://private/getcontentwidth/")) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056.T6(this.f429587a, wi6);
        return true;
    }
}
