package fa3;

/* loaded from: classes10.dex */
public class f implements bi3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342289a;

    public f(fa3.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342289a = gVar;
    }

    @Override // bi3.f
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppCameraManager", "LiteAppCamera InitErrorCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("error", "camera init error");
        this.f342289a.f(hashMap);
    }
}
