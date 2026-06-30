package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBBuildConfig;", "Llc3/e;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.MBBuildConfig */
/* loaded from: classes7.dex */
public final /* data */ class C16416x87606a7b<T extends lc3.e> implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b<?>> f37477x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.x4();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f229350d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f229351e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229352f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f229353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f229354h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f229355i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f229356m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Parcelable f229357n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f229358o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f229359p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f229360q;

    /* renamed from: r, reason: collision with root package name */
    public jc3.g0 f229361r;

    /* renamed from: s, reason: collision with root package name */
    public jc3.r f229362s;

    /* renamed from: t, reason: collision with root package name */
    public jc3.p f229363t;

    /* renamed from: u, reason: collision with root package name */
    public jc3.f0 f229364u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f229365v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f229366w;

    /* renamed from: x, reason: collision with root package name */
    public lc3.e f229367x;

    public C16416x87606a7b(java.util.HashSet jsapiNameSet, java.util.HashSet extSet, java.lang.String sessionId, java.lang.String process, boolean z17, boolean z18, boolean z19, android.os.Parcelable parcelable, boolean z27, java.lang.String customEnvParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapiNameSet, "jsapiNameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extSet, "extSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customEnvParams, "customEnvParams");
        this.f229350d = jsapiNameSet;
        this.f229351e = extSet;
        this.f229352f = sessionId;
        this.f229353g = process;
        this.f229354h = z17;
        this.f229355i = z18;
        this.f229356m = z19;
        this.f229357n = parcelable;
        this.f229358o = z27;
        this.f229359p = customEnvParams;
        this.f229360q = new java.util.HashMap();
        this.f229365v = true;
        this.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b a(java.util.Collection jsapi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        java.util.Iterator it = jsapi.iterator();
        while (it.hasNext()) {
            lc3.c0 c0Var = (lc3.c0) it.next();
            this.f229350d.add(new jz5.l(c0Var.f(), java.lang.Boolean.valueOf(c0Var.g())));
            this.f229360q.put(c0Var.f(), c0Var);
        }
        return this;
    }

    public final lc3.e b() {
        lc3.e eVar = this.f229367x;
        if (eVar != null) {
            return eVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bizContext");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66263xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229350d, c16416x87606a7b.f229350d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229351e, c16416x87606a7b.f229351e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229352f, c16416x87606a7b.f229352f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229353g, c16416x87606a7b.f229353g) && this.f229354h == c16416x87606a7b.f229354h && this.f229355i == c16416x87606a7b.f229355i && this.f229356m == c16416x87606a7b.f229356m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229357n, c16416x87606a7b.f229357n) && this.f229358o == c16416x87606a7b.f229358o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229359p, c16416x87606a7b.f229359p);
    }

    /* renamed from: hashCode */
    public int m66264x8cdac1b() {
        int hashCode = ((((((((((((this.f229350d.hashCode() * 31) + this.f229351e.hashCode()) * 31) + this.f229352f.hashCode()) * 31) + this.f229353g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f229354h)) * 31) + java.lang.Boolean.hashCode(this.f229355i)) * 31) + java.lang.Boolean.hashCode(this.f229356m)) * 31;
        android.os.Parcelable parcelable = this.f229357n;
        return ((((hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f229358o)) * 31) + this.f229359p.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66265x9616526c() {
        return "MBBuildConfig(jsapiNameSet=" + this.f229350d + ", extSet=" + this.f229351e + ", sessionId=" + this.f229352f + ", process=" + this.f229353g + ", enableInspector=" + this.f229354h + ", enableRenderEngine=" + this.f229355i + ", enableBindingJsContextInterface=" + this.f229356m + ", bizExtraParams=" + this.f229357n + ", enableWindowRefactor=" + this.f229358o + ", customEnvParams=" + this.f229359p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.HashSet hashSet = this.f229350d;
        out.writeInt(hashSet.size());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            out.writeSerializable((java.io.Serializable) it.next());
        }
        java.util.HashSet hashSet2 = this.f229351e;
        out.writeInt(hashSet2.size());
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            out.writeString((java.lang.String) it6.next());
        }
        out.writeString(this.f229352f);
        out.writeString(this.f229353g);
        out.writeInt(this.f229354h ? 1 : 0);
        out.writeInt(this.f229355i ? 1 : 0);
        out.writeInt(this.f229356m ? 1 : 0);
        out.writeParcelable(this.f229357n, i17);
        out.writeInt(this.f229358o ? 1 : 0);
        out.writeString(this.f229359p);
    }

    public /* synthetic */ C16416x87606a7b(java.util.HashSet hashSet, java.util.HashSet hashSet2, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, android.os.Parcelable parcelable, boolean z27, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? new java.util.HashSet() : hashSet, (i17 & 2) != 0 ? new java.util.HashSet() : hashSet2, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? "" : str2, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? true : z18, (i17 & 64) != 0 ? false : z19, (i17 & 128) != 0 ? null : parcelable, (i17 & 256) == 0 ? z27 : false, (i17 & 512) == 0 ? str3 : "");
    }
}
