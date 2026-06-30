package i53;

/* loaded from: classes8.dex */
public class o implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f370214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.t f370215c;

    public o(i53.t tVar, int i17, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d) {
        this.f370215c = tVar;
        this.f370213a = i17;
        this.f370214b = c10756x2a5d7b2d;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameHaowanDataCenter", "checkNewVideo errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0) {
            p33.h hVar = (p33.h) oVar.f152244b.f152233a;
            java.lang.String str2 = hVar.f433117i;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.contains("[count]")) {
                int i19 = this.f370213a + hVar.f433116h;
                if (i19 > 0) {
                    this.f370214b.f149939d = str2.replace("[count]", java.lang.String.valueOf(i19));
                }
            } else {
                this.f370214b.f149939d = str2;
            }
        }
        synchronized (this.f370215c.f370249a) {
            this.f370215c.f370249a.notifyAll();
        }
    }
}
