package gn4;

/* loaded from: classes15.dex */
public class y implements fn4.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f355195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gn4.z f355196b;

    public y(gn4.z zVar) {
        this.f355196b = zVar;
        this.f355195a = i65.a.k(zVar.getContext());
    }

    @Override // fn4.c
    public void a() {
        gn4.z zVar = this.f355196b;
        if (!(zVar.f346054s.getVisibility() == 0)) {
            if (zVar.G.getVisibility() == 0) {
                zVar.G.w();
                return;
            }
            zVar.G.x();
            if (zVar.m131897x2e7566b3() != null) {
                ((fn4.m) zVar.m131897x2e7566b3()).t();
                ((fn4.m) zVar.m131897x2e7566b3()).m();
            }
        }
    }

    @Override // fn4.c
    public void b(float f17) {
    }

    @Override // fn4.c
    public void c() {
    }

    @Override // fn4.c
    public int d(int i17, float f17) {
        float f18 = f17 / this.f355195a;
        gn4.z zVar = this.f355196b;
        fn4.c1 c1Var = zVar.m131898x15cb7231().I2().f346106b;
        int mo61527x6d590e18 = c1Var != null ? c1Var.mo61527x6d590e18() : 0;
        int mo129836x9746038c = mo129836x9746038c() + ((int) (mo61527x6d590e18 * f18));
        int i18 = mo129836x9746038c >= 0 ? mo129836x9746038c > mo61527x6d590e18 ? mo61527x6d590e18 : mo129836x9746038c : 0;
        java.lang.String a17 = vv4.e1.a(mo61527x6d590e18 * 1000);
        zVar.f346043e.setText(vv4.e1.a(i18 * 1000) + "/" + a17);
        return i18;
    }

    @Override // fn4.c
    public void e(float f17) {
    }

    @Override // fn4.c
    public void f(int i17, float f17) {
        gn4.z zVar = this.f355196b;
        zVar.G.f244009i.setVisibility(0);
        zVar.f346043e.setVisibility(8);
        zVar.f(i17);
    }

    @Override // fn4.c
    public boolean g() {
        return !(this.f355196b.f346054s.getVisibility() == 0);
    }

    @Override // fn4.c
    /* renamed from: getCurrentPosition */
    public int mo129836x9746038c() {
        fn4.c1 c1Var = this.f355196b.m131898x15cb7231().I2().f346106b;
        if (c1Var != null) {
            return c1Var.mo61523x898ffe25();
        }
        return 0;
    }

    @Override // fn4.c
    public void h() {
        gn4.z zVar = this.f355196b;
        zVar.f346043e.setVisibility(0);
        zVar.G.f244009i.setVisibility(8);
    }
}
