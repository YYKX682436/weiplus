package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.MapTileID */
/* loaded from: classes13.dex */
public class C4253xaef2a4a5 {

    /* renamed from: dataSource */
    private int f16531x4bd85c65;

    /* renamed from: priority */
    private int f16532xba8879a4;

    /* renamed from: tileTag */
    private int f16533xb1a0ce0c;
    private java.lang.String url;

    /* renamed from: x, reason: collision with root package name */
    private int f130209x;

    /* renamed from: y, reason: collision with root package name */
    private int f130210y;

    /* renamed from: z, reason: collision with root package name */
    private int f130211z;

    /* renamed from: getDataSource */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4243xc2aa3885 m35383x3a19145b() {
        return com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4243xc2aa3885.get(this.f16531x4bd85c65);
    }

    /* renamed from: getPriority */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c m35384x3662b71a() {
        return com.p314xaae8f345.map.lib.p496xc04b6a6a.EnumC4244x6254e26c.get(this.f16532xba8879a4);
    }

    /* renamed from: getTileTag */
    public int m35385xef6e09d6() {
        return this.f16533xb1a0ce0c;
    }

    /* renamed from: getUrl */
    public java.lang.String m35386xb5887639() {
        return this.url;
    }

    /* renamed from: getX */
    public int m35387x305bc2() {
        return this.f130209x;
    }

    /* renamed from: getY */
    public int m35388x305bc3() {
        return this.f130210y;
    }

    /* renamed from: getZ */
    public int m35389x305bc4() {
        return this.f130211z;
    }

    /* renamed from: toString */
    public java.lang.String m35390x9616526c() {
        return "MapTileID{x=" + this.f130209x + ", y=" + this.f130210y + ", z=" + this.f130211z + ", url='" + this.url + "', priority=" + this.f16532xba8879a4 + ", dataSource=" + this.f16531x4bd85c65 + ", tileTag=" + this.f16533xb1a0ce0c + '}';
    }
}
