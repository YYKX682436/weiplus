package a31;

/* loaded from: classes5.dex */
public final class e implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a31.m f82483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f82484b;

    public e(a31.m mVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f82483a = mVar;
        this.f82484b = c22621x7603e017;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        java.util.Objects.toString(charSequence);
        if (charSequence == null || r26.n0.N(charSequence)) {
            return;
        }
        a31.m mVar = this.f82483a;
        mVar.f82507h = true;
        mVar.f82513n++;
        a31.m.a(mVar, charSequence);
        mVar.m(51);
    }

    @Override // fl5.f
    /* renamed from: sendKeyEvent */
    public void mo480x359d3323(android.view.KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.toString();
            if (keyEvent.getAction() != 0) {
                return;
            }
            a31.m mVar = this.f82483a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = mVar.f82502c;
            int curV2TStatus = c19651x7fe9d32 != null ? c19651x7fe9d32.getCurV2TStatus() : 0;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 67) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f82484b;
                if (c22621x7603e017 == null) {
                    return;
                }
                int selectionStart = c22621x7603e017.getSelectionStart();
                if (selectionStart < 0) {
                    selectionStart = 0;
                }
                int selectionEnd = c22621x7603e017.getSelectionEnd();
                int i17 = selectionEnd >= 0 ? selectionEnd : 0;
                java.lang.CharSequence subSequence = selectionStart != i17 ? c22621x7603e017.getText().subSequence(java.lang.Math.min(selectionStart, i17), java.lang.Math.max(selectionStart, i17)) : selectionStart > 0 ? c22621x7603e017.getText().subSequence(selectionStart - 1, selectionStart) : null;
                mVar.f82507h = true;
                mVar.f82513n++;
                a31.m.a(mVar, subSequence);
            }
            if (keyCode == 0 || curV2TStatus < 2) {
                return;
            }
            if (keyCode == 21 || keyCode == 22) {
                mVar.m(53);
            } else {
                mVar.m(51);
            }
        }
    }
}
