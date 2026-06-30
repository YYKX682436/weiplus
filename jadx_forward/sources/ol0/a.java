package ol0;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.j2 f427652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ol0.b f427653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427654c;

    public a(com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var, ol0.b bVar, java.lang.String str) {
        this.f427652a = j2Var;
        this.f427653b = bVar;
        this.f427654c = str;
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
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        this.f427652a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KaraModelDownloadHelper", "downloadUrl onCronetTaskCompleted statusCode: %s", java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff));
        int i17 = cronetTaskResult.f18207xec0a8ff;
        ol0.b bVar = this.f427653b;
        if (i17 != 200) {
            bVar.a();
        } else {
            bVar.b(this.f427654c);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}
