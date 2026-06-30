package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class rc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f198192h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f198193i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f198194m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f198195n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f198196o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rc(android.content.Context r8, zl2.u4 r9, int r10, p3321xbce91901.jvm.p3324x21ffc6bd.i r11) {
        /*
            r7 = this;
            r10 = r10 & 2
            if (r10 == 0) goto L6
            zl2.u4 r9 = zl2.u4.f555521d
        L6:
            r3 = r9
            java.lang.String r9 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r9)
            java.lang.String r9 = "uiMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r9)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            wd2.g r8 = r7.f199917g
            com.tencent.mm.ui.widget.dialog.y1 r8 = r8.f526369c
            android.view.Window r8 = r8.b()
            r9 = 80
            r8.setGravity(r9)
            wd2.g r8 = r7.f199917g
            com.tencent.mm.ui.widget.dialog.y1 r8 = r8.f526369c
            android.view.Window r8 = r8.b()
            r9 = 2131820800(0x7f110100, float:1.9274325E38)
            r8.setWindowAnimations(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rc.<init>(android.content.Context, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dwd;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568881s90);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565015b02);
        android.view.View view = null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.oc(this));
        } else {
            findViewById = null;
        }
        this.f198195n = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rel);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.pc(this));
            view = findViewById2;
        }
        this.f198196o = view;
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.ord);
        if (textView2 != null) {
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.content.Context context = this.f199914d;
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            int L = r26.n0.L(string, string2, 0, false, 6, null);
            int length = string2.length() + L;
            if (L < 0 || length > string.length()) {
                return;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)), 0, spannableString.length(), 17);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.qc(this), L, length, 33);
            textView2.setText(spannableString);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        yz5.a aVar = this.f198192h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
