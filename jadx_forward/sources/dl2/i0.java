package dl2;

/* loaded from: classes3.dex */
public final class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d f316761d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d) {
        this.f316761d = c14279xd5b5745d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f316761d.f196289g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        dl2.g0 holder = (dl2.g0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f3e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d = this.f316761d;
        java.util.List list = c14279xd5b5745d.f196289g;
        textView.setText(list != null ? (java.lang.String) list.get(i17) : null);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dy1.a.i(itemView, "live_gift_tab");
        if (i17 == c14279xd5b5745d.selectedTabIndex) {
            android.view.View view = holder.f3639x46306858;
            android.content.Context context = c14279xd5b5745d.f196286d;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            view.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563256a41));
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            com.p314xaae8f345.mm.ui.fk.a(textView);
            if (i17 != c14279xd5b5745d.f196291i) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                android.view.View view2 = holder.f3639x46306858;
                jz5.l[] lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("tab_type_page", java.lang.Integer.valueOf(i17 + 1));
                java.util.List list2 = c14279xd5b5745d.f196289g;
                if (list2 == null || (str = (java.lang.String) list2.get(i17)) == null) {
                    str = "";
                }
                lVarArr[1] = new jz5.l("tab_type_name", str);
                ((cy1.a) rVar).Cj("view_exp", view2, kz5.c1.k(lVarArr), 25561);
                c14279xd5b5745d.f196291i = i17;
            }
        } else {
            holder.f3639x46306858.setBackground(null);
            textView.setTextColor(android.graphics.Color.parseColor("#55FFFFFF"));
            com.p314xaae8f345.mm.ui.fk.c(textView);
        }
        if (c14279xd5b5745d.f196294o) {
            holder.f3639x46306858.setBackground(null);
            textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), 0);
        }
        holder.f3639x46306858.setOnClickListener(new dl2.h0(c14279xd5b5745d, i17, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14279xd5b5745d c14279xd5b5745d = this.f316761d;
        android.view.View inflate = android.view.LayoutInflater.from(c14279xd5b5745d.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.as_, parent, false);
        inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2));
        return new dl2.g0(c14279xd5b5745d, inflate);
    }
}
