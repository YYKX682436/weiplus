package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public class qe extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f145997d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f145998e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f145999f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f146000g;

    public qe(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f145997d = context;
        this.f145999f = arrayList;
        this.f146000g = arrayList2;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f145998e.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it.next(), true));
        }
        java.util.Iterator it6 = this.f146000g.iterator();
        while (it6.hasNext()) {
            this.f145998e.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it6.next(), true));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f145998e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f145998e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.re reVar = (com.p314xaae8f345.mm.p648x55baa833.ui.re) k3Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.ArrayList) list).get(i17);
        z3Var.getClass();
        android.view.View view = reVar.f146021d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.U6(z3Var.d1(), reVar.f146022e);
        boolean contains = this.f145999f.contains(z3Var.d1());
        android.content.Context context = this.f145997d;
        android.widget.TextView textView = reVar.f146025h;
        android.widget.TextView textView2 = reVar.f146024g;
        android.widget.TextView textView3 = reVar.f146023f;
        if (contains) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.X6(context, z3Var.d1(), textView2, textView, true);
            textView3.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.X6(context, z3Var.d1(), textView2, textView, false);
            textView3.setVisibility(0);
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k4x);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.p648x55baa833.ui.re(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_e, viewGroup, false));
    }
}
