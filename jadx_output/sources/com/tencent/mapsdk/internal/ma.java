package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ma extends com.tencent.mapsdk.internal.lu {
    @Override // com.tencent.mapsdk.internal.lu
    public final byte[] f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        return (doGet == null || !doGet.available()) ? super.f(str) : doGet.data;
    }
}
