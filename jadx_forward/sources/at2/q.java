package at2;

/* loaded from: classes3.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f95267p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f95268q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f95269r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95267p = "ReplayExceptionLazyPlugin";
    }

    @Override // qo0.a
    public boolean B0() {
        android.view.ViewGroup viewGroup = this.f95269r;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        R0().m57646xb4098c93();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public boolean H0() {
        android.view.ViewGroup viewGroup = this.f95269r;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        R0().m57646xb4098c93();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f95268q == null) {
            android.view.ViewGroup viewGroup = this.f446856d;
            viewGroup.removeAllViews();
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570418aq5, viewGroup, true);
            inflate.setOnClickListener(at2.l.f95233d);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.fg8);
            if (viewGroup2 != null) {
                this.f95269r = viewGroup2;
                viewGroup2.setBackgroundColor(viewGroup2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w, null));
                this.f95268q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se(viewGroup2, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), null, 8, null);
            }
        }
    }
}
