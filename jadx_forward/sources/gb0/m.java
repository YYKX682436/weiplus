package gb0;

/* loaded from: classes8.dex */
public final class m implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb0.n f351500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351501b;

    public m(gb0.n nVar, java.lang.String str) {
        this.f351500a = nVar;
        this.f351501b = str;
    }

    @Override // zh1.a1
    public final void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgService", "onOpenMaterialsGot success:" + z17 + " openMaterialCollection:" + openMaterialCollection);
        java.lang.String str = this.f351501b;
        gb0.n nVar = this.f351500a;
        if (!z17 || openMaterialCollection.f167785g.size() <= 0) {
            fb0.j jVar = nVar.f351503e;
            if (jVar != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar).a(false);
            }
            nVar.f351504f.put(str, java.lang.Boolean.FALSE);
            return;
        }
        fb0.j jVar2 = nVar.f351503e;
        if (jVar2 != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pi) jVar2).a(true);
        }
        nVar.f351504f.put(str, java.lang.Boolean.TRUE);
    }
}
