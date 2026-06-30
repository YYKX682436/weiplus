package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class mc extends com.tencent.mapsdk.internal.lu {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.map.tools.net.NetResponse f50411a;

    private static java.io.InputStream a(java.io.InputStream inputStream) {
        return inputStream;
    }

    @Override // com.tencent.mapsdk.internal.lu
    public final void b() {
        super.b();
        com.tencent.map.tools.net.NetResponse netResponse = this.f50411a;
        if (netResponse != null) {
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) netResponse.getInputStream());
        }
    }

    @Override // com.tencent.mapsdk.internal.lu
    public java.io.InputStream e(java.lang.String str) {
        com.tencent.map.tools.net.NetRequest.NetRequestBuilder url = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str);
        a(url);
        com.tencent.map.tools.net.NetResponse doStream = url.doStream();
        this.f50411a = doStream;
        if (doStream == null) {
            a(new com.tencent.map.tools.net.NetResponse(url.getNetRequest()));
            return null;
        }
        java.io.InputStream inputStream = doStream.getInputStream();
        a(this.f50411a);
        return inputStream;
    }

    public void a(com.tencent.map.tools.net.NetRequest.NetRequestBuilder netRequestBuilder) {
    }

    public void a(com.tencent.map.tools.net.NetResponse netResponse) {
    }
}
