package s65;

/* loaded from: classes11.dex */
public class f0 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f484980a;

    /* renamed from: b, reason: collision with root package name */
    public int f484981b;

    /* renamed from: c, reason: collision with root package name */
    public final q65.b f484982c;

    /* renamed from: d, reason: collision with root package name */
    public org.apache.http.client.HttpClient f484983d = null;

    /* renamed from: e, reason: collision with root package name */
    public org.apache.http.client.methods.HttpGet f484984e = null;

    /* renamed from: f, reason: collision with root package name */
    public org.apache.http.HttpResponse f484985f = null;

    /* renamed from: g, reason: collision with root package name */
    public org.apache.http.HttpEntity f484986g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.OutputStream f484987h = new s65.e0(this);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s65.g0 f484988i;

    public f0(s65.g0 g0Var, int i17, int i18, q65.b bVar) {
        this.f484988i = g0Var;
        this.f484980a = i17;
        this.f484981b = i18;
        this.f484982c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01af, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r14.getConnectionManager().shutdown();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
    
        if (r14 != null) goto L30;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.f0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        org.apache.http.client.methods.HttpGet httpGet = this.f484984e;
        if (httpGet != null) {
            httpGet.abort();
        }
        org.apache.http.HttpEntity httpEntity = this.f484986g;
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetUpdatePackFromCDN", e17, "", new java.lang.Object[0]);
            }
        }
        org.apache.http.client.HttpClient httpClient = this.f484983d;
        if (httpClient != null) {
            httpClient.getConnectionManager().shutdown();
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f484982c.d(((java.lang.Integer) obj).intValue(), 0, null);
    }
}
