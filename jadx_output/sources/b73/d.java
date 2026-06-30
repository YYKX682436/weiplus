package b73;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b73.h f18206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f18207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b73.i f18208g;

    public d(b73.i iVar, java.util.List list, b73.h hVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f18208g = iVar;
        this.f18205d = list;
        this.f18206e = hVar;
        this.f18207f = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f18205d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            try {
                b73.i.a(this.f18208g, (java.lang.String) it.next());
            } catch (b73.a e17) {
                i17 = e17.f18200d.a();
            }
        }
        if (this.f18206e != null) {
            this.f18207f.post(new b73.c(this, new b73.j(i17, "")));
        }
    }
}
