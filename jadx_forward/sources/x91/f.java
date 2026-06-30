package x91;

/* loaded from: classes16.dex */
public class f implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f534178a;

    public f(x91.h hVar) {
        this.f534178a = hVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        x91.c cVar;
        if (eVar == null || (cVar = this.f534178a.f534180a) == null) {
            return;
        }
        java.lang.String str = cVar.f534172g;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        x91.h hVar = this.f534178a;
        hVar.f534188i = false;
        hVar.f534185f = null;
        x91.c cVar = hVar.f534180a;
        if (cVar != null) {
            java.lang.String str = cVar.f534172g;
        }
    }
}
