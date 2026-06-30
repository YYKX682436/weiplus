package bg2;

/* loaded from: classes2.dex */
public final class b5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.c5 f101476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(bg2.c5 c5Var) {
        super(3);
        this.f101476d = c5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.ViewGroup viewGroup;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b playerView = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerView, "playerView");
        in5.s0 s0Var = this.f101476d.f498674d.f498682i;
        if (s0Var != null && (viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f566158ey0)) != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b.f212130p1;
            playerView.h(viewGroup, intValue, intValue2, false);
        }
        return jz5.f0.f384359a;
    }
}
