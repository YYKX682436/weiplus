package pi2;

/* loaded from: classes3.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final yz5.a H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, yz5.a confirm) {
        super(context, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirm, "confirm");
        this.H = confirm;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drx;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drx, (android.view.ViewGroup) z(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.Button button = (android.widget.Button) rootView.findViewById(com.p314xaae8f345.mm.R.id.hrn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        com.p314xaae8f345.mm.ui.fk.a(button);
        button.setOnClickListener(new pi2.o(this));
    }
}
