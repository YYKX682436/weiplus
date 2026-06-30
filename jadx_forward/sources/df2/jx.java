package df2;

/* loaded from: classes10.dex */
public final class jx extends if2.b {
    public int A;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312037m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f312038n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f312039o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f312040p;

    /* renamed from: q, reason: collision with root package name */
    public final zi2.y f312041q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f312042r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f312043s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f312044t;

    /* renamed from: u, reason: collision with root package name */
    public final df2.fx f312045u;

    /* renamed from: v, reason: collision with root package name */
    public final df2.ix f312046v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f312047w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f312048x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f312049y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f312050z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312037m = "LiveVoiceMorePreviewController";
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80603x22730eba);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560635q1));
        this.f312040p = c22699x3dcdb352;
        this.f312041q = new zi2.y(store.getLiveRoomData());
        this.f312042r = jz5.h.b(new df2.gx(this));
        this.f312043s = jz5.h.b(new df2.bx(this));
        this.f312044t = jz5.h.b(df2.yw.f313430d);
        this.f312045u = new df2.fx(this);
        this.f312046v = new df2.ix();
        this.f312047w = jz5.h.b(new df2.hx(this));
        this.f312048x = jz5.h.b(new df2.cx(this));
        this.f312049y = jz5.h.b(new df2.ax(this));
        this.f312050z = jz5.h.b(new df2.zw(this));
        this.A = -1;
    }

    public static final void Z6(df2.jx jxVar, r45.q12 q12Var) {
        yf2.i2 i2Var;
        android.view.View view;
        int i17 = 8;
        if (((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).a8()) {
            android.view.View view2 = jxVar.f312038n;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = jxVar.f372632e;
        int height = (ubVar == null || (i2Var = (yf2.i2) ubVar.mo57658x143f1b92(yf2.i2.class)) == null || (view = i2Var.f543256s) == null) ? 0 : view.getHeight();
        android.view.View view3 = jxVar.f312038n;
        if (view3 == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.p2(q12Var)) {
            if (!pm0.v.z((int) ((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).f410399q, 64)) {
                ((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).p8(64 | ((int) ((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).f410399q));
            }
            ((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).p8(((int) ((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).f410399q) & (-16385));
            if (jxVar.A == -1) {
                jxVar.A = com.p314xaae8f345.mm.ui.bl.c(jxVar.O6());
            }
            android.view.View view4 = jxVar.f312038n;
            if (view4 != null) {
                r4Var.f(jxVar.f312037m, view4, false, false, jxVar.A);
            }
            ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) jxVar.m56788xbba4bfc0(mm2.c1.class)).f410385o);
            if (b17 != null) {
                java.lang.String y07 = b17.y0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = jxVar.f312039o;
                if (c14245x86828950 != null) {
                    r4Var.k(c14245x86828950, y07);
                }
            }
            java.lang.Integer valueOf = q12Var != null ? java.lang.Integer.valueOf(q12Var.m75939xb282bd08(1)) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = jxVar.f312039o;
                jz5.g gVar = jxVar.f312047w;
                if (c14245x868289502 != null) {
                    c14245x868289502.m56838x6cab2c8d((gi2.e) ((jz5.n) gVar).mo141623x754a37bb());
                }
                ((gi2.e) ((jz5.n) gVar).mo141623x754a37bb()).j((java.util.LinkedList) ((jz5.n) jxVar.f312042r).mo141623x754a37bb(), new android.graphics.Rect());
            } else {
                jz5.g gVar2 = jxVar.f312043s;
                if (valueOf != null && valueOf.intValue() == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = jxVar.f312039o;
                    jz5.g gVar3 = jxVar.f312048x;
                    if (c14245x868289503 != null) {
                        c14245x868289503.m56838x6cab2c8d((gi2.e) ((jz5.n) gVar3).mo141623x754a37bb());
                    }
                    ((gi2.e) ((jz5.n) gVar3).mo141623x754a37bb()).f353801b = height;
                    ((gi2.e) ((jz5.n) gVar3).mo141623x754a37bb()).j((java.util.LinkedList) ((jz5.n) gVar2).mo141623x754a37bb(), new android.graphics.Rect());
                } else if (valueOf != null && valueOf.intValue() == 8) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289504 = jxVar.f312039o;
                    jz5.g gVar4 = jxVar.f312049y;
                    if (c14245x868289504 != null) {
                        c14245x868289504.m56838x6cab2c8d((gi2.e) ((jz5.n) gVar4).mo141623x754a37bb());
                    }
                    ((gi2.e) ((jz5.n) gVar4).mo141623x754a37bb()).f353801b = height;
                    ((gi2.e) ((jz5.n) gVar4).mo141623x754a37bb()).j((java.util.LinkedList) ((jz5.n) gVar2).mo141623x754a37bb(), new android.graphics.Rect());
                } else if (valueOf != null && valueOf.intValue() == 16) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289505 = jxVar.f312039o;
                    jz5.g gVar5 = jxVar.f312050z;
                    if (c14245x868289505 != null) {
                        c14245x868289505.m56838x6cab2c8d((bi2.b) ((jz5.n) gVar5).mo141623x754a37bb());
                    }
                    ((bi2.b) ((jz5.n) gVar5).mo141623x754a37bb()).f353801b = height;
                    ((bi2.b) ((jz5.n) gVar5).mo141623x754a37bb()).j((java.util.LinkedList) ((jz5.n) jxVar.f312044t).mo141623x754a37bb(), new android.graphics.Rect());
                }
            }
            i17 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveVoiceModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950) S6(com.p314xaae8f345.mm.R.id.qrt);
        this.f312039o = c14245x86828950;
        if (c14245x86828950 != null) {
            android.widget.FrameLayout singContentLayout = c14245x86828950.getSingContentLayout();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f312040p;
            singContentLayout.removeView(c22699x3dcdb352);
            android.view.ViewParent parent = c22699x3dcdb352.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c22699x3dcdb352);
            }
            android.widget.FrameLayout singContentLayout2 = c14245x86828950.getSingContentLayout();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i65.a.b(c14245x86828950.getContext(), 112), i65.a.b(c14245x86828950.getContext(), 112));
            layoutParams.gravity = 1;
            singContentLayout2.addView(c22699x3dcdb352, layoutParams);
            c14245x86828950.getContentScrollLayout().setTranslationY(-i65.a.b(c14245x86828950.getContext(), 96));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ex(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        android.widget.FrameLayout singContentLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f312038n = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f312039o;
        if (c14245x86828950 != null && (singContentLayout = c14245x86828950.getSingContentLayout()) != null) {
            singContentLayout.removeView(this.f312040p);
        }
        this.f312039o = null;
    }
}
