package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class q4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f145973d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f145974e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f145975f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f145976g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.s4 f145978i;

    /* renamed from: h, reason: collision with root package name */
    public int f145977h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f145979m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f145980n = 0;

    public q4(android.content.Context context, java.util.List list, java.util.HashMap hashMap, java.util.List list2, com.p314xaae8f345.mm.p648x55baa833.ui.s4 s4Var) {
        this.f145973d = context;
        this.f145974e = list;
        this.f145976g = hashMap;
        this.f145975f = list2;
        this.f145978i = s4Var;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next()).d1(), java.lang.Boolean.FALSE);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f145974e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f145974e;
        list.size();
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.t4 t4Var = (com.p314xaae8f345.mm.p648x55baa833.ui.t4) k3Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) list.get(i17);
        list.size();
        z3Var.getClass();
        android.view.View view = t4Var.f146056d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.U6(z3Var.d1(), t4Var.f146058f);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.X6(this.f145973d, z3Var.d1(), t4Var.f146059g, t4Var.f146060h, false);
        java.lang.Boolean bool = (java.lang.Boolean) this.f145976g.get(z3Var.d1());
        android.widget.CheckBox checkBox = t4Var.f146057e;
        checkBox.setEnabled(true);
        checkBox.setChecked(bool != null ? bool.booleanValue() : false);
        android.view.View view2 = t4Var.f146056d;
        view2.setTag(z3Var);
        view2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.p4(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p648x55baa833.ui.t4(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569943sj, viewGroup, false));
    }
}
