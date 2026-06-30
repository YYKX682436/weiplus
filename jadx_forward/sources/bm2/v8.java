package bm2;

/* loaded from: classes3.dex */
public final class v8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f103924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f103925e = new java.util.LinkedList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103925e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((bm2.r8) this.f103925e.get(i17)).f103813c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        r45.il1 il1Var;
        r45.il1 il1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof bm2.s8)) {
            if (holder instanceof bm2.q8) {
                return;
            }
            return;
        }
        bm2.s8 s8Var = (bm2.s8) holder;
        java.lang.String str = null;
        bm2.r8 r8Var = i17 >= 0 && i17 < mo1894x7e414b06() ? (bm2.r8) this.f103925e.get(i17) : null;
        boolean z17 = r8Var != null && r8Var.f103811a;
        android.widget.CheckBox checkBox = s8Var.f103827d;
        checkBox.setChecked(z17);
        if (r8Var != null && r8Var.f103814d) {
            checkBox.setEnabled(true);
            android.view.View view = s8Var.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            s8Var.f3639x46306858.setOnClickListener(new bm2.t8(r8Var, s8Var, this));
        } else {
            checkBox.setEnabled(false);
            android.view.View view2 = s8Var.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter", "bindWhiteListViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveWhiteListAdapter$WhiteListViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            s8Var.f3639x46306858.setOnClickListener(new bm2.u8(s8Var));
        }
        java.lang.String m75945x2fec8307 = (r8Var == null || (il1Var2 = r8Var.f103812b) == null) ? null : il1Var2.m75945x2fec8307(1);
        android.widget.TextView textView = s8Var.f103828e;
        textView.setText(m75945x2fec8307);
        if (r8Var != null && (il1Var = r8Var.f103812b) != null) {
            str = il1Var.m75945x2fec8307(0);
        }
        textView.setTag(str);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570553b20, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new bm2.q8(this, inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570554b21, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new bm2.s8(this, inflate2);
    }
}
