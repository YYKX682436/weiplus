package ye5;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f542795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f542796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ze5.n8 n8Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        super(4);
        this.f542795d = n8Var;
        this.f542796e = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 chattingHolder = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingHolder, "chattingHolder");
        ye5.j b17 = ye5.k0.b(ye5.l0.f542804a, msgData);
        if (b17 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = b17.f542797a;
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ujd);
            q31.n nVar = tag instanceof q31.n ? (q31.n) tag : null;
            if (nVar != null) {
                this.f542795d.m80057x35d80ff(nVar);
                lf5.f fVar = lf5.f.f400067a;
                ze5.n8 n8Var = this.f542795d;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var = this.f542796e;
                ze5.ma maVar = b17.f542798b;
                fVar.a(chattingContext, f9Var, n8Var, a0Var, maVar.a(), maVar.b());
            }
        }
        return jz5.f0.f384359a;
    }
}
