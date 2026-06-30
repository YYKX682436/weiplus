package lm3;

/* loaded from: classes10.dex */
public final class d extends in5.r {

    /* renamed from: h, reason: collision with root package name */
    public static final lm3.a f401011h = new lm3.a(null);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d3 f401012e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401013f;

    /* renamed from: g, reason: collision with root package name */
    public final int f401014g;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e3 sizeResolver, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d3 actionCallback) {
        int b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeResolver, "sizeResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionCallback, "actionCallback");
        this.f401012e = actionCallback;
        this.f401013f = "MicroMsg.MusicMVVideoItemConverter";
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h3 h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h3) sizeResolver;
        int i17 = h3Var.f232691a;
        if (i17 == 0) {
            i17 = i65.a.B(h3Var.f232692b.m158354x19263085());
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 70);
        } else {
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 70);
        }
        this.f401014g = i17 - (b17 * 2);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c5c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r13 == true) goto L8;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r9, in5.c r10, int r11, int r12, boolean r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm3.d.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.k1n);
        linearLayout.getLayoutParams().width = this.f401014g;
        linearLayout.getLayoutParams().height = -1;
    }
}
