package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.WMMaterialInfo */
/* loaded from: classes5.dex */
public class C4126xb75206b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType f129881a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129882b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129883c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129884d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129885e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129886f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f129887g;

    /* renamed from: h, reason: collision with root package name */
    public final long f129888h;

    /* renamed from: com.tencent.maas.model.WMMaterialInfo$WMMaterialType */
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
        public final int f129891d;

        WMMaterialType(int i17) {
            this.f129891d = i17;
        }

        public static com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType a(int i17) {
            for (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType wMMaterialType : m33961xcee59d22()) {
                if (wMMaterialType.m33962x754a37bb() == i17) {
                    return wMMaterialType;
                }
            }
            return None;
        }

        /* renamed from: getValue */
        public int m33962x754a37bb() {
            return this.f129891d;
        }
    }

    public C4126xb75206b(int i17, java.lang.String str, int i18) {
        this.f129881a = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType.a(i17);
        this.f129882b = "";
        this.f129883c = str;
        this.f129884d = "";
        this.f129885e = i18;
        this.f129886f = "";
        this.f129887g = null;
        this.f129888h = 0L;
    }

    /* renamed from: getData */
    public java.lang.Object m33950xfb7e5820() {
        return this.f129887g;
    }

    /* renamed from: getDownloadURL */
    public java.lang.String m33951x91a59a91() {
        return this.f129886f;
    }

    /* renamed from: getMaterialID */
    public java.lang.String m33952xd8cf7878() {
        return this.f129883c;
    }

    /* renamed from: getMaterialName */
    public java.lang.String m33953xe2d5fac8() {
        return this.f129882b;
    }

    /* renamed from: getMaterialType */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType m33954xe2d90f77() {
        return this.f129881a;
    }

    /* renamed from: getThumbnailResId */
    public int m33955x1b265945() {
        return this.f129885e;
    }

    /* renamed from: getThumbnailURL */
    public java.lang.String m33956x4baed359() {
        return this.f129884d;
    }

    /* renamed from: getVersion */
    public long m33957x52c258a2() {
        return this.f129888h;
    }

    /* renamed from: toString */
    public java.lang.String m33958x9616526c() {
        return "MJMaterialInfo{materialType=" + this.f129881a.f129891d + ", materialName='" + this.f129882b + "', materialID='" + this.f129883c + "', thumbnailURL='" + this.f129884d + "', downloadURL='" + this.f129886f + "', version=" + this.f129888h + '}';
    }

    public C4126xb75206b(int i17, java.lang.String str, java.lang.Object obj) {
        this.f129881a = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType.a(i17);
        this.f129882b = "";
        this.f129883c = str;
        this.f129884d = "";
        this.f129885e = -1;
        this.f129886f = "";
        this.f129887g = obj;
        this.f129888h = 0L;
    }

    public C4126xb75206b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f129881a = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType.a(i17);
        this.f129882b = "";
        this.f129883c = str;
        this.f129884d = str2;
        this.f129885e = -1;
        this.f129886f = str3;
        this.f129887g = null;
        this.f129888h = 0L;
    }

    public C4126xb75206b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
        this.f129881a = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType.a(i17);
        this.f129882b = str;
        this.f129883c = str2;
        this.f129884d = str3;
        this.f129885e = -1;
        this.f129886f = str4;
        this.f129887g = null;
        this.f129888h = j17;
    }

    public C4126xb75206b(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4126xb75206b.WMMaterialType wMMaterialType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, long j17) {
        this.f129881a = wMMaterialType;
        this.f129882b = str;
        this.f129883c = str2;
        this.f129884d = str3;
        this.f129885e = i17;
        this.f129886f = str4;
        this.f129887g = null;
        this.f129888h = j17;
    }
}
