package rf3;

/* loaded from: classes12.dex */
public final class s implements cg3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf3.u f476533a;

    public s(rf3.u uVar) {
        this.f476533a = uVar;
    }

    @Override // cg3.c
    public android.graphics.Matrix a() {
        return this.f476533a.S().a().getMainMatrix();
    }

    @Override // cg3.c
    /* renamed from: getView */
    public android.view.View mo14794xfb86a31b() {
        rf3.u uVar = this.f476533a;
        android.view.View m66589x6815f2c1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4) ((jz5.n) uVar.f476539s).mo141623x754a37bb()).m66589x6815f2c1();
        if (m66589x6815f2c1 != null) {
            return m66589x6815f2c1;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a b17 = uVar.S().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getNormalImage(...)");
        return b17;
    }
}
