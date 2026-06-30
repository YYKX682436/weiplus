package f93;

/* loaded from: classes3.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 f341855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f341856e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455, android.content.Context context) {
        this.f341855d = dialogC16164x43fb9455;
        this.f341856e = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f341855d.f224720w.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((f93.c5) this.f341855d.f224720w.get(i17)).f341838a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f3639x46306858.setOnClickListener(f93.c.f341832d);
        boolean z17 = holder instanceof f93.v5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455 = this.f341855d;
        if (z17) {
            f93.v5 v5Var = (f93.v5) holder;
            java.lang.String str = ((f93.c5) dialogC16164x43fb9455.f224720w.get(i17)).f341839b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            v5Var.f3639x46306858.setClickable(false);
            android.view.View view = v5Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view).setText(str);
            return;
        }
        if (!(holder instanceof f93.u5)) {
            if (holder instanceof f93.u0) {
                f93.u0 u0Var = (f93.u0) holder;
                u0Var.i(((f93.c5) dialogC16164x43fb9455.f224720w.get(i17)).f341841d);
                if (mo863xcdaf1228(i17) == 6) {
                    if (dialogC16164x43fb9455.f224721x == 0 && i17 == 0) {
                        u0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563655b21);
                        return;
                    } else {
                        u0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1y);
                        return;
                    }
                }
                if (mo863xcdaf1228(i17) == 5) {
                    if (dialogC16164x43fb9455.f224721x == 0 && i17 == 0) {
                        u0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563654b20);
                        return;
                    } else {
                        u0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1z);
                        return;
                    }
                }
                return;
            }
            return;
        }
        f93.u5 u5Var = (f93.u5) holder;
        f93.r5 r5Var = ((f93.c5) dialogC16164x43fb9455.f224720w.get(i17)).f341840c;
        java.lang.Object mo141623x754a37bb = ((jz5.n) u5Var.f342016d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(r5Var != null ? r5Var.f341984b : null, true));
        int i18 = r5Var != null ? r5Var.f341985c : 0;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) u5Var.f342017e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        java.lang.String r17 = i65.a.r(u5Var.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.jb7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setText(format);
        if (mo863xcdaf1228(i17) == 3) {
            u5Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1y);
        } else if (mo863xcdaf1228(i17) == 2) {
            u5Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1z);
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb94552 = this.f341855d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        itemView.setOnClickListener(new f93.b(itemView, 1000L, dialogC16164x43fb94552, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455 dialogC16164x43fb9455 = this.f341855d;
        switch (i17) {
            case 1:
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(dialogC16164x43fb9455.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571037cs0, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                return new f93.v5(inflate);
            case 2:
            case 3:
                android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(dialogC16164x43fb9455.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571038cs1, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
                return new f93.u5(inflate2);
            case 4:
                return new f93.d(com.p314xaae8f345.mm.ui.id.b(dialogC16164x43fb9455.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cry, parent, false));
            case 5:
            case 6:
                android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(dialogC16164x43fb9455.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crz, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
                return new f93.u0(inflate3, this.f341856e, dialogC16164x43fb9455.f224717t);
            default:
                return new f93.u5(new android.widget.TextView(dialogC16164x43fb9455.getContext()));
        }
    }
}
