package hn4;

/* loaded from: classes15.dex */
public class y implements fn4.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f364139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364140b;

    public y(hn4.z zVar) {
        this.f364140b = zVar;
        this.f364139a = i65.a.k(zVar.getContext());
    }

    @Override // fn4.c
    public void a() {
        hn4.z zVar = this.f364140b;
        if (!(zVar.f346054s.getVisibility() == 0)) {
            if (zVar.G.getVisibility() == 0) {
                zVar.G.w();
                return;
            }
            zVar.G.x();
            if (zVar.m133834xc3959822() != null) {
                ((hn4.d0) zVar.m133834xc3959822()).t();
                ((hn4.d0) zVar.m133834xc3959822()).m();
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
        float f18 = f17 / this.f364139a;
        hn4.z zVar = this.f364140b;
        fn4.c1 c1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.f346106b;
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
        hn4.z zVar = this.f364140b;
        zVar.G.f244009i.setVisibility(0);
        zVar.f346043e.setVisibility(8);
        zVar.f(i17);
    }

    @Override // fn4.c
    public boolean g() {
        return !(this.f364140b.f346054s.getVisibility() == 0);
    }

    @Override // fn4.c
    /* renamed from: getCurrentPosition */
    public int mo129836x9746038c() {
        fn4.c1 c1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) this.f364140b.m133835x24b16ea2()).f256659J.f346106b;
        if (c1Var != null) {
            return c1Var.mo61523x898ffe25();
        }
        return 0;
    }

    @Override // fn4.c
    public void h() {
        hn4.z zVar = this.f364140b;
        zVar.f346043e.setVisibility(0);
        zVar.G.f244009i.setVisibility(8);
    }
}
