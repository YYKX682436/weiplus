package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rs extends com.tencent.mapsdk.internal.lu {

    /* renamed from: a, reason: collision with root package name */
    private static final int f51259a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.rs f51260b;

    private static com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse b(byte[] bArr) {
        for (int i17 = 0; i17 < 3; i17++) {
            try {
                com.tencent.map.tools.net.NetResponse rttData = ((com.tencent.mapsdk.internal.df) ((com.tencent.mapsdk.internal.du) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.du.class)).i()).rttData(bArr);
                if (rttData != null && rttData.data != null) {
                    com.tencent.mapsdk.internal.f fVar = new com.tencent.mapsdk.internal.f();
                    fVar.a(com.tencent.mapsdk.internal.rv.f51270c);
                    fVar.a(rttData.data);
                    return (com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse) fVar.b(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH, true, (java.lang.ClassLoader) null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static synchronized com.tencent.mapsdk.internal.rs c() {
        com.tencent.mapsdk.internal.rs rsVar;
        synchronized (com.tencent.mapsdk.internal.rs.class) {
            if (f51260b == null) {
                f51260b = new com.tencent.mapsdk.internal.rs();
            }
            rsVar = f51260b;
        }
        return rsVar;
    }

    @Override // com.tencent.mapsdk.internal.lu
    public final byte[] a(byte[] bArr) {
        com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse b17;
        if (bArr != null) {
            try {
                if (bArr.length == 0 || (b17 = b(bArr)) == null) {
                    return null;
                }
                return b17.result;
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    private static byte[] a(com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse rttResponse) {
        if (rttResponse == null) {
            return null;
        }
        return rttResponse.result;
    }
}
