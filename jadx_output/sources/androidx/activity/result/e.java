package androidx.activity.result;

/* loaded from: classes13.dex */
public class e extends androidx.activity.result.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f9056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.h f9057c;

    public e(androidx.activity.result.h hVar, java.lang.String str, h.b bVar) {
        this.f9057c = hVar;
        this.f9055a = str;
        this.f9056b = bVar;
    }

    @Override // androidx.activity.result.c
    public void a(java.lang.Object obj, z2.m mVar) {
        androidx.activity.result.h hVar = this.f9057c;
        java.util.HashMap hashMap = (java.util.HashMap) hVar.f9064c;
        java.lang.String str = this.f9055a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        h.b bVar = this.f9056b;
        if (num != null) {
            hVar.f9066e.add(str);
            hVar.b(num.intValue(), bVar, obj, mVar);
            return;
        }
        throw new java.lang.IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // androidx.activity.result.c
    public void b() {
        this.f9057c.g(this.f9055a);
    }
}
