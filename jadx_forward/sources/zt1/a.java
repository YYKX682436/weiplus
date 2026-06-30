package zt1;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f557086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f557087e;

    public a(zt1.b bVar, boolean z17, boolean z18) {
        this.f557086d = z17;
        this.f557087e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Long l17;
        if (this.f557086d && (l17 = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L)) != null && l17.longValue() == 0) {
            xt1.t0.mj().a();
        }
        if (this.f557087e && android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null))) {
            xt1.t0.wi().a(1);
        }
    }
}
