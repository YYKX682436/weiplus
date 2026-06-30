package x91;

/* loaded from: classes16.dex */
public class e implements z91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x91.h f534177a;

    public e(x91.h hVar) {
        this.f534177a = hVar;
    }

    @Override // z91.c
    public void a(aa1.e eVar) {
        x91.c cVar;
        if (eVar == null || (cVar = this.f534177a.f534180a) == null) {
            return;
        }
        java.lang.String str = cVar.f534172g;
    }

    @Override // z91.c
    public void b(aa1.c cVar) {
        x91.h hVar = this.f534177a;
        hVar.f534189j = true;
        hVar.f534186g = cVar;
        x91.c cVar2 = hVar.f534180a;
        if (cVar2 != null) {
            java.lang.String str = cVar2.f534172g;
        }
    }
}
