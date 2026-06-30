package ju3;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17006x5840abd4 f383392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17006x5840abd4 c17006x5840abd4) {
        super(0);
        this.f383392d = c17006x5840abd4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17006x5840abd4 c17006x5840abd4 = this.f383392d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 c16553x9b9a9a23 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23) c17006x5840abd4.findViewById(com.p314xaae8f345.mm.R.id.ofi);
        if (com.p314xaae8f345.mm.ui.bk.u(c17006x5840abd4.getContext(), false)) {
            android.view.ViewGroup.LayoutParams layoutParams = c16553x9b9a9a23.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = com.p314xaae8f345.mm.ui.bk.p(c17006x5840abd4.getContext()) + c17006x5840abd4.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562102a62);
            c16553x9b9a9a23.setLayoutParams(layoutParams2);
        }
        return c16553x9b9a9a23;
    }
}
