package so2;

/* loaded from: classes10.dex */
public final class z4 {

    /* renamed from: k, reason: collision with root package name */
    public static final so2.x4 f492265k = new so2.x4(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f492266a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f492267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f492268c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f492269d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f492270e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.a5 f492271f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f492272g;

    /* renamed from: h, reason: collision with root package name */
    public final int f492273h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f492274i;

    /* renamed from: j, reason: collision with root package name */
    public final so2.i5 f492275j;

    public z4(java.lang.String title, java.lang.String productID, int i17, java.lang.String appID, java.lang.String pagePath, so2.a5 source, java.lang.String str, int i18, java.lang.String extInfo, so2.i5 i5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productID, "productID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f492266a = title;
        this.f492267b = productID;
        this.f492268c = i17;
        this.f492269d = appID;
        this.f492270e = pagePath;
        this.f492271f = source;
        this.f492272g = str;
        this.f492273h = i18;
        this.f492274i = extInfo;
        this.f492275j = i5Var;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 a() {
        cl0.g gVar = new cl0.g();
        java.lang.String str = this.f492267b;
        gVar.h("product_id", str);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        c19786x6a1e2862.m76550x2592a27b(1);
        int i17 = this.f492273h;
        if (i17 == 0) {
            i17 = 1;
        }
        c19786x6a1e2862.m76527x75c48317(i17);
        c19786x6a1e2862.m76525x56897a5b(1);
        java.lang.String str2 = this.f492272g;
        if (str2 == null || str2.length() == 0) {
            cu2.f0 f0Var = cu2.f0.f303924a;
            r45.am2 am2Var = (r45.am2) cu2.f0.f303930g.m75936x14adae67(3);
            str2 = am2Var != null ? am2Var.m75945x2fec8307(1) : null;
        }
        c19786x6a1e2862.m76544x4a9beb2b(str2);
        c19786x6a1e2862.m76570xc2385d6(this.f492266a);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 c19800x7f8d35f8 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8();
        c19800x7f8d35f8.m77198x4310efb(this.f492269d);
        c19800x7f8d35f8.m77212x764e93a7(this.f492270e);
        c19800x7f8d35f8.m77201x8dda1c85(str);
        c19786x6a1e2862.m76552x7d3cf1b2(c19800x7f8d35f8);
        c19786x6a1e2862.m76536x9b35e8e(gVar.toString());
        byte[] bytes = this.f492274i.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        c19786x6a1e2862.m76535x9b04a33(com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes));
        c19786x6a1e2862.m76567x22dcbf1d(1);
        if (so2.y4.f492258a[this.f492271f.ordinal()] == 1) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            r45.wf6 wf6Var = new r45.wf6();
            wf6Var.set(1, 1);
            wf6Var.set(2, 0);
            wf6Var.set(0, 1);
            m76521x7528c3fb.add(wf6Var);
            java.util.LinkedList<r45.wf6> m76521x7528c3fb2 = c19786x6a1e2862.m76521x7528c3fb();
            r45.wf6 wf6Var2 = new r45.wf6();
            wf6Var2.set(1, 6);
            wf6Var2.set(2, 2);
            wf6Var2.set(0, 1);
            m76521x7528c3fb2.add(wf6Var2);
        }
        return c19786x6a1e2862;
    }

    /* renamed from: equals */
    public boolean m164969xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.z4)) {
            return false;
        }
        so2.z4 z4Var = (so2.z4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492266a, z4Var.f492266a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492267b, z4Var.f492267b) && this.f492268c == z4Var.f492268c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492269d, z4Var.f492269d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492270e, z4Var.f492270e) && this.f492271f == z4Var.f492271f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492272g, z4Var.f492272g) && this.f492273h == z4Var.f492273h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492274i, z4Var.f492274i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492275j, z4Var.f492275j);
    }

    /* renamed from: hashCode */
    public int m164970x8cdac1b() {
        int hashCode = ((((((((((this.f492266a.hashCode() * 31) + this.f492267b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492268c)) * 31) + this.f492269d.hashCode()) * 31) + this.f492270e.hashCode()) * 31) + this.f492271f.hashCode()) * 31;
        java.lang.String str = this.f492272g;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f492273h)) * 31) + this.f492274i.hashCode()) * 31;
        so2.i5 i5Var = this.f492275j;
        return hashCode2 + (i5Var != null ? i5Var.m164901x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164971x9616526c() {
        return "FinderSelectProductInfo(title=" + this.f492266a + ", productID=" + this.f492267b + ", activityType=" + this.f492268c + ", appID=" + this.f492269d + ", pagePath=" + this.f492270e + ", source=" + this.f492271f + ", iconUrl=" + this.f492272g + ", busienssType=" + this.f492273h + ", extInfo=" + this.f492274i + ", previewIcon=" + this.f492275j + ')';
    }
}
