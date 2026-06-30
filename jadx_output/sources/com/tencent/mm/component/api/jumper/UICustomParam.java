package com.tencent.mm.component.api.jumper;

/* loaded from: classes8.dex */
public class UICustomParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.component.api.jumper.UICustomParam> CREATOR = new hp.a();

    /* renamed from: d, reason: collision with root package name */
    public float f64775d;

    /* renamed from: e, reason: collision with root package name */
    public float f64776e;

    /* renamed from: f, reason: collision with root package name */
    public float f64777f;

    /* renamed from: g, reason: collision with root package name */
    public float f64778g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f64779h;

    /* renamed from: i, reason: collision with root package name */
    public int f64780i;

    /* renamed from: m, reason: collision with root package name */
    public int f64781m;

    /* renamed from: n, reason: collision with root package name */
    public int f64782n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f64783o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f64784p;

    /* renamed from: q, reason: collision with root package name */
    public int f64785q;

    /* renamed from: r, reason: collision with root package name */
    public float f64786r;

    /* renamed from: s, reason: collision with root package name */
    public int f64787s;

    /* renamed from: t, reason: collision with root package name */
    public final int f64788t;

    /* renamed from: u, reason: collision with root package name */
    public final int f64789u;

    /* renamed from: v, reason: collision with root package name */
    public float f64790v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f64791w;

    public UICustomParam(hp.a aVar) {
        this.f64775d = 0.0f;
        this.f64776e = 0.0f;
        this.f64777f = 0.0f;
        this.f64778g = 0.0f;
        this.f64780i = 0;
        this.f64781m = 0;
        this.f64782n = 0;
        this.f64783o = "";
        this.f64784p = "";
        this.f64785q = 0;
        this.f64786r = 0.0f;
        this.f64787s = 0;
        this.f64788t = -1;
        this.f64789u = -1;
        this.f64790v = -1.0f;
        this.f64791w = false;
        this.f64779h = new java.util.HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f64775d);
        parcel.writeFloat(this.f64776e);
        parcel.writeFloat(this.f64777f);
        parcel.writeFloat(this.f64778g);
        java.util.Map map = this.f64779h;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeInt(this.f64780i);
        parcel.writeInt(this.f64781m);
        parcel.writeInt(this.f64782n);
        parcel.writeString(this.f64783o);
        parcel.writeString(this.f64784p);
        parcel.writeInt(this.f64785q);
        parcel.writeFloat(this.f64786r);
        parcel.writeInt(this.f64787s);
        parcel.writeInt(this.f64788t);
        parcel.writeInt(this.f64789u);
        parcel.writeFloat(this.f64790v);
        parcel.writeInt(this.f64791w ? 1 : 0);
    }

    public UICustomParam(android.os.Parcel parcel) {
        this.f64775d = 0.0f;
        this.f64776e = 0.0f;
        this.f64777f = 0.0f;
        this.f64778g = 0.0f;
        this.f64780i = 0;
        this.f64781m = 0;
        this.f64782n = 0;
        this.f64783o = "";
        this.f64784p = "";
        this.f64785q = 0;
        this.f64786r = 0.0f;
        this.f64787s = 0;
        this.f64788t = -1;
        this.f64789u = -1;
        this.f64790v = -1.0f;
        this.f64791w = false;
        this.f64775d = parcel.readFloat();
        this.f64776e = parcel.readFloat();
        this.f64777f = parcel.readFloat();
        this.f64778g = parcel.readFloat();
        int readInt = parcel.readInt();
        this.f64779h = new java.util.HashMap(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f64779h.put(parcel.readString(), (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader()));
        }
        this.f64780i = parcel.readInt();
        this.f64781m = parcel.readInt();
        this.f64782n = parcel.readInt();
        this.f64783o = parcel.readString();
        this.f64784p = parcel.readString();
        this.f64785q = parcel.readInt();
        this.f64786r = parcel.readFloat();
        this.f64787s = parcel.readInt();
        this.f64788t = parcel.readInt();
        this.f64789u = parcel.readInt();
        this.f64790v = parcel.readFloat();
        this.f64791w = parcel.readInt() != 0;
    }
}
