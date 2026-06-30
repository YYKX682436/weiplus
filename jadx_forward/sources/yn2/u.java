package yn2;

/* loaded from: classes2.dex */
public final class u extends yn2.n {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e f545545e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar) {
        this.f545545e = eVar;
    }

    @Override // yn2.n, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dkd;
    }

    @Override // yn2.n, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568318yg);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(p17, "watch_later_area_expand");
        aVar.Tj(p17, 40, 1, true);
        aVar.Ai(p17, new yn2.s(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r5 != -1) == true) goto L19;
     */
    @Override // yn2.n, in5.r
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, zn2.b r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.u.h(in5.s0, zn2.b, int, int, boolean, java.util.List):void");
    }

    @Override // yn2.n
    public void o(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.o(holder);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568318yg);
        if (p17 != null) {
            p17.setOnClickListener(new yn2.t(this, holder));
        }
    }
}
