package fa3;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342287f;

    public d(fa3.b bVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342287f = bVar;
        this.f342285d = str;
        this.f342286e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            str = fa3.t.b(this.f342285d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppCameraManager", "stopRecord, remux failed, callback with origin videoexp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            str = null;
        }
        ik1.h0.b(new fa3.c(this, str));
    }
}
