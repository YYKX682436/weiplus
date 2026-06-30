package ir4;

/* loaded from: classes11.dex */
public final class i implements hr4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir4.k f375802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f375803b;

    public i(ir4.k kVar, java.lang.String str) {
        this.f375802a = kVar;
        this.f375803b = str;
    }

    @Override // hr4.q
    public void a(boolean z17, kr4.e eVar) {
        if (!z17 || eVar == null) {
            return;
        }
        vo0.d dVar = ir4.o.f375813a;
        wo0.c a17 = ir4.o.f375813a.a(new ir4.e(eVar.f68899xf205f03e));
        ir4.h hVar = new ir4.h(this.f375802a, this.f375803b);
        a17.getClass();
        a17.f529406d = hVar;
        a17.a();
    }

    @Override // hr4.q
    public void b() {
    }
}
