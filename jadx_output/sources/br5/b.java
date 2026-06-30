package br5;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.zoomimage.subsampling.internal.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ br5.e f23749a;

    public b(br5.e eVar) {
        this.f23749a = eVar;
    }

    public void a(long j17) {
        er5.g gVar = this.f23749a.f23752a;
        ((kotlinx.coroutines.flow.h3) gVar.f256245f).k(new zq5.g(j17));
        hr5.a1 a1Var = gVar.f256242c;
        a1Var.getClass();
        zq5.b.d();
        if (zq5.g.a(a1Var.f284283g, j17)) {
            return;
        }
        a1Var.f284283g = j17;
        a1Var.f284277a.a(new hr5.o0(a1Var, j17));
        hr5.a1.e(a1Var, "contentOriginSizeChanged", false, 2, null);
    }
}
