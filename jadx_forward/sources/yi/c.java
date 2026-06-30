package yi;

/* loaded from: classes15.dex */
public class c extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.d f543981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yi.d dVar, yi.h hVar) {
        super(hVar);
        this.f543981b = dVar;
    }

    @Override // yi.h
    public void c(zi.b bVar, int i17, zi.b bVar2, zi.b bVar3, int i18, zi.a[] aVarArr, zi.a[] aVarArr2) {
        zi.b bVar4;
        zi.b bVar5;
        yi.d dVar = this.f543981b;
        yi.g gVar = dVar.f543982b;
        if (gVar.f543998n == null && (bVar5 = gVar.f543990f) != null && bVar5.m179013xb2c87fbf(bVar)) {
            dVar.f543982b.f543998n = aVarArr2;
            return;
        }
        yi.g gVar2 = dVar.f543982b;
        if (gVar2.f543999o == null && (bVar4 = gVar2.f543994j) != null && bVar4.m179013xb2c87fbf(bVar)) {
            dVar.f543982b.f543999o = aVarArr2;
        }
    }
}
