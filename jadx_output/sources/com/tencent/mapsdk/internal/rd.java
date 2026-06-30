package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rd extends com.tencent.mapsdk.internal.lu {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.re f51144a;

    public rd(com.tencent.mapsdk.internal.re reVar) {
        this.f51144a = reVar;
    }

    @Override // com.tencent.mapsdk.internal.lu
    public final byte[] f(java.lang.String str) {
        com.tencent.mapsdk.internal.re reVar;
        if (com.tencent.mapsdk.internal.hr.a(str) || !str.startsWith(com.tencent.mapsdk.internal.re.f51145a) || (reVar = this.f51144a) == null) {
            return null;
        }
        return reVar.a(str);
    }
}
