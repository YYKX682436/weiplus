package al1;

/* loaded from: classes7.dex */
public final class y implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 f87353d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32) {
        this.f87353d = c12763x195d5f32;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32 = this.f87353d;
        if (c12763x195d5f32.f172577i) {
            c12763x195d5f32.f172577i = false;
            al1.b0 b0Var = c12763x195d5f32.f172580o;
            if (b0Var != null) {
                tj1.r rVar = (tj1.r) b0Var;
                mi1.v vVar = rVar.f501243a;
                if (vVar != null) {
                    vVar.m();
                }
                new mi1.k2().x(rVar.f501244b.mo32091x9a3f0ba2().C0());
            }
        }
    }
}
