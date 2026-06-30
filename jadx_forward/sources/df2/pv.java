package df2;

/* loaded from: classes3.dex */
public final class pv extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312645m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f312646n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f312647o;

    /* renamed from: p, reason: collision with root package name */
    public vd2.j5 f312648p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312645m = "LiveViewConflictController";
        this.f312646n = new java.util.LinkedList();
        this.f312647o = new byte[0];
    }

    public final void Z6(vd2.j5 j5Var) {
        synchronized (this.f312647o) {
            if (!this.f312646n.contains(j5Var)) {
                this.f312646n.add(j5Var);
                java.util.LinkedList linkedList = this.f312646n;
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new df2.ov());
                }
            }
        }
    }

    public final void a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[clearAll] scene:" + str);
        synchronized (this.f312647o) {
            this.f312646n.clear();
            this.f312648p = null;
        }
    }

    public final void b7(vd2.j5 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        synchronized (this.f312647o) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f312648p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[hideViewSelf] hide curShowingView: " + view.Q());
                view.o1();
                this.f312648p = null;
                c7();
            } else if (this.f312646n.contains(view)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[hideViewSelf] remove which is waiting: " + view.Q());
                this.f312646n.remove(view);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[hideViewSelf] view: " + view.Q() + " not in viewConflict, hide itself");
                view.o1();
            }
        }
    }

    public final void c7() {
        java.lang.Object pollFirst;
        java.lang.String str;
        synchronized (this.f312647o) {
            pollFirst = this.f312646n.pollFirst();
        }
        java.lang.String str2 = this.f312645m;
        vd2.j5 j5Var = (vd2.j5) pollFirst;
        if (j5Var == null || (str = j5Var.Q()) == null) {
            str = "null";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[pollNextAndNotifyShow] get next to Show:  ".concat(str));
        if (j5Var != null) {
            j5Var.C4();
        }
        this.f312648p = j5Var;
    }

    public final void d7(vd2.j5 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        synchronized (this.f312647o) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f312648p, view)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[tryToShow] view:" + view.Q() + " showing already");
                return;
            }
            if (this.f312648p == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[tryToShow] curShowingView is null , " + view.Q() + " show");
                this.f312648p = view;
                view.C4();
            } else {
                int mo56972xba8879a4 = view.mo56972xba8879a4();
                vd2.j5 j5Var = this.f312648p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var);
                if (mo56972xba8879a4 < j5Var.mo56972xba8879a4()) {
                    java.lang.String str = this.f312645m;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tryToShow]  ");
                    sb6.append(view.Q());
                    sb6.append(" is higher than curShowingView:");
                    vd2.j5 j5Var2 = this.f312648p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var2);
                    sb6.append(j5Var2.Q());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    vd2.j5 j5Var3 = this.f312648p;
                    if (j5Var3 != null) {
                        j5Var3.o1();
                    }
                    vd2.j5 j5Var4 = this.f312648p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var4);
                    Z6(j5Var4);
                    this.f312648p = view;
                    view.C4();
                } else {
                    int mo56972xba8879a42 = view.mo56972xba8879a4();
                    vd2.j5 j5Var5 = this.f312648p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var5);
                    if (mo56972xba8879a42 == j5Var5.mo56972xba8879a4()) {
                        java.lang.String str2 = this.f312645m;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[tryToShow]  ");
                        sb7.append(view.Q());
                        sb7.append(" is eqauls than curShowingView:");
                        vd2.j5 j5Var6 = this.f312648p;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var6);
                        sb7.append(j5Var6.Q());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                        this.f312648p = view;
                        view.C4();
                    } else {
                        java.lang.String str3 = this.f312645m;
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[tryToShow]  ");
                        sb8.append(view.Q());
                        sb8.append(" is lower than curShowingView:");
                        vd2.j5 j5Var7 = this.f312648p;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j5Var7);
                        sb8.append(j5Var7.Q());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb8.toString());
                        view.o1();
                        Z6(view);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        a7("onLiveDeactivate");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        android.content.Context O6 = O6();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = O6 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) O6 : null;
        boolean z17 = false;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312645m, "[onViewUnmount] isFinishing:" + abstractActivityC21394xb3d2c0cf.isFinishing() + ", isDestroyed:" + abstractActivityC21394xb3d2c0cf.isDestroyed());
            if (abstractActivityC21394xb3d2c0cf.isFinishing() || abstractActivityC21394xb3d2c0cf.isDestroyed()) {
                z17 = true;
            }
        }
        if (z17) {
            a7("onViewUnmount");
        }
    }
}
