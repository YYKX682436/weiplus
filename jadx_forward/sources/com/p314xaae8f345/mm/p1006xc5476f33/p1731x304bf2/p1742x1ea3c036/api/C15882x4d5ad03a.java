package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api;

/* renamed from: com.tencent.mm.plugin.game.luggage.api.GameInputConfig */
/* loaded from: classes.dex */
public class C15882x4d5ad03a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15882x4d5ad03a> f36925x681a0c0c = new s43.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221053e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221054f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f221055g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f221056h;

    /* renamed from: i, reason: collision with root package name */
    public final int f221057i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f221058m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f221059n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f221060o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f221061p;

    /* renamed from: q, reason: collision with root package name */
    public final int f221062q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f221063r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f221064s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f221065t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f221066u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f221067v;

    /* renamed from: w, reason: collision with root package name */
    public final int f221068w;

    /* renamed from: x, reason: collision with root package name */
    public final int f221069x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f221070y;

    public C15882x4d5ad03a(android.os.Parcel parcel) {
        this.f221055g = false;
        this.f221056h = false;
        this.f221057i = 1000;
        this.f221058m = false;
        this.f221060o = true;
        this.f221065t = false;
        this.f221069x = 1000;
        this.f221070y = "send";
        this.f221052d = parcel.readString();
        this.f221053e = parcel.readString();
        this.f221054f = parcel.readString();
        this.f221055g = parcel.readInt() == 1;
        this.f221056h = parcel.readInt() == 1;
        this.f221057i = parcel.readInt();
        this.f221058m = parcel.readInt() == 1;
        this.f221059n = parcel.readString();
        this.f221060o = parcel.readInt() == 1;
        this.f221061p = parcel.readInt() == 1;
        this.f221062q = parcel.readInt();
        this.f221063r = parcel.readInt() == 1;
        this.f221064s = parcel.readString();
        this.f221069x = parcel.readInt();
        this.f221070y = parcel.readString();
        this.f221065t = parcel.readInt() == 1;
        this.f221066u = parcel.readString();
        this.f221067v = parcel.readString();
        this.f221068w = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f221052d);
        parcel.writeString(this.f221053e);
        parcel.writeString(this.f221054f);
        parcel.writeInt(this.f221055g ? 1 : 0);
        parcel.writeInt(this.f221056h ? 1 : 0);
        parcel.writeInt(this.f221057i);
        parcel.writeInt(this.f221058m ? 1 : 0);
        parcel.writeString(this.f221059n);
        parcel.writeInt(this.f221060o ? 1 : 0);
        parcel.writeInt(this.f221061p ? 1 : 0);
        parcel.writeInt(this.f221062q);
        parcel.writeInt(this.f221063r ? 1 : 0);
        parcel.writeString(this.f221064s);
        parcel.writeInt(this.f221069x);
        parcel.writeString(this.f221070y);
        parcel.writeInt(this.f221065t ? 1 : 0);
        parcel.writeString(this.f221066u);
        parcel.writeString(this.f221067v);
        parcel.writeInt(this.f221068w);
    }
}
