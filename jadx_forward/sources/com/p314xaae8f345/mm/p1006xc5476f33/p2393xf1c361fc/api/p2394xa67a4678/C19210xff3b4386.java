package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/websearch/api/circlesearch/CircleSearchInfo;", "Landroid/os/Parcelable;", "tu4/a", "websearch-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo */
/* loaded from: classes.dex */
public final /* data */ class C19210xff3b4386 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f262976d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262977e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f262978f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f262979g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f262980h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f262981i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f262982m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f262983n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f262984o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f262985p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f262986q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Integer f262987r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f262988s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f262989t;

    /* renamed from: u, reason: collision with root package name */
    public static final tu4.a f262975u = new tu4.a(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386> f38708x681a0c0c = new tu4.b();

    public C19210xff3b4386(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num2, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Integer num3, java.lang.String str9, java.lang.String str10) {
        this.f262976d = num;
        this.f262977e = str;
        this.f262978f = str2;
        this.f262979g = bool;
        this.f262980h = str3;
        this.f262981i = str4;
        this.f262982m = str5;
        this.f262983n = num2;
        this.f262984o = str6;
        this.f262985p = str7;
        this.f262986q = str8;
        this.f262987r = num3;
        this.f262988s = str9;
        this.f262989t = str10;
    }

    public final java.lang.String a(java.lang.String sessionId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return "," + this.f262987r + ",0,0," + sessionId + ',' + i17 + ',' + java.lang.System.currentTimeMillis() + ',' + this.f262980h + ',' + this.f262985p + ',' + this.f262986q + ',' + this.f262983n;
    }

    public final java.util.Map b() {
        return kz5.c1.k(new jz5.l("searchScene", this.f262976d), new jz5.l("parentSearchId", this.f262977e), new jz5.l("thirdExtInfo", this.f262978f), new jz5.l("skipImageUploading", this.f262979g), new jz5.l("recommendQuery", this.f262980h), new jz5.l("imageUrl", this.f262981i), new jz5.l("base64ImageData", this.f262982m), new jz5.l("reportInfoFor33399", this.f262984o), new jz5.l("imgPath", this.f262988s), new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f262989t));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74045xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386 c19210xff3b4386 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262976d, c19210xff3b4386.f262976d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262977e, c19210xff3b4386.f262977e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262978f, c19210xff3b4386.f262978f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262979g, c19210xff3b4386.f262979g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262980h, c19210xff3b4386.f262980h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262981i, c19210xff3b4386.f262981i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262982m, c19210xff3b4386.f262982m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262983n, c19210xff3b4386.f262983n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262984o, c19210xff3b4386.f262984o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262985p, c19210xff3b4386.f262985p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262986q, c19210xff3b4386.f262986q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262987r, c19210xff3b4386.f262987r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262988s, c19210xff3b4386.f262988s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262989t, c19210xff3b4386.f262989t);
    }

    /* renamed from: hashCode */
    public int m74046x8cdac1b() {
        java.lang.Integer num = this.f262976d;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f262977e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f262978f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Boolean bool = this.f262979g;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str3 = this.f262980h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f262981i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f262982m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Integer num2 = this.f262983n;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str6 = this.f262984o;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f262985p;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f262986q;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Integer num3 = this.f262987r;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str9 = this.f262988s;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.f262989t;
        return hashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m74047x9616526c() {
        return "CircleSearchInfo(searchScene=" + this.f262976d + ", parentSearchId=" + this.f262977e + ", extInfo=" + this.f262978f + ", skipImageUploading=" + this.f262979g + ", recommendQuery=" + this.f262980h + ", imageUrl=" + this.f262981i + ", base64ImageData=" + this.f262982m + ", recommendQueryPullType=" + this.f262983n + ", reportInfoFor33399=" + this.f262984o + ", reportSearchStatusInfoFor34875=" + this.f262985p + ", reportExtInfoFor34875=" + this.f262986q + ", enterScene=" + this.f262987r + ", imgPath=" + this.f262988s + ", sessionId=" + this.f262989t + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        int i18 = 0;
        java.lang.Integer num = this.f262976d;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f262977e);
        out.writeString(this.f262978f);
        java.lang.Boolean bool = this.f262979g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.f262980h);
        out.writeString(this.f262981i);
        out.writeString(this.f262982m);
        java.lang.Integer num2 = this.f262983n;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.f262984o);
        out.writeString(this.f262985p);
        out.writeString(this.f262986q);
        java.lang.Integer num3 = this.f262987r;
        if (num3 != null) {
            out.writeInt(1);
            i18 = num3.intValue();
        }
        out.writeInt(i18);
        out.writeString(this.f262988s);
        out.writeString(this.f262989t);
    }
}
