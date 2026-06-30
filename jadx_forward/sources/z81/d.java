package z81;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f552223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h91.a f552224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z81.g f552225f;

    public d(z81.g gVar, org.json.JSONArray jSONArray, h91.a aVar) {
        this.f552225f = gVar;
        this.f552223d = jSONArray;
        this.f552224e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11803x74c53cda c11803x74c53cda = this.f552225f.f552232f;
        this.f552225f.f552232f = null;
        z81.g gVar = this.f552225f;
        gVar.f552231e = this.f552223d;
        gVar.f552241r = true;
        gVar.f552230d = true;
        h91.a aVar = this.f552224e;
        if (aVar != null) {
            aVar.a(c11803x74c53cda);
        }
        z81.g gVar2 = this.f552225f;
        if (gVar2.f552240q != 0) {
            java.lang.System.nanoTime();
            gVar2.f552240q = 0L;
        }
    }
}
