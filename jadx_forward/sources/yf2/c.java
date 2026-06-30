package yf2;

/* loaded from: classes3.dex */
public final class c extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f543198m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f543199n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveCloseController", "onViewMount: Creating close UI");
        this.f543198m = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.thm);
        this.f543199n = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.tho);
        android.view.View view = this.f543198m;
        if (view != null) {
            view.setOnClickListener(new yf2.a(this));
        }
        android.view.View view2 = this.f543198m;
        if (view2 != null) {
            view2.setOnTouchListener(new yf2.b(this));
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveCloseController", "onViewUnmount: Cleaning up close button");
        this.f543198m = null;
        this.f543199n = null;
    }
}
