package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ay implements com.tencent.tencentmap.mapsdk.maps.model.TileOverlay {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qz f48875a;

    public ay(com.tencent.mapsdk.internal.qz qzVar) {
        this.f48875a = qzVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void clearTileCache() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        if (qzVar == null) {
            return;
        }
        qzVar.e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.tencent.mapsdk.internal.ay)) {
            return this.f48875a.equals(((com.tencent.mapsdk.internal.ay) obj).f48875a);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        return qzVar == null ? "" : qzVar.y();
    }

    public final int hashCode() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        if (qzVar == null) {
            return 0;
        }
        return qzVar.hashCode();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void reload() {
        if (this.f48875a == null) {
            return;
        }
        this.f48875a.a(!(r0.f51134r.getTileProvider() instanceof com.tencent.mapsdk.internal.ro));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void remove() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        if (qzVar == null) {
            return;
        }
        qzVar.remove();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void setDiskCacheDir(java.lang.String str) {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        if (qzVar == null || qzVar.f51134r == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        qzVar.f51134r.diskCacheDir(str);
        qzVar.f51135s = qzVar.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileOverlay
    public final void setZindex(int i17) {
        com.tencent.mapsdk.internal.qz qzVar = this.f48875a;
        if (qzVar == null) {
            return;
        }
        qzVar.a(i17);
    }
}
