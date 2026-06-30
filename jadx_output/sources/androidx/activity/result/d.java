package androidx.activity.result;

/* loaded from: classes13.dex */
public class d extends androidx.activity.result.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f9053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.h f9054c;

    public d(androidx.activity.result.h hVar, java.lang.String str, h.b bVar) {
        this.f9054c = hVar;
        this.f9052a = str;
        this.f9053b = bVar;
    }

    @Override // androidx.activity.result.c
    public void a(java.lang.Object obj, z2.m mVar) {
        androidx.activity.result.h hVar = this.f9054c;
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f9064c;
        java.lang.String str = this.f9052a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        h.b bVar = this.f9053b;
        if (num != null) {
            hVar.f9066e.add(str);
            try {
                hVar.b(num.intValue(), bVar, obj, mVar);
                return;
            } catch (java.lang.Exception e17) {
                hVar.f9066e.remove(str);
                throw e17;
            }
        }
        throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // androidx.activity.result.c
    public void b() {
        this.f9054c.g(this.f9052a);
    }
}
