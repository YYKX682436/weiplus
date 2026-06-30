package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.w0.class)
/* loaded from: classes13.dex */
public class qc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.w0 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f281296e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f281297f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f281298g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f281299h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f281300i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld f281301m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f281302n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f281303o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cd f281304p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f281305q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f281306r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f281307s = false;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f281308t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f281309u = null;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281310v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd f281311w;

    public qc() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281310v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GroupTodoComponent$1
            {
                this.f39173x3fe91575 = 1864745998;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe) {
                int n07;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe2 = c5759x7ac701fe;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc.this;
                qcVar.f280113d.b0();
                if (c5759x7ac701fe2 != null) {
                    am.ql qlVar = c5759x7ac701fe2.f136078g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "NotifyGroupTodoEvent %s %s %s", qlVar.f89249b, qlVar.f89250c, java.lang.Integer.valueOf(qlVar.f89248a));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(qcVar.f280113d.x(), qlVar.f89249b)) {
                        if (qlVar.f89248a != 3) {
                            java.util.ArrayList arrayList = qcVar.f281305q;
                            if (arrayList.size() > 0) {
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md mdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md) it.next();
                                    if (mdVar.f281035b == 1) {
                                        qcVar.o0(mdVar.f281034a);
                                        qcVar.f281301m.m8151xc67946d3(0, mdVar.f281036c);
                                    }
                                }
                                arrayList.clear();
                            }
                        }
                        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(qlVar.f89249b, qlVar.f89250c);
                        int i17 = qlVar.f89248a;
                        if (i17 == 0) {
                            qcVar.m0(z07, false);
                        } else if (i17 == 1) {
                            java.lang.String str = qlVar.f89250c;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (n07 = qcVar.n0((rn.c) qcVar.f281303o.remove(str))) != -1) {
                                qcVar.f281301m.m8155x27702c4(n07);
                            }
                        } else if (i17 == 2) {
                            qcVar.m0(z07, false);
                        } else if (i17 == 3) {
                            qcVar.m0(z07, true);
                        }
                        qcVar.p0();
                    }
                }
                return false;
            }
        };
        this.f281311w = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f280113d.x())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onPause");
            this.f281310v.mo48814x2efc64();
            android.view.View view = this.f281296e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f280113d.x());
            if (p17 != null && p17.J0() == 1) {
                p17.D1(0);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).Y(p17, p17.h1(), false, true);
            }
        }
        this.f281307s = false;
    }

    public final void m0(rn.c cVar, boolean z17) {
        if (kn.j0.e(cVar)) {
            if (((java.util.ArrayList) this.f281302n).contains(cVar)) {
                if (z17) {
                    if (((java.util.ArrayList) this.f281302n).indexOf(cVar) != -1) {
                        this.f281305q.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md(cVar, 1, 0, ((java.util.ArrayList) this.f281302n).indexOf(cVar) + 1));
                        return;
                    }
                    return;
                } else {
                    int o07 = o0(cVar);
                    if (o07 != -1) {
                        this.f281301m.m8151xc67946d3(0, o07 + 1);
                        return;
                    }
                    return;
                }
            }
            if (cVar != null) {
                ((java.util.ArrayList) this.f281302n).add(0, cVar);
                this.f281303o.put(cVar.f66264x1210aac6, cVar);
                this.f281301m.m8149x8b456734(0);
            }
            if (((java.util.ArrayList) this.f281302n).size() > 20) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vc vcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vc(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(vcVar, 300L, false);
            }
        }
    }

    public final int n0(rn.c cVar) {
        if (cVar == null) {
            return -1;
        }
        java.util.List list = this.f281302n;
        if (!((java.util.ArrayList) list).contains(cVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "removeTodoItemList todo no exist???");
            return -1;
        }
        int indexOf = ((java.util.ArrayList) list).indexOf(cVar);
        ((java.util.ArrayList) list).remove(cVar);
        this.f281303o.remove(cVar.f66264x1210aac6);
        return indexOf;
    }

    public final int o0(rn.c cVar) {
        if (cVar == null) {
            return -1;
        }
        java.util.List list = this.f281302n;
        if (!((java.util.ArrayList) list).contains(cVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.GroupTodoComponent", "updateItem todo no exist???");
            return -1;
        }
        int indexOf = ((java.util.ArrayList) list).indexOf(cVar);
        ((java.util.ArrayList) list).remove(indexOf);
        ((java.util.ArrayList) list).add(0, cVar);
        this.f281303o.put(cVar.f66264x1210aac6, cVar);
        return indexOf;
    }

    public final void p0() {
        if (this.f281296e != null) {
            if (((java.util.ArrayList) this.f281302n).size() == 0) {
                android.view.View view = this.f281296e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cd cdVar = this.f281304p;
                if (cdVar != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v1) cdVar).f272222a;
                    c19666xfd6e2f33.f271604u = false;
                    c19666xfd6e2f33.M1();
                    return;
                }
                return;
            }
            if (this.f281306r) {
                android.view.View view2 = this.f281296e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cd cdVar2 = this.f281304p;
                if (cdVar2 != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v1) cdVar2).f272222a;
                    c19666xfd6e2f332.f271604u = true;
                    c19666xfd6e2f332.M1();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        java.util.ArrayList arrayList = this.f281305q;
        if (arrayList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "saveOperationList:%s", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md mdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.md) it.next();
                if (mdVar.f281035b == 1) {
                    o0(mdVar.f281034a);
                    this.f281301m.m8151xc67946d3(0, mdVar.f281036c);
                }
            }
            arrayList.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f280113d.x(), java.lang.Integer.valueOf(hashCode()));
        if (this.f281296e == null) {
            long c17 = c01.id.c();
            android.view.View c18 = this.f280113d.c(com.p314xaae8f345.mm.R.id.bl_);
            this.f281296e = c18;
            this.f281297f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c18.findViewById(com.p314xaae8f345.mm.R.id.oel);
            this.f281298g = (android.widget.ImageView) this.f281296e.findViewById(com.p314xaae8f345.mm.R.id.oeg);
            this.f281299h = (android.widget.ImageView) this.f281296e.findViewById(com.p314xaae8f345.mm.R.id.oek);
            this.f281297f.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rc(this));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(this.f280113d.g());
            this.f281300i = c22847x422a813d;
            c22847x422a813d.Q(0);
            this.f281297f.mo7967x900dcbe1(this.f281300i);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld ldVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld(this.f280113d.g(), this.f281302n, this.f281311w);
            this.f281301m = ldVar;
            this.f281297f.mo7960x6cab2c8d(ldVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "constructor interTime:%s", java.lang.Long.valueOf(c01.id.c() - c17));
        }
        this.f281307s = true;
        long c19 = c01.id.c();
        ((java.util.ArrayList) this.f281302n).clear();
        this.f281303o.clear();
        if (this.f281307s) {
            java.util.Collections.sort(this.f281302n, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uc(this));
            this.f281301m.m8146xced61ae5();
            p0();
        }
        android.view.View view = this.f281296e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(this.f280113d.x())) {
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.qc$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc.this;
                    final java.lang.String x17 = qcVar.f280113d.x();
                    rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
                    Bi.getClass();
                    final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                        long c27 = c01.id.c();
                        android.database.Cursor E = Bi.f479135d.E("GroupTodo", rn.c.T.f398487c, "roomname=? and createtime>=? AND state IN (0,1)", new java.lang.String[]{x17, (c27 - rn.e.f479132e.longValue()) + ""}, null, null, "updatetime DESC limit 20");
                        if (E != null) {
                            while (E.moveToNext()) {
                                try {
                                    rn.c cVar = new rn.c();
                                    cVar.mo9015xbf5d97fd(E);
                                    arrayList2.add(cVar);
                                } finally {
                                    E.close();
                                }
                            }
                        }
                    }
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.qc$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str;
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc.this;
                            if (qcVar2.f281307s && (str = x17) != null && str.equals(qcVar2.f280113d.x())) {
                                qcVar2.f281310v.mo48813x58998cd();
                                java.util.List list = qcVar2.f281302n;
                                java.util.List<rn.c> list2 = arrayList2;
                                if (list2 != null) {
                                    for (rn.c cVar2 : list2) {
                                        ((java.util.ArrayList) list).add(cVar2);
                                        qcVar2.f281303o.put(cVar2.f66264x1210aac6, cVar2);
                                    }
                                }
                                if (qcVar2.f281307s) {
                                    java.util.Collections.sort(list, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uc(qcVar2));
                                    qcVar2.f281301m.m8146xced61ae5();
                                    qcVar2.p0();
                                }
                            }
                        }
                    });
                }
            });
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "onResume chatroomUsername:%s interTime:%s size:%s", this.f280113d.x(), java.lang.Long.valueOf(c01.id.c() - c19), java.lang.Integer.valueOf(((java.util.ArrayList) this.f281302n).size()));
    }
}
