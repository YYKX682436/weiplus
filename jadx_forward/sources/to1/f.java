package to1;

/* loaded from: classes5.dex */
public final class f implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo1.o f502443a;

    public f(fo1.o oVar) {
        this.f502443a = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        fo1.n nVar;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[permissionRegain] resultCode is ");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskDevice", sb6.toString());
            nVar = fo1.n.f346421h;
        } else {
            java.io.Serializable serializableExtra = intent.getSerializableExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskDevice", "[permissionRegain] errorCode = " + serializableExtra);
            nVar = serializableExtra instanceof fo1.n ? (fo1.n) serializableExtra : null;
            if (nVar == null) {
                nVar = fo1.n.f346421h;
            }
        }
        this.f502443a.a(nVar);
    }
}
