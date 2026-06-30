package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class lr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr f200503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar) {
        super(0);
        this.f200503d = mrVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar = this.f200503d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mrVar.N;
        java.lang.Boolean bool = null;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdt");
            throw null;
        }
        boolean requestFocus = c22621x7603e017.requestFocus();
        android.content.Context context = mrVar.f199716e;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = mrVar.N;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdt");
                throw null;
            }
            bool = java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(c22621x7603e0172, 0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mrVar.I, "[showKVB] imm:" + inputMethodManager + ", result:" + bool + ", inputEtFocused:" + requestFocus);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo26063x7b383410();
        }
        return jz5.f0.f384359a;
    }
}
