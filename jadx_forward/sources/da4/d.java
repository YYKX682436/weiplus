package da4;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f309307a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f309308b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309309c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f309310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f309311e;

    /* renamed from: f, reason: collision with root package name */
    public int f309312f;

    /* renamed from: toString */
    public java.lang.String m123801x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[");
            sb6.append("brand=");
            sb6.append(this.f309309c);
            sb6.append(", appPkg=");
            sb6.append(this.f309310d);
            sb6.append(", name=");
            sb6.append(this.f309311e);
            sb6.append(", priority=");
            sb6.append(this.f309312f);
            java.util.List list = this.f309308b;
            if (list != null && list.size() > 0) {
                sb6.append(", pkgs=");
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb6.append((java.lang.String) it.next());
                    sb6.append("|");
                }
            }
            java.util.List list2 = this.f309307a;
            if (list2 != null && list2.size() > 0) {
                sb6.append(", urls=");
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    sb6.append((java.lang.String) it6.next());
                    sb6.append("|");
                }
            }
            sb6.append("]");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return sb7;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAppMarketTagNode", "toString exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return "";
        }
    }
}
