package gr3;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f356393a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f356395c;

    /* renamed from: d, reason: collision with root package name */
    public int f356396d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356398f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356399g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356400h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f356401i;

    /* renamed from: b, reason: collision with root package name */
    public int f356394b = 1;

    /* renamed from: e, reason: collision with root package name */
    public gr3.j f356397e = gr3.j.f356413e;

    public final java.lang.String a() {
        if (this.f356401i == null) {
            this.f356401i = "session_id_" + java.lang.System.currentTimeMillis();
        }
        java.lang.String str = this.f356401i;
        return str == null ? "" : str;
    }

    public final void b() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("wxtype", java.lang.Integer.valueOf(this.f356394b));
        linkedHashMap.put("enter_50321_path", java.lang.Integer.valueOf(this.f356393a));
        java.lang.String str = this.f356395c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("wx_username", str);
        linkedHashMap.put("page_sessionid", a());
        linkedHashMap.put("referpath", java.lang.Integer.valueOf(this.f356396d));
        linkedHashMap.put("page_name", "PersonalPermissionSettingsPage");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50321, "page_in", linkedHashMap, 33629);
    }

    public final void c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("enter_50321_path", java.lang.Integer.valueOf(this.f356393a));
        linkedHashMap.put("wxtype", java.lang.Integer.valueOf(this.f356394b));
        boolean z17 = this.f356398f;
        boolean z18 = this.f356399g;
        boolean z19 = this.f356400h;
        linkedHashMap.put("level2permission", java.lang.Integer.valueOf((z17 ? gr3.i.f356406e : (!z18 || z19) ? (z18 || !z19) ? (z18 && z19) ? gr3.i.f356409h : gr3.i.f356410i : gr3.i.f356408g : gr3.i.f356407f).f356412d));
        linkedHashMap.put("level1permission", java.lang.Integer.valueOf((this.f356398f ? gr3.h.f356403f : gr3.h.f356402e).f356405d));
        linkedHashMap.put("modify_permission", java.lang.Integer.valueOf(this.f356397e.f356421d));
        java.lang.String str = this.f356395c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("wx_username", str);
        linkedHashMap.put("page_sessionid", a());
        linkedHashMap.put("page_name", "PersonalPermissionSettingsPage");
        linkedHashMap.put("referpath", java.lang.Integer.valueOf(this.f356396d));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50321, "50321_permission_change", linkedHashMap, 33629);
    }
}
