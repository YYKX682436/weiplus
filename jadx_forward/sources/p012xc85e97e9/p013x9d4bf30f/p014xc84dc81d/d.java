package p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d;

/* loaded from: classes13.dex */
public class d extends p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f90586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h f90587c;

    public d(p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar, java.lang.String str, h.b bVar) {
        this.f90587c = hVar;
        this.f90585a = str;
        this.f90586b = bVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void a(java.lang.Object obj, z2.m mVar) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar = this.f90587c;
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f90597c;
        java.lang.String str = this.f90585a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        h.b bVar = this.f90586b;
        if (num != null) {
            hVar.f90599e.add(str);
            try {
                hVar.b(num.intValue(), bVar, obj, mVar);
                return;
            } catch (java.lang.Exception e17) {
                hVar.f90599e.remove(str);
                throw e17;
            }
        }
        throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void b() {
        this.f90587c.g(this.f90585a);
    }
}
