package t22;

@j95.b
/* loaded from: classes5.dex */
public final class v extends i95.w implements o22.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496643d = "MicroMsg.PluginEmojiCapture";

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f496643d, "onAccountInitialized: ");
        q25.b.b(new t22.m(), "//emojicapture");
        p05.p3 p3Var = p05.p3.f432172a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisModelMgr", "init: ");
        int n17 = p3Var.b().n("sdk_version");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        if (n17 == tq5.i.f502802a) {
            r45.v87 v87Var = p05.p3.f432174c;
            byte[] j17 = p3Var.b().j("local_info");
            if (j17 != null) {
                try {
                    v87Var.mo11468x92b714fd(j17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            r45.v87 v87Var2 = p05.p3.f432175d;
            byte[] j18 = p3Var.b().j("target_info");
            if (j18 != null) {
                try {
                    v87Var2.mo11468x92b714fd(j18);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                }
            }
        } else {
            p3Var.b().d();
        }
        p3Var.f();
        p3Var.e();
        pm0.v.V(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, p05.k3.f432106d);
        p05.v2.f432237d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p05.v2.f432238e, "init: deviceModel:" + wo.q.f529315c);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f496643d, "onAccountRelease: ");
        q25.b.c("//emojicapture");
    }
}
