package sk4;

/* loaded from: classes.dex */
public final class n implements com.p314xaae8f345.mm.ui.yc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f490519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490520b;

    public n(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, sk4.p pVar) {
        this.f490519a = activityC21401x6ce6f73f;
        this.f490520b = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.yc
    public void a(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 == 80) {
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f490519a;
            activityC21401x6ce6f73f.m78769xd0f357ed(this);
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            this.f490520b.getClass();
            pm0.v.X(new sk4.j(activityC21401x6ce6f73f));
        }
    }
}
