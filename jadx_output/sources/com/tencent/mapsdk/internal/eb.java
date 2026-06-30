package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class eb<IN extends com.qq.taf.jce.MapJceStruct, OUT extends com.qq.taf.jce.MapJceStruct> extends com.tencent.mapsdk.internal.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Class<IN> f49230a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Class<OUT> f49231b;

    /* renamed from: c, reason: collision with root package name */
    private com.qq.taf.jce.MapJceStruct f49232c;

    /* loaded from: classes13.dex */
    public static class a<OUT extends com.qq.taf.jce.MapJceStruct> extends com.tencent.map.tools.net.NetResponse {

        /* renamed from: a, reason: collision with root package name */
        public OUT f49233a;

        public a(com.tencent.map.tools.net.NetResponse netResponse, java.lang.Class<OUT> cls) {
            clone(netResponse);
            byte[] bArr = netResponse.data;
            if (bArr != null) {
                com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr);
                OUT out = (OUT) com.tencent.mapsdk.internal.hp.a(cls, new java.lang.Object[0]);
                this.f49233a = out;
                if (out != null) {
                    out.readFrom(mVar);
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50207h, "[JCE-RESP]:" + this.f49233a);
        }

        private OUT a() {
            return this.f49233a;
        }

        @Override // com.tencent.map.tools.net.NetResponse
        public final boolean available() {
            return super.available() && this.f49233a != null;
        }
    }

    public eb(java.lang.Class<IN> cls, java.lang.Class<OUT> cls2) {
        this.f49230a = cls;
        this.f49231b = cls2;
    }

    private com.tencent.mapsdk.internal.eb.a<OUT> b(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.eb.a<>(netResponse, this.f49231b);
    }

    @Override // com.tencent.mapsdk.internal.dz, com.tencent.mapsdk.internal.ed
    public final java.lang.Object[] a(int[] iArr, java.lang.Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length > 0 && objArr.length > 0) {
            java.util.List asList = java.util.Arrays.asList(objArr);
            int i17 = iArr[0];
            int i18 = iArr.length == 1 ? i17 : iArr[1];
            if (objArr.length - 1 >= i18 && i17 >= 0) {
                com.qq.taf.jce.MapJceStruct mapJceStruct = (com.qq.taf.jce.MapJceStruct) com.tencent.mapsdk.internal.hp.a(this.f49230a, java.util.Arrays.copyOfRange(objArr, i17, i18 + 1));
                this.f49232c = mapJceStruct;
                byte[] bArr = new byte[0];
                if (mapJceStruct != null) {
                    bArr = mapJceStruct.toByteArray();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i19 = 0; i19 < asList.size(); i19++) {
                    if (i19 < i17 || i19 > i18) {
                        arrayList.add(asList.get(i19));
                    } else if (i19 == i18) {
                        arrayList.add(bArr);
                    }
                }
                return arrayList.toArray();
            }
        }
        return super.a(iArr, objArr);
    }

    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("JceResolver{inJce=");
        stringBuffer.append(this.f49232c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.tencent.mapsdk.internal.dz, com.tencent.mapsdk.internal.ed
    public final /* synthetic */ com.tencent.map.tools.net.NetResponse a(com.tencent.map.tools.net.NetResponse netResponse) {
        return new com.tencent.mapsdk.internal.eb.a(netResponse, this.f49231b);
    }
}
