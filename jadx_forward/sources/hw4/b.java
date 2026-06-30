package hw4;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f367120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw4.a f367121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.j2 f367122c;

    public b(hw4.a aVar, com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var) {
        this.f367121b = aVar;
        this.f367122c = j2Var;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f367120a) {
            return 0;
        }
        this.f367120a = true;
        return this.f367121b.a(this.f367122c, responseHeader, i17, str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        this.f367121b.c(this.f367122c, str, cronetTaskResult, str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        this.f367121b.b(this.f367122c, str, cronetDownloadProgress);
    }
}
