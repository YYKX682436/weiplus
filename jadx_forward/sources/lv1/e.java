package lv1;

/* loaded from: classes7.dex */
public class e implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final dn.k f403027a;

    public e(dn.k kVar) {
        this.f403027a = kVar;
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
        dn.h hVar = new dn.h();
        hVar.f69553xb5f54fe9 = cronetTaskResult.f18200x139cb015;
        this.f403027a.r4((java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177050f).get(str), 0, null, hVar, false);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        dn.g gVar = new dn.g();
        gVar.f69496x83ec3dd = cronetDownloadProgress.f18155xf006a00e;
        gVar.f69500x8ab84c59 = cronetDownloadProgress.f18156xdd8f6e6c;
        this.f403027a.r4((java.lang.String) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.p1320x7643c6b5.ServiceC13094x9254a35e.f177050f).get(str), 0, gVar, null, false);
    }
}
