package b73;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b73.h f99739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f99740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b73.i f99741g;

    public d(b73.i iVar, java.util.List list, b73.h hVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f99741g = iVar;
        this.f99738d = list;
        this.f99739e = hVar;
        this.f99740f = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f99738d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            try {
                b73.i.a(this.f99741g, (java.lang.String) it.next());
            } catch (b73.a e17) {
                i17 = e17.f99733d.a();
            }
        }
        if (this.f99739e != null) {
            this.f99740f.mo50293x3498a0(new b73.c(this, new b73.j(i17, "")));
        }
    }
}
