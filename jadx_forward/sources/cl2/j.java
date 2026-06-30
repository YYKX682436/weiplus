package cl2;

/* loaded from: classes10.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static android.animation.ValueAnimator f124464e;

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axn;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x046f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0573  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r35, in5.c r36, int r37, int r38, boolean r39, java.util.List r40) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl2.j.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PromoteBannerNormalConvert", "onCreate, type: " + i17);
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        android.animation.ValueAnimator valueAnimator = f124464e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.fi6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.MMPAGView");
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById).n();
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.fig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.view.MMPAGView");
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2).n();
    }

    public final void n(android.widget.TextView tv6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        if (z17) {
            tv6.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            tv6.setMarqueeRepeatLimit(Integer.MAX_VALUE);
            tv6.setSelected(true);
        } else {
            tv6.setEllipsize(null);
            tv6.setMarqueeRepeatLimit(0);
            tv6.setSelected(false);
        }
    }
}
