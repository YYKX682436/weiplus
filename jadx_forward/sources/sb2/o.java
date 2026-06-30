package sb2;

/* loaded from: classes3.dex */
public final class o extends tc2.c implements uc2.i {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f486962f = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f486963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f486963e = "Finder.LiveMediaClickController";
    }

    @Override // tc2.c
    public void S6(android.view.View view, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f486963e, "onMediaClick");
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T7).mo141623x754a37bb()).r()).intValue() != 1) {
            if (intent == null) {
                intent = new android.content.Intent();
            }
            Y6(view, intent);
            return;
        }
        in5.s0 s0Var = this.f498674d.f498682i;
        if (s0Var == null || (c15310x1d9feb31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31) s0Var.p(com.p314xaae8f345.mm.R.id.f566143ti1)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "onSingleTap");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "scrollToSecondPage position=" + c15310x1d9feb31.f212726J);
        android.widget.Scroller scroller = c15310x1d9feb31.D;
        if (scroller != null) {
            android.widget.FrameLayout frameLayout = c15310x1d9feb31.E;
            scroller.startScroll(frameLayout != null ? (int) frameLayout.getX() : 0, 0, -c15310x1d9feb31.getWidth(), 0, 500);
        }
        c15310x1d9feb31.invalidate();
        c15310x1d9feb31.f212726J = 1;
        c15310x1d9feb31.e(1);
        c15310x1d9feb31.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bd(c15310x1d9feb31), 300L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0360, code lost:
    
        if (r0 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0455, code lost:
    
        if (r0.equals("999") == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0481, code lost:
    
        r6 = "25";
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0475, code lost:
    
        if (r0.equals("102") == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x047e, code lost:
    
        if (r0.equals("101") == false) goto L199;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:273:0x044b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0491  */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y6(android.view.View r46, android.content.Intent r47) {
        /*
            Method dump skipped, instructions count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.o.Y6(android.view.View, android.content.Intent):void");
    }
}
