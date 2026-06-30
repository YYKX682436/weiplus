package e33;

/* loaded from: classes10.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f329092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f329093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e33.a2 f329094f;

    public z1(e33.a2 a2Var, int i17, int i18) {
        this.f329094f = a2Var;
        this.f329092d = i17;
        this.f329093e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.n1 n1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) this.f329094f.f328649d.get();
        if (c15630x7d8d0183 == null || (n1Var = t23.p0.k().f496829e) == null || ((t23.f) n1Var).f496677g || !c15630x7d8d0183.f219956o) {
            return;
        }
        c15630x7d8d0183.f219950f = this.f329092d;
        c15630x7d8d0183.f219952h = this.f329093e;
        c15630x7d8d0183.f219956o = false;
        this.f329094f.f328650e.notifyDataSetChanged();
    }
}
