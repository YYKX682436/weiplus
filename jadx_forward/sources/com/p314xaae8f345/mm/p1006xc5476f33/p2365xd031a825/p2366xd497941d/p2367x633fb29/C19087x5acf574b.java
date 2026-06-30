package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle */
/* loaded from: classes9.dex */
public class C19087x5acf574b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b> f38667x681a0c0c = new ys4.n();
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public int G;
    public java.lang.String H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260956d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260958f;

    /* renamed from: g, reason: collision with root package name */
    public int f260959g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f260960h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c f260961i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260962m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f260963n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f260964o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f260965p;

    /* renamed from: q, reason: collision with root package name */
    public int f260966q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f260967r;

    /* renamed from: s, reason: collision with root package name */
    public int f260968s;

    /* renamed from: t, reason: collision with root package name */
    public int f260969t;

    /* renamed from: u, reason: collision with root package name */
    public int f260970u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f260971v;

    /* renamed from: w, reason: collision with root package name */
    public int f260972w;

    /* renamed from: x, reason: collision with root package name */
    public int f260973x;

    /* renamed from: y, reason: collision with root package name */
    public int f260974y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f260975z;

    public C19087x5acf574b(android.os.Parcel parcel) {
        this.f260956d = parcel.readString();
        this.f260957e = parcel.readString();
        this.f260958f = parcel.readString();
        this.f260959g = parcel.readInt();
        this.f260960h = parcel.readString();
        this.f260961i = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c.class.getClassLoader());
        this.f260962m = parcel.readString();
        this.f260963n = parcel.readString();
        this.f260964o = parcel.readString();
        this.f260965p = parcel.readString();
        this.f260966q = parcel.readInt();
        this.f260967r = parcel.readString();
        this.f260968s = parcel.readInt();
        this.f260969t = parcel.readInt();
        this.f260970u = parcel.readInt();
        this.f260971v = parcel.readString();
        this.f260972w = parcel.readInt();
        this.f260973x = parcel.readInt();
        this.f260974y = parcel.readInt();
        this.f260975z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readString();
        this.I = parcel.readInt();
    }

    public void a(java.util.Map map) {
        map.put("detail_address", this.C);
        map.put("phone_no", this.H);
        map.put("sex", java.lang.String.valueOf(this.I));
        map.put("nationality", this.f260975z);
        map.put("birth_date", this.f260971v);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c c19086x2eaebd1c = this.f260961i;
        map.put("profession_name", c19086x2eaebd1c != null ? c19086x2eaebd1c.f260954d : "");
        map.put("user_country", this.f260962m);
        map.put("user_province", this.f260963n);
        map.put("user_city", this.f260964o);
        map.put("cre_expire_date", this.f260967r);
        map.put("creid_renewal", java.lang.String.valueOf(this.f260966q));
        map.put("cre_effect_date", this.D);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f260956d);
        parcel.writeString(this.f260957e);
        parcel.writeString(this.f260958f);
        parcel.writeInt(this.f260959g);
        parcel.writeString(this.f260960h);
        parcel.writeParcelable(this.f260961i, 1);
        parcel.writeString(this.f260962m);
        parcel.writeString(this.f260963n);
        parcel.writeString(this.f260964o);
        parcel.writeString(this.f260965p);
        parcel.writeInt(this.f260966q);
        parcel.writeString(this.f260967r);
        parcel.writeInt(this.f260968s);
        parcel.writeInt(this.f260969t);
        parcel.writeInt(this.f260970u);
        parcel.writeString(this.f260971v);
        parcel.writeInt(this.f260972w);
        parcel.writeInt(this.f260973x);
        parcel.writeInt(this.f260974y);
        parcel.writeString(this.f260975z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeString(this.H);
        parcel.writeInt(this.I);
    }
}
