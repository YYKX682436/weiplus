package fk3;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345082d;

    public e(fk3.o oVar) {
        this.f345082d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f345082d;
        kk3.d dVar = oVar.f345122e;
        if (dVar != null) {
            ek3.e eVar = oVar.f345121d;
            dVar.b(eVar != null ? eVar.m127794x8c4fcf52() : null, 3);
        }
    }
}
