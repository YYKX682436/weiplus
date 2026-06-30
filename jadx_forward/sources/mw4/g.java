package mw4;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.PipedOutputStream f413298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f413300d;

    public g(yz5.l lVar, java.io.PipedOutputStream pipedOutputStream, java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f413297a = lVar;
        this.f413298b = pipedOutputStream;
        this.f413299c = str;
        this.f413300d = atomicBoolean;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
        java.io.PipedOutputStream pipedOutputStream = this.f413298b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetReceiveChunkedData, length:");
        sb6.append(j17);
        sb6.append(", data:");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(chunkedData);
        sb6.append(chunkedData.f18148x2eefaa.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpCronetInterceptor", sb6.toString());
        try {
            this.f413300d.set(true);
            pipedOutputStream.write(chunkedData.f18148x2eefaa);
            pipedOutputStream.flush();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MpCronetInterceptor", "onCronetReceiveChunkedData exception = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader header, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpCronetInterceptor", "onCronetReceiveHeader, url:" + this.f413299c + ", status_code:" + i17);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headers = header.f18226x2f676f86;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(headers, "headers");
        int length = headers.length;
        for (int i18 = 0; i18 < length; i18++) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap = headers[i18];
            if (r26.i0.p(headerMap.key, "Content-Type", true)) {
                yz5.l lVar = this.f413297a;
                if (headerMap != null) {
                    lVar.mo146xb9724478(headerMap.f18216x6ac9171);
                } else {
                    lVar.mo146xb9724478("");
                }
                return 0;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        this.f413297a.mo146xb9724478("");
        java.lang.String str3 = this.f413299c;
        java.io.PipedOutputStream pipedOutputStream = this.f413298b;
        if (cronetTaskResult == null) {
            pipedOutputStream.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, result is null, url: " + str3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpCronetInterceptor", "onCronetTaskCompleted, filekey:" + str + ", errorCode:" + cronetTaskResult.f18200x139cb015 + ", errorMsg:" + cronetTaskResult.f18201x5336c059 + ", totalWriteByte:" + cronetTaskResult.f18211xdd08d6a3 + ", totalReceiveByte:" + cronetTaskResult.f18209x953f8a7 + ", totalSendByte:" + cronetTaskResult.f18210x4be65c14);
        try {
            if (this.f413300d.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpCronetInterceptor", "mp over mars chunk request success");
                pipedOutputStream.flush();
                pipedOutputStream.close();
                return;
            }
            if (cronetTaskResult.f18207xec0a8ff != 200) {
                pipedOutputStream.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, statusCode: " + cronetTaskResult.f18207xec0a8ff + ", url: " + str3);
                return;
            }
            byte[] bArr = cronetTaskResult.f18198x2eefaa;
            if (bArr != null) {
                pipedOutputStream.write(bArr);
                pipedOutputStream.flush();
                pipedOutputStream.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MpCronetInterceptor", "mp over mars request success");
                return;
            }
            pipedOutputStream.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, data is empty, url: " + str3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MpCronetInterceptor", "onCronetTaskCompleted exception = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}
