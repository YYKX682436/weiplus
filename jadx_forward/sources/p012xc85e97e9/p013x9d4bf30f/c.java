package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f90561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h.a f90562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.e f90563f;

    public c(p012xc85e97e9.p013x9d4bf30f.e eVar, int i17, h.a aVar) {
        this.f90563f = eVar;
        this.f90561d = i17;
        this.f90562e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar;
        java.lang.Object obj = this.f90562e.f359298a;
        p012xc85e97e9.p013x9d4bf30f.e eVar = this.f90563f;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) eVar.f90596b).get(java.lang.Integer.valueOf(this.f90561d));
        if (str == null) {
            return;
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f fVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f) ((java.util.HashMap) eVar.f90600f).get(str);
        if (fVar == null || (bVar = fVar.f90591a) == null) {
            eVar.f90602h.remove(str);
            ((java.util.HashMap) eVar.f90601g).put(str, obj);
        } else if (eVar.f90599e.remove(str)) {
            bVar.a(obj);
        }
    }
}
