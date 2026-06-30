package ol;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.c f427623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ol.h f427624e;

    public g(ol.h hVar, hl.c cVar) {
        this.f427624e = hVar;
        this.f427623d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ol.h hVar = this.f427624e;
        if (hVar.f427634j != null) {
            hl.c cVar = this.f427623d;
            cVar.f363548b = 2;
            hVar.getClass();
            cVar.f363547a = 44100;
            ol.b bVar = this.f427624e.f427634j;
            hl.c cVar2 = this.f427623d;
            dl3.i iVar = ((dl3.p) bVar).f316874a;
            dl3.b bVar2 = iVar.L;
            if (bVar2 != null) {
                bVar2.a(iVar.M, 1, cVar2.f363548b, cVar2.f363547a, cVar2.f363549c);
            }
            if (il.g.f373521d == null) {
                synchronized (il.g.class) {
                    if (il.g.f373521d == null) {
                        il.g.f373521d = new il.g();
                    }
                }
            }
            il.g gVar = il.g.f373521d;
            synchronized (gVar) {
                if (cVar2 != null) {
                    if (cVar2.f363549c != null) {
                        cVar2.f363548b = 0;
                        cVar2.f363547a = 0;
                        cVar2.f363550d.clear();
                        byte[] bArr = cVar2.f363549c;
                        java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
                        gVar.f373522a.add(0, cVar2);
                        gVar.f373524c--;
                    }
                }
            }
        }
    }
}
