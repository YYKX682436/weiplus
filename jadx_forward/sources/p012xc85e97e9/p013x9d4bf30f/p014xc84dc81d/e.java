package p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d;

/* loaded from: classes13.dex */
public class e extends p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f90589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h f90590c;

    public e(p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar, java.lang.String str, h.b bVar) {
        this.f90590c = hVar;
        this.f90588a = str;
        this.f90589b = bVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void a(java.lang.Object obj, z2.m mVar) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar = this.f90590c;
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f90597c;
        java.lang.String str = this.f90588a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        h.b bVar = this.f90589b;
        if (num != null) {
            hVar.f90599e.add(str);
            hVar.b(num.intValue(), bVar, obj, mVar);
            return;
        }
        throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c
    public void b() {
        this.f90590c.g(this.f90588a);
    }
}
