package com.google.android.exoplayer2;

/* loaded from: classes15.dex */
public final class Format implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.Format> CREATOR = new m8.r();
    public final int A;
    public final int B;
    public final long C;
    public final int D;
    public final java.lang.String E;
    public final int F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f44075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44076e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44077f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.Metadata f44078g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f44079h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f44080i;

    /* renamed from: m, reason: collision with root package name */
    public final int f44081m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f44082n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.DrmInitData f44083o;

    /* renamed from: p, reason: collision with root package name */
    public final int f44084p;

    /* renamed from: q, reason: collision with root package name */
    public final int f44085q;

    /* renamed from: r, reason: collision with root package name */
    public final float f44086r;

    /* renamed from: s, reason: collision with root package name */
    public final int f44087s;

    /* renamed from: t, reason: collision with root package name */
    public final float f44088t;

    /* renamed from: u, reason: collision with root package name */
    public final int f44089u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f44090v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.ColorInfo f44091w;

    /* renamed from: x, reason: collision with root package name */
    public final int f44092x;

    /* renamed from: y, reason: collision with root package name */
    public final int f44093y;

    /* renamed from: z, reason: collision with root package name */
    public final int f44094z;

    public Format(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, int i27, float f17, int i28, float f18, byte[] bArr, int i29, com.google.android.exoplayer2.video.ColorInfo colorInfo, int i37, int i38, int i39, int i47, int i48, int i49, java.lang.String str5, int i57, long j17, java.util.List list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, com.google.android.exoplayer2.metadata.Metadata metadata) {
        this.f44075d = str;
        this.f44079h = str2;
        this.f44080i = str3;
        this.f44077f = str4;
        this.f44076e = i17;
        this.f44081m = i18;
        this.f44084p = i19;
        this.f44085q = i27;
        this.f44086r = f17;
        this.f44087s = i28;
        this.f44088t = f18;
        this.f44090v = bArr;
        this.f44089u = i29;
        this.f44091w = colorInfo;
        this.f44092x = i37;
        this.f44093y = i38;
        this.f44094z = i39;
        this.A = i47;
        this.B = i48;
        this.D = i49;
        this.E = str5;
        this.F = i57;
        this.C = j17;
        this.f44082n = list == null ? java.util.Collections.emptyList() : list;
        this.f44083o = drmInitData;
        this.f44078g = metadata;
    }

    public static com.google.android.exoplayer2.Format a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.util.List list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, int i38, java.lang.String str4, com.google.android.exoplayer2.metadata.Metadata metadata) {
        return new com.google.android.exoplayer2.Format(str, null, str2, str3, i17, i18, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i19, i27, i28, i29, i37, i38, str4, -1, com.tencent.wcdb.core.Database.DictDefaultMatchValue, list, drmInitData, metadata);
    }

    public static com.google.android.exoplayer2.Format b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, int i28, java.util.List list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, int i29, java.lang.String str4) {
        return a(str, str2, str3, i17, i18, i19, i27, i28, -1, -1, list, drmInitData, i29, str4, null);
    }

    public static com.google.android.exoplayer2.Format c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, java.util.List list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, int i28, java.lang.String str4) {
        return b(str, str2, str3, i17, i18, i19, i27, -1, list, drmInitData, i28, str4);
    }

    public static com.google.android.exoplayer2.Format d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.util.List list, java.lang.String str4, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return new com.google.android.exoplayer2.Format(str, null, str2, str3, i17, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, com.tencent.wcdb.core.Database.DictDefaultMatchValue, list, drmInitData, null);
    }

    public static com.google.android.exoplayer2.Format e(java.lang.String str, java.lang.String str2, long j17) {
        return new com.google.android.exoplayer2.Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j17, null, null, null);
    }

    public static com.google.android.exoplayer2.Format f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return new com.google.android.exoplayer2.Format(str, null, str2, str3, i17, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, com.tencent.wcdb.core.Database.DictDefaultMatchValue, null, drmInitData, null);
    }

    public static com.google.android.exoplayer2.Format g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, java.lang.String str5, int i19) {
        return new com.google.android.exoplayer2.Format(str, str2, str3, str4, i17, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i18, str5, i19, com.tencent.wcdb.core.Database.DictDefaultMatchValue, null, null, null);
    }

    public static com.google.android.exoplayer2.Format h(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return i(str, str2, null, -1, i17, str3, -1, drmInitData, com.tencent.wcdb.core.Database.DictDefaultMatchValue, java.util.Collections.emptyList());
    }

    public static com.google.android.exoplayer2.Format i(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, com.google.android.exoplayer2.drm.DrmInitData drmInitData, long j17, java.util.List list) {
        return new com.google.android.exoplayer2.Format(str, null, str2, str3, i17, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i18, str4, i19, j17, list, drmInitData, null);
    }

    public static com.google.android.exoplayer2.Format m(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, float f17, java.util.List list, int i28, float f18, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return n(str, str2, str3, i17, i18, i19, i27, f17, list, i28, f18, null, -1, null, drmInitData);
    }

    public static com.google.android.exoplayer2.Format n(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, int i27, float f17, java.util.List list, int i28, float f18, byte[] bArr, int i29, com.google.android.exoplayer2.video.ColorInfo colorInfo, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return new com.google.android.exoplayer2.Format(str, null, str2, str3, i17, i18, i19, i27, f17, i28, f18, bArr, i29, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, com.tencent.wcdb.core.Database.DictDefaultMatchValue, list, drmInitData, null);
    }

    public static void r(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        if (i17 != -1) {
            mediaFormat.setInteger(str, i17);
        }
    }

    public static java.lang.String s(com.google.android.exoplayer2.Format format) {
        int i17;
        if (format == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id=");
        sb6.append(format.f44075d);
        sb6.append(", mimeType=");
        sb6.append(format.f44080i);
        int i18 = format.f44076e;
        if (i18 != -1) {
            sb6.append(", bitrate=");
            sb6.append(i18);
        }
        int i19 = format.f44084p;
        if (i19 != -1 && (i17 = format.f44085q) != -1) {
            sb6.append(", res=");
            sb6.append(i19);
            sb6.append("x");
            sb6.append(i17);
        }
        float f17 = format.f44086r;
        if (f17 != -1.0f) {
            sb6.append(", fps=");
            sb6.append(f17);
        }
        int i27 = format.f44092x;
        if (i27 != -1) {
            sb6.append(", channels=");
            sb6.append(i27);
        }
        int i28 = format.f44093y;
        if (i28 != -1) {
            sb6.append(", sample_rate=");
            sb6.append(i28);
        }
        java.lang.String str = format.E;
        if (str != null) {
            sb6.append(", language=");
            sb6.append(str);
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.exoplayer2.Format.class == obj.getClass()) {
            com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) obj;
            if (this.f44076e == format.f44076e && this.f44081m == format.f44081m && this.f44084p == format.f44084p && this.f44085q == format.f44085q && this.f44086r == format.f44086r && this.f44087s == format.f44087s && this.f44088t == format.f44088t && this.f44089u == format.f44089u && this.f44092x == format.f44092x && this.f44093y == format.f44093y && this.f44094z == format.f44094z && this.A == format.A && this.B == format.B && this.C == format.C && this.D == format.D && t9.d0.a(this.f44075d, format.f44075d) && t9.d0.a(this.E, format.E) && this.F == format.F && t9.d0.a(this.f44079h, format.f44079h) && t9.d0.a(this.f44080i, format.f44080i) && t9.d0.a(this.f44077f, format.f44077f) && t9.d0.a(this.f44083o, format.f44083o) && t9.d0.a(this.f44078g, format.f44078g) && t9.d0.a(this.f44091w, format.f44091w) && java.util.Arrays.equals(this.f44090v, format.f44090v)) {
                java.util.List list = this.f44082n;
                int size = list.size();
                java.util.List list2 = format.f44082n;
                if (size == list2.size()) {
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!java.util.Arrays.equals((byte[]) list.get(i17), (byte[]) list2.get(i17))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.G == 0) {
            java.lang.String str = this.f44075d;
            int hashCode = (com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.f44079h;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.f44080i;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.f44077f;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f44076e) * 31) + this.f44084p) * 31) + this.f44085q) * 31) + this.f44092x) * 31) + this.f44093y) * 31;
            java.lang.String str5 = this.E;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.F) * 31;
            com.google.android.exoplayer2.drm.DrmInitData drmInitData = this.f44083o;
            int hashCode6 = (hashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            com.google.android.exoplayer2.metadata.Metadata metadata = this.f44078g;
            this.G = hashCode6 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.G;
    }

    public final android.media.MediaFormat o() {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", this.f44080i);
        java.lang.String str = this.E;
        if (str != null) {
            mediaFormat.setString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, str);
        }
        r(mediaFormat, "max-input-size", this.f44081m);
        r(mediaFormat, "width", this.f44084p);
        r(mediaFormat, "height", this.f44085q);
        float f17 = this.f44086r;
        if (f17 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f17);
        }
        r(mediaFormat, "rotation-degrees", this.f44087s);
        r(mediaFormat, "channel-count", this.f44092x);
        r(mediaFormat, "sample-rate", this.f44093y);
        r(mediaFormat, "encoder-delay", this.A);
        r(mediaFormat, "encoder-padding", this.B);
        int i17 = 0;
        while (true) {
            java.util.List list = this.f44082n;
            if (i17 >= list.size()) {
                break;
            }
            mediaFormat.setByteBuffer("csd-" + i17, java.nio.ByteBuffer.wrap((byte[]) list.get(i17)));
            i17++;
        }
        com.google.android.exoplayer2.video.ColorInfo colorInfo = this.f44091w;
        if (colorInfo != null) {
            r(mediaFormat, "color-transfer", colorInfo.f44165f);
            r(mediaFormat, "color-standard", colorInfo.f44163d);
            r(mediaFormat, "color-range", colorInfo.f44164e);
            byte[] bArr = colorInfo.f44166g;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public int q() {
        int i17;
        int i18 = this.f44084p;
        if (i18 == -1 || (i17 = this.f44085q) == -1) {
            return -1;
        }
        return i18 * i17;
    }

    public java.lang.String toString() {
        return "Format(" + this.f44075d + ", " + this.f44079h + ", " + this.f44080i + ", " + this.f44076e + ", " + this.E + ", [" + this.f44084p + ", " + this.f44085q + ", " + this.f44086r + "], [" + this.f44092x + ", " + this.f44093y + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f44075d);
        parcel.writeString(this.f44079h);
        parcel.writeString(this.f44080i);
        parcel.writeString(this.f44077f);
        parcel.writeInt(this.f44076e);
        parcel.writeInt(this.f44081m);
        parcel.writeInt(this.f44084p);
        parcel.writeInt(this.f44085q);
        parcel.writeFloat(this.f44086r);
        parcel.writeInt(this.f44087s);
        parcel.writeFloat(this.f44088t);
        byte[] bArr = this.f44090v;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f44089u);
        parcel.writeParcelable(this.f44091w, i17);
        parcel.writeInt(this.f44092x);
        parcel.writeInt(this.f44093y);
        parcel.writeInt(this.f44094z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
        parcel.writeLong(this.C);
        java.util.List list = this.f44082n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            parcel.writeByteArray((byte[]) list.get(i18));
        }
        parcel.writeParcelable(this.f44083o, 0);
        parcel.writeParcelable(this.f44078g, 0);
    }

    public Format(android.os.Parcel parcel) {
        this.f44075d = parcel.readString();
        this.f44079h = parcel.readString();
        this.f44080i = parcel.readString();
        this.f44077f = parcel.readString();
        this.f44076e = parcel.readInt();
        this.f44081m = parcel.readInt();
        this.f44084p = parcel.readInt();
        this.f44085q = parcel.readInt();
        this.f44086r = parcel.readFloat();
        this.f44087s = parcel.readInt();
        this.f44088t = parcel.readFloat();
        this.f44090v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f44089u = parcel.readInt();
        this.f44091w = (com.google.android.exoplayer2.video.ColorInfo) parcel.readParcelable(com.google.android.exoplayer2.video.ColorInfo.class.getClassLoader());
        this.f44092x = parcel.readInt();
        this.f44093y = parcel.readInt();
        this.f44094z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.F = parcel.readInt();
        this.C = parcel.readLong();
        int readInt = parcel.readInt();
        this.f44082n = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f44082n.add(parcel.createByteArray());
        }
        this.f44083o = (com.google.android.exoplayer2.drm.DrmInitData) parcel.readParcelable(com.google.android.exoplayer2.drm.DrmInitData.class.getClassLoader());
        this.f44078g = (com.google.android.exoplayer2.metadata.Metadata) parcel.readParcelable(com.google.android.exoplayer2.metadata.Metadata.class.getClassLoader());
    }
}
