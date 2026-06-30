package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class at implements com.tencent.tencentmap.mapsdk.maps.model.CustomLayer {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qz f48861a;

    /* renamed from: b, reason: collision with root package name */
    private int f48862b;

    public at(com.tencent.mapsdk.internal.qz qzVar) {
        this.f48862b = -1;
        this.f48861a = qzVar;
        com.tencent.mapsdk.internal.az azVar = qzVar.f50680n;
        if (azVar == null || azVar.b() == null) {
            return;
        }
        this.f48862b = qzVar.f50680n.b().K;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.CustomLayer
    public final void clearDiskCache() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar == null) {
            return;
        }
        qzVar.e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.tencent.mapsdk.internal.at)) {
            return this.f48861a.equals(((com.tencent.mapsdk.internal.at) obj).f48861a);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        return qzVar == null ? "" : qzVar.y();
    }

    public final int hashCode() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar == null) {
            return 0;
        }
        return qzVar.hashCode();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar != null) {
            return qzVar.isRemoved();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar != null) {
            qzVar.releaseData();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.CustomLayer
    public final void reload() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar == null) {
            return;
        }
        qzVar.a(true);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        com.tencent.mapsdk.internal.qz qzVar = this.f48861a;
        if (qzVar == null) {
            return;
        }
        qzVar.remove();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.kx.f50200a, this.f48862b);
    }
}
