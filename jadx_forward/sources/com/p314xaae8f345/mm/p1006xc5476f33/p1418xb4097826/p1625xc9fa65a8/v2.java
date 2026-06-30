package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class v2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207458d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207459e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f207460f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f207461g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f207462h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f207463i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f207464m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f207465n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f207466o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f207467p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f207468q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f207469r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f207470s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewGroup f207471t;

    /* renamed from: u, reason: collision with root package name */
    public final int f207472u;

    /* renamed from: v, reason: collision with root package name */
    public final int f207473v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f207474w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f207475x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f207476y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f207477z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.view.View itemView, boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(itemView);
        z17 = (i17 & 2) != 0 ? true : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        z19 = (i17 & 8) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f207458d = z17;
        this.f207459e = z18;
        this.f207460f = z19;
        this.f207461g = "Finder.MixSearchContactItemHolder";
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.d1y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f207462h = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f207463i = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f207464m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.gbd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f207465n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hcq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f207466o = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.l7x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f207467p = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cub);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f207468q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.cuc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f207469r = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.a86);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f207470s = (android.widget.ImageView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.ffc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById10;
        this.f207471t = viewGroup;
        this.f207472u = itemView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac);
        this.f207473v = itemView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
        this.f207474w = itemView.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ac_);
        this.f207475x = itemView.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ac9);
        this.f207476y = itemView.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.acb);
        this.f207477z = itemView.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aca);
        this.A = 1;
        viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.s2(this));
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        android.widget.TextView textView = this.f207468q;
        textView.setVisibility(0);
        this.f207469r.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setText(r26.i0.t(str2, "\n", " ", false));
                this.A++;
                return;
            }
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        java.lang.String t17 = r26.i0.t(str, "\n", " ", false);
        java.lang.String format = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(16777215 & textView.getCurrentTextColor())}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        if (this.f207458d) {
            format = "";
        }
        android.text.Spanned c17 = l4Var.c(t17, format);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, c17, textSize));
        this.A++;
    }

    public final void j(boolean z17, int i17) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int i18 = (z17 || i17 > 0) ? 0 : 8;
        android.widget.TextView textView = this.f207465n;
        textView.setVisibility(i18);
        boolean z18 = this.f207459e;
        if (z17) {
            textView.setText(this.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4));
            int i19 = this.f207472u;
            if (z18) {
                textView.setTextColor(i19);
                drawable2 = this.f207475x;
            } else {
                textView.setTextColor(i19);
                drawable2 = this.f207474w;
            }
            textView.setBackground(drawable2);
            return;
        }
        if (i17 > 0) {
            textView.setText(this.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2t, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(i17, false)));
            int i27 = this.f207473v;
            if (z18) {
                textView.setTextColor(i27);
                drawable = this.f207477z;
            } else {
                textView.setTextColor(i27);
                drawable = this.f207476y;
            }
            textView.setBackground(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0422  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(r45.mu2 r35, android.view.View.OnClickListener r36, android.view.View.OnLongClickListener r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2.k(r45.mu2, android.view.View$OnClickListener, android.view.View$OnLongClickListener, boolean):void");
    }
}
