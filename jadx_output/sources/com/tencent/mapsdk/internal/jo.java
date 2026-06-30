package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class jo extends com.tencent.mapsdk.internal.jm {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.jm> f50042a;

    private jo(java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList) {
        this.f50042a = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.jm
    public final boolean a(com.tencent.mapsdk.internal.jp jpVar) {
        if (this.f50042a.isEmpty()) {
            return true;
        }
        com.tencent.mapsdk.internal.jm jmVar = this.f50042a.get(0);
        if (jmVar.a(jpVar)) {
            this.f50042a.remove(jmVar);
        }
        return this.f50042a.isEmpty();
    }
}
