package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd f280758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld f280759e;

    public id(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld ldVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd fdVar) {
        this.f280759e = ldVar;
        this.f280758d = fdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd ddVar = this.f280759e.f280945f;
        if (ddVar != null) {
            int m8183xf806b362 = this.f280758d.m8183xf806b362();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd) ddVar;
            bdVar.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof rn.c) {
                rn.c cVar = (rn.c) tag;
                boolean i17 = kn.j0.i(cVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onFinish finish(%s %s)", cVar.f66264x1210aac6, java.lang.Boolean.valueOf(i17));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = bdVar.f280265a;
                if (i17) {
                    jn.k Ri = ((nn.j) i95.n0.c(nn.j.class)).Ri();
                    java.lang.String x17 = qcVar.f280113d.x();
                    java.lang.String str = cVar.f66252xb1e12de7;
                    java.lang.String str2 = cVar.f66264x1210aac6;
                    r45.vt5 b17 = kn.j0.b(cVar);
                    Ri.getClass();
                    gm0.j1.d().g(new kn.b0(x17, str, str2, b17));
                    qcVar.n0(cVar);
                    qcVar.f281301m.m8155x27702c4(m8183xf806b362);
                    qcVar.p0();
                }
                kn.k0.b(qcVar.f280113d.x(), cVar.v0() ? 1 : 0, 1, 2, cVar.f66264x1210aac6, cVar.f66266xdec927b);
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = tag == null ? "null" : tag.getClass().getSimpleName();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "onFinish %s", objArr);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
