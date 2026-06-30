package tt0;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f503329a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f503330b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f503331c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f503332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f503333e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f503334f;

    /* renamed from: g, reason: collision with root package name */
    public int f503335g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f503336h;

    /* renamed from: i, reason: collision with root package name */
    public int f503337i;

    /* renamed from: j, reason: collision with root package name */
    public int f503338j;

    /* renamed from: k, reason: collision with root package name */
    public int f503339k;

    public static tt0.d a(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        tt0.d dVar = new tt0.d();
        if (d17 == null) {
            return dVar;
        }
        dVar.f503330b = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.template");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.title");
        dVar.f503331c = str2;
        dVar.f503329a = dVar.f503330b.replace("$wxaapp_view$", str2);
        dVar.f503332d = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.appid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        dVar.f503333e = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.username");
        dVar.f503334f = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.path");
        dVar.f503335g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.type"), 0);
        dVar.f503336h = (java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key");
        dVar.f503337i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.forbids"), 0);
        dVar.f503338j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.wxaapp_type"), 1);
        dVar.f503339k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.subscribesysmsg.content_template.link_list.link.updatable_msg_type"), 0);
        return dVar;
    }
}
