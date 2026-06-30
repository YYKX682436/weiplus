package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class MapTileID {
    private int dataSource;
    private int priority;
    private int tileTag;
    private java.lang.String url;

    /* renamed from: x, reason: collision with root package name */
    private int f48676x;

    /* renamed from: y, reason: collision with root package name */
    private int f48677y;

    /* renamed from: z, reason: collision with root package name */
    private int f48678z;

    public com.tencent.map.lib.models.DataSource getDataSource() {
        return com.tencent.map.lib.models.DataSource.get(this.dataSource);
    }

    public com.tencent.map.lib.models.DownloadPriority getPriority() {
        return com.tencent.map.lib.models.DownloadPriority.get(this.priority);
    }

    public int getTileTag() {
        return this.tileTag;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public int getX() {
        return this.f48676x;
    }

    public int getY() {
        return this.f48677y;
    }

    public int getZ() {
        return this.f48678z;
    }

    public java.lang.String toString() {
        return "MapTileID{x=" + this.f48676x + ", y=" + this.f48677y + ", z=" + this.f48678z + ", url='" + this.url + "', priority=" + this.priority + ", dataSource=" + this.dataSource + ", tileTag=" + this.tileTag + '}';
    }
}
