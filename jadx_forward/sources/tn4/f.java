package tn4;

/* loaded from: classes11.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tn4.o f502360a;

    public f(tn4.o oVar) {
        this.f502360a = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what == this.f502360a.f502371d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "do checkRealDoMMdiffUpdatePatchVersion");
            tn4.o oVar = this.f502360a;
            boolean z17 = message.arg1 == 1;
            boolean z18 = message.arg2 == 1;
            oVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new tn4.k(oVar, z18, z17));
        }
    }
}
