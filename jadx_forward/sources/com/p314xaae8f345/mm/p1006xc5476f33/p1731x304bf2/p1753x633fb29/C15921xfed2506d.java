package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* renamed from: com.tencent.mm.plugin.game.model.GameTabData */
/* loaded from: classes8.dex */
public class C15921xfed2506d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d> f36933x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f2();

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f221684d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar f221685e;

    /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$TabItem */
    /* loaded from: classes8.dex */
    public static class TabItem implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem> f36935x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f221688d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f221689e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f221690f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f221691g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f221692h;

        /* renamed from: i, reason: collision with root package name */
        public int f221693i;

        /* renamed from: m, reason: collision with root package name */
        public int f221694m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f221695n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f221696o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f221697p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f221698q;

        /* renamed from: r, reason: collision with root package name */
        public int f221699r;

        /* renamed from: s, reason: collision with root package name */
        public int f221700s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f221701t;

        public TabItem(android.os.Parcel parcel) {
            this.f221688d = parcel.readString();
            this.f221689e = parcel.readString();
            this.f221690f = parcel.readString();
            this.f221691g = parcel.readByte() != 0;
            this.f221692h = parcel.readByte() != 0;
            this.f221693i = parcel.readInt();
            this.f221694m = parcel.readInt();
            this.f221695n = parcel.readString();
            this.f221696o = parcel.readString();
            this.f221697p = parcel.readString();
            this.f221698q = parcel.readByte() != 0;
            this.f221699r = parcel.readInt();
            this.f221700s = parcel.readInt();
            this.f221701t = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f221688d);
            parcel.writeString(this.f221689e);
            parcel.writeString(this.f221690f);
            parcel.writeByte(this.f221691g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f221692h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f221693i);
            parcel.writeInt(this.f221694m);
            parcel.writeString(this.f221695n);
            parcel.writeString(this.f221696o);
            parcel.writeString(this.f221697p);
            parcel.writeByte(this.f221698q ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f221699r);
            parcel.writeInt(this.f221700s);
            parcel.writeString(this.f221701t);
        }
    }

    public C15921xfed2506d() {
        this.f221684d = new java.util.LinkedHashMap();
        this.f221685e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar();
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = this.f221684d;
        if (linkedHashMap != null) {
            arrayList.addAll(linkedHashMap.values());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f221684d.size());
        java.util.Iterator it = this.f221684d.entrySet().iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) ((java.util.Map.Entry) it.next()).getValue(), i17);
        }
        parcel.writeParcelable(this.f221685e, i17);
    }

    /* renamed from: com.tencent.mm.plugin.game.model.GameTabData$StatusBar */
    /* loaded from: classes8.dex */
    public static class StatusBar implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar> f36934x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f221686d;

        /* renamed from: e, reason: collision with root package name */
        public int f221687e;

        public StatusBar() {
            this.f221686d = null;
            this.f221687e = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f221686d);
            parcel.writeInt(this.f221687e);
        }

        public StatusBar(android.os.Parcel parcel) {
            this.f221686d = null;
            this.f221687e = 0;
            this.f221686d = parcel.readString();
            this.f221687e = parcel.readInt();
        }
    }

    public C15921xfed2506d(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f2 f2Var) {
        int readInt = parcel.readInt();
        if (this.f221684d == null) {
            this.f221684d = new java.util.LinkedHashMap();
        }
        for (int i17 = 0; i17 < readInt; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem.class.getClassLoader());
            if (tabItem != null) {
                this.f221684d.put(tabItem.f221688d, tabItem);
            }
        }
        this.f221685e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar.class.getClassLoader());
    }
}
