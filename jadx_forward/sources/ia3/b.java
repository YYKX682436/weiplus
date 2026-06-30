package ia3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia3.c f371526d;

    public b(ia3.c cVar) {
        this.f371526d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ia3.c cVar = this.f371526d;
        int i17 = cVar.f371527a;
        ia3.e eVar = cVar.f371530d;
        if (i17 == eVar.f371551e && eVar.f371548b == cVar.f371528b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "continuous mode: restart recognition");
            ia3.e eVar2 = cVar.f371530d;
            ia3.d dVar = cVar.f371528b;
            eVar2.d(dVar, dVar.f371535e, true);
        }
    }
}
