package ks2;

/* loaded from: classes8.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f393137d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f393138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ks2.j f393139f;

    public e(ks2.j jVar) {
        this.f393139f = jVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f393137d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((r45.cq4) this.f393137d.get(i17)).m75939xb282bd08(0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        android.text.SpannableString spannableString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f393137d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.cq4 cq4Var = (r45.cq4) obj;
        boolean z17 = true;
        if (holder instanceof ks2.f) {
            this.f393138e = true;
            holder.f3639x46306858.setOnClickListener(new ks2.c(this, cq4Var));
            return;
        }
        if (holder instanceof ks2.g) {
            android.view.View view = holder.f3639x46306858;
            int i18 = this.f393138e ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ks2.g gVar = (ks2.g) holder;
            java.lang.String m75945x2fec8307 = cq4Var.m75945x2fec8307(1);
            android.widget.TextView textView = gVar.f393140d;
            textView.setText(m75945x2fec8307);
            java.lang.String m75945x2fec83072 = cq4Var.m75945x2fec8307(2);
            ks2.j jVar = this.f393139f;
            if (m75945x2fec83072 != null) {
                i95.m c17 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                spannableString = zy2.s6.l6((zy2.s6) c17, m75945x2fec83072, (int) jVar.E.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r), false, null, 0, false, null, 124, null);
            } else {
                spannableString = null;
            }
            android.widget.TextView textView2 = gVar.f393141e;
            textView2.setText(spannableString);
            java.lang.CharSequence text = textView.getText();
            if (text != null && text.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                }
                if (marginLayoutParams != null) {
                    textView2.setLayoutParams(marginLayoutParams);
                }
            } else {
                textView.setVisibility(0);
            }
            textView2.setTextColor(cq4Var.m75939xb282bd08(0) == 2 ? jVar.E.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c) : jVar.E.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            textView2.setOnClickListener(new ks2.d(cq4Var, holder));
            android.view.View view2 = gVar.f393142f;
            int i19 = cq4Var.m75939xb282bd08(0) == 4 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        ks2.j jVar = this.f393139f;
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(jVar.E).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.edq, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new ks2.f(jVar, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(jVar.E).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.edr, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new ks2.g(jVar, inflate2);
    }
}
