package bt0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f105671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105673c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f105674d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f105675e;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f105671a = ai3.d.o(context) / 1024;
        this.f105672b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multi_record, true);
        this.f105673c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_record_ram_enable, 5000);
        java.lang.String blackModelList = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multi_record_model_black, "", true);
        this.f105674d = blackModelList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(blackModelList, "blackModelList");
        this.f105675e = r26.n0.e0(blackModelList, new char[]{';'}, false, 0, 6, null);
    }

    public final boolean a() {
        java.util.Iterator it = this.f105675e.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) it.next(), wo.w0.m())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DaemonChecker", "disable by blackModelList Build.MODEL:".concat(wo.w0.m()));
                return false;
            }
        }
        int i17 = this.f105673c;
        int i18 = this.f105671a;
        if (i18 >= i17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DaemonChecker", "disable by lower ram:" + i18 + "  config:" + i17);
        return false;
    }
}
