package w82;

/* loaded from: classes8.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f525366d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f525367e;

    /* renamed from: f, reason: collision with root package name */
    public int f525368f;

    public d(java.util.List options, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f525366d = options;
        this.f525367e = onItemClick;
        this.f525368f = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f525366d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        w82.b holder = (w82.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        w82.l option = (w82.l) this.f525366d.get(i17);
        boolean z17 = i17 == this.f525368f;
        boolean z18 = i17 == mo1894x7e414b06() - 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        android.widget.TextView textView = holder.f525346d;
        textView.setText(option.f525441b);
        holder.f525347e.setVisibility(z17 ? 0 : 8);
        android.view.View view = holder.f525348f;
        int i18 = z18 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$FavCleanOptionItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavCleanOptionAdapter$OptionViewHolder", "bind", "(Lcom/tencent/mm/plugin/fav/ui/widget/FavFilterPanel$FavCleanOptionItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        } else {
            com.p314xaae8f345.mm.ui.fk.c(textView);
        }
        holder.f3639x46306858.setOnClickListener(new w82.c(this, i17, option));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570287e51, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new w82.b(inflate);
    }

    public final void x(int i17) {
        int i18 = this.f525368f;
        java.util.List list = this.f525366d;
        if (i18 != i17) {
            this.f525368f = i17;
            if (i18 != -1) {
                m8147xed6e4d18(i18);
            }
            int i19 = this.f525368f;
            if (i19 != -1 && i19 < list.size()) {
                m8147xed6e4d18(this.f525368f);
            }
        }
        this.f525367e.mo146xb9724478((w82.l) list.get(i17));
    }
}
