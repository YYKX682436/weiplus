package hr3;

/* loaded from: classes11.dex */
public class u0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements o13.x {

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365570n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f365571o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f365572p;

    public u0(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(l4Var, (java.util.List) new java.util.ArrayList(), true, false, i17);
        this.f365571o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f365570n = z3Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        if (vVar.f432691c == 0) {
            this.f365572p = vVar.f432693e;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f365572p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r rVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r(i17, this.f365570n);
        rVar.f(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(((p13.y) this.f365572p.get(i17)).f432720e, true));
        return rVar;
    }
}
