package ie2;

/* loaded from: classes3.dex */
public abstract class a implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f372512d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f372513e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372514f;

    public a(android.view.View oriRootView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriRootView, "oriRootView");
        this.f372512d = oriRootView;
        this.f372513e = "BaseLiveBubbleView_" + v();
        this.f372514f = c14179xd6e3454a;
        if (c14179xd6e3454a != null) {
            c14179xd6e3454a.m56781xa1160b3b(this);
        }
        if (c14179xd6e3454a != null) {
            c14179xd6e3454a.b();
        }
    }

    public android.view.View h() {
        return u();
    }

    public final android.view.View t(int i17) {
        android.view.View view = this.f372514f;
        if (view == null) {
            view = this.f372512d;
        }
        return view.findViewById(i17);
    }

    public final android.view.View u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372514f;
        android.view.View childAt = c14179xd6e3454a != null ? c14179xd6e3454a.getChildAt(0) : null;
        return childAt == null ? this.f372512d : childAt;
    }

    public abstract java.lang.String v();

    public final int w() {
        android.view.View view = this.f372514f;
        if (view == null) {
            view = this.f372512d;
        }
        return view.getVisibility();
    }

    public final boolean x() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372514f;
        return c14179xd6e3454a != null && c14179xd6e3454a.f193043i == 2;
    }

    public final void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f372513e, "requestBubbleHide");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372514f;
        if (c14179xd6e3454a != null) {
            c14179xd6e3454a.c();
        }
    }

    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f372513e, "requestBubbleShow");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372514f;
        if (c14179xd6e3454a != null) {
            c14179xd6e3454a.d();
        }
    }
}
