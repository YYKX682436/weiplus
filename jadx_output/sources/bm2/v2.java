package bm2;

/* loaded from: classes3.dex */
public final class v2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public int f22376e;

    /* renamed from: g, reason: collision with root package name */
    public r45.js1 f22378g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f22379h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f22375d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f22377f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f22380i = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479681ch);

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22375d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        ((bm2.t2) this.f22375d.get(i17)).getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        bm2.q2 holder = (bm2.q2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof bm2.r2)) {
            if (holder instanceof bm2.s2) {
                bm2.s2 s2Var = (bm2.s2) holder;
                int i18 = this.f22376e;
                s2Var.f22289d.setText(s2Var.itemView.getContext().getString(com.tencent.mm.R.string.den, java.lang.Integer.valueOf(i18 > 0 ? i18 : 0)));
                return;
            }
            return;
        }
        bm2.r2 r2Var = (bm2.r2) holder;
        r45.fq1 fq1Var = ((bm2.t2) this.f22375d.get(i17)).f22307a;
        java.lang.String str = null;
        r45.xn1 xn1Var = fq1Var != null ? (r45.xn1) fq1Var.getCustom(0) : null;
        r2Var.f22267d.setText(java.lang.String.valueOf(i17 + 1));
        int measuredWidth = (r2Var.itemView.getMeasuredWidth() - r2Var.f22267d.getMeasuredWidth()) - com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj);
        r2Var.f22269f.setVisibility(xn1Var != null && xn1Var.getInteger(7) == 3 ? 0 : 8);
        if (r2Var.f22269f.getVisibility() == 0) {
            measuredWidth -= r2Var.f22269f.getMeasuredWidth();
        }
        java.util.List<android.text.style.UpdateLayout> r17 = gm2.c1.r(gm2.c1.f273320a, xn1Var != null ? xn1Var.getList(11) : null, new int[]{12, 4}, gm2.c2.f273350i, null, 0, r2Var.f22270g, null, 0, 0, null, null, 2008, null);
        if (r17.isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f328773y6;
            java.util.LinkedList list = xn1Var != null ? xn1Var.getList(11) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getNickname());
            sb6.append(",bindFansItem");
            x0Var.b(list, sb6.toString());
        } else {
            for (android.text.style.UpdateLayout updateLayout : r17) {
                gm2.y1 y1Var = updateLayout instanceof gm2.y1 ? (gm2.y1) updateLayout : null;
                measuredWidth -= y1Var != null ? y1Var.a() : 0;
            }
        }
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(gm2.c1.f273320a.o(r17).concat(" "));
        java.util.Iterator it = r17.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            int i27 = i19 + 1;
            f0Var.c((android.text.style.ImageSpan) it.next(), i19, i27, 33);
            i19 = i27;
        }
        r2Var.f22270g.setText(f0Var);
        if (this.f22377f == 1) {
            r2Var.f22271h.setText(java.lang.String.valueOf(xn1Var != null ? java.lang.Long.valueOf(xn1Var.getLong(13)) : null));
        } else {
            r2Var.f22271h.setText(java.lang.String.valueOf(xn1Var != null ? java.lang.Long.valueOf(xn1Var.getLong(15)) : null));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(r2Var.f22271h.getMeasuredWidth());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = measuredWidth - (valueOf != null ? valueOf.intValue() : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj));
        if (intValue > 0) {
            r2Var.f22268e.setMaxWidth(intValue);
        } else {
            r2Var.f22268e.setMaxWidth(this.f22380i);
        }
        android.widget.TextView textView = r2Var.f22268e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str = finderContact.getNickname();
        }
        float textSize = r2Var.f22268e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        r2Var.itemView.setOnClickListener(new bm2.u2(this, xn1Var));
        android.widget.TextView textView2 = r2Var.f22272i;
        r45.js1 js1Var = this.f22378g;
        int integer = js1Var != null ? js1Var.getInteger(8) : 0;
        r45.js1 js1Var2 = this.f22378g;
        int integer2 = js1Var2 != null ? js1Var2.getInteger(6) : -1;
        if (i17 != integer - 1 || integer <= 1 || integer2 < 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.lu_, java.lang.String.valueOf(integer2)));
        }
        zl2.r4.f473950a.M2("FinderLiveFansListAdapter", "bindFansItem nicknameMaxWidth:" + intValue);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aqg, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new bm2.s2(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aqf, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new bm2.r2(this, inflate2);
    }
}
