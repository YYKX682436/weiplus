package com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b;

/* renamed from: com.tencent.mm.component.api.jumper.UICustomParam */
/* loaded from: classes8.dex */
public class C10402x5bc41468 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468> f27833x681a0c0c = new hp.a();

    /* renamed from: d, reason: collision with root package name */
    public float f146308d;

    /* renamed from: e, reason: collision with root package name */
    public float f146309e;

    /* renamed from: f, reason: collision with root package name */
    public float f146310f;

    /* renamed from: g, reason: collision with root package name */
    public float f146311g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f146312h;

    /* renamed from: i, reason: collision with root package name */
    public int f146313i;

    /* renamed from: m, reason: collision with root package name */
    public int f146314m;

    /* renamed from: n, reason: collision with root package name */
    public int f146315n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f146316o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f146317p;

    /* renamed from: q, reason: collision with root package name */
    public int f146318q;

    /* renamed from: r, reason: collision with root package name */
    public float f146319r;

    /* renamed from: s, reason: collision with root package name */
    public int f146320s;

    /* renamed from: t, reason: collision with root package name */
    public final int f146321t;

    /* renamed from: u, reason: collision with root package name */
    public final int f146322u;

    /* renamed from: v, reason: collision with root package name */
    public float f146323v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f146324w;

    public C10402x5bc41468(hp.a aVar) {
        this.f146308d = 0.0f;
        this.f146309e = 0.0f;
        this.f146310f = 0.0f;
        this.f146311g = 0.0f;
        this.f146313i = 0;
        this.f146314m = 0;
        this.f146315n = 0;
        this.f146316o = "";
        this.f146317p = "";
        this.f146318q = 0;
        this.f146319r = 0.0f;
        this.f146320s = 0;
        this.f146321t = -1;
        this.f146322u = -1;
        this.f146323v = -1.0f;
        this.f146324w = false;
        this.f146312h = new java.util.HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f146308d);
        parcel.writeFloat(this.f146309e);
        parcel.writeFloat(this.f146310f);
        parcel.writeFloat(this.f146311g);
        java.util.Map map = this.f146312h;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            parcel.writeString((java.lang.String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeInt(this.f146313i);
        parcel.writeInt(this.f146314m);
        parcel.writeInt(this.f146315n);
        parcel.writeString(this.f146316o);
        parcel.writeString(this.f146317p);
        parcel.writeInt(this.f146318q);
        parcel.writeFloat(this.f146319r);
        parcel.writeInt(this.f146320s);
        parcel.writeInt(this.f146321t);
        parcel.writeInt(this.f146322u);
        parcel.writeFloat(this.f146323v);
        parcel.writeInt(this.f146324w ? 1 : 0);
    }

    public C10402x5bc41468(android.os.Parcel parcel) {
        this.f146308d = 0.0f;
        this.f146309e = 0.0f;
        this.f146310f = 0.0f;
        this.f146311g = 0.0f;
        this.f146313i = 0;
        this.f146314m = 0;
        this.f146315n = 0;
        this.f146316o = "";
        this.f146317p = "";
        this.f146318q = 0;
        this.f146319r = 0.0f;
        this.f146320s = 0;
        this.f146321t = -1;
        this.f146322u = -1;
        this.f146323v = -1.0f;
        this.f146324w = false;
        this.f146308d = parcel.readFloat();
        this.f146309e = parcel.readFloat();
        this.f146310f = parcel.readFloat();
        this.f146311g = parcel.readFloat();
        int readInt = parcel.readInt();
        this.f146312h = new java.util.HashMap(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f146312h.put(parcel.readString(), (java.lang.Boolean) parcel.readValue(java.lang.Boolean.class.getClassLoader()));
        }
        this.f146313i = parcel.readInt();
        this.f146314m = parcel.readInt();
        this.f146315n = parcel.readInt();
        this.f146316o = parcel.readString();
        this.f146317p = parcel.readString();
        this.f146318q = parcel.readInt();
        this.f146319r = parcel.readFloat();
        this.f146320s = parcel.readInt();
        this.f146321t = parcel.readInt();
        this.f146322u = parcel.readInt();
        this.f146323v = parcel.readFloat();
        this.f146324w = parcel.readInt() != 0;
    }
}
