package km4;

/* loaded from: classes11.dex */
public final class i implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390822c;

    public i(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f390820a = lVar;
        this.f390821b = c0Var;
        this.f390822c = h0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f390822c;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f390821b;
        yz5.l lVar = this.f390820a;
        try {
            boolean optBoolean = new org.json.JSONObject(str).optBoolean("isEnded");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAdHelper", "openAD result = " + str + ", isEnded = " + optBoolean);
            if (optBoolean) {
                km4.l.f390829a.a(3, null);
                km4.l.c(lVar, c0Var, h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44769xf1927de);
            } else {
                km4.l.f390829a.a(4, null);
                km4.l.c(lVar, c0Var, h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44767x3b32b10);
            }
        } catch (java.lang.Exception e17) {
            km4.l.f390829a.a(11, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingAdHelper", e17, "parse back value failed", new java.lang.Object[0]);
            km4.l.c(lVar, c0Var, h0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
        }
    }
}
