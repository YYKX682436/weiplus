package gx0;

/* loaded from: classes5.dex */
public final class bh extends ou0.p {
    public android.widget.FrameLayout A;
    public ou0.z B;
    public final android.text.SpannableStringBuilder C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a H;
    public final gx0.yg I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f357794J;
    public final jz5.g K;
    public final kz5.q L;
    public boolean M;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f357795r;

    /* renamed from: s, reason: collision with root package name */
    public final int f357796s;

    /* renamed from: t, reason: collision with root package name */
    public final int f357797t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f357798u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f357799v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f357800w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f357801x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f357802y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f f357803z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f357795r = jz5.h.b(new gx0.vg(this));
        this.f357796s = j65.q.a(m80379x76847179()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agr);
        this.f357797t = j65.q.a(m80379x76847179()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.agq);
        this.B = new ou0.w(false);
        this.C = new android.text.SpannableStringBuilder();
        this.D = jz5.h.b(new gx0.ig(this));
        this.E = jz5.h.b(new gx0.kg(this));
        this.F = jz5.h.b(gx0.ah.f357746d);
        this.G = jz5.h.b(gx0.zg.f358823d);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        this.H = InvalidTime;
        this.I = new gx0.yg(this);
        this.f357794J = jz5.h.b(new gx0.lg(this));
        this.K = jz5.h.b(new gx0.jg(this));
        this.L = new kz5.q();
        this.M = true;
    }

    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a Y6(gx0.bh bhVar, float f17) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) bhVar.V6().f357791y.mo3195x754a37bb();
        if (c4128x879fba0a == null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            return InvalidTime;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33984x636d539 = c4128x879fba0a.m33984x636d539(f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33984x636d539, "multi(...)");
        return m33984x636d539;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0 == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(gx0.bh r3, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r4, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r5) {
        /*
            gx0.kh r0 = r3.W6()
            ex0.a0 r0 = r0.f358175r
            r1 = 0
            if (r0 == 0) goto Le
            ex0.r r0 = r0.n()
            goto Lf
        Le:
            r0 = r1
        Lf:
            boolean r2 = r0 instanceof ex0.f
            if (r2 == 0) goto L16
            r1 = r0
            ex0.f r1 = (ex0.f) r1
        L16:
            if (r1 == 0) goto L1e
            boolean r0 = r1.f338666i
            r1 = 1
            if (r0 != r1) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L22
            goto L3e
        L22:
            gx0.bf r0 = r3.V6()
            boolean r0 = r0.L
            if (r0 == 0) goto L2b
            goto L3e
        L2b:
            if (r4 == 0) goto L3e
            boolean r0 = r4.m33980x66356283()
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L3e
            boolean r0 = r5.m33980x66356283()
            if (r0 == 0) goto L3e
            r3.i7(r4, r5)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bh.Z6(gx0.bh, com.tencent.maas.model.time.MJTime, com.tencent.maas.model.time.MJTime):void");
    }

    public final gx0.w8 a7() {
        return (gx0.w8) ((jz5.n) this.f357795r).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l76 = V6().l7();
        if (!l76.m33980x66356283()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            return InvalidTime;
        }
        if (this.f357803z == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineToolbar");
            throw null;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33984x636d539 = l76.m33984x636d539(r1.m47261x1555a00f());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33984x636d539, "multi(...)");
        return m33984x636d539;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (((ou0.w) r0).f430445b != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c7() {
        /*
            r2 = this;
            ou0.z r0 = r2.B
            boolean r1 = r0 instanceof ou0.v
            if (r1 == 0) goto L8
            r1 = 1
            goto La
        L8:
            boolean r1 = r0 instanceof ou0.y
        La:
            if (r1 == 0) goto Ld
            goto L21
        Ld:
            boolean r1 = r0 instanceof ou0.x
            if (r1 == 0) goto L17
            ou0.x r0 = (ou0.x) r0
            r0.getClass()
            goto L24
        L17:
            boolean r1 = r0 instanceof ou0.w
            if (r1 == 0) goto L26
            ou0.w r0 = (ou0.w) r0
            boolean r0 = r0.f430445b
            if (r0 == 0) goto L24
        L21:
            int r0 = r2.f357796s
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            jz5.j r0 = new jz5.j
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bh.c7():int");
    }

    public final void d7() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7(boolean z17) {
        if (z17) {
            android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q3b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q3b);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565990q52);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q4z);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(mo144222x4ff8c0f04, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f04.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f04, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f05 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565989q51);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(mo144222x4ff8c0f05, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f05.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f05, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f06 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565988q50);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(mo144222x4ff8c0f06, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f06.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f06, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(ou0.z type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (this.B.f430447a != type.f430447a) {
            this.B = type;
            java.util.Objects.toString(type);
            int i17 = this.B.f430447a;
            if (i17 == 1) {
                e7(((ou0.w) type).f430445b);
                d7();
            } else if (i17 == 2) {
                g7();
                e7(false);
            } else if (i17 == 4) {
                h7();
                d7();
            } else if (i17 == 6) {
                g7();
                h7();
            }
        }
        if (type instanceof ou0.y) {
            k7(((ou0.y) type).f430446b);
        }
        if (type instanceof ou0.v) {
            k7(((ou0.v) type).f430444b);
        }
    }

    public final void g7() {
        android.widget.FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("vThumbLayout");
            throw null;
        }
        int height = frameLayout.getHeight();
        int i17 = this.f357797t;
        if (height != i17) {
            android.widget.FrameLayout frameLayout2 = this.A;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("vThumbLayout");
                throw null;
            }
            frameLayout2.getLayoutParams().height = i17;
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h7() {
        android.view.View view = this.f357798u;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineBgView");
            throw null;
        }
        int height = view.getHeight();
        int i17 = this.f357796s;
        if (height != i17) {
            android.view.View view2 = this.f357798u;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineBgView");
                throw null;
            }
            view2.getLayoutParams().height = i17;
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q3b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565990q52);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q4z);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(mo144222x4ff8c0f03, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f03.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f03, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a mjTime, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjTime, "mjTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        long m33987xd22e7c2d = (long) mjTime.m33987xd22e7c2d();
        long m33987xd22e7c2d2 = (long) duration.m33987xd22e7c2d();
        java.lang.String d17 = ou0.f.d(m33987xd22e7c2d);
        java.lang.String str = d17 + " / " + ou0.f.d(m33987xd22e7c2d2);
        android.text.SpannableStringBuilder timeSpanBuilder = this.C;
        timeSpanBuilder.clear();
        timeSpanBuilder.append((java.lang.CharSequence) str);
        timeSpanBuilder.setSpan((android.text.style.ForegroundColorSpan) ((jz5.n) this.D).mo141623x754a37bb(), 0, d17.length(), 34);
        timeSpanBuilder.setSpan((android.text.style.ForegroundColorSpan) ((jz5.n) this.E).mo141623x754a37bb(), d17.length(), str.length(), 34);
        android.widget.TextView textView = this.f357799v;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineTimeView");
            throw null;
        }
        textView.setText(timeSpanBuilder);
        if (!ou0.f.c(mjTime, 4L)) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f = this.f357803z;
            if (c10966x6b7a943f == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineToolbar");
                throw null;
            }
            if (c10966x6b7a943f.getWidth() > 0 && !c10966x6b7a943f.F) {
                int width = c10966x6b7a943f.getWidth();
                c10966x6b7a943f.A.setMax(width);
                c10966x6b7a943f.C(width * (((float) m33987xd22e7c2d) / ((float) m33987xd22e7c2d2)));
            }
        }
        gx0.w8 a76 = a7();
        a76.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeSpanBuilder, "timeSpanBuilder");
        android.widget.TextView textView2 = a76.H;
        if (textView2 != null) {
            textView2.setText(timeSpanBuilder);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvPlayerTime");
            throw null;
        }
    }

    public final void k7(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f357801x;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("revokeButton");
                throw null;
            }
            c22699x3dcdb352.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f357802y;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recoverButton");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f357801x;
        if (c22699x3dcdb3523 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("revokeButton");
            throw null;
        }
        c22699x3dcdb3523.setVisibility(4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f357802y;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setVisibility(4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recoverButton");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        nv0.d t76 = a7().t7();
        t76.getClass();
        gx0.yg change = this.I;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(change, "change");
        java.util.ArrayList arrayList = t76.f421960a;
        if (arrayList.contains(change)) {
            arrayList.remove(change);
        }
    }

    @Override // du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        a7().t7().a(this.I);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.qbp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f) mo144222x4ff8c0f0;
        this.f357803z = c10966x6b7a943f;
        android.view.View findViewById = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.qbt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.A = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.q3b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f357798u = findViewById2;
        android.view.View findViewById3 = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.f565990q52);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f357799v = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.q4z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f357800w = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View findViewById5 = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.f565989q51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f357801x = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        android.view.View findViewById6 = c10966x6b7a943f.findViewById(com.p314xaae8f345.mm.R.id.f565988q50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f357802y = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        f7(new ou0.x(false));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f2 = this.f357803z;
        if (c10966x6b7a943f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineToolbar");
            throw null;
        }
        c10966x6b7a943f2.m47262xf00f287e(new gx0.xg(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f357800w;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelinePlayButton");
            throw null;
        }
        c22699x3dcdb352.setOnClickListener(new gx0.sg(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f357801x;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("revokeButton");
            throw null;
        }
        c22699x3dcdb3522.setOnClickListener(new gx0.tg(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f357802y;
        if (c22699x3dcdb3523 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recoverButton");
            throw null;
        }
        c22699x3dcdb3523.setOnClickListener(new gx0.ug(this));
        V6().f357788v.mo7806x9d92d11c(m158354x19263085(), new gx0.mg(this));
        V6().f357791y.mo7806x9d92d11c(m158354x19263085(), new gx0.ng(this));
        V6().A.mo7806x9d92d11c(m158354x19263085(), new gx0.og(this));
    }
}
