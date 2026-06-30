package k10;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k10.a f384697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384699g;

    public b(java.lang.String str, k10.a aVar, android.content.Context context, java.lang.String str2) {
        this.f384696d = str;
        this.f384697e = aVar;
        this.f384698f = context;
        this.f384699g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        k10.a aVar = this.f384697e;
        try {
            k10.d dVar = k10.d.f384703a;
            org.json.JSONObject b17 = k10.d.b(dVar, this.f384696d);
            java.lang.String optString = b17.optString("bizName", "");
            int optInt = b17.optInt("version", 0);
            org.json.JSONObject optJSONObject = b17.optJSONObject("ecsExt");
            if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
                str = "{}";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() == 0) {
                ((g10.u) aVar).a("/meta 返回的 bizName 为空");
                return;
            }
            com.p314xaae8f345.mm.vfs.r6 a17 = k10.d.a(dVar, this.f384698f, this.f384699g, optString);
            double d17 = 1024;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((com.p314xaae8f345.mm.vfs.w6.k(a17.o()) / d17) / d17)}, 1)), "format(...)");
            a17.o();
            ((g10.u) aVar).b(a17, optString, optInt, str);
        } catch (java.lang.Exception e17) {
            ((g10.u) aVar).a("Fast Debug 失败: " + e17.getMessage());
        }
    }
}
