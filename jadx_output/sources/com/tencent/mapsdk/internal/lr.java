package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lr extends com.tencent.mapsdk.internal.lq {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50353b = "URLNetImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f50354c = false;

    /* renamed from: d, reason: collision with root package name */
    private java.net.HttpURLConnection f50355d;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final int f50358c = 3;

        /* renamed from: a, reason: collision with root package name */
        int f50359a;

        /* renamed from: b, reason: collision with root package name */
        boolean f50360b = true;

        public a(int i17) {
            this.f50359a = i17;
            if (i17 > 3) {
                this.f50359a = 3;
            }
            if (this.f50359a <= 0) {
                this.f50359a = 1;
            }
        }

        private boolean b() {
            return this.f50360b && this.f50359a > 0;
        }

        private void c() {
            this.f50360b = false;
        }

        public final void a() {
            this.f50359a--;
        }
    }

    public static /* synthetic */ java.net.HttpURLConnection a(com.tencent.mapsdk.internal.lr lrVar) {
        lrVar.f50355d = null;
        return null;
    }

    private static void b() {
        if (java.lang.Integer.parseInt(android.os.Build.VERSION.SDK) < 8) {
            java.lang.System.setProperty("http.keepAlive", "false");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.map.tools.net.NetResponse c(com.tencent.map.tools.net.NetRequest r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.lr.c(com.tencent.map.tools.net.NetRequest):com.tencent.map.tools.net.NetResponse");
    }

    private static void d(com.tencent.map.tools.net.NetRequest netRequest) {
        for (com.tencent.map.tools.net.processor.Processor processor : netRequest.processors) {
            if (processor instanceof com.tencent.map.tools.net.processor.RequestProcessor) {
                ((com.tencent.map.tools.net.processor.RequestProcessor) processor).onRequest(netRequest);
            }
        }
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final boolean cancel() {
        java.net.HttpURLConnection httpURLConnection = this.f50355d;
        if (httpURLConnection == null) {
            return false;
        }
        httpURLConnection.disconnect();
        return true;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final com.tencent.map.tools.net.NetResponse doRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        netRequest.addProcessor(new com.tencent.mapsdk.internal.me());
        return c(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final com.tencent.map.tools.net.NetResponse openStream(com.tencent.map.tools.net.NetRequest netRequest) {
        netRequest.addProcessor(new com.tencent.mapsdk.internal.ml());
        return c(netRequest);
    }

    private static void a(com.tencent.map.tools.net.NetResponse netResponse) {
        java.util.List<com.tencent.map.tools.net.processor.Processor> processors = netResponse.getProcessors();
        java.util.Collections.reverse(processors);
        for (com.tencent.map.tools.net.processor.Processor processor : processors) {
            if (processor instanceof com.tencent.map.tools.net.processor.ResponseProcessor) {
                ((com.tencent.map.tools.net.processor.ResponseProcessor) processor).onResponse(netResponse);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.lq
    public final com.tencent.map.tools.net.NetResponse b(com.tencent.map.tools.net.NetRequest netRequest) {
        netRequest.setNetMethod(com.tencent.map.tools.net.NetMethod.POST);
        return doRequest(netRequest);
    }

    @Override // com.tencent.mapsdk.internal.lq
    public final com.tencent.map.tools.net.NetResponse a(com.tencent.map.tools.net.NetRequest netRequest) {
        netRequest.setNetMethod(com.tencent.map.tools.net.NetMethod.GET);
        return doRequest(netRequest);
    }

    @Override // com.tencent.mapsdk.internal.lq
    public final void a() {
        if (java.lang.Integer.parseInt(android.os.Build.VERSION.SDK) < 8) {
            java.lang.System.setProperty("http.keepAlive", "false");
        }
    }
}
