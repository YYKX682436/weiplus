package in5;

/* loaded from: classes10.dex */
public abstract class q0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f374650f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374648d = "ScopeRecyclerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f374649e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final in5.p0 f374651g = new in5.p0(this);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8162x34789575(in5.r0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374648d, "rvnotify-test-onViewRecycled, " + holder.m8183xf806b362());
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        if (y0Var != null) {
            this.f374649e.remove(y0Var);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = holder.f374653d;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
        }
        holder.f374653d = null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onAttachedToRecyclerView ");
        sb6.append(j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374648d, sb6.toString());
        if (j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1) {
            recyclerView.addOnAttachStateChangeListener(this.f374651g);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        in5.r0 holder = (in5.r0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(holder, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        in5.r0 z17 = z(parent, i17);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = z17.f374653d;
        java.util.HashSet hashSet = this.f374649e;
        if (y0Var != null) {
            hashSet.remove(y0Var);
        }
        z17.i();
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = z17.f374653d;
        if (y0Var2 != null) {
            hashSet.add(y0Var2);
        }
        return z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374648d, "rvnotify-test-onDetachedFromRecyclerView");
        recyclerView.removeOnAttachStateChangeListener(this.f374651g);
        java.util.HashSet hashSet = this.f374649e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) it.next(), null, 1, null);
        }
        hashSet.clear();
    }

    public abstract void x(in5.r0 r0Var, int i17);

    public abstract void y(in5.r0 r0Var, int i17, java.util.List list);

    public abstract in5.r0 z(android.view.ViewGroup viewGroup, int i17);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in5.r0 holder = (in5.r0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        java.util.HashSet hashSet = this.f374649e;
        if (isEmpty) {
            p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
            if (y0Var != null) {
                hashSet.remove(y0Var);
            }
            holder.i();
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = holder.f374653d;
            if (y0Var2 != null) {
                hashSet.add(y0Var2);
            }
            super.mo8157xe5e2e48d(holder, i17, payloads);
            return;
        }
        holder.j();
        p3325xe03a0797.p3326xc267989b.y0 y0Var3 = holder.f374653d;
        if (y0Var3 != null) {
            hashSet.add(y0Var3);
        }
        y(holder, i17, payloads);
    }
}
