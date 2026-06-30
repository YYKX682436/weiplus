package p14;

/* loaded from: classes8.dex */
public class a implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17365x6ab01746 f432742a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17365x6ab01746 activityC17365x6ab01746) {
        this.f432742a = activityC17365x6ab01746;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17365x6ab01746 activityC17365x6ab01746 = this.f432742a;
        if (sVar == null) {
            activityC17365x6ab01746.finish();
            return;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(new android.content.Intent(), activityC17365x6ab01746);
            activityC17365x6ab01746.finish();
            return;
        }
        java.lang.String dataString = activityC17365x6ab01746.getIntent().getDataString();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.ActivityC17365x6ab01746.f241623g;
        activityC17365x6ab01746.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dataString)) {
            return;
        }
        if (dataString.startsWith("weixin://qr/")) {
            str = dataString.substring(12) + "@qr";
        } else {
            java.lang.String str2 = jd0.y1.f380663b;
            if (dataString.startsWith(str2)) {
                str = dataString.substring(str2.length()) + "@qr";
            } else {
                java.lang.String str3 = jd0.y1.f380662a;
                if (dataString.startsWith(str3)) {
                    str = dataString.substring(str3.length()) + "@qr";
                } else {
                    str = "";
                }
            }
        }
        gm0.j1.d().a(106, activityC17365x6ab01746);
        activityC17365x6ab01746.f241625f = new tg3.r1(str, 5);
        gm0.j1.d().g(activityC17365x6ab01746.f241625f);
    }
}
