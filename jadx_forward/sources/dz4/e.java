package dz4;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f326741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f326742b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f326743c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f326744d;

    /* renamed from: e, reason: collision with root package name */
    public final double f326745e;

    /* renamed from: f, reason: collision with root package name */
    public final double f326746f;

    /* renamed from: g, reason: collision with root package name */
    public final double f326747g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f326748h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f326749i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f326750j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f326751k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f326752l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f326753m;

    /* renamed from: n, reason: collision with root package name */
    public final float f326754n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f326755o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f326756p;

    public e(int i17, int i18, java.lang.String str, java.lang.String str2, double d17, double d18, double d19, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7, float f17, java.lang.String str8, java.lang.String str9, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i27 = (i19 & 1) != 0 ? 0 : i17;
        int i28 = (i19 & 2) != 0 ? 0 : i18;
        java.lang.String poiName = (i19 & 4) != 0 ? "" : str;
        java.lang.String locationThumbTaskName = (i19 & 8) != 0 ? "" : str2;
        double d27 = (i19 & 16) != 0 ? 0.0d : d17;
        double d28 = (i19 & 32) != 0 ? 0.0d : d18;
        double d29 = (i19 & 64) == 0 ? d19 : 0.0d;
        java.lang.String address = (i19 & 128) != 0 ? "" : str3;
        java.lang.String poiid = (i19 & 256) != 0 ? "" : str4;
        boolean z18 = (i19 & 512) != 0 ? false : z17;
        java.lang.String poiCategoryTips = (i19 & 1024) != 0 ? "" : str5;
        boolean z19 = z18;
        java.lang.String poiBusinessHour = (i19 & 2048) != 0 ? "" : str6;
        double d37 = d29;
        java.lang.String poiPhone = (i19 & 4096) != 0 ? "" : str7;
        float f18 = (i19 & 8192) != 0 ? 0.0f : f17;
        java.lang.String buildingID = (i19 & 16384) != 0 ? "" : str8;
        java.lang.String floorName = (i19 & 32768) != 0 ? "" : str9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiName, "poiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationThumbTaskName, "locationThumbTaskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(address, "address");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiid, "poiid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiCategoryTips, "poiCategoryTips");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiBusinessHour, "poiBusinessHour");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiPhone, "poiPhone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildingID, "buildingID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floorName, "floorName");
        this.f326741a = i27;
        this.f326742b = i28;
        this.f326743c = poiName;
        this.f326744d = locationThumbTaskName;
        this.f326745e = d27;
        this.f326746f = d28;
        this.f326747g = d37;
        this.f326748h = address;
        this.f326749i = poiid;
        this.f326750j = z19;
        this.f326751k = poiCategoryTips;
        this.f326752l = poiBusinessHour;
        this.f326753m = poiPhone;
        this.f326754n = f18;
        this.f326755o = buildingID;
        this.f326756p = floorName;
    }

    /* renamed from: equals */
    public boolean m126489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.e)) {
            return false;
        }
        dz4.e eVar = (dz4.e) obj;
        return this.f326741a == eVar.f326741a && this.f326742b == eVar.f326742b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326743c, eVar.f326743c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326744d, eVar.f326744d) && java.lang.Double.compare(this.f326745e, eVar.f326745e) == 0 && java.lang.Double.compare(this.f326746f, eVar.f326746f) == 0 && java.lang.Double.compare(this.f326747g, eVar.f326747g) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326748h, eVar.f326748h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326749i, eVar.f326749i) && this.f326750j == eVar.f326750j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326751k, eVar.f326751k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326752l, eVar.f326752l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326753m, eVar.f326753m) && java.lang.Float.compare(this.f326754n, eVar.f326754n) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326755o, eVar.f326755o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326756p, eVar.f326756p);
    }

    /* renamed from: hashCode */
    public int m126490x8cdac1b() {
        return (((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f326741a) * 31) + java.lang.Integer.hashCode(this.f326742b)) * 31) + this.f326743c.hashCode()) * 31) + this.f326744d.hashCode()) * 31) + java.lang.Double.hashCode(this.f326745e)) * 31) + java.lang.Double.hashCode(this.f326746f)) * 31) + java.lang.Double.hashCode(this.f326747g)) * 31) + this.f326748h.hashCode()) * 31) + this.f326749i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f326750j)) * 31) + this.f326751k.hashCode()) * 31) + this.f326752l.hashCode()) * 31) + this.f326753m.hashCode()) * 31) + java.lang.Float.hashCode(this.f326754n)) * 31) + this.f326755o.hashCode()) * 31) + this.f326756p.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126491x9616526c() {
        return "FlutterNoteLocationModel(width=" + this.f326741a + ", height=" + this.f326742b + ", poiName=" + this.f326743c + ", locationThumbTaskName=" + this.f326744d + ", lat=" + this.f326745e + ", lng=" + this.f326746f + ", scale=" + this.f326747g + ", address=" + this.f326748h + ", poiid=" + this.f326749i + ", isFromPoiList=" + this.f326750j + ", poiCategoryTips=" + this.f326751k + ", poiBusinessHour=" + this.f326752l + ", poiPhone=" + this.f326753m + ", poiPriceTips=" + this.f326754n + ", buildingID=" + this.f326755o + ", floorName=" + this.f326756p + ')';
    }
}
