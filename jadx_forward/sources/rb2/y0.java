package rb2;

/* loaded from: classes10.dex */
public final class y0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f475362e;

    /* renamed from: f, reason: collision with root package name */
    public final int f475363f;

    /* renamed from: g, reason: collision with root package name */
    public final gd2.n f475364g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f475365h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f475366i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.p f475367m;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj, int i17, gd2.n menuData, yz5.l onLikeComment, yz5.l onOpenCommentInputFooter, yz5.p onRunDragAnimation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuData, "menuData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLikeComment, "onLikeComment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOpenCommentInputFooter, "onOpenCommentInputFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRunDragAnimation, "onRunDragAnimation");
        this.f475362e = feedObj;
        this.f475363f = i17;
        this.f475364g = menuData;
        this.f475365h = onLikeComment;
        this.f475366i = onOpenCommentInputFooter;
        this.f475367m = onRunDragAnimation;
    }

    public static final void n(rb2.y0 y0Var, android.view.View view) {
        y0Var.getClass();
        if (view.getWidth() > 0) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hke);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oog);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.u79);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vip);
            android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vid);
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f568997vj2);
            android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.ucc);
            int width = view.findViewById(com.p314xaae8f345.mm.R.id.f567185uc4).getWidth();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            int p17 = y0Var.p(findViewById);
            int p18 = findViewById2.getVisibility() == 0 ? y0Var.p(findViewById2) : 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            int q17 = y0Var.q(textView2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            int q18 = y0Var.q(textView3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
            int p19 = y0Var.p(findViewById3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
            int p27 = y0Var.p(findViewById4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            int p28 = hc2.f1.p(textView);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageFlowConvert", "Width all:" + width + " avatar:" + p17 + " finderIcon:" + p18 + " ipRegion:" + q17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageFlowConvert", "Width commentTime:" + q18 + " reply:" + p19 + " thumbLikeContainer:" + p27 + " char:" + p28);
            int i17 = ((((((width - p17) - p18) - q17) - q18) - p19) - p27) - p28;
            int i18 = (int) (((float) p28) * 2.5f);
            if (i17 < i18) {
                i17 = i18;
            }
            textView.setMaxWidth(i17);
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e66;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r28, in5.c r29, int r30, int r31, boolean r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.y0.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15) holder.p(com.p314xaae8f345.mm.R.id.u76);
        c13709xbc18ee15.m55656x528e502b(this.f475364g);
        c13709xbc18ee15.mo55657x3be48126(new rb2.v0(this, holder));
        c13709xbc18ee15.setOnItemSelectedListener(new rb2.w0(this, holder, c13709xbc18ee15));
        holder.p(com.p314xaae8f345.mm.R.id.ssh).setClickable(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c) holder.p(com.p314xaae8f345.mm.R.id.vic);
        android.content.Context context = holder.f374654e;
        int m9702x7444d5ad = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
        int m9702x7444d5ad2 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.ajw);
        c15213xbf81077c.f212353p.setTextColor(m9702x7444d5ad);
        c15213xbf81077c.f212354q.setTextColor(m9702x7444d5ad2);
        float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb) * i65.a.q(context);
        c15213xbf81077c.f212354q.setTextSize(0, dimension);
        c15213xbf81077c.f212353p.setTextSize(0, dimension);
        c15213xbf81077c.setOnClickListener(new rb2.x0(this, holder));
    }

    public final void o(in5.s0 s0Var, so2.y0 y0Var) {
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f475362e;
        long j17 = c14994x9b99c079.f66939xc8a07680;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
        int i17 = this.f475363f;
        r(s0Var, n1Var.i(j17, yj0Var, i17), n1Var.b(c14994x9b99c079.f66939xc8a07680, y0Var.f492236d, i17));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.ucc);
        viewGroup.setOnClickListener(new rb2.s0(this, s0Var, y0Var, viewGroup));
    }

    public final int p(android.view.View view) {
        int width = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int c17 = width + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return c17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public final int q(android.widget.TextView textView) {
        int r17 = hc2.f1.r(textView, textView.getPaddingStart() + textView.getPaddingEnd());
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int c17 = r17 + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        return c17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
    }

    public final void r(in5.s0 s0Var, boolean z17, int i17) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.vjf);
        if (i17 > 0) {
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.d(i17));
        } else {
            textView.setVisibility(8);
            textView.setText("");
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int m9702x7444d5ad = this.f475362e.m59303x7d1523() ? b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741) : z17 ? b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23) : b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        textView.setTextColor(m9702x7444d5ad);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.u7q);
        c22699x3dcdb352.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f79758xc84e73d5 : com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
        c22699x3dcdb352.m82040x7541828(m9702x7444d5ad);
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
    }
}
