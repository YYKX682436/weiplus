package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.q5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f217484d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f217485e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217486f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f217487g;

    static {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q0.f217175d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217484d = new java.util.HashMap();
    }

    public final void O6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, r45.ib ibVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f217486f;
        boolean z17 = false;
        if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.mo2128x1ed62e84() == feed.mo2128x1ed62e84()) {
            z17 = true;
        }
        if (z17) {
            holder.j();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f217485e;
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = null;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                r2Var2 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r0(ibVar, feed, this, holder, null), 2, null);
            }
            this.f217485e = r2Var2;
        }
    }

    public final boolean P6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ggt);
        if (!(findViewById instanceof android.widget.TextView)) {
            findViewById = null;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        if (textView != null && textView.getVisibility() == 0) {
            java.lang.Object tag = textView != null ? textView.getTag(com.p314xaae8f345.mm.R.id.tb_) : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p093xedfae76a.j0 Q6 = ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).Q6(feed.mo2128x1ed62e84());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s0(feed, this, holder);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pm0.v.y(Q6, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, s0Var);
        this.f217484d.put(java.lang.Integer.valueOf(holder.hashCode()), s0Var);
    }
}
