package df;

/* loaded from: classes7.dex */
public final class m implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.l f311043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f311044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams f311045c;

    public m(df.l lVar, int i17, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams) {
        this.f311043a = lVar;
        this.f311044b = i17;
        this.f311045c = cronetRequestParams;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult result, java.lang.String str2) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.Runnable runnable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f311043a.b();
        java.lang.String[] strArr3 = new java.lang.String[0];
        java.lang.String[] strArr4 = new java.lang.String[0];
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headerMapArr = result.f18202x2f676f86;
        if (headerMapArr != null) {
            int length = headerMapArr.length;
            java.lang.String[] strArr5 = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr5[i17] = "";
            }
            int length2 = result.f18202x2f676f86.length;
            java.lang.String[] strArr6 = new java.lang.String[length2];
            for (int i18 = 0; i18 < length2; i18++) {
                strArr6[i18] = "";
            }
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headers = result.f18202x2f676f86;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(headers, "headers");
            int length3 = headers.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length3) {
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap = headers[i19];
                java.lang.String key = headerMap.key;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
                strArr5[i27] = key;
                java.lang.String value = headerMap.f18216x6ac9171;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
                strArr6[i27] = value;
                i19++;
                i27++;
            }
            strArr = strArr5;
            strArr2 = strArr6;
        } else {
            strArr = strArr3;
            strArr2 = strArr4;
        }
        byte[] bArr = result.f18198x2eefaa;
        com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95940x584236c7(this.f311044b, result.f18200x139cb015, result.f18207xec0a8ff, strArr, strArr2, bArr == null ? new byte[0] : bArr);
        java.lang.Object obj = df.n.f311056g;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = this.f311045c;
        synchronized (obj) {
            java.util.HashSet hashSet = df.n.f311055f;
            if (hashSet.contains(cronetRequestParams.f18180xcb7ef180)) {
                hashSet.remove(cronetRequestParams.f18180xcb7ef180);
                df.n.f311053d--;
                java.util.LinkedList linkedList = df.n.f311054e;
                if ((!linkedList.isEmpty()) && (runnable = (java.lang.Runnable) linkedList.poll()) != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}
