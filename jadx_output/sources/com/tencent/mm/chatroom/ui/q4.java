package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class q4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f64440d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f64441e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f64442f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f64443g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.s4 f64445i;

    /* renamed from: h, reason: collision with root package name */
    public int f64444h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f64446m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f64447n = 0;

    public q4(android.content.Context context, java.util.List list, java.util.HashMap hashMap, java.util.List list2, com.tencent.mm.chatroom.ui.s4 s4Var) {
        this.f64440d = context;
        this.f64441e = list;
        this.f64443g = hashMap;
        this.f64442f = list2;
        this.f64445i = s4Var;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((com.tencent.mm.storage.z3) it.next()).d1(), java.lang.Boolean.FALSE);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64441e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.List list = this.f64441e;
        list.size();
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.tencent.mm.chatroom.ui.t4 t4Var = (com.tencent.mm.chatroom.ui.t4) k3Var;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) list.get(i17);
        list.size();
        z3Var.getClass();
        android.view.View view = t4Var.f64523d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.U6(z3Var.d1(), t4Var.f64525f);
        com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.X6(this.f64440d, z3Var.d1(), t4Var.f64526g, t4Var.f64527h, false);
        java.lang.Boolean bool = (java.lang.Boolean) this.f64443g.get(z3Var.d1());
        android.widget.CheckBox checkBox = t4Var.f64524e;
        checkBox.setEnabled(true);
        checkBox.setChecked(bool != null ? bool.booleanValue() : false);
        android.view.View view2 = t4Var.f64523d;
        view2.setTag(z3Var);
        view2.setOnClickListener(new com.tencent.mm.chatroom.ui.p4(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.chatroom.ui.t4(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488410sj, viewGroup, false));
    }
}
