package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class qe extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f64464d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f64465e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f64466f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f64467g;

    public qe(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f64464d = context;
        this.f64466f = arrayList;
        this.f64467g = arrayList2;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f64465e.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it.next(), true));
        }
        java.util.Iterator it6 = this.f64467g.iterator();
        while (it6.hasNext()) {
            this.f64465e.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it6.next(), true));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f64465e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f64465e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        com.tencent.mm.chatroom.ui.re reVar = (com.tencent.mm.chatroom.ui.re) k3Var;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.ArrayList) list).get(i17);
        z3Var.getClass();
        android.view.View view = reVar.f64488d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.U6(z3Var.d1(), reVar.f64489e);
        boolean contains = this.f64466f.contains(z3Var.d1());
        android.content.Context context = this.f64464d;
        android.widget.TextView textView = reVar.f64492h;
        android.widget.TextView textView2 = reVar.f64491g;
        android.widget.TextView textView3 = reVar.f64490f;
        if (contains) {
            com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.X6(context, z3Var.d1(), textView2, textView, true);
            textView3.setVisibility(8);
        } else {
            com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.X6(context, z3Var.d1(), textView2, textView, false);
            textView3.setVisibility(0);
            textView3.setText(com.tencent.mm.R.string.k4x);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.chatroom.ui.re(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.d_e, viewGroup, false));
    }
}
