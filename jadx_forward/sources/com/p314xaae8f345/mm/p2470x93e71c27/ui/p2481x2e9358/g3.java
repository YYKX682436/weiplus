package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class g3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271860d;

    public g3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271860d = c19666xfd6e2f33;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && 66 != keyEvent.getAction()) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271860d;
        java.lang.String obj = c19666xfd6e2f33.f271494b4.getText().toString();
        if (c19666xfd6e2f33.f271623x0 == null) {
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            c19666xfd6e2f33.f271623x0.d(obj);
        }
        c19666xfd6e2f33.f271623x0.o();
        return true;
    }
}
