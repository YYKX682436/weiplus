package d55;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f308087i;

    /* renamed from: a, reason: collision with root package name */
    public int f308088a;

    /* renamed from: b, reason: collision with root package name */
    public int f308089b;

    /* renamed from: c, reason: collision with root package name */
    public long f308090c;

    /* renamed from: d, reason: collision with root package name */
    public long f308091d;

    /* renamed from: e, reason: collision with root package name */
    public long f308092e;

    /* renamed from: f, reason: collision with root package name */
    public long f308093f;

    /* renamed from: g, reason: collision with root package name */
    public long f308094g;

    /* renamed from: h, reason: collision with root package name */
    public final d55.x f308095h;

    public a0(android.content.Context context) {
        d55.w wVar = new d55.w(context, "recovery_setting");
        this.f308095h = wVar;
        wVar.a();
        f308087i = wVar.mo123524x41a8a7f2("setting_debug_mode", false);
        this.f308088a = java.lang.Math.max(wVar.mo123525xb58848b9("setting_threshold_1", 3), 2);
        int max = java.lang.Math.max(wVar.mo123525xb58848b9("setting_threshold_2", 5), 3);
        this.f308089b = max;
        int i17 = this.f308088a;
        if (max < i17) {
            this.f308089b = i17;
        }
        this.f308090c = java.lang.Math.max(wVar.mo123526xfb822ef2("setting_crash_interval", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d), 5000L);
        this.f308091d = java.lang.Math.max(wVar.mo123526xfb822ef2("setting_crash_interval_sub", 30000L), 5000L);
        this.f308092e = java.lang.Math.max(wVar.mo123526xfb822ef2("setting_crash_minimal_interval", 1000L), 0L);
        this.f308093f = java.lang.Math.max(wVar.mo123526xfb822ef2("setting_reset_delay", 5000L), 1000L);
        this.f308094g = java.lang.Math.max(wVar.mo123526xfb822ef2("setting_app_exit_info_interval", 1800000L), 0L);
    }

    public void a() {
        d55.w wVar = (d55.w) this.f308095h;
        wVar.mo123528x1c849219("setting_debug_mode", f308087i);
        wVar.mo123529xc5c55e60("setting_threshold_1", this.f308088a);
        wVar.mo123529xc5c55e60("setting_threshold_2", this.f308089b);
        wVar.mo123530xf2e7ce2b("setting_crash_interval", this.f308090c);
        wVar.mo123530xf2e7ce2b("setting_crash_interval_sub", this.f308091d);
        wVar.mo123530xf2e7ce2b("setting_crash_minimal_interval", this.f308092e);
        wVar.mo123530xf2e7ce2b("setting_reset_delay", this.f308093f);
        wVar.mo123530xf2e7ce2b("setting_app_exit_info_interval", this.f308094g);
        wVar.c();
    }
}
