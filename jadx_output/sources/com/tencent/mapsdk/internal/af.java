package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.al f48858a;

    public af(com.tencent.mapsdk.internal.al alVar) {
        this.f48858a = alVar;
    }

    private void a() {
        if (this.f48858a != null) {
            this.f48858a = null;
        }
    }

    private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> b() {
        com.tencent.mapsdk.internal.al alVar = this.f48858a;
        if (alVar == null) {
            return null;
        }
        return alVar.C();
    }
}
