package od5;

/* loaded from: classes9.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f426194e;

    /* renamed from: f, reason: collision with root package name */
    public final yb5.d f426195f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426196g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k f426197h;

    /* renamed from: i, reason: collision with root package name */
    public final int f426198i;

    /* renamed from: m, reason: collision with root package name */
    public final int f426199m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f426200n;

    public g(int i17, yb5.d context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f426194e = i17;
        this.f426195f = context;
        this.f426196g = jz5.h.b(new od5.e(this));
        this.f426198i = context.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        this.f426199m = context.s().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        this.f426200n = new od5.f(this);
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 b17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xr.a(this.f426195f)).b(this.f426194e);
        android.view.View F = b17.F((android.view.LayoutInflater) ((jz5.n) this.f426196g).mo141623x754a37bb(), null);
        F.setTag(com.p314xaae8f345.mm.R.id.ecm, b17);
        return F;
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        java.lang.Object tag = convertView.getTag(com.p314xaae8f345.mm.R.id.ecm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem");
        java.lang.Object tag2 = convertView.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItem.BaseViewHolder");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) tag2).m80056x52a763fb((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0) tag);
        return new qd5.e(convertView);
    }

    @Override // in5.r
    public boolean f() {
        return this.f374652d;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f426197h = adapter instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) adapter : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0978, code lost:
    
        r0 = r54.f426197h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x097a, code lost:
    
        if (r0 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x097c, code lost:
    
        r0 = r0.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x097e, code lost:
    
        if (r0 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0980, code lost:
    
        r0 = (java.lang.ref.WeakReference) ((java.util.HashMap) r0).remove(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x098c, code lost:
    
        r0 = r54.f426197h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x098e, code lost:
    
        if (r0 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0990, code lost:
    
        r0 = r0.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0992, code lost:
    
        if (r0 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0994, code lost:
    
        r0 = (java.lang.Integer) ((java.util.HashMap) r0).remove(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0956 A[Catch: all -> 0x094a, RuntimeException -> 0x094c, TryCatch #2 {RuntimeException -> 0x094c, all -> 0x094a, blocks: (B:263:0x0940, B:214:0x0956, B:217:0x096e, B:220:0x0978, B:222:0x097c, B:224:0x0980, B:225:0x098c, B:227:0x0990, B:229:0x0994), top: B:262:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09b0 A[EDGE_INSN: B:261:0x09b0->B:257:0x09b0 BREAK  A[LOOP:3: B:209:0x093c->B:259:0x093c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0940 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08e9  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r55, in5.c r56, int r57, int r58, boolean r59, java.util.List r60) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od5.g.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f426197h = null;
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void m(boolean z17) {
    }
}
