package fk2;

/* loaded from: classes3.dex */
public abstract class v extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f345027m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f345027m = "CommentItemBaseEmoji";
    }

    public static final void q(fk2.v vVar, android.content.Context context, android.view.View view) {
        if (vVar.l()) {
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8), 0, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
        }
    }

    public final void r(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, android.view.View view) {
        df2.ih ihVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 c14309x7fd7c1d9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9) view.findViewById(com.p314xaae8f345.mm.R.id.ua_);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.uaa);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ual);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.uaj);
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.uak);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = this.f526773a.p();
        if (p17 != null && (ihVar = (df2.ih) p17.mo57658x143f1b92(df2.ih.class)) != null) {
            java.lang.Integer num = ihVar.f311938v;
            if (num != null) {
                int intValue = num.intValue();
                c14309x7fd7c1d9.m57287x86c391e1(intValue);
                findViewById.getLayoutParams().width = intValue;
                findViewById.getLayoutParams().height = intValue;
                findViewById.requestLayout();
            }
            java.lang.Integer num2 = ihVar.f311939w;
            if (num2 != null) {
                c14309x7fd7c1d9.m57288x93dd6bcf(num2.intValue());
            }
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Bi(str, gVar);
        c14309x7fd7c1d9.m43712xc040f7d2(Bi);
        c14309x7fd7c1d9.requestLayout();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345027m, "[loadEmoji] md5=" + ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Bi).mo42933xb5885648());
        c14309x7fd7c1d9.m43715x36e51bc8(new fk2.u(Bi, findViewById, this, findViewById2, findViewById3, findViewById4));
    }

    public final void s(android.content.Context context, bm2.h1 holder, dk2.zf msg) {
        jz5.l q17;
        df2.ih ihVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = msg instanceof dk2.fg;
        dk2.fg fgVar = z17 ? (dk2.fg) msg : null;
        java.lang.String b17 = fgVar != null ? fgVar.b() : null;
        if (b17 == null || b17.length() == 0) {
            dk2.fg fgVar2 = z17 ? (dk2.fg) msg : null;
            if (fgVar2 == null || (q17 = fgVar2.q()) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) q17.f384366d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) q17.f384367e;
            if (str == null || gVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 p17 = this.f526773a.p();
            boolean z18 = (p17 == null || (ihVar = (df2.ih) p17.mo57658x143f1b92(df2.ih.class)) == null || !ihVar.f311940x) ? false : true;
            android.widget.FrameLayout frameLayout = z18 ? holder.f103467o : holder.f103466n;
            frameLayout.setVisibility(0);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9v, (android.view.ViewGroup) frameLayout, false);
            frameLayout.addView(inflate);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9 c14309x7fd7c1d9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14309x7fd7c1d9) inflate.findViewById(com.p314xaae8f345.mm.R.id.ua_);
            r(str, gVar, inflate);
            q(this, context, frameLayout);
            if (z18) {
                holder.f103462g.post(new fk2.t(holder, inflate, this, c14309x7fd7c1d9, str, gVar, context));
            }
        }
    }
}
