package ws3;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws3.j f530708d;

    public f(ws3.j jVar) {
        this.f530708d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ws3.j jVar = this.f530708d;
        jVar.f530714a = o25.b.e(jVar.f530716c.getContext());
        ws3.y yVar = jVar.f530717d;
        if (yVar != null) {
            yVar.f530738o = jVar.f530714a;
        }
    }
}
