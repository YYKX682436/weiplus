package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class o3 implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272063a;

    public o3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272063a = c19666xfd6e2f33;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272063a;
        c19666xfd6e2f33.f271531h6 = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.g(c19666xfd6e2f33, charSequence);
    }

    @Override // fl5.f
    /* renamed from: sendKeyEvent */
    public void mo480x359d3323(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272063a;
            c19666xfd6e2f33.f271531h6 = true;
            int max = java.lang.Math.max(c19666xfd6e2f33.f271494b4.getSelectionStart(), 0);
            int max2 = java.lang.Math.max(c19666xfd6e2f33.f271494b4.getSelectionEnd(), 0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.g(c19666xfd6e2f33, max != max2 ? c19666xfd6e2f33.f271494b4.getText().subSequence(java.lang.Math.min(max, max2), java.lang.Math.max(max, max2)) : max > 0 ? c19666xfd6e2f33.f271494b4.getText().subSequence(max - 1, max) : null);
        }
    }
}
