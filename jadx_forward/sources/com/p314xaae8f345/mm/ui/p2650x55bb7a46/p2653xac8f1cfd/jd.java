package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class jd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd f280818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld f280819e;

    public jd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld ldVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd fdVar) {
        this.f280819e = ldVar;
        this.f280818d = fdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String j17;
        ot0.q v17;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd ddVar = this.f280819e.f280945f;
        if (ddVar != null) {
            int m8183xf806b362 = this.f280818d.m8183xf806b362();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd) ddVar;
            bdVar.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof rn.c) {
                rn.c cVar = (rn.c) tag;
                boolean v07 = cVar.v0();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = bdVar.f280265a;
                if (v07) {
                    kn.j0.d(qcVar.f280113d.g(), cVar.f66259x137a1f8b, false);
                } else {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398545a = cVar.f66266xdec927b;
                    b1Var.f398555f = cVar.f66257x2260084a;
                    b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e5.f34113x366c91de;
                    java.lang.String str = cVar.f66259x137a1f8b;
                    b1Var.f398575t = str;
                    b1Var.f398576u = str;
                    ((nn.j) i95.n0.c(nn.j.class)).wi(b1Var, cVar);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(cVar.f66259x137a1f8b, cVar.u0());
                    b1Var.R = (o27 == null || (j17 = o27.j()) == null || (v17 = ot0.q.v(c01.w9.l(true, j17, o27.A0()))) == null) ? 0 : v17.f430250u2;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(qcVar.f280113d.g(), b1Var);
                }
                rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(cVar.f66259x137a1f8b, cVar.f66264x1210aac6);
                boolean e17 = kn.j0.e(z07);
                if (z07 != null) {
                    z17 = kn.j0.j(z07);
                    if (z17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wc(bdVar, z07, m8183xf806b362), 300L);
                    }
                } else {
                    z17 = false;
                }
                kn.k0.a(qcVar.f280113d.x(), cVar.v0() ? 1 : 0, 1, cVar.f66264x1210aac6, cVar.f66266xdec927b);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = z07 != null ? z07.f66264x1210aac6 : "null";
                objArr[1] = java.lang.Boolean.valueOf(z17);
                objArr[2] = java.lang.Boolean.valueOf(e17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "click update to finish(%s %s %s)", objArr);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = tag != null ? tag.getClass().getSimpleName() : "null";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "onClick %s", objArr2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
