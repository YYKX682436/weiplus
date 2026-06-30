package b73;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f99746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b73.h f99747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b73.i f99748g;

    public f(b73.i iVar, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, b73.h hVar) {
        this.f99748g = iVar;
        this.f99745d = str;
        this.f99746e = n3Var;
        this.f99747f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b73.j jVar = new b73.j(0, "Inventory refresh successful.");
        android.content.Intent intent = new android.content.Intent();
        try {
            int b17 = b73.i.b(this.f99748g, intent, this.f99745d);
            if (b17 != 0) {
                jVar = new b73.j(b17, "Error refreshing inventory (querying owned items).");
            }
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e17, "", new java.lang.Object[0]);
            jVar = new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "Remote exception while refreshing inventory.");
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e18, "", new java.lang.Object[0]);
            jVar = new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3, "Error parsing JSON response while refreshing inventory.");
        }
        intent.putExtra("RESPONSE_CODE", jVar.a());
        this.f99746e.mo50293x3498a0(new b73.e(this, jVar, intent));
    }
}
