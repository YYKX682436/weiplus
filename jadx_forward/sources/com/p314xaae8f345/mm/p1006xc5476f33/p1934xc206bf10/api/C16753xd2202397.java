package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api;

/* renamed from: com.tencent.mm.plugin.normsg.api.CameraStatus */
/* loaded from: classes13.dex */
public class C16753xd2202397 implements android.os.Parcelable, java.lang.Cloneable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397> f37712x681a0c0c = new fo3.c();

    /* renamed from: d, reason: collision with root package name */
    public long f233941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f233942e;

    /* renamed from: f, reason: collision with root package name */
    public long f233943f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f233944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f233945h;

    /* renamed from: i, reason: collision with root package name */
    public long f233946i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f233947m;

    public C16753xd2202397() {
        this.f233941d = 0L;
        this.f233942e = "";
        this.f233943f = 0L;
        this.f233944g = new java.util.concurrent.ConcurrentHashMap();
        this.f233945h = "";
        this.f233946i = 0L;
        this.f233947m = new java.util.concurrent.ConcurrentHashMap();
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397 c16753xd2202397) {
        this.f233941d = c16753xd2202397.f233941d;
        this.f233942e = c16753xd2202397.f233942e;
        this.f233943f = c16753xd2202397.f233943f;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f233944g;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(c16753xd2202397.f233944g);
        this.f233945h = c16753xd2202397.f233945h;
        this.f233946i = c16753xd2202397.f233946i;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f233947m;
        concurrentHashMap2.clear();
        concurrentHashMap2.putAll(c16753xd2202397.f233947m);
    }

    public final void b(android.os.Bundle bundle, java.lang.String str, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                concurrentHashMap.put(((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904) parcelableArrayList.get(i17)).f233938d, (com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904) parcelableArrayList.get(i17));
            }
        }
    }

    public com.p314xaae8f345.mm.p975xc206bf10.e c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904 c16752xd9b55904 : this.f233944g.values()) {
            arrayList.add(new com.p314xaae8f345.mm.p975xc206bf10.d(c16752xd9b55904.f233938d, c16752xd9b55904.f233939e, c16752xd9b55904.f233940f));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904 c16752xd9b559042 : this.f233947m.values()) {
            arrayList2.add(new com.p314xaae8f345.mm.p975xc206bf10.d(c16752xd9b559042.f233938d, c16752xd9b559042.f233939e, c16752xd9b559042.f233940f));
        }
        return new com.p314xaae8f345.mm.p975xc206bf10.e(this.f233941d, this.f233942e, this.f233943f, arrayList, this.f233945h, this.f233946i, arrayList2);
    }

    /* renamed from: clone */
    public java.lang.Object m67468x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397 c16753xd2202397;
        synchronized (this) {
            c16753xd2202397 = new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16753xd2202397();
            c16753xd2202397.a(this);
        }
        return c16753xd2202397;
    }

    public void d(java.lang.String str, boolean z17) {
        synchronized (this) {
            this.f233945h = this.f233942e;
            this.f233946i = this.f233943f;
            this.f233947m.clear();
            this.f233947m.putAll(this.f233944g);
            this.f233942e = str;
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            this.f233943f = currentTimeMillis;
            this.f233944g.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904(str, currentTimeMillis, z17));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f233941d);
        parcel.writeString(this.f233942e);
        parcel.writeLong(this.f233943f);
        parcel.writeString(this.f233945h);
        parcel.writeLong(this.f233946i);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("K_C_CS", new java.util.ArrayList<>(this.f233944g.values()));
        bundle.putParcelableArrayList("K_L_CS", new java.util.ArrayList<>(this.f233947m.values()));
        parcel.writeParcelable(bundle, i17);
    }

    public C16753xd2202397(android.os.Parcel parcel) {
        this.f233941d = 0L;
        this.f233942e = "";
        this.f233943f = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f233944g = concurrentHashMap;
        this.f233945h = "";
        this.f233946i = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
        this.f233947m = concurrentHashMap2;
        try {
            this.f233941d = parcel.readLong();
            this.f233942e = parcel.readString();
            this.f233943f = parcel.readLong();
            this.f233945h = parcel.readString();
            this.f233946i = parcel.readLong();
            android.os.Bundle bundle = (android.os.Bundle) parcel.readParcelable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getClassLoader());
            bundle.setClassLoader(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getClassLoader());
            b(bundle, "K_C_CS", concurrentHashMap);
            b(bundle, "K_L_CS", concurrentHashMap2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CS", "read from parcel error:" + th6);
        }
    }
}
