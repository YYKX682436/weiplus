package uf5;

/* loaded from: classes10.dex */
public class d1 extends uf5.w0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22348x7c995a79 f508745s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22348x7c995a79 activityC22348x7c995a79, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        super(activityC22348x7c995a79, l4Var);
        this.f508745s = activityC22348x7c995a79;
    }

    @Override // uf5.w0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d t(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
        n0Var.f288436y = str;
        return n0Var;
    }

    @Override // uf5.w0
    public java.lang.String v() {
        int i17 = this.f508745s.F;
        if (i17 == 2) {
            return "@finder.block.my.liked.android";
        }
        if (i17 == 1) {
            return "@finder.block.his.liked.android";
        }
        return null;
    }
}
