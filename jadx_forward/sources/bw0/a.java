package bw0;

/* loaded from: classes5.dex */
public final class a extends qv0.f {
    public final vw0.i0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.I = new vw0.i0(context);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        bodyContainerLayout.addView(this.I, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String b17 = j65.q.b(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lmm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "safeGetString(...)");
        return b17;
    }

    /* renamed from: setColorDataList */
    public final void m11427x142ed2a9(sw0.e textMaterialUiState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMaterialUiState, "textMaterialUiState");
        this.I.m172803xc27babb(textMaterialUiState);
    }

    /* renamed from: setFontDataList */
    public final void m11428xcc376e59(sw0.e textMaterialUiState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textMaterialUiState, "textMaterialUiState");
        this.I.m172804x6434e411(textMaterialUiState);
    }

    /* renamed from: setSelectedCallback */
    public final void m11429x2dcea882(vw0.d0 textStyleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyleCallback, "textStyleCallback");
        this.I.m172805xb149494c(textStyleCallback);
    }

    /* renamed from: setTextStyleState */
    public final void m11430xba281f6f(sw0.e textStyleUiState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyleUiState, "textStyleUiState");
        this.I.m172806xba281f6f(textStyleUiState);
    }
}
