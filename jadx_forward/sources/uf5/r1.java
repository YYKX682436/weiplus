package uf5;

/* loaded from: classes10.dex */
public class r1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final uf5.q1 f508827m;

    public r1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, uf5.q1 q1Var) {
        super(l4Var, false, 0);
        this.f508827m = q1Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f508827m.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        return this.f508827m.j(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        uf5.q1 q1Var = this.f508827m;
        if (!q1Var.f508821q.equalsIgnoreCase("")) {
            q1Var.f508821q = "";
        }
        q1Var.s();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        h();
        uf5.q1 q1Var = this.f508827m;
        if (!q1Var.f508821q.equalsIgnoreCase(str)) {
            q1Var.f508821q = str;
        }
        q1Var.s();
        com.p314xaae8f345.mm.ui.p2690x38b72420.n4 n4Var = this.f288584i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), true);
        }
    }
}
