package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mf implements com.tencent.map.tools.net.processor.RequestProcessor {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50417a;

    private mf(boolean z17) {
        this.f50417a = z17;
    }

    public static com.tencent.mapsdk.internal.mf a(boolean z17) {
        return new com.tencent.mapsdk.internal.mf(z17);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        if (this.f50417a) {
            java.lang.String str = netRequest.url;
            if (str.startsWith("http://")) {
                str = str.replaceFirst("http://", "https://");
            }
            netRequest.url = str;
        }
    }
}
