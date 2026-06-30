package t22;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f496616a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m5 f496617b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f496618c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f496619d;

    public e(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m5 onResult) {
        java.lang.String lensId;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        this.f496616a = context;
        this.f496617b = onResult;
        this.f496618c = "MicroMsg.CheckLensInfo";
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        boolean z17 = true;
        this.f496619d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, string, true, 0, new t22.d(this));
        int L = str != null ? r26.n0.L(str, "lensid=", 0, false, 6, null) : 0;
        if (str != null) {
            lensId = str.substring(L + 7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensId, "substring(...)");
        } else {
            lensId = null;
        }
        if (lensId != null && lensId.length() != 0) {
            z17 = false;
        }
        if (z17) {
            onResult.a(false);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        t22.c cVar = new t22.c(this, lensId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            new x85.f(abstractActivityC21394xb3d2c0cf, lensId, cVar);
        } else {
            new x85.i(abstractActivityC21394xb3d2c0cf, lensId, cVar);
        }
    }
}
