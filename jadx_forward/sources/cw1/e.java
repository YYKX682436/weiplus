package cw1;

/* loaded from: classes12.dex */
public final class e implements cw1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.f f304413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f304414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot1.h f304415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f304416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f304417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f304418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f304419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.e8 f304420n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f304421o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f304422p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h90.w f304423q;

    public e(cw1.f fVar, java.util.ArrayList arrayList, ot1.h hVar, java.lang.Boolean bool, boolean z17, int i17, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, boolean z18, java.util.HashMap hashMap, h90.w wVar) {
        this.f304413d = fVar;
        this.f304414e = arrayList;
        this.f304415f = hVar;
        this.f304416g = bool;
        this.f304417h = z17;
        this.f304418i = i17;
        this.f304419m = map;
        this.f304420n = e8Var;
        this.f304421o = z18;
        this.f304422p = hashMap;
        this.f304423q = wVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f304413d.close();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        pm5.i iVar = new pm5.i(this.f304414e);
        return new pm5.f(iVar.iterator(), new cw1.d(this.f304415f, this.f304416g, this.f304417h, this.f304418i, this.f304419m, this.f304420n, this.f304421o, this.f304422p, this.f304423q));
    }
}
