package a32;

/* loaded from: classes10.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82550a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb) {
        this.f82550a = c13392x8bacb7fb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void a() {
        this.f82550a.f180192y.p(true, false, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void b() {
        this.f82550a.f180192y.p(false, false, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void c(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82550a;
        c13392x8bacb7fb.f180192y.c(f17, f18, c13392x8bacb7fb.f180176f.getWidth(), c13392x8bacb7fb.f180176f.getHeight(), 400L);
        c13392x8bacb7fb.f180184q.a(f17, f18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82550a;
        at0.n nVar = c13392x8bacb7fb.f180192y;
        if (nVar.f95137l == 0) {
            nVar.f95127b.o();
        }
        c13392x8bacb7fb.d();
    }
}
