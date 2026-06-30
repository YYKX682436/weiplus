package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes9.dex */
public class ee extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f145670o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f145671p;

    /* renamed from: q, reason: collision with root package name */
    public int f145672q;

    /* renamed from: r, reason: collision with root package name */
    public final int f145673r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145674s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 f145675t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60, android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.f9());
        this.f145675t = activityC10375x35d0ae60;
        this.f145672q = -1;
        this.f145673r = -1;
        this.f145673r = i17;
        this.f145670o = str;
        this.f145671p = str2;
        this.f145674s = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(activityC10375x35d0ae60.f145536h);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        if (f9Var == null) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        }
        f9Var.mo9015xbf5d97fd(cursor);
        return f9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ad, code lost:
    
        if (r1 == null) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0476  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.ee.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        int i17 = this.f145672q;
        int i18 = this.f145673r;
        if (i17 < 0 || i17 > i18) {
            this.f145672q = i18 - 16;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60 activityC10375x35d0ae60 = this.f145675t;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC10375x35d0ae60.f145537i);
        java.lang.String str = this.f145670o;
        if (!K0 && c01.z1.J(activityC10375x35d0ae60.f145537i)) {
            s(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c5(str, i18 - this.f145672q));
        } else {
            if (c01.z1.J(activityC10375x35d0ae60.f145537i)) {
                return;
            }
            s(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b5(str, this.f145671p, i18 - this.f145672q));
        }
    }

    public boolean t(java.lang.CharSequence charSequence, android.widget.TextView textView) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        textView.setVisibility(0);
        return true;
    }
}
