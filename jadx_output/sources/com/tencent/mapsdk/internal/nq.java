package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nq extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.nr> {

    /* renamed from: i, reason: collision with root package name */
    private final java.util.HashMap<java.lang.Long, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> f50582i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.HashMap<java.lang.Long, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> f50583j;

    public nq(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
        this.f50582i = new java.util.HashMap<>();
        this.f50583j = new java.util.HashMap<>();
    }

    private void g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = this.f50582i.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f50582i.get(it.next()));
        }
        if (this.f50582i.size() == this.f50583j.size() && this.f50582i.keySet().equals(this.f50583j.keySet())) {
            return;
        }
        this.f50583j.clear();
        this.f50583j.putAll(this.f50582i);
        this.f50568a.a(arrayList);
    }

    private com.tencent.mapsdk.internal.nq h() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> a(com.tencent.mapsdk.internal.nr nrVar) {
        return new com.tencent.mapsdk.internal.ns(this, nrVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c() {
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass87(ngVar.e_(), ngVar.f50567d));
        if (!ngVar.f50567d.f50584a.isBuildingHidden() || ngVar.f50567d.f50584a.getLatLngBounds() == null) {
            return;
        }
        this.f50582i.put(java.lang.Long.valueOf(ngVar.e_()), ngVar.f50567d.f50584a.getLatLngBounds());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> ngVar) {
        this.f50568a.c(ngVar.e_());
        this.f50582i.remove(java.lang.Long.valueOf(ngVar.e_()));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> ngVar) {
        ((com.tencent.mapsdk.internal.ns) ngVar).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.ns b(com.tencent.mapsdk.internal.nr nrVar) {
        return (com.tencent.mapsdk.internal.ns) super.b((com.tencent.mapsdk.internal.nq) nrVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass86>) new com.tencent.mapsdk.internal.tk.AnonymousClass86(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass86) 0L)).longValue());
        if (!ngVar.f50567d.f50584a.isBuildingHidden() || ngVar.f50567d.f50584a.getLatLngBounds() == null) {
            return;
        }
        this.f50582i.put(java.lang.Long.valueOf(ngVar.e_()), ngVar.f50567d.f50584a.getLatLngBounds());
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nr> a2(com.tencent.mapsdk.internal.nr nrVar) {
        return new com.tencent.mapsdk.internal.ns(this, nrVar);
    }

    public final java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo> b(long j17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        int intValue = ((java.lang.Integer) tkVar.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass91>) new com.tencent.mapsdk.internal.tk.AnonymousClass91(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass91) 0)).intValue();
        if (intValue <= 0) {
            return null;
        }
        com.tencent.mapsdk.internal.tk tkVar2 = this.f50568a;
        float[] fArr = (float[]) tkVar2.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass92>) new com.tencent.mapsdk.internal.tk.AnonymousClass92(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass92) new float[0]);
        com.tencent.mapsdk.internal.tk tkVar3 = this.f50568a;
        java.lang.String[] strArr = (java.lang.String[]) tkVar3.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass93>) new com.tencent.mapsdk.internal.tk.AnonymousClass93(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass93) new java.lang.String[0]);
        if (fArr == null || strArr == null || fArr.length != strArr.length || fArr.length != intValue) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < intValue; i17++) {
            arrayList.add(new com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo(i17, strArr[i17], fArr[i17]));
        }
        return arrayList;
    }

    public final void e(long j17) {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass98(j17));
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final boolean f() {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).isClickEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, long j17, java.lang.String str, java.lang.String str2) {
        android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> pair = new android.util.Pair<>(null, null);
        if (j17 > 0) {
            java.util.Iterator it = this.f50569b.entrySet().iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ns nsVar = (com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue();
                if (nsVar.e_() == j17) {
                    com.tencent.mapsdk.internal.nh.a aVar = new com.tencent.mapsdk.internal.nh.a(latLng, str, str2);
                    com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.ns.AnonymousClass1(aVar));
                    return new android.util.Pair<>(nsVar, aVar);
                }
            }
        }
        return pair;
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it = this.f50582i.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f50582i.get(it.next()));
        }
        if (this.f50582i.size() != this.f50583j.size() || !this.f50582i.keySet().equals(this.f50583j.keySet())) {
            this.f50583j.clear();
            this.f50583j.putAll(this.f50582i);
            this.f50568a.a(arrayList);
        }
        if (this.f50568a.y()) {
            this.f50568a.f51666j.f50522v = true;
        }
    }

    public final void a(long j17, int i17, float f17, boolean z17) {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass88(j17, i17, f17, z17));
            }
        }
    }

    public final void a(long j17) {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass89(j17));
            }
        }
    }

    public final int d(long j17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        return java.lang.Math.max(((java.lang.Integer) tkVar.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass95>) new com.tencent.mapsdk.internal.tk.AnonymousClass95(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass95) 0)).intValue(), 0);
    }

    public final void a(long j17, int i17) {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass96(j17, i17));
            }
        }
    }

    public final java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo> c(long j17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        com.tencent.mapsdk.internal.tk.AnonymousClass94 anonymousClass94 = new com.tencent.mapsdk.internal.tk.AnonymousClass94(j17);
        java.lang.String[] strArr = (java.lang.String[]) tkVar.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass94>) anonymousClass94, (com.tencent.mapsdk.internal.tk.AnonymousClass94) new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo materialVariantInfo = new com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo();
                materialVariantInfo.variantName = str;
                arrayList.add(materialVariantInfo);
            }
        }
        return arrayList;
    }

    public final void a(long j17, float f17, float f18, float f19) {
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mapsdk.internal.ns) ((java.util.Map.Entry) it.next()).getValue()).e_() == j17) {
                com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass97(j17, f17, f18, f19));
            }
        }
    }
}
