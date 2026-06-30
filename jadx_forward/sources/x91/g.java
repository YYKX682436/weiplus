package x91;

/* loaded from: classes16.dex */
public class g implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f534179a;

    public g(x91.h hVar) {
        this.f534179a = hVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        x91.c cVar;
        if (eVar == null || (cVar = this.f534179a.f534180a) == null) {
            return;
        }
        java.lang.String str = cVar.f534172g;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        x91.h hVar = this.f534179a;
        hVar.f534189j = false;
        hVar.f534186g = null;
        x91.c cVar = hVar.f534180a;
        if (cVar != null) {
            java.lang.String str = cVar.f534172g;
        }
    }
}
