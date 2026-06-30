package dl2;

/* loaded from: classes3.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac f316723d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac) {
        this.f316723d = c14278x370c3dac;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f316723d.f196282h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        dl2.a holder = (dl2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f3e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac = this.f316723d;
        java.util.List list = c14278x370c3dac.f196282h;
        textView.setText(list != null ? (java.lang.String) list.get(i17) : null);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dy1.a.i(itemView, "live_gift_tab");
        if (i17 == c14278x370c3dac.selectedTabIndex) {
            android.view.View view = holder.f3639x46306858;
            android.content.Context context = c14278x370c3dac.f196279e;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            view.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563256a41));
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        } else {
            holder.f3639x46306858.setBackground(null);
            textView.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
        }
        holder.f3639x46306858.setOnClickListener(new dl2.b(c14278x370c3dac, i17, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac = this.f316723d;
        android.view.View inflate = android.view.LayoutInflater.from(c14278x370c3dac.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.as_, parent, false);
        inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2));
        return new dl2.a(c14278x370c3dac, inflate);
    }
}
