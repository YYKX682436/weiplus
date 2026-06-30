package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class WMMaterialInfo {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.WMMaterialInfo.WMMaterialType f48348a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48349b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48350c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48352e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48353f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f48354g;

    /* renamed from: h, reason: collision with root package name */
    public final long f48355h;

    /* loaded from: classes5.dex */
    public enum WMMaterialType {
        None(-1),
        /* JADX INFO: Fake field, exist only in values array */
        Filter(0),
        /* JADX INFO: Fake field, exist only in values array */
        Font(1),
        /* JADX INFO: Fake field, exist only in values array */
        Sticker(2),
        /* JADX INFO: Fake field, exist only in values array */
        TextStyle(3),
        /* JADX INFO: Fake field, exist only in values array */
        TextColor(4);


        /* renamed from: d, reason: collision with root package name */
        public final int f48358d;

        WMMaterialType(int i17) {
            this.f48358d = i17;
        }

        public static com.tencent.maas.model.WMMaterialInfo.WMMaterialType a(int i17) {
            for (com.tencent.maas.model.WMMaterialInfo.WMMaterialType wMMaterialType : values()) {
                if (wMMaterialType.getValue() == i17) {
                    return wMMaterialType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.f48358d;
        }
    }

    public WMMaterialInfo(int i17, java.lang.String str, int i18) {
        this.f48348a = com.tencent.maas.model.WMMaterialInfo.WMMaterialType.a(i17);
        this.f48349b = "";
        this.f48350c = str;
        this.f48351d = "";
        this.f48352e = i18;
        this.f48353f = "";
        this.f48354g = null;
        this.f48355h = 0L;
    }

    public java.lang.Object getData() {
        return this.f48354g;
    }

    public java.lang.String getDownloadURL() {
        return this.f48353f;
    }

    public java.lang.String getMaterialID() {
        return this.f48350c;
    }

    public java.lang.String getMaterialName() {
        return this.f48349b;
    }

    public com.tencent.maas.model.WMMaterialInfo.WMMaterialType getMaterialType() {
        return this.f48348a;
    }

    public int getThumbnailResId() {
        return this.f48352e;
    }

    public java.lang.String getThumbnailURL() {
        return this.f48351d;
    }

    public long getVersion() {
        return this.f48355h;
    }

    public java.lang.String toString() {
        return "MJMaterialInfo{materialType=" + this.f48348a.f48358d + ", materialName='" + this.f48349b + "', materialID='" + this.f48350c + "', thumbnailURL='" + this.f48351d + "', downloadURL='" + this.f48353f + "', version=" + this.f48355h + '}';
    }

    public WMMaterialInfo(int i17, java.lang.String str, java.lang.Object obj) {
        this.f48348a = com.tencent.maas.model.WMMaterialInfo.WMMaterialType.a(i17);
        this.f48349b = "";
        this.f48350c = str;
        this.f48351d = "";
        this.f48352e = -1;
        this.f48353f = "";
        this.f48354g = obj;
        this.f48355h = 0L;
    }

    public WMMaterialInfo(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f48348a = com.tencent.maas.model.WMMaterialInfo.WMMaterialType.a(i17);
        this.f48349b = "";
        this.f48350c = str;
        this.f48351d = str2;
        this.f48352e = -1;
        this.f48353f = str3;
        this.f48354g = null;
        this.f48355h = 0L;
    }

    public WMMaterialInfo(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
        this.f48348a = com.tencent.maas.model.WMMaterialInfo.WMMaterialType.a(i17);
        this.f48349b = str;
        this.f48350c = str2;
        this.f48351d = str3;
        this.f48352e = -1;
        this.f48353f = str4;
        this.f48354g = null;
        this.f48355h = j17;
    }

    public WMMaterialInfo(com.tencent.maas.model.WMMaterialInfo.WMMaterialType wMMaterialType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, long j17) {
        this.f48348a = wMMaterialType;
        this.f48349b = str;
        this.f48350c = str2;
        this.f48351d = str3;
        this.f48352e = i17;
        this.f48353f = str4;
        this.f48354g = null;
        this.f48355h = j17;
    }
}
