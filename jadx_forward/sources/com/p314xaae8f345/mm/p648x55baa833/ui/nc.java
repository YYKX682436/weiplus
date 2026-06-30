package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes14.dex */
public class nc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe f145930d;

    public nc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe) {
        this.f145930d = activityC10368x68cc8efe;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectDateUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe activityC10368x68cc8efe = this.f145930d;
        int[] m43521xbf73d141 = activityC10368x68cc8efe.f145492d.m43521xbf73d141();
        if (m43521xbf73d141 != null) {
            int[] m43523xbcd1ef6e = activityC10368x68cc8efe.f145492d.m43523xbcd1ef6e();
            int[] T6 = activityC10368x68cc8efe.T6();
            int i17 = m43521xbf73d141[0];
            int i18 = m43523xbcd1ef6e[0];
            if (i17 <= i18 && (i17 != i18 || m43521xbf73d141[1] <= m43523xbcd1ef6e[1])) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int i19 = m43523xbcd1ef6e[0];
                while (i19 >= m43521xbf73d141[0]) {
                    arrayList2.add(java.lang.String.valueOf(i19));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    int i27 = i19 == m43521xbf73d141[0] ? m43521xbf73d141[1] + 1 : 1;
                    for (int i28 = i19 == m43523xbcd1ef6e[0] ? m43523xbcd1ef6e[1] + 1 : 12; i28 >= i27; i28--) {
                        arrayList4.add(java.lang.String.valueOf(i28));
                    }
                    arrayList3.add(arrayList4);
                    i19--;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activityC10368x68cc8efe, arrayList2, arrayList3);
                c0Var.g(android.view.View.inflate(activityC10368x68cc8efe, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570234e44, null));
                int indexOf = arrayList2.indexOf(java.lang.String.valueOf(T6[0]));
                int indexOf2 = (indexOf < 0 || indexOf >= arrayList3.size() || arrayList3.get(indexOf) == null) ? -1 : ((java.util.List) arrayList3.get(indexOf)).indexOf(java.lang.String.valueOf(T6[1]));
                if (indexOf != -1 && indexOf2 != -1) {
                    c0Var.j(indexOf, indexOf2);
                } else if (indexOf != -1) {
                    c0Var.i(indexOf);
                }
                c0Var.f293792t = new com.p314xaae8f345.mm.p648x55baa833.ui.oc(activityC10368x68cc8efe, c0Var);
                c0Var.l();
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectDateUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
