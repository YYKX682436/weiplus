package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj {

    /* renamed from: r, reason: collision with root package name */
    public final r45.vx0 f192398r;

    /* renamed from: s, reason: collision with root package name */
    public int f192399s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f192400t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 presenter, int i17, int i18, r45.vx0 vx0Var) {
        super(context, presenter, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f192398r = vx0Var;
        this.f192400t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p20(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public android.view.View j() {
        int i17 = this.f192399s;
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            return (android.view.View) ((jz5.n) this.f192400t).mo141623x754a37bb();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void q(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.q(data);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17 = o();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188501d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        o17.m82697xe136b7d8(inflate);
        android.view.View f294968x = o().getF294968x();
        if (f294968x != null) {
            int color = f294968x.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77641x7c59d06e);
            android.widget.TextView textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView != null) {
                textView.setTextColor(color);
            }
            android.view.View findViewById = f294968x.findViewById(com.p314xaae8f345.mm.R.id.bdv);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
            android.view.View findViewById2 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.i0a);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(color);
            }
            android.view.View findViewById3 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.m3v);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(color);
            }
        }
        r45.vx0 vx0Var = this.f192398r;
        if (vx0Var != null && vx0Var.m75939xb282bd08(10) == 2) {
            int dimension = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            int dimension2 = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561212cf);
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0x, (android.view.ViewGroup) null);
            android.view.ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, dimension2);
            }
            layoutParams.height = dimension2;
            inflate2.setMinimumHeight(dimension2);
            inflate2.setLayoutParams(layoutParams);
            o().m82690xd3a27e96(true);
            o().m82701x7344efcb(inflate2);
            o().m82696x5dd8f4d3(dimension2 - dimension);
            o().m82702xfa5d1e8f(dimension - dimension2);
            o().m82686x6e84640(1.6f);
            o().m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s20(this));
        }
        this.f192399s = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("key_topic_type", 0);
        abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("LoaderCacheStoreIntentKey", 0L);
        int i17 = this.f192399s;
        if (i17 == 5) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
            ((android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3)).setVisibility(0);
            ((android.widget.ProgressBar) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.lbi)).setVisibility(0);
            return;
        }
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            ((android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3)).setVisibility(0);
            ((android.widget.ProgressBar) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.lbi)).setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void u() {
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t20(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj
    public void x(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        int i17 = this.f192399s;
        if (i17 == 5) {
            java.lang.Object obj = reason.f545053e;
            if ((obj instanceof r45.r03) && reason.f545050b != -1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTopicInfo");
                y();
                return;
            }
        }
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            y();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c0Var = this.f188502e;
            c0Var.mo56038xb3ee2b3f(reason);
            java.util.ArrayList f17 = c0Var.f();
            if (f17 != null && f17.isEmpty()) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188501d;
                ((android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3)).setVisibility(0);
                ((android.widget.TextView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.dft)).setVisibility(0);
            }
        }
    }

    public final void y() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188501d;
        ((android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3)).setVisibility(8);
        ((android.widget.ProgressBar) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.lbi)).setVisibility(8);
    }
}
