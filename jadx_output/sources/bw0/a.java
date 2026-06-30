package bw0;

/* loaded from: classes5.dex */
public final class a extends qv0.f {
    public final vw0.i0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = new vw0.i0(context);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        bodyContainerLayout.addView(this.I, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String b17 = j65.q.b(getContext(), com.tencent.mm.R.string.lmm);
        kotlin.jvm.internal.o.f(b17, "safeGetString(...)");
        return b17;
    }

    public final void setColorDataList(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        this.I.setColorStyleState$plugin_mj_template_release(textMaterialUiState);
    }

    public final void setFontDataList(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        this.I.setFontStyleState(textMaterialUiState);
    }

    public final void setSelectedCallback(vw0.d0 textStyleCallback) {
        kotlin.jvm.internal.o.g(textStyleCallback, "textStyleCallback");
        this.I.setSelectedTextStyleCallback(textStyleCallback);
    }

    public final void setTextStyleState(sw0.e textStyleUiState) {
        kotlin.jvm.internal.o.g(textStyleUiState, "textStyleUiState");
        this.I.setTextStyleState(textStyleUiState);
    }
}
