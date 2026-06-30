package pn4;

/* loaded from: classes4.dex */
public class e2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public pn4.k f438629f;

    /* renamed from: g, reason: collision with root package name */
    public final pn4.j f438630g;

    /* renamed from: h, reason: collision with root package name */
    public final int f438631h;

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f438627d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438628e = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f438632i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new pn4.d2(this), false);

    public e2(int i17, pn4.j jVar) {
        this.f438631h = i17;
        this.f438630g = jVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f438629f != m1Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkingTranslate", "not my translate work");
            return;
        }
        this.f438632i.d();
        java.lang.System.currentTimeMillis();
        pn4.k kVar = (pn4.k) m1Var;
        java.util.LinkedList linkedList = kVar.f438663f;
        if (linkedList != null) {
            linkedList.size();
        }
        this.f438629f = null;
        this.f438628e = false;
        ((pn4.q1) this.f438630g).b(this.f438631h, i17, i18, str, this.f438627d, kVar.f438663f);
    }
}
