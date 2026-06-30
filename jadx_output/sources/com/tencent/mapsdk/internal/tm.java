package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tm implements com.tencent.mapsdk.internal.ba {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f52153a;

    public tm(com.tencent.mapsdk.internal.tr trVar) {
        this.f52153a = trVar;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(com.tencent.mapsdk.internal.v vVar) {
        com.tencent.mapsdk.internal.tr trVar = this.f52153a;
        if (trVar == null) {
            return;
        }
        if (vVar != null) {
            trVar.a(((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50520t.a());
        }
        com.tencent.mapsdk.internal.tr trVar2 = this.f52153a;
        android.os.Handler handler = trVar2.f52209x;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a17 = trVar2.a();
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = trVar2.f52210y;
        if (cameraPosition == null || !cameraPosition.equals(a17)) {
            trVar2.f52209x.sendEmptyMessage(0);
            trVar2.f52210y = a17;
        }
    }
}
