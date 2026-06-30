package nz2;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz2.b f423097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz2.f f423098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nz2.n f423099f;

    public m(nz2.n nVar, nz2.b bVar, nz2.f fVar) {
        this.f423099f = nVar;
        this.f423097d = bVar;
        this.f423098e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr;
        int i17;
        mb.e c17 = this.f423099f.c();
        nz2.f fVar = this.f423098e;
        nz2.b bVar = this.f423097d;
        if (c17 == null) {
            if (bVar != null) {
                bVar.a(nz2.c.a(fVar.f423088c, -1, -1, -1, -1));
                return;
            }
            return;
        }
        mb.g gVar = c17.f406814b;
        mb.j jVar = c17.f406813a;
        try {
            iArr = ((mb.h) jVar).e(gVar);
        } catch (android.os.RemoteException unused) {
            iArr = new int[0];
        }
        nz2.l lVar = new nz2.l(this);
        if (iArr != null) {
            c17.f406816d = lVar;
            c17.f406817e = 0;
            try {
                i17 = ((mb.h) jVar).j(gVar, iArr, null);
            } catch (android.os.RemoteException unused2) {
            }
            if (i17 != 0 || bVar == null) {
            }
            bVar.a(nz2.c.a(fVar.f423088c, -1, -1, -1, -1));
            return;
        }
        i17 = -1;
        if (i17 != 0) {
        }
    }
}
