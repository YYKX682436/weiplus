package b73;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f18213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b73.h f18214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b73.i f18215g;

    public f(b73.i iVar, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var, b73.h hVar) {
        this.f18215g = iVar;
        this.f18212d = str;
        this.f18213e = n3Var;
        this.f18214f = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b73.j jVar = new b73.j(0, "Inventory refresh successful.");
        android.content.Intent intent = new android.content.Intent();
        try {
            int b17 = b73.i.b(this.f18215g, intent, this.f18212d);
            if (b17 != 0) {
                jVar = new b73.j(b17, "Error refreshing inventory (querying owned items).");
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e17, "", new java.lang.Object[0]);
            jVar = new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "Remote exception while refreshing inventory.");
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e18, "", new java.lang.Object[0]);
            jVar = new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR, "Error parsing JSON response while refreshing inventory.");
        }
        intent.putExtra("RESPONSE_CODE", jVar.a());
        this.f18213e.post(new b73.e(this, jVar, intent));
    }
}
