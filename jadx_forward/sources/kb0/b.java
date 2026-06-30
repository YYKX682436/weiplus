package kb0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f387720a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f387721b;

    /* renamed from: c, reason: collision with root package name */
    public int f387722c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f387723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f387724e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f387725f;

    public b(java.util.HashMap commonReportMap, java.util.Map itemMap, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        int i17;
        xj.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonReportMap, "commonReportMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemMap, "itemMap");
        this.f387720a = commonReportMap;
        this.f387721b = itemMap;
        this.f387723d = new java.util.LinkedHashSet();
        this.f387725f = new kb0.a(this);
        java.lang.Boolean valueOf = (wVar == null || (mVar = wVar.f272555o) == null) ? null : java.lang.Boolean.valueOf(mVar.f536293h);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            i17 = 2;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.FALSE)) {
            i17 = 1;
        } else {
            if (valueOf != null) {
                throw new jz5.j();
            }
            i17 = 0;
        }
        commonReportMap.put("yuanbao_user_state", java.lang.Integer.valueOf(i17));
    }

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar, int i17, java.lang.String str) {
        boolean z17 = wVar.f272551h;
        java.util.HashMap hashMap = this.f387720a;
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_open_another_app", str, hashMap, 35480);
            return;
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("recent_app_index", java.lang.Integer.valueOf(i17)), new jz5.l("recent_app_name", wVar.a()));
        i18.putAll(hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_share_sheet_recent_apps", str, i18, 35480);
    }
}
