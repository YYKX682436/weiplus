package n11;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final o11.d f415584a;

    /* renamed from: b, reason: collision with root package name */
    public p11.j f415585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f415586c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f415587d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f415588e = new java.util.HashMap();

    public b(o11.d dVar) {
        this.f415584a = dVar;
        this.f415585b = dVar.f423607l;
        this.f415586c = dVar.f423608m;
        ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.a) dVar.f423602g).f152779a = dVar.f423604i;
    }

    public void a(s11.b bVar) {
        n11.c cVar;
        java.util.HashMap hashMap = this.f415588e;
        if (hashMap == null || bVar == null || (cVar = bVar.f483639e) == null) {
            return;
        }
        hashMap.remove(java.lang.Integer.valueOf(cVar.f415590b));
    }

    public void b(n11.c cVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.f415590b);
        java.util.Map map = this.f415587d;
        map.remove(valueOf);
        map.size();
    }
}
