package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class n7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        super(0);
        this.f272043d = c8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f272043d.f271753b.getContext().getSystemService("input_method");
        if (systemService instanceof android.view.inputmethod.InputMethodManager) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        return null;
    }
}
