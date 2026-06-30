package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 f233313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3) {
        super(0);
        this.f233313d = c16702xded4f4e3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3 = this.f233313d;
        c16702xded4f4e3.m67356x96811f7a().N(0);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p3 resultListener = c16702xded4f4e3.getResultListener();
        if (resultListener != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h0) resultListener).a(1, c16702xded4f4e3.m67343xf939df19().mo1894x7e414b06());
        }
        android.widget.LinearLayout emptyLL = c16702xded4f4e3.getEmptyLL();
        if (emptyLL != null) {
            emptyLL.setVisibility(c16702xded4f4e3.m67343xf939df19().mo1894x7e414b06() != 0 ? 8 : 0);
        }
        android.widget.TextView loadingTv = c16702xded4f4e3.getLoadingTv();
        if (loadingTv != null) {
            loadingTv.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
