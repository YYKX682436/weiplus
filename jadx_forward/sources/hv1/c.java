package hv1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f366805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hv1.d f366806f;

    public c(hv1.d dVar, java.lang.String str, dn.h hVar) {
        this.f366806f = dVar;
        this.f366804d = str;
        this.f366805e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f366806f.f366810f;
        java.lang.String str = this.f366804d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.l lVar = mVar.f323329p0;
        if (lVar != null) {
            lVar.x(str, this.f366805e);
        }
    }
}
