package kz3;

/* loaded from: classes15.dex */
public final class g implements uy3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f395410a;

    public g(kz3.l lVar) {
        this.f395410a = lVar;
    }

    @Override // uy3.p
    /* renamed from: onClick */
    public void mo144661xaf6b9ae9(android.view.View view) {
        kz3.l lVar = this.f395410a;
        kz3.p pVar = lVar.f395426k;
        if (pVar == null) {
            return;
        }
        if ((lVar.f395419d instanceof db5.f0) || lVar.f395421f != null) {
            kz3.w wVar = lVar.f395427l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
            wVar.c(pVar.k() / 2.0f, 0.0f);
        }
    }
}
