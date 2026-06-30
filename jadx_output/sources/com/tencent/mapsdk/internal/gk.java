package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gk {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.gj> f49591a = new java.util.ArrayList<>();

    private com.tencent.mapsdk.internal.gj a(int i17) {
        return this.f49591a.get(i17);
    }

    private int b() {
        return this.f49591a.size();
    }

    public final void a(com.tencent.mapsdk.internal.gj gjVar) {
        this.f49591a.add(gjVar);
    }

    private void a(com.tencent.mapsdk.internal.gk gkVar) {
        this.f49591a.addAll(gkVar.f49591a);
    }

    public final float[] a() {
        float[] fArr = new float[this.f49591a.size() * 3];
        for (int i17 = 0; i17 < this.f49591a.size(); i17++) {
            int i18 = i17 * 3;
            fArr[i18 + 0] = this.f49591a.get(i17).f49587a;
            fArr[i18 + 1] = this.f49591a.get(i17).f49588b;
            fArr[i18 + 2] = this.f49591a.get(i17).f49589c;
        }
        return fArr;
    }
}
