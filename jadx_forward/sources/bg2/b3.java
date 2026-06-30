package bg2;

/* loaded from: classes2.dex */
public final class b3 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101471f;

    /* renamed from: g, reason: collision with root package name */
    public final int f101472g;

    /* renamed from: h, reason: collision with root package name */
    public final char f101473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101470e = "LiveConvertShareGuideController";
        this.f101471f = 5;
        this.f101472g = 86400;
        this.f101473h = (char) 8197;
    }

    public static final void Y6(bg2.b3 b3Var, int i17) {
        bg2.d1 d1Var;
        in5.s0 s0Var = b3Var.f498674d.f498682i;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        if (context == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.text.SpannableString spannableString = new android.text.SpannableString(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.npl));
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80306x8f6ba587, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq sqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq(e17);
        int K = r26.n0.K(spannableString, b3Var.f101473h, 0, false, 6, null);
        spannableString.setSpan(sqVar, K, K + 1, 34);
        uc2.g gVar = (uc2.g) b3Var.O6(uc2.g.class);
        android.view.View e76 = gVar != null ? ((sb2.l) gVar).e7() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showShareGuideBubble] isShareViewShown = ");
        sb6.append(e76 != null ? java.lang.Boolean.valueOf(e76.isShown()) : null);
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b3Var.f101470e, sb6.toString());
        if (e76 != null) {
            android.view.View view = e76.isShown() ? e76 : null;
            if (view == null || (d1Var = (bg2.d1) b3Var.N6(bg2.d1.class)) == null) {
                return;
            }
            d1Var.Y6(spannableString, view, 3000L, new bg2.a3(b3Var, i17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P6() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.b3.P6():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.b3.Q6():void");
    }
}
