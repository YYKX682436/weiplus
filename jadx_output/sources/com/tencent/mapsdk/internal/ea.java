package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ea extends com.tencent.mapsdk.internal.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f49227a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f49228b;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.tools.net.NetResponse {

        /* renamed from: a, reason: collision with root package name */
        private java.io.File f49229a;

        public a(com.tencent.map.tools.net.NetResponse netResponse, java.lang.String str, java.lang.String str2) {
            clone(netResponse);
            if (netResponse.available()) {
                this.f49229a = new java.io.File(str, str2);
                java.io.File file = new java.io.File(str, str2 + ".tmp");
                com.tencent.mapsdk.internal.ks.b(file);
                if (com.tencent.mapsdk.internal.ks.a(file) && com.tencent.mapsdk.internal.ks.a(file, netResponse.data) && com.tencent.mapsdk.internal.ks.a(file, this.f49229a)) {
                    com.tencent.mapsdk.internal.ks.b(file);
                }
            }
        }

        private java.io.File a() {
            return this.f49229a;
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            java.io.File file;
            return super.available() && (file = this.f49229a) != null && file.exists();
        }
    }

    public ea(java.lang.String str) {
        this.f49227a = str;
    }

    private com.tencent.mapsdk.internal.ea.a b(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.ea.a(netResponse, this.f49228b, this.f49227a);
    }

    @Override // com.tencent.mapsdk.internal.dz, com.tencent.mapsdk.internal.ed
    public final java.lang.Object[] a(int[] iArr, java.lang.Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length == 1 && objArr.length > 0) {
            java.lang.Object obj = objArr[iArr[0]];
            if (obj instanceof java.lang.String) {
                this.f49228b = java.lang.String.valueOf(obj);
            }
        }
        return super.a(iArr, objArr);
    }

    @Override // com.tencent.mapsdk.internal.dz, com.tencent.mapsdk.internal.ed
    public final /* synthetic */ com.tencent.map.tools.net.NetResponse a(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.ea.a(netResponse, this.f49228b, this.f49227a);
    }
}
