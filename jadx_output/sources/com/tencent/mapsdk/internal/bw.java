package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bw implements com.tencent.mapsdk.internal.gd.a {

    /* renamed from: a, reason: collision with root package name */
    public static final double f49048a = 1.0d;

    /* renamed from: d, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.gg f49049d = new com.tencent.mapsdk.internal.gg(1.0d);

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.fu f49050b;

    /* renamed from: c, reason: collision with root package name */
    double f49051c;

    public bw(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17) {
        this.f49050b = f49049d.d(latLng);
        if (d17 >= 0.0d) {
            this.f49051c = d17;
        } else {
            this.f49051c = 1.0d;
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLng b() {
        return f49049d.b(this.f49050b);
    }

    private double c() {
        return this.f49051c;
    }

    @Override // com.tencent.mapsdk.internal.gd.a
    public final com.tencent.mapsdk.internal.fu a() {
        return this.f49050b;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.f49050b = f49049d.d(latLng);
    }

    private void a(double d17) {
        if (d17 >= 0.0d) {
            this.f49051c = d17;
        } else {
            this.f49051c = 1.0d;
        }
    }

    public bw(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this(latLng, 1.0d);
    }
}
