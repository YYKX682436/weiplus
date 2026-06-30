package l01;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.i f396304d;

    public h(l01.i iVar) {
        this.f396304d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.i iVar = this.f396304d;
        byte[] g17 = iVar.f396309f.g(iVar.f396307d);
        l01.t tVar = iVar.f396308e;
        if (tVar != null) {
            tVar.a(g17);
        }
    }
}
