package yi;

/* loaded from: classes15.dex */
public class d extends yi.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.g f543982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yi.g gVar) {
        super(null);
        this.f543982b = gVar;
    }

    @Override // yi.j
    public void b(java.lang.String str, int i17, long j17) {
        yi.g gVar = this.f543982b;
        gVar.f543996l = i17;
        gVar.f543997m = new zi.b(new byte[i17]);
    }

    @Override // yi.j
    public yi.h c(int i17, int i18, long j17) {
        return new yi.c(this, null);
    }

    @Override // yi.j
    public void d(int i17, zi.b bVar, int i18, zi.b bVar2, int i19, long j17) {
        zi.b bVar3;
        zi.b bVar4;
        yi.g gVar = this.f543982b;
        if (gVar.f543990f == null && (bVar4 = gVar.f543989e) != null && bVar4.m179013xb2c87fbf(bVar2)) {
            gVar.f543990f = bVar;
        } else if (gVar.f543994j == null && (bVar3 = gVar.f543993i) != null && bVar3.m179013xb2c87fbf(bVar2)) {
            gVar.f543994j = bVar;
        }
    }

    @Override // yi.j
    public void g(zi.b bVar, java.lang.String str, int i17, long j17) {
        yi.g gVar = this.f543982b;
        if (gVar.f543989e == null && "android.graphics.Bitmap".equals(str)) {
            gVar.f543989e = bVar;
            return;
        }
        if (gVar.f543991g == null && "mBuffer".equals(str)) {
            gVar.f543991g = bVar;
            return;
        }
        if (gVar.f543992h == null && "mRecycled".equals(str)) {
            gVar.f543992h = bVar;
            return;
        }
        if (gVar.f543993i == null && "java.lang.String".equals(str)) {
            gVar.f543993i = bVar;
        } else if (gVar.f543995k == null && "value".equals(str)) {
            gVar.f543995k = bVar;
        }
    }
}
