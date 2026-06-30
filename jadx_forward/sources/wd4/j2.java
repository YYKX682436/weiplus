package wd4;

/* loaded from: classes.dex */
public final class j2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f f526472d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f) {
        this.f526472d = dialogC18384xa272e02f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        int size = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(this.f526472d).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        wd4.s0 s0Var = (wd4.s0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(this.f526472d).get(i17);
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int i18 = s0Var.f526553a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.f3639x46306858.setOnClickListener(wd4.h2.f526455d);
        boolean z17 = holder instanceof wd4.d3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f = this.f526472d;
        if (z17) {
            wd4.d3 d3Var = (wd4.d3) holder;
            wd4.s0 s0Var = (wd4.s0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(dialogC18384xa272e02f).get(i17);
            s0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            java.lang.String str2 = s0Var.f526554b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
            d3Var.f3639x46306858.setClickable(false);
            android.view.View view = d3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) view).setText(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
        } else if (holder instanceof wd4.w0) {
            wd4.w0 w0Var = (wd4.w0) holder;
            wd4.t0 a17 = ((wd4.s0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(dialogC18384xa272e02f).get(i17)).a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.Object mo141623x754a37bb = ((jz5.n) w0Var.f526584d).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                str = a17.f526561b;
            } else {
                str = null;
            }
            textView.setText(Di.Ri(str, true));
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                i18 = a17.f526562c;
            } else {
                i18 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) w0Var.f526585e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            java.lang.String r17 = i65.a.r(w0Var.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.jb7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setText(format);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            if (mo863xcdaf1228(i17) == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                w0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1y);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            } else if (mo863xcdaf1228(i17) == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                w0Var.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b1z);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            }
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            itemView.setOnClickListener(new wd4.g2(itemView, 1000L, this.f526472d, i17));
        } else if (holder instanceof wd4.w) {
            wd4.w wVar = (wd4.w) holder;
            wd4.s0 s0Var2 = (wd4.s0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.K(dialogC18384xa272e02f).get(i17);
            s0Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = s0Var2.f526556d;
            if (z3Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            } else {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = z3Var.d1();
                ((sg3.a) v0Var).getClass();
                java.lang.String c17 = c01.a2.c(z3Var, d17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                java.lang.Object mo141623x754a37bb3 = ((jz5.n) wVar.f526583f).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserTextView", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                ((android.widget.TextView) mo141623x754a37bb3).setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(c17, true));
                kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                java.lang.Object mo141623x754a37bb4 = ((jz5.n) wVar.f526582e).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarImg", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf) mo141623x754a37bb4, z3Var.d1(), null);
                android.view.View itemView2 = wVar.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                itemView2.setOnClickListener(new wd4.u(itemView2, 1000L, wVar, z3Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContactInfo", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder");
            }
            if (mo863xcdaf1228(i17) == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z18 = dialogC18384xa272e02f.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z18 || i17 != 0) {
                    wVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.b1y);
                } else {
                    wVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.f563655b21);
                }
            } else if (mo863xcdaf1228(i17) == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z19 = dialogC18384xa272e02f.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z19 || i17 != 0) {
                    wVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.b1z);
                } else {
                    wVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.f563654b20);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 d3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f = this.f526472d;
        switch (i17) {
            case 1:
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(dialogC18384xa272e02f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571037cs0, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                d3Var = new wd4.d3(inflate);
                break;
            case 2:
            case 3:
                android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(dialogC18384xa272e02f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571038cs1, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
                d3Var = new wd4.w0(inflate2);
                break;
            case 4:
                d3Var = new wd4.i2(com.p314xaae8f345.mm.ui.id.b(dialogC18384xa272e02f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cry, parent, false));
                break;
            case 5:
            case 6:
                android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(dialogC18384xa272e02f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crz, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                d3Var = new wd4.w(inflate3, dialogC18384xa272e02f.f251994r);
                break;
            default:
                d3Var = new wd4.w0(new android.widget.TextView(dialogC18384xa272e02f.getContext()));
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return d3Var;
    }
}
