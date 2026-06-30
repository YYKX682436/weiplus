package vi1;

/* loaded from: classes7.dex */
public final class g1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f518855d;

    public g1(vi1.j1 j1Var) {
        this.f518855d = j1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (((r2 == null || (r2 = r2.m78931xfb85ada3()) == null || r2.length() != 0) ? false : true) == false) goto L25;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            vi1.j1 r2 = r1.f518855d
            android.widget.Button r3 = r2.f518883g
            if (r3 != 0) goto L7
            goto L38
        L7:
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r4 = r2.f518880d
            r5 = 1
            r0 = 0
            if (r4 == 0) goto L1b
            android.text.Editable r4 = r4.m52280xfb85ada3()
            if (r4 == 0) goto L1b
            int r4 = r4.length()
            if (r4 != 0) goto L1b
            r4 = r5
            goto L1c
        L1b:
            r4 = r0
        L1c:
            if (r4 != 0) goto L34
            com.tencent.mm.ui.base.MMFormInputView r2 = r2.f518881e
            if (r2 == 0) goto L30
            android.text.Editable r2 = r2.m78931xfb85ada3()
            if (r2 == 0) goto L30
            int r2 = r2.length()
            if (r2 != 0) goto L30
            r2 = r5
            goto L31
        L30:
            r2 = r0
        L31:
            if (r2 != 0) goto L34
            goto L35
        L34:
            r5 = r0
        L35:
            r3.setEnabled(r5)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi1.g1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
