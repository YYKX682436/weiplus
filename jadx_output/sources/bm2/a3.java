package bm2;

/* loaded from: classes3.dex */
public final class a3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f21760d;

    /* renamed from: e, reason: collision with root package name */
    public int f21761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.g3 f21762f;

    public a3(bm2.g3 g3Var, java.lang.ref.WeakReference weakReference, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f21762f = g3Var;
        this.f21760d = weakReference;
        this.f21761e = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r5.length() == 0) == true) goto L20;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            bm2.g3 r0 = r4.f21762f
            java.util.ArrayList r1 = r0.f21908d
            int r2 = r4.f21761e
            if (r5 == 0) goto L18
            java.lang.String r3 = r5.toString()
            if (r3 == 0) goto L18
            java.lang.CharSequence r3 = r26.n0.u0(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L1a
        L18:
            java.lang.String r3 = ""
        L1a:
            r1.set(r2, r3)
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L33
            int r5 = r5.length()
            r2 = 1
            if (r5 != 0) goto L2f
            r5 = r2
            goto L30
        L2f:
            r5 = r1
        L30:
            if (r5 != r2) goto L33
            goto L34
        L33:
            r2 = r1
        L34:
            r5 = 0
            java.lang.ref.WeakReference r3 = r4.f21760d
            if (r2 == 0) goto L4a
            if (r3 == 0) goto L41
            java.lang.Object r5 = r3.get()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
        L41:
            if (r5 != 0) goto L44
            goto L58
        L44:
            r1 = 8
            r5.setVisibility(r1)
            goto L58
        L4a:
            if (r3 == 0) goto L52
            java.lang.Object r5 = r3.get()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
        L52:
            if (r5 != 0) goto L55
            goto L58
        L55:
            r5.setVisibility(r1)
        L58:
            r0.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.a3.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
