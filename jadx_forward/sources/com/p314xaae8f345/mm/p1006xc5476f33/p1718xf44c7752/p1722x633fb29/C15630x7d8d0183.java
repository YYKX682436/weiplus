package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem */
/* loaded from: classes10.dex */
public class C15630x7d8d0183 implements android.os.Parcelable, java.lang.Comparable<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183> f36409x681a0c0c = new t23.z0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f219948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219949e;

    /* renamed from: f, reason: collision with root package name */
    public int f219950f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219951g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f219953i;

    /* renamed from: h, reason: collision with root package name */
    public int f219952h = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f219954m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f219955n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f219956o = false;

    public C15630x7d8d0183(java.lang.String str, int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        str = str == null ? "" : str;
        this.f219948d = str;
        this.f219950f = i17;
        this.f219949e = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = c15630x7d8d0183;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = this.f219953i;
        if (abstractC15633xee4330782 != null && (abstractC15633xee433078 = c15630x7d8d01832.f219953i) != null) {
            long j17 = abstractC15633xee4330782.f219968m;
            long j18 = abstractC15633xee433078.f219968m;
            if (j17 == j18) {
                return java.lang.Long.compare(abstractC15633xee433078.f219970o, abstractC15633xee4330782.f219970o);
            }
            if (j17 <= j18) {
                return 1;
            }
        } else if (abstractC15633xee4330782 == null) {
            return c15630x7d8d01832.f219953i != null ? 1 : 0;
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f219953i;
        if (abstractC15633xee433078 != null) {
            return abstractC15633xee433078.f219963e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumItem", "getOriginalPath mediaItem is null");
        return null;
    }

    public long i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f219953i;
        if (abstractC15633xee433078 != null) {
            return abstractC15633xee433078.f219967i;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumItem", "getThumbMediaOrigId mediaItem is null");
        return -1L;
    }

    public long m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f219953i;
        if (abstractC15633xee433078 != null) {
            return abstractC15633xee433078.f219968m;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumItem", "getThumbModifyDate mediaItem is null");
        return -1L;
    }

    public java.lang.String n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f219953i;
        if (abstractC15633xee433078 != null) {
            return abstractC15633xee433078.o();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumItem", "getThumbPath mediaItem is null");
        return null;
    }

    public int o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f219953i;
        if (abstractC15633xee433078 != null) {
            return abstractC15633xee433078.mo63659xfb85f7b0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumItem", "getThumbType mediaItem is null");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.String r3) {
        /*
            r2 = this;
            r2.f219951g = r3
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto Lbc
            java.lang.String r3 = r2.f219951g
            java.lang.Class<t23.j1> r0 = t23.j1.class
            i95.m r0 = i95.n0.c(r0)
            t23.j1 r0 = (t23.j1) r0
            t23.g1 r0 = (t23.g1) r0
            r0.getClass()
            java.lang.String r0 = "bucketID"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r0 != 0) goto Lb3
            r0 = 0
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r3, r0)
            int r0 = j33.d0.f378962b
            if (r0 != r3) goto L36
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768763(0x7f1035bb, float:1.9168782E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L36:
            int r0 = j33.d0.f378963c
            if (r0 != r3) goto L45
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768737(0x7f1035a1, float:1.9168729E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L45:
            int r0 = j33.d0.f378964d
            if (r0 != r3) goto L53
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768742(0x7f1035a6, float:1.916874E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L53:
            java.util.ArrayList r0 = j33.d0.f378965e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L69
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768746(0x7f1035aa, float:1.9168747E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L69:
            java.util.ArrayList r0 = j33.d0.f378966f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7f
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768747(0x7f1035ab, float:1.916875E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        L7f:
            t23.p0 r0 = t23.p0.j()
            android.util.SparseArray r0 = r0.f496774m
            java.lang.Object r3 = r0.get(r3)
            t23.c1 r3 = (t23.c1) r3
            if (r3 == 0) goto Lb3
            java.lang.String r0 = r3.f496654a
            java.lang.String r1 = "key"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.lang.String r1 = "WeChatWork"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r1)
            if (r0 == 0) goto Lb0
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131768762(0x7f1035ba, float:1.916878E38)
            java.lang.String r3 = r3.getString(r0)
            goto Lb4
        Lb0:
            java.lang.String r3 = r3.f496656c
            goto Lb4
        Lb3:
            r3 = 0
        Lb4:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r0 != 0) goto Lbc
            r2.f219949e = r3
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183.r(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f219948d);
        parcel.writeInt(this.f219950f);
        parcel.writeParcelable(this.f219953i, i17);
    }

    public C15630x7d8d0183(android.os.Parcel parcel) {
        this.f219948d = parcel.readString();
        this.f219950f = parcel.readInt();
        this.f219953i = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.class.getClassLoader());
    }
}
