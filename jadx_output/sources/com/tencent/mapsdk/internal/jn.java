package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class jn extends com.tencent.mapsdk.internal.jm {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.jm> f50041a;

    private jn(java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList) {
        this.f50041a = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.jm
    public final boolean a(com.tencent.mapsdk.internal.jp jpVar) {
        if (this.f50041a.isEmpty()) {
            return true;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.jm> it = this.f50041a.iterator();
        while (it.hasNext()) {
            it.next().a(jpVar);
        }
        return true;
    }
}
