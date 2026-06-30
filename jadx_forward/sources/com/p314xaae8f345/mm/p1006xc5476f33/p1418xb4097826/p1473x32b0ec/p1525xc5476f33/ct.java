package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ct extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f193729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str) {
        super(0);
        this.f193729d = etVar;
        this.f193730e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f193729d;
        boolean requestFocus = etVar.f193994y.requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) etVar.f446856d.getContext().getSystemService("input_method");
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(etVar.f193994y, 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "[showKVB] imm:" + inputMethodManager + ", result:" + valueOf + ", inputEtFocused:" + requestFocus);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.FALSE)) {
            pm0.z.b(xy2.b.f539688b, "finder_live_show_soft_input_failed", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bt(this.f193730e), 60, null);
            android.content.Context context = etVar.R;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo26063x7b383410();
        }
        nk2.l.f419554a.b(nk2.a.f419491n);
        return jz5.f0.f384359a;
    }
}
