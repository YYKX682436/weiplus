package fh1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344090d;

    public k(fh1.z zVar) {
        this.f344090d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fh1.x0 x0Var;
        fh1.z zVar = this.f344090d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zVar.f344164e, "recreate bizInstanceName:".concat(zVar.c()));
        synchronized (zVar) {
            x0Var = zVar.f344168i;
            zVar.f344168i = null;
        }
        if (x0Var != null) {
            x0Var.mo123041x5cd39ffa();
        }
        zVar.a();
        yz5.a aVar = zVar.f344169j;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = zVar.f344160a.C0();
        if (C0 != null) {
            C0.g("onMagicBrushFrameRecreate", new org.json.JSONObject().toString());
        }
    }
}
