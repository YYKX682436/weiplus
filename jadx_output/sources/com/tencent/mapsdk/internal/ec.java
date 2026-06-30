package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ec<OUT extends com.tencent.map.tools.json.JsonComposer> extends com.tencent.mapsdk.internal.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Class<OUT> f49234a;

    public ec(java.lang.Class<OUT> cls) {
        this.f49234a = cls;
    }

    private com.tencent.mapsdk.internal.ec.a<OUT> b(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.ec.a<>(netResponse, this.f49234a);
    }

    @Override // com.tencent.mapsdk.internal.dz, com.tencent.mapsdk.internal.ed
    public final /* synthetic */ com.tencent.map.tools.net.NetResponse a(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.ec.a(netResponse, this.f49234a);
    }

    /* loaded from: classes13.dex */
    public static class a<OUT extends com.tencent.map.tools.json.JsonComposer> extends com.tencent.map.tools.net.NetResponse {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f49235a;

        /* renamed from: b, reason: collision with root package name */
        public OUT f49236b;

        public a(com.tencent.map.tools.net.NetResponse netResponse) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    this.f49235a = new java.lang.String(netResponse.data, netResponse.charset);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }

        private java.lang.String a() {
            return this.f49235a;
        }

        private OUT b() {
            return this.f49236b;
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            java.lang.String str;
            return (!super.available() || (str = this.f49235a) == null || android.text.TextUtils.isEmpty(str)) ? false : true;
        }

        public a(com.tencent.map.tools.net.NetResponse netResponse, java.lang.Class<OUT> cls) {
            clone(netResponse);
            if (netResponse.available()) {
                try {
                    java.lang.String str = new java.lang.String(netResponse.data, netResponse.charset);
                    this.f49235a = str;
                    this.f49236b = (OUT) com.tencent.map.tools.json.JsonUtils.parseToModel(str, cls, new java.lang.Object[0]);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }
    }
}
