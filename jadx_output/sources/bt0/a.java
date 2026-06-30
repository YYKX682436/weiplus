package bt0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24138a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24139b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24140c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24141d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f24142e;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f24138a = ai3.d.o(context) / 1024;
        this.f24139b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multi_record, true);
        this.f24140c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_record_ram_enable, 5000);
        java.lang.String blackModelList = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multi_record_model_black, "", true);
        this.f24141d = blackModelList;
        kotlin.jvm.internal.o.f(blackModelList, "blackModelList");
        this.f24142e = r26.n0.e0(blackModelList, new char[]{';'}, false, 0, 6, null);
    }

    public final boolean a() {
        java.util.Iterator it = this.f24142e.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), wo.w0.m())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DaemonChecker", "disable by blackModelList Build.MODEL:".concat(wo.w0.m()));
                return false;
            }
        }
        int i17 = this.f24140c;
        int i18 = this.f24138a;
        if (i18 >= i17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DaemonChecker", "disable by lower ram:" + i18 + "  config:" + i17);
        return false;
    }
}
