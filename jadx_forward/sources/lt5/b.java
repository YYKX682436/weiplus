package lt5;

/* loaded from: classes8.dex */
public class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt5.c f402827d;

    public b(lt5.c cVar) {
        this.f402827d = cVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "msa-init-fetcher";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.MsaIdManager", "[+] do initialize in sep thread now.");
        lt5.c cVar = this.f402827d;
        lt5.f a17 = cVar.f402828d.f402830a.a(cVar.f402829e);
        lt5.f[] fVarArr = lt5.e.f402833b;
        synchronized (fVarArr) {
            fVarArr[0] = a17;
        }
        lt5.e.d();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.MsaIdManager", "[+] initialize done.");
    }
}
