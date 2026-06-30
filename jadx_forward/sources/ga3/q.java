package ga3;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c f351396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351397e;

    public q(ga3.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c) {
        this.f351397e = vVar;
        this.f351396d = c12420xb1146e9c;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f351397e.f351410c) {
            ga3.v vVar = this.f351397e;
            vVar.f351411d = this.f351396d;
            ga3.v.c(vVar);
        }
    }
}
