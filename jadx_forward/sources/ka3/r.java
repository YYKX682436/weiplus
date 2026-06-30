package ka3;

/* loaded from: classes15.dex */
public final class r implements dd1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka3.u f387616a;

    public r(ka3.u uVar) {
        this.f387616a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0389  */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    @Override // dd1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r18, android.nfc.cardemulation.HostApduService r19) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka3.r.a(org.json.JSONObject, android.nfc.cardemulation.HostApduService):void");
    }

    @Override // dd1.a
    public void b(org.json.JSONObject resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        ka3.m mVar = ka3.u.f387620r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onServiceCallback=");
        sb6.append(resp);
        sb6.append(", nfcModuleCallback==null ");
        ka3.u uVar = this.f387616a;
        sb6.append(uVar.f387626e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppNFCServiceMgr", sb6.toString());
        if (ka3.b.a(resp)) {
            ka3.u.a(uVar);
        }
        ka3.i iVar = uVar.f387626e;
        if (iVar != null) {
            iVar.a(resp);
        }
    }
}
