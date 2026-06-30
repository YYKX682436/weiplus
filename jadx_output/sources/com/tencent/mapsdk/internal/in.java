package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class in extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    protected boolean f49911i;

    /* renamed from: j, reason: collision with root package name */
    protected java.util.List<com.tencent.mapsdk.internal.im> f49912j;

    public in(boolean z17) {
        this.f49912j = null;
        this.f49911i = z17;
        this.f49912j = new java.util.ArrayList();
    }

    public final void a(com.tencent.mapsdk.internal.im imVar) {
        if (imVar == null) {
            return;
        }
        this.f49912j.add(imVar);
    }

    public final void c() {
        java.util.List<com.tencent.mapsdk.internal.im> list = this.f49912j;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(long j17) {
        int size;
        super.a(j17);
        java.util.List<com.tencent.mapsdk.internal.im> list = this.f49912j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.im imVar = this.f49912j.get(i17);
            if (imVar != null) {
                imVar.a(j17);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        int size;
        java.util.List<com.tencent.mapsdk.internal.im> list = this.f49912j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.im imVar = this.f49912j.get(i17);
            if (imVar != null) {
                if (this.f49911i) {
                    imVar.a(f17, interpolator);
                } else {
                    imVar.a(f17, imVar.f49908f);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.im
    public final boolean a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        java.util.List<com.tencent.mapsdk.internal.im> list;
        int size;
        boolean a17 = super.a(geoPoint, geoPoint2);
        if (!a17 || (list = this.f49912j) == null || (size = list.size()) == 0) {
            return false;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.im imVar = this.f49912j.get(i17);
            if (imVar != null) {
                a17 = a17 && imVar.a(geoPoint, geoPoint2);
            }
        }
        return a17;
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(com.tencent.mapsdk.internal.im.b bVar) {
        int size;
        super.a(bVar);
        java.util.List<com.tencent.mapsdk.internal.im> list = this.f49912j;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mapsdk.internal.im imVar = this.f49912j.get(i17);
            if (imVar != null) {
                imVar.a(bVar);
            }
        }
    }
}
