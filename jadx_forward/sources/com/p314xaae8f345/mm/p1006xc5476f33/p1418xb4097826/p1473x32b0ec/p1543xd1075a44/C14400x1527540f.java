package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveInfiniteLoopView;", "Landroid/widget/FrameLayout;", "", "b", "Ljz5/f0;", "setCanScroll", "", "animationDuration", "setSmoothScrollDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/widget/yl", "com/tencent/mm/plugin/finder/live/widget/zl", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView */
/* loaded from: classes15.dex */
public final class C14400x1527540f extends android.widget.FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f199173r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199174d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199175e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec f199176f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wl f199177g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f199178h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f199179i;

    /* renamed from: m, reason: collision with root package name */
    public final long f199180m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xl f199181n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f199182o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f199183p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f199184q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14400x1527540f(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199174d = "Finder.FinderLiveInfiniteLoopView";
        this.f199177g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wl(this);
        this.f199178h = new android.widget.ImageView(getContext());
        this.f199179i = new android.widget.ImageView(getContext());
        this.f199180m = 5000L;
        this.f199181n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xl(this);
        this.f199182o = new java.util.LinkedList();
        this.f199183p = new java.util.LinkedList();
        d(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f) {
        android.graphics.Bitmap b07;
        android.view.View view = (android.view.View) c14400x1527540f.f199183p.getLast();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl zlVar = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl) view : null;
        if (zlVar == null || (b07 = zlVar.mo57240x8cd5133a()) == null) {
            b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view);
        }
        c14400x1527540f.f199179i.setImageBitmap(b07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f) {
        android.graphics.Bitmap b07;
        android.view.View view = (android.view.View) c14400x1527540f.f199183p.getFirst();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl zlVar = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl) view : null;
        if (zlVar == null || (b07 = zlVar.mo57240x8cd5133a()) == null) {
            b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(view);
        }
        c14400x1527540f.f199178h.setImageBitmap(b07);
    }

    public final void c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.LinkedList linkedList = this.f199183p;
        if (linkedList.contains(view)) {
            return;
        }
        h();
        linkedList.addLast(view);
        java.util.LinkedList linkedList2 = this.f199182o;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        if (linkedList.size() > 1) {
            linkedList2.addLast(this.f199178h);
            linkedList2.addFirst(this.f199179i);
        }
        this.f199177g.mo8343xced61ae5();
        if (linkedList.size() == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = this.f199176f;
        if (c14410xbcb3c9ec == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c14410xbcb3c9ec.m8321x40341e13(linkedList2.size());
        if (linkedList.size() <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec2 = this.f199176f;
            if (c14410xbcb3c9ec2 != null) {
                c14410xbcb3c9ec2.m8316x940d026a(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec3 = this.f199176f;
        if (c14410xbcb3c9ec3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c14410xbcb3c9ec3.m8316x940d026a(1);
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tl(this));
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drb, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199175e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.roc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec) findViewById;
        this.f199176f = c14410xbcb3c9ec;
        c14410xbcb3c9ec.m8315x6cab2c8d(this.f199177g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec2 = this.f199176f;
        if (c14410xbcb3c9ec2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xl xlVar = this.f199181n;
        c14410xbcb3c9ec2.m8314x7cd807d6(xlVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec3 = this.f199176f;
        if (c14410xbcb3c9ec3 != null) {
            c14410xbcb3c9ec3.m8289xa5a25773(xlVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
    }

    public final boolean e() {
        if (this.f199183p.size() > 1) {
            java.util.LinkedList linkedList = this.f199182o;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedList.getFirst(), this.f199179i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedList.getLast(), this.f199178h)) {
                return true;
            }
        }
        return false;
    }

    public final void f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.LinkedList linkedList = this.f199183p;
        if (linkedList.contains(view)) {
            h();
            linkedList.remove(view);
            java.util.LinkedList linkedList2 = this.f199182o;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            if (linkedList.size() > 1) {
                linkedList2.addLast(this.f199178h);
                linkedList2.addFirst(this.f199179i);
            }
            this.f199177g.mo8343xced61ae5();
            if (linkedList.size() == 0) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = this.f199176f;
            if (c14410xbcb3c9ec == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c14410xbcb3c9ec.m8321x40341e13(linkedList2.size());
            if (linkedList.size() <= 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec2 = this.f199176f;
                if (c14410xbcb3c9ec2 != null) {
                    c14410xbcb3c9ec2.m8316x940d026a(0);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                    throw null;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec3 = this.f199176f;
            if (c14410xbcb3c9ec3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c14410xbcb3c9ec3.m8316x940d026a(1);
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.am(this));
        }
    }

    public final void g() {
        h();
        if (e()) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            this.f199184q = k0Var != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dm(this, null), 3, null) : null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199174d, "[startAutoScroll] return, size = " + this.f199182o.size());
        }
    }

    public final void h() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f199184q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* renamed from: setCanScroll */
    public final void m57906x5cc2687b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = this.f199176f;
        if (c14410xbcb3c9ec != null) {
            c14410xbcb3c9ec.m57943x5cc2687b(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
    }

    /* renamed from: setSmoothScrollDuration */
    public final void m57907x50542051(int i17) {
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = this.f199176f;
        if (c14410xbcb3c9ec == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        try {
            java.lang.reflect.Field declaredField = p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.class.getDeclaredField("mScroller");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.set(c14410xbcb3c9ec, new zl2.b5(context, i17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiveViewPagerUtil", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14400x1527540f(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199174d = "Finder.FinderLiveInfiniteLoopView";
        this.f199177g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wl(this);
        this.f199178h = new android.widget.ImageView(getContext());
        this.f199179i = new android.widget.ImageView(getContext());
        this.f199180m = 5000L;
        this.f199181n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xl(this);
        this.f199182o = new java.util.LinkedList();
        this.f199183p = new java.util.LinkedList();
        d(context);
    }
}
