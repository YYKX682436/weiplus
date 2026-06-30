package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView;", "Landroid/widget/RelativeLayout;", "Lrm3/a;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setViewEventListener", "", "maxWidth", "setMaxWidth", "count", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/mv/ui/view/m1", "com/tencent/mm/plugin/mv/ui/view/o1", "com/tencent/mm/plugin/mv/ui/view/p1", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView */
/* loaded from: classes10.dex */
public final class C16689xafe4de36 extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f233190i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f233191d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f233192e;

    /* renamed from: f, reason: collision with root package name */
    public int f233193f;

    /* renamed from: g, reason: collision with root package name */
    public rm3.a f233194g;

    /* renamed from: h, reason: collision with root package name */
    public final bm3.b f233195h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16689xafe4de36(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f233191d = arrayList;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4r, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        int i18 = com.p314xaae8f345.mm.R.id.i4b;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.i4b);
        if (c22849x81a93d25 != null) {
            i18 = com.p314xaae8f345.mm.R.id.f567638k71;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567638k71);
            if (relativeLayout != null) {
                i18 = com.p314xaae8f345.mm.R.id.f567639k72;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567639k72);
                if (textView != null) {
                    this.f233195h = new bm3.b(frameLayout, frameLayout, c22849x81a93d25, relativeLayout, textView);
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$prepareViews$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "getItemConvert, type:" + type);
                            return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36.this);
                        }
                    }, arrayList, true);
                    this.f233192e = c22848x6ddd90cf;
                    c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
                    c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 1, false));
                    c22849x81a93d25.N(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t1());
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f233192e;
                    if (c22848x6ddd90cf2 != null) {
                        c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.u1(this);
                        c22848x6ddd90cf2.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v1(this);
                        c22849x81a93d25.i(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w1(this));
                        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.x1(this));
                        setTag(this);
                        return;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36, java.lang.Boolean bool) {
        c16689xafe4de36.getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        bm3.b bVar = c16689xafe4de36.f233195h;
        if (b17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = bVar.f104028c;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c16689xafe4de36.f233192e;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            int mo1894x7e414b06 = c22848x6ddd90cf.mo1894x7e414b06() - 1;
            if (mo1894x7e414b06 < 0) {
                mo1894x7e414b06 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = bVar.f104028c;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = c16689xafe4de36.f233192e;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            int mo1894x7e414b062 = c22848x6ddd90cf2.mo1894x7e414b06() - 1;
            if (mo1894x7e414b062 < 0) {
                mo1894x7e414b062 = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(mo1894x7e414b062));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22849x81a93d252, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
            c22849x81a93d252.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22849x81a93d252, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView", "commentScrollToEnd", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = c16689xafe4de36.f233192e;
        if (c22848x6ddd90cf3 != null) {
            c16689xafe4de36.f233193f = c22848x6ddd90cf3.m82898xfb7e5820().size();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    public final void b() {
        this.f233195h.f104029d.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r0 == (r5.mo1894x7e414b06() - 1)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36.c(java.util.ArrayList):void");
    }

    public final void d(int i17) {
        if (i17 <= 0) {
            b();
            return;
        }
        bm3.b bVar = this.f233195h;
        bVar.f104029d.setVisibility(0);
        android.widget.TextView textView = bVar.f104030e;
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        textView.setText(format);
    }

    /* renamed from: setMaxHeight */
    public final void m67311x25bfb969(int i17) {
        if (i17 >= 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f233195h.f104027b.getLayoutParams();
            if (i17 < 3 || layoutParams.height >= getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0)) {
                return;
            }
            layoutParams.height = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0);
        }
    }

    /* renamed from: setMaxWidth */
    public final void m67312x8e6ff544(int i17) {
        if (i17 > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f233195h.f104027b.getLayoutParams();
            if (i17 > 0) {
                layoutParams.width = i17;
            }
        }
    }

    /* renamed from: setViewEventListener */
    public final void m67313x61aa1e87(rm3.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f233194g = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16689xafe4de36(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
