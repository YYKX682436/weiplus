package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.ConversationListView */
/* loaded from: classes11.dex */
public class ViewOnTouchListenerC22366xcd5c2226 extends android.widget.ListView implements android.widget.AbsListView.OnScrollListener, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k0, android.view.View.OnTouchListener, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f288843x0 = 0;
    public java.lang.Runnable A;
    public android.view.View B;
    public android.view.View C;
    public ul5.k D;
    public int E;
    public android.view.View F;
    public final int G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f288844J;
    public final android.graphics.Rect K;
    public android.graphics.Paint L;
    public boolean M;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N;
    public final android.view.View.OnLayoutChangeListener P;
    public android.view.View.OnTouchListener Q;
    public int R;
    public boolean S;
    public android.view.View T;
    public boolean U;
    public boolean V;
    public android.widget.AdapterView.OnItemLongClickListener W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f288845d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AbsListView.OnScrollListener f288846e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnTouchListener f288847f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288848g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f288849h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s f288850i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r f288851m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f288852n;

    /* renamed from: o, reason: collision with root package name */
    public int f288853o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f288854p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f288855p0;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f288856q;

    /* renamed from: r, reason: collision with root package name */
    public int f288857r;

    /* renamed from: s, reason: collision with root package name */
    public int f288858s;

    /* renamed from: t, reason: collision with root package name */
    public int f288859t;

    /* renamed from: u, reason: collision with root package name */
    public int f288860u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f288861v;

    /* renamed from: w, reason: collision with root package name */
    public int f288862w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f288863x;

    /* renamed from: y, reason: collision with root package name */
    public hh4.a f288864y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f288865z;

    public ViewOnTouchListenerC22366xcd5c2226(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f288845d = new java.util.LinkedList();
        this.f288848g = true;
        this.f288849h = false;
        this.f288854p = new android.graphics.Paint(1);
        this.f288856q = new android.graphics.Paint(1);
        this.f288859t = 0;
        this.f288860u = 0;
        this.f288862w = 0;
        this.f288863x = false;
        this.f288864y = null;
        this.f288865z = null;
        this.A = null;
        this.E = 0;
        this.G = i65.a.b(getContext(), 56);
        this.H = true;
        this.I = 0;
        this.f288844J = false;
        this.K = new android.graphics.Rect();
        this.M = false;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.conversation.ConversationListView.1
            {
                this.f39173x3fe91575 = 1571206658;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12 c5719x35b0ea12) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12 c5719x35b0ea122 = c5719x35b0ea12;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.this;
                boolean z17 = viewOnTouchListenerC22366xcd5c2226.f288844J;
                boolean z18 = c5719x35b0ea122.f136041g.f88215a;
                if (z17 == z18) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "MultiWindowModeChanged: %b", java.lang.Boolean.valueOf(z18));
                viewOnTouchListenerC22366xcd5c2226.f288844J = c5719x35b0ea122.f136041g.f88215a;
                viewOnTouchListenerC22366xcd5c2226.y();
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = viewOnTouchListenerC22366xcd5c2226.f288850i;
                if (sVar == null) {
                    return false;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).e(viewOnTouchListenerC22366xcd5c2226.f288844J);
                return false;
            }
        };
        this.P = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h3(this);
        this.Q = null;
        this.S = true;
        this.V = false;
        q(context);
    }

    /* renamed from: getEmptyFooter */
    private android.view.View m80516x9e48012() {
        android.view.View findViewById = getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9);
        int height = findViewById != null ? findViewById.getHeight() : 0;
        if (height > 0) {
            dimension = height;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        android.view.View view = new android.view.View(getContext());
        this.T = view;
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, dimension));
        linearLayout.addView(this.T);
        linearLayout.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        linearLayout.setId(com.p314xaae8f345.mm.R.id.bp9);
        return linearLayout;
    }

    /* renamed from: getHeaderViewList */
    private java.util.ArrayList<android.view.View> m80517x9099bb86() {
        android.view.View view;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f288845d;
            if (i17 >= linkedList.size()) {
                return arrayList;
            }
            android.widget.ListView.FixedViewInfo fixedViewInfo = (android.widget.ListView.FixedViewInfo) linkedList.get(i17);
            if (fixedViewInfo != null && (view = fixedViewInfo.view) != null) {
                arrayList.add(view);
            }
            i17++;
        }
    }

    /* renamed from: getRealCount */
    private int m80518xc929cb5b() {
        if (getAdapter() == null) {
            return 1;
        }
        return (getAdapter().getCount() - getHeaderViewsCount()) - getFooterViewsCount();
    }

    public final void A(boolean z17) {
        boolean z18;
        boolean z19 = this.f288848g;
        this.f288848g = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "updateHeaderContainer showHeaderContainer: %b, last: %b, updateView: %b, isHeaderContainerAdded: %b", true, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f288849h));
        if (z17 && z19 != (z18 = this.f288848g)) {
            if (!z18) {
                if (this.f288849h) {
                    java.lang.Object obj = this.f288850i;
                    if (obj != null) {
                        removeHeaderView((android.widget.RelativeLayout) obj);
                        y();
                    }
                    this.f288849h = false;
                    setSelection(0);
                    return;
                }
                return;
            }
            if (this.f288849h) {
                return;
            }
            if (this.f288850i != null) {
                java.util.ArrayList<android.view.View> m80517x9099bb86 = m80517x9099bb86();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "removeHeaderViewList size: %d", java.lang.Integer.valueOf(m80517x9099bb86.size()));
                for (int i17 = 0; i17 < m80517x9099bb86.size(); i17++) {
                    android.view.View view = m80517x9099bb86.get(i17);
                    if (view != null) {
                        removeHeaderView(view);
                    }
                }
                addHeaderView((android.widget.RelativeLayout) this.f288850i);
                m80517x9099bb86.remove((android.widget.RelativeLayout) this.f288850i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "addHeaderViewList addViewList: %d", java.lang.Integer.valueOf(m80517x9099bb86.size()));
                for (int i18 = 0; i18 < m80517x9099bb86.size(); i18++) {
                    addHeaderView(m80517x9099bb86.get(i18));
                }
                y();
            }
            this.f288849h = true;
            j(200L, 0, true);
        }
    }

    public final void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(getContext());
        int i17 = this.E;
        if (i17 <= 0 && !this.f288844J) {
            i17 = h17;
        }
        int i18 = this.f288858s;
        this.f288858s = com.p314xaae8f345.mm.ui.bl.a(getContext()) + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "updateScrollOffset statusBarHeight:%d actionBarTop:%d scrollOffset:%d old:%d", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.f288858s), java.lang.Integer.valueOf(i18));
        if (this.f288848g && (rVar = this.f288851m) != null) {
            int i19 = this.f288858s;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
            zVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "updateScrollOffset %d", java.lang.Integer.valueOf(i19));
            zVar.f254302m = i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar;
            if (viewOnTouchListenerC18555xc58183f3.f254047x != i17) {
                viewOnTouchListenerC18555xc58183f3.f254047x = i17;
                ((android.widget.FrameLayout.LayoutParams) viewOnTouchListenerC18555xc58183f3.f254035i.getLayoutParams()).topMargin = i17;
                android.view.ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC18555xc58183f3.f254049z.contentView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = i17;
            }
        }
        if (i18 != this.f288858s) {
            setSelection(1);
        }
    }

    @Override // android.widget.ListView
    public void addHeaderView(android.view.View view, java.lang.Object obj, boolean z17) {
        super.addHeaderView(view, obj, z17);
        android.widget.ListView.FixedViewInfo fixedViewInfo = new android.widget.ListView.FixedViewInfo(this);
        fixedViewInfo.view = view;
        fixedViewInfo.data = obj;
        fixedViewInfo.isSelectable = z17;
        this.f288845d.add(fixedViewInfo);
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i17, layoutParams);
        if (this.f288857r > 0 || this.f288851m == null) {
            return;
        }
        this.f288857r = com.p314xaae8f345.mm.ui.bl.a(getContext()) + com.p314xaae8f345.mm.ui.bl.i(getContext(), 0);
        this.f288858s = com.p314xaae8f345.mm.ui.bl.a(getContext()) + com.p314xaae8f345.mm.ui.bl.h(getContext());
        y();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            sVar.mo71599x679283bb(this.C);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = this.f288851m;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).J1 = this.C;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).I1 = getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) this.f288851m).K1 = (com.p314xaae8f345.mm.ui.C21369x9726cc7b) getRootView().findViewById(com.p314xaae8f345.mm.R.id.jlt);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k0
    public void b(int i17) {
    }

    public float c(int i17, int i18, boolean z17) {
        if (getAdapter() == null) {
            return 0.0f;
        }
        i(false);
        int i19 = this.f288859t;
        int i27 = this.f288860u;
        int headerViewsCount = (i17 - getHeaderViewsCount()) - getFooterViewsCount();
        int i28 = (((headerViewsCount - i18) - (z17 ? 1 : 0)) * i19) + ((z17 ? 1 : 0) * i27);
        int measuredHeight = getMeasuredHeight();
        int a17 = com.p314xaae8f345.mm.ui.bl.a(getContext());
        float f17 = ((measuredHeight - i28) - a17) - this.E;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[isFullScreen] totalItemCount:" + i17 + " rawCount:" + headerViewsCount + " itemHeight:" + i19 + " foldItemHeight:" + i27 + " foldedItemCount:" + i18 + " foldItemCount:" + (z17 ? 1 : 0) + " getFirstVisiblePosition:" + getFirstVisiblePosition() + " getLastVisiblePosition:" + getLastVisiblePosition() + " getHeaderViewsCount:" + getHeaderViewsCount() + " getFooterViewsCount:" + getFooterViewsCount() + " measuredHeight:" + measuredHeight + " rawHeight:" + i28 + " actionBarHeight:" + a17 + " statusBarHeight: " + this.E + " extraHeight:" + f17);
        return f17;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        java.lang.Object obj = this.f288850i;
        return obj == null ? super.canScrollHorizontally(i17) : ((android.widget.RelativeLayout) obj).getBottom() >= ((android.widget.RelativeLayout) this.f288850i).getHeight();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void d() {
        m();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        int i17 = this.f288858s + this.I;
        if (i17 >= 0 && !r() && !com.p314xaae8f345.mm.ui.t7.f291414a.a()) {
            float f17 = i17;
            canvas.drawLine(0.0f, f17, getMeasuredWidth(), f17, this.f288856q);
        }
        android.graphics.Rect rect = this.K;
        if (rect.isEmpty()) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        getLocalVisibleRect(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect(rect2);
        android.graphics.Rect rect4 = new android.graphics.Rect(rect2);
        if (this.M) {
            rect3.top = rect.top;
            rect3.bottom = rect.bottom;
            canvas.drawRect(rect3, this.L);
        } else {
            rect3.bottom = rect.top;
            rect4.top = rect.bottom;
            canvas.drawRect(rect3, this.L);
            canvas.drawRect(rect4, this.L);
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            this.L.getAlpha();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        if (getFirstVisiblePosition() != 0 || i18 >= 0 || iArr == null || iArr.length < 2 || this.f288863x) {
            return super.dispatchNestedPreScroll(i17, i18, iArr, iArr2);
        }
        iArr[1] = (int) (i18 * 0.32f);
        super.dispatchNestedPreScroll(i17, i18, iArr, iArr2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.Q;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        try {
            int rawY = (int) motionEvent.getRawY();
            if (this.f288844J) {
                rawY = (int) motionEvent.getY();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
            if (sVar != null) {
                sVar.mo71590x94e28117().toString();
                motionEvent.getRawX();
                motionEvent.getRawY();
                ((android.view.View) this.f288850i).getBottom();
                ((android.view.View) this.f288850i).getHeight();
            }
            if (r() && this.f288850i != null) {
                if (motionEvent.getPointerCount() > 1) {
                    motionEvent.setAction(3);
                    return ((android.widget.RelativeLayout) this.f288850i).dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    if (this.f288850i.mo71590x94e28117().contains((int) motionEvent.getRawX(), rawY)) {
                        this.V = true;
                    } else {
                        this.V = false;
                    }
                }
                if (!this.V) {
                    return ((android.widget.RelativeLayout) this.f288850i).dispatchTouchEvent(motionEvent);
                }
            }
            java.lang.Object obj = this.f288850i;
            if (obj != null && ((android.widget.RelativeLayout) obj).getBottom() >= ((android.widget.RelativeLayout) this.f288850i).getHeight()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) this.f288850i).f254031e.getClass();
                if (getFirstVisiblePosition() == 0) {
                    if (motionEvent.getAction() == 0 && this.f288850i.mo71590x94e28117().contains((int) motionEvent.getRawX(), rawY)) {
                        this.U = true;
                    } else if (motionEvent.getAction() == 0) {
                        this.U = false;
                    }
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        if (this.f288851m != null && motionEvent.getAction() == 0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) this.f288851m).p(motionEvent);
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (!this.U) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.U = false;
                    if (this.f288851m != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "closeHeader by click BackUpFooterRect");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) this.f288851m).a(12);
                    }
                    if (motionEvent.getAction() != 1) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "ConversationListView cancel touch event");
                    motionEvent.setAction(3);
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (this.U && motionEvent.getAction() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "ConversationListView cancel touch event..., isHeaderOpen: %b, isHeaderVisible: %b", java.lang.Boolean.valueOf(r()), java.lang.Boolean.valueOf(s()));
                if (r()) {
                    motionEvent.setAction(3);
                } else {
                    this.U = false;
                }
            }
            if (motionEvent.getAction() == 0 && this.f288851m != null && motionEvent.getAction() == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) this.f288851m).p(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConversationListView", e17, "ConversationListView dispatchTouchEvent exception", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.g():void");
    }

    /* renamed from: getBannerHeaderHeight */
    public int m80519x2d1b5556() {
        java.util.Iterator it = this.f288845d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = ((android.widget.ListView.FixedViewInfo) it.next()).view;
            if (view != this.f288850i) {
                i17 += view.getMeasuredHeight();
            }
        }
        return i17;
    }

    /* renamed from: getEmptyFooterHeight */
    public int m80520x655227d9() {
        android.view.View view = this.T;
        android.widget.LinearLayout.LayoutParams layoutParams = view != null ? (android.widget.LinearLayout.LayoutParams) view.getLayoutParams() : null;
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    /* renamed from: getFirstHeaderVisible */
    public int m80521xd9c5ba4b() {
        android.view.View childAt;
        java.util.Iterator it = this.f288845d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = ((android.widget.ListView.FixedViewInfo) it.next()).view;
            if (view != this.f288850i && view != null && (view instanceof android.view.ViewGroup) && (childAt = ((android.view.ViewGroup) view).getChildAt(0)) != null && childAt.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", java.lang.Integer.valueOf(i17));
                return i17;
            }
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    /* renamed from: getShowHeaderContainer */
    public boolean m80522x1495d881() {
        return this.f288848g;
    }

    /* renamed from: getTaskBarView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.t m80523x367742dd() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            return sVar.mo71597x367742dd();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationListView", "mHeaderContainer is null");
        return null;
    }

    public void h(boolean z17) {
        if (this.T == null) {
            return;
        }
        if (z17) {
            postDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n3(this), 0L);
        } else {
            g();
        }
    }

    public final void i(boolean z17) {
        if (z17 || this.f288859t == 0 || this.f288860u == 0) {
            this.f288859t = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9);
            this.f288860u = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561405hl);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "checkSavedItemHeight %b %d %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f288859t), java.lang.Integer.valueOf(this.f288860u));
        }
    }

    public void j(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[closeHeader] delay:%s, type: %d, forceClose: %b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (getFirstVisiblePosition() == 0 || z17) {
            if (j17 <= 0) {
                setSelection(0);
                return;
            }
            java.lang.Runnable runnable = this.f288865z;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m3 m3Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m3(this, i17);
            this.f288865z = m3Var;
            postDelayed(m3Var, j17);
        }
    }

    public final void k(int i17) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(m80521xd9c5ba4b(), this.f288858s);
        } else {
            super.smoothScrollToPositionFromTop(i17, this.f288858s);
        }
    }

    public final void l(int i17, int i18) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(m80521xd9c5ba4b(), i18 + this.f288858s);
        } else {
            super.smoothScrollToPositionFromTop(i17, i18 + this.f288858s);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[onOpenHeader]");
        setImportantForAccessibility(2);
        this.f288863x = true;
        ul5.k kVar = this.D;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(false);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        int hashCode = hashCode();
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).uj("MainUI_PullDown", hashCode, 1005, 0);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f288861v;
        ((cy1.a) rVar2).bk(activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 ? ((com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) activityC21401x6ce6f73f).m78446x1cde66a9().m78421xefd35ffa().g() : null, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void o(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[onCloseHeader]");
        setImportantForAccessibility(1);
        this.U = false;
        this.f288863x = false;
        this.f288853o = 0;
        ul5.k kVar = this.D;
        if (kVar != null) {
            kVar.mo82163x4e0f6657(true);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f288861v;
        ((cy1.a) rVar).bk(activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 ? ((com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) activityC21401x6ce6f73f).m78446x1cde66a9().m78421xefd35ffa().g() : null, false);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        int hashCode = hashCode();
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar2).vj("MainUI_PullDown", hashCode, 1005, 0);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null) {
            boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode();
            this.f288844J = isInMultiWindowMode;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
            if (sVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).e(isInMultiWindowMode);
            }
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.N;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[onConfigurationChanged] orientation:%s, last: %d", java.lang.Integer.valueOf(configuration.orientation), 0);
        h(true);
        B();
        if (this.f288848g && (rVar = this.f288851m) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
            zVar.c();
            int color = zVar.f254295d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
            zVar.U = color;
            zVar.q(1.0f, color, 0);
            zVar.s(1.0f);
            zVar.L = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "AppBrandDesktopContainer onCustomConfigurationChanged newConfig orientation: %d", java.lang.Integer.valueOf(configuration.orientation));
            java.lang.Runnable runnable = viewOnTouchListenerC18555xc58183f3.M;
            if (runnable != null) {
                viewOnTouchListenerC18555xc58183f3.removeCallbacks(runnable);
            }
            android.view.View view = viewOnTouchListenerC18555xc58183f3.f254038o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p0(viewOnTouchListenerC18555xc58183f3);
            viewOnTouchListenerC18555xc58183f3.M = p0Var;
            viewOnTouchListenerC18555xc58183f3.postDelayed(p0Var, 400L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = viewOnTouchListenerC18555xc58183f3.f254031e;
            if (c18557xc00aa3f3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "TaskBarView onCustomConfigurationChanged lastOrientation: %d, orientation: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254073t2), java.lang.Integer.valueOf(configuration.orientation));
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f32 = c18557xc00aa3f3.f254059f2;
                if (viewOnTouchListenerC18555xc58183f32 != null) {
                    int m71598x6ba62022 = viewOnTouchListenerC18555xc58183f32.m71598x6ba62022();
                    c18557xc00aa3f3.f254070q2 = m71598x6ba62022;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "TaskBarView onCustomConfigurationChanged fixedViewHeight: %d", java.lang.Integer.valueOf(m71598x6ba62022));
                }
                int i17 = c18557xc00aa3f3.f254073t2;
                int i18 = configuration.orientation;
                if (i17 != i18) {
                    c18557xc00aa3f3.f254073t2 = i18;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f33 = c18557xc00aa3f3.f254059f2;
                    if (viewOnTouchListenerC18555xc58183f33 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar2 = viewOnTouchListenerC18555xc58183f33.f254030d;
                        if (zVar2 != null ? zVar2.h() : false) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onCustomConfigurationChanged closeHeader");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar3 = c18557xc00aa3f3.f254059f2.f254030d;
                            if (zVar3 != null) {
                                zVar3.b(0L, 0, true);
                            }
                        }
                    }
                    java.lang.Runnable runnable2 = c18557xc00aa3f3.Y2;
                    c18557xc00aa3f3.removeCallbacks(runnable2);
                    c18557xc00aa3f3.post(runnable2);
                }
            }
        }
        hh4.a aVar = this.f288864y;
        if (aVar != null) {
            aVar.b(true);
        }
        java.lang.Runnable runnable3 = this.A;
        if (runnable3 != null) {
            removeCallbacks(runnable3);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e3 e3Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e3(this, configuration);
        this.A = e3Var;
        postDelayed(e3Var, 800L);
        this.f288863x = false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.N;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f288850i == null || getFirstVisiblePosition() != 0) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) this.f288850i).f254031e.getClass();
        if (((android.widget.RelativeLayout) this.f288850i).getBottom() <= 6 || this.f288853o < 30) {
            return;
        }
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f288854p;
        paint.setStyle(style);
        paint.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560176cz));
        paint.setAlpha(!s() ? 0 : this.f288853o);
        canvas.drawRect(this.f288850i.mo71590x94e28117().left, this.f288850i.mo71590x94e28117().top + this.G, this.f288850i.mo71590x94e28117().right, this.f288850i.mo71590x94e28117().bottom, paint);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        try {
            if (this.S && !r() && getAdapter() != null && getAdapter().getCount() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[onLayout] pre-set LAYOUT_SET_SELECTION for first layout");
                super.setSelectionFromTop(1, this.f288858s);
            }
            super.onLayout(z17, i17, i18, i19, i27);
            boolean r17 = r();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[onLayout] changed:%s, isHeaderOpen: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(r17));
            m80518xc929cb5b();
            hashCode();
            if (!this.S && z17 && !r17) {
                setSelection(1);
                post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l3(this));
            }
            if (!z17 && (this.R >= 16 || m80518xc929cb5b() == this.R)) {
                h(true);
                this.R = m80518xc929cb5b();
                this.S = false;
            }
            h(false);
            this.R = m80518xc929cb5b();
            this.S = false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConversationListView", e17, "onLayout exception", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        int i27;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout;
        java.lang.Object obj3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (this.f288848g && i17 == 0 && this.H) {
            android.view.View childAt = getChildAt(1);
            if (childAt == null) {
                i27 = (!r() || (obj3 = this.f288850i) == null) ? 0 : ((android.view.View) obj3).getMeasuredHeight() - this.f288858s;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "computeActionBarTranslation %d", java.lang.Integer.valueOf(i27));
            } else {
                i27 = -((-childAt.getTop()) + ((int) (java.lang.Math.max(i17 - getHeaderViewsCount(), 0) * getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9))) + this.f288858s);
            }
            int max = java.lang.Math.max(0, i27);
            this.I = max;
            android.view.View view = this.C;
            if (view != null) {
                float f17 = max;
                view.setTranslationY(f17);
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f288852n;
                if (o5Var != null && (linearLayout = o5Var.f289461h) != null) {
                    linearLayout.setTranslationY(f17);
                }
            }
            android.view.View view2 = this.F;
            if (view2 != null) {
                if (max > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (this.f288848g && (obj2 = this.f288850i) != null) {
                float f18 = max * 1.0f;
                ((android.view.View) obj2).getHeight();
                int height = ((android.view.View) this.f288850i).getHeight() - this.f288858s;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) obj2;
                if (viewOnTouchListenerC18555xc58183f3.K) {
                    android.widget.LinearLayout linearLayout2 = viewOnTouchListenerC18555xc58183f3.f254035i;
                    if (linearLayout2 != null && max > 10) {
                        linearLayout2.setTranslationY(viewOnTouchListenerC18555xc58183f3.getMeasuredHeight() - viewOnTouchListenerC18555xc58183f3.getBottom());
                        float max2 = java.lang.Math.max(java.lang.Math.min(((f18 / height) * 0.39999998f) + 0.6f, 1.0f), 0.6f);
                        viewOnTouchListenerC18555xc58183f3.f254035i.setScaleX(max2);
                        viewOnTouchListenerC18555xc58183f3.f254035i.setScaleY(max2);
                        if (max >= height) {
                            viewOnTouchListenerC18555xc58183f3.K = false;
                        }
                    }
                } else if (max <= 10) {
                    viewOnTouchListenerC18555xc58183f3.K = true;
                }
            }
        } else if (i17 > 0) {
            u();
        }
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f288846e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i17, i18, i19);
        }
        if (this.f288848g && (rVar = this.f288851m) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).onScroll(absListView, i17, i18, i19);
        }
        if (this.f288848g && i18 > 1 && s() && (obj = this.f288850i) != null) {
            int bottom = ((android.view.View) obj).getBottom() - i65.a.b(getContext(), 56);
            this.f288850i.mo71590x94e28117().set(0, bottom, getWidth(), getHeight() + bottom);
            this.f288850i.mo71590x94e28117().toString();
            ((android.view.View) this.f288850i).getTop();
            ((android.view.View) this.f288850i).getBottom();
            this.f288853o = (int) ((((android.view.View) this.f288850i).getBottom() * 255.0f) / ((android.view.View) this.f288850i).getHeight());
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f288846e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = this.f288851m;
        if (rVar != null && this.f288848g) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).onScrollStateChanged(absListView, i17);
        }
        if (i17 == 1) {
            fg5.c.f344035b = 0L;
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f288852n;
        if (o5Var == null || i18 == i27) {
            return;
        }
        o5Var.c(i18, false);
        o5Var.A(true);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f288848g && (rVar = this.f288851m) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).onTouch(view, motionEvent);
        }
        android.view.View.OnTouchListener onTouchListener = this.f288847f;
        boolean onTouch = onTouchListener != null ? false | onTouchListener.onTouch(view, motionEvent) : false;
        yj0.a.i(onTouch, this, "com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }

    public final void p(int i17, int i18, int i19) {
        if (i17 == 0) {
            super.smoothScrollToPositionFromTop(m80521xd9c5ba4b(), i18 + this.f288858s, i19);
        } else {
            super.smoothScrollToPositionFromTop(i17, i18 + this.f288858s, i19);
        }
    }

    public final void q(android.content.Context context) {
        android.graphics.Paint paint = this.f288854p;
        paint.setAlpha(255);
        paint.setTextSize(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561415hv));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.L = paint2;
        paint2.setColor(-16777216);
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        android.graphics.Paint paint3 = this.f288856q;
        paint3.setColor(color);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setStrokeWidth(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561171bd));
        super.setOnScrollListener(this);
        super.setOnTouchListener(this);
        setOverScrollMode(2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "HeaderContainer new, ConversationListView: %d", java.lang.Integer.valueOf(hashCode()));
        A(false);
        addFooterView(m80516x9e48012());
        this.f288862w = (int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2) * i65.a.m(getContext()));
        this.f288859t = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9);
        this.f288860u = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561405hl);
        this.f288858s = com.p314xaae8f345.mm.ui.bl.a(getContext()) + com.p314xaae8f345.mm.ui.bl.h(getContext());
        setWillNotDraw(false);
    }

    public boolean r() {
        return s() && this.f288863x;
    }

    @Override // android.widget.ListView
    public boolean removeHeaderView(android.view.View view) {
        java.util.LinkedList linkedList;
        int i17 = 0;
        while (true) {
            linkedList = this.f288845d;
            if (i17 >= linkedList.size()) {
                i17 = -1;
                break;
            }
            android.widget.ListView.FixedViewInfo fixedViewInfo = (android.widget.ListView.FixedViewInfo) linkedList.get(i17);
            if (fixedViewInfo != null && fixedViewInfo.view == view) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            linkedList.remove(i17);
        }
        return super.removeHeaderView(view);
    }

    public boolean s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        if (this.f288850i == null || (rVar = this.f288851m) == null) {
            return false;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).h();
    }

    /* renamed from: setActionBarUpdateCallback */
    public void m80524x989890c9(hh4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = this.f288851m;
        if (rVar != null) {
            this.f288864y = aVar;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).f254304o = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g3(this, aVar);
        }
    }

    /* renamed from: setActivity */
    public void m80525x13de9191(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        this.f288861v = activityC21401x6ce6f73f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            sVar.mo71600x13de9191(activityC21401x6ce6f73f);
        }
    }

    /* renamed from: setFoldBanner */
    public void m80526xae6cb88f(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = this.f288850i;
        if (sVar != null) {
            sVar.mo71605xae6cb88f(view);
        }
    }

    /* renamed from: setFoldHelper */
    public void m80527xb8e14911(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f288852n = o5Var;
    }

    /* renamed from: setHighLightChildNew */
    public void m80528x14659756(int i17) {
        this.M = true;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.L.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            this.L.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[newStyle] setfalse" + this.M);
        int max = java.lang.Math.max(0, i17);
        android.view.View childAt = getChildAt(max);
        if (childAt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(getHeaderViewsCount() + max);
        }
        if (childAt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationListView", "null == view index:%s", java.lang.Integer.valueOf(max + getHeaderViewsCount()));
            return;
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(com.p314xaae8f345.mm.ui.bk.C() ? android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f) : android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f));
        childAt.getGlobalVisibleRect(this.K);
        ofPropertyValuesHolder.addUpdateListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j3(this, childAt));
        ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k3(this));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    /* renamed from: setIsCurrentMainUI */
    public void m80529x16e1331a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "setIsCurrentMainUI: %b", java.lang.Boolean.valueOf(z17));
        this.H = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = this.f288851m;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
            zVar.Y = z17;
            if (z17 || !zVar.N) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "setIsCurrentMainUI and header open, close");
            zVar.b(0L, 0, true);
        }
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f288855p0 = onItemClickListener;
        super.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d3(this));
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.W = onItemLongClickListener;
        super.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o3(this));
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.f288846e = onScrollListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f288847f = onTouchListener;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[setSelection] position:%s, scrollOffset: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f288858s));
        if (i17 == 0) {
            super.setSelectionFromTop(m80521xd9c5ba4b(), this.f288858s);
        } else {
            super.setSelectionFromTop(i17, this.f288858s);
        }
    }

    @Override // android.widget.AbsListView
    public void setSelectionFromTop(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[setSelectionFromTop] position:%s, scrollOffset: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.setSelectionFromTop(i17, i18);
    }

    /* renamed from: setStatusBarMaskView */
    public void m80530x8a07dd50(android.view.View view) {
        this.B = view;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = this.f288851m;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).f254308q = view;
        }
    }

    /* renamed from: setonDispatchTouchEventListener */
    public void m80531xbc4e7d2a(android.view.View.OnTouchListener onTouchListener) {
        this.Q = onTouchListener;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void smoothScrollToPosition(final int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPosition] position:%s", java.lang.Integer.valueOf(i17));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i18 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.this.k(i17);
                }
            });
        } else {
            k(i17);
        }
    }

    @Override // android.widget.AbsListView
    public void smoothScrollToPositionFromTop(final int i17, final int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i19 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.this.l(i17, i18);
                }
            });
        } else {
            l(i17, i18);
        }
    }

    public final boolean t(int i17) {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (i17 - getLastVisiblePosition() > 50) {
            super.setSelection(i17 - 50);
            return true;
        }
        if (firstVisiblePosition - i17 <= 50) {
            return false;
        }
        super.setSelection(i17 + 50);
        return true;
    }

    public final void u() {
        android.view.View view = this.C;
        if (view != null) {
            view.setTranslationY(0.0f);
            if (this.C.getVisibility() != 0) {
                android.view.View view2 = this.C;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f288864y != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by);
                this.f288864y.c(0.0f, color, color);
                this.f288864y.a(0.0f, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7), 0);
            } else {
                int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx);
                this.f288864y.c(0.0f, color2, color2);
                this.f288864y.a(0.0f, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07), 0);
            }
        }
    }

    public final void v(int i17, boolean z17) {
        android.content.SharedPreferences.Editor edit;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "saveTopMargin topMargin: %d, needRead: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        if (d17 == null || (edit = d17.edit()) == null) {
            return;
        }
        edit.putBoolean("Main_need_read_top_margin", z17);
        edit.putInt("Main_top_marign", i17);
        edit.apply();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "saveTopMargin success");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q
    public void w(int i17) {
        o(i17, 0);
    }

    public final void x(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "initActionBarView statusBarHeight: %d, isInMultiWindowMode: %b, target: %d, actionBarTop: %d, actionBarHeight: %d", java.lang.Integer.valueOf(this.E), java.lang.Boolean.valueOf(this.f288844J), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.C.getTop()), java.lang.Integer.valueOf(i18));
        if (i17 >= 0) {
            if (this.f288844J) {
                android.view.View view = this.B;
                if (view != null) {
                    view.getLayoutParams().height = i17;
                }
                android.view.View view2 = this.F;
                if (view2 != null) {
                    view2.getLayoutParams().height = i17;
                }
            } else {
                android.view.View view3 = this.B;
                if (view3 != null) {
                    view3.getLayoutParams().height = this.E + (this.f288848g ? 0 : i18);
                }
                android.view.View view4 = this.F;
                if (view4 != null) {
                    view4.getLayoutParams().height = this.E + (this.f288848g ? 0 : i18);
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                if (this.f288844J) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin = 0;
                } else {
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                    if (this.f288848g) {
                        i18 = 0;
                    }
                    layoutParams2.topMargin = i18;
                }
            }
            B();
        }
    }

    public final void y() {
        boolean z17;
        if (this.C == null) {
            android.view.View findViewById = getRootView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
            this.C = findViewById;
            if (findViewById == null) {
                return;
            } else {
                findViewById.addOnLayoutChangeListener(this.P);
            }
        }
        if (this.F == null) {
            this.F = getRootView().findViewById(com.p314xaae8f345.mm.R.id.og9);
        }
        if (this.f288844J && com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null) {
            boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode();
            this.f288844J = isInMultiWindowMode;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "initActionBarView check multiWindowMode %b", java.lang.Boolean.valueOf(isInMultiWindowMode));
        }
        int a17 = o25.n1.a(getContext());
        int i17 = this.E;
        if (i17 == 0 || !(this.f288844J || this.C.getTop() == this.E || this.C.getTop() == 0)) {
            this.E = this.C.getTop();
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17 || this.f288844J) {
            int top = this.C.getTop();
            this.E = top;
            if (top <= 0 && !this.f288844J) {
                this.E = com.p314xaae8f345.mm.ui.bl.h(getContext());
            }
            x(this.E, a17);
            v(this.E, false);
        } else {
            post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i3(this, a17));
        }
        if (this.E != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "statusBar height changed old:%d new:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.E));
            h(false);
        }
    }

    public final void z(float f17, int i17, int i18) {
        hh4.a aVar = this.f288864y;
        if (aVar != null) {
            aVar.a(f17, i17, 0);
            this.f288864y.c(f17, i18, i18);
        }
    }

    @Override // android.widget.AbsListView
    public void smoothScrollToPositionFromTop(final int i17, final int i18, final int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s duration:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (t(i17)) {
            post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.ConversationListView$$c
                @Override // java.lang.Runnable
                public final void run() {
                    int i27 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.this.p(i17, i18, i19);
                }
            });
        } else {
            p(i17, i18, i19);
        }
    }

    public ViewOnTouchListenerC22366xcd5c2226(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f288845d = new java.util.LinkedList();
        this.f288848g = true;
        this.f288849h = false;
        this.f288854p = new android.graphics.Paint(1);
        this.f288856q = new android.graphics.Paint(1);
        this.f288859t = 0;
        this.f288860u = 0;
        this.f288862w = 0;
        this.f288863x = false;
        this.f288864y = null;
        this.f288865z = null;
        this.A = null;
        this.E = 0;
        this.G = i65.a.b(getContext(), 56);
        this.H = true;
        this.I = 0;
        this.f288844J = false;
        this.K = new android.graphics.Rect();
        this.M = false;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.conversation.ConversationListView.1
            {
                this.f39173x3fe91575 = 1571206658;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12 c5719x35b0ea12) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12 c5719x35b0ea122 = c5719x35b0ea12;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.this;
                boolean z17 = viewOnTouchListenerC22366xcd5c2226.f288844J;
                boolean z18 = c5719x35b0ea122.f136041g.f88215a;
                if (z17 == z18) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "MultiWindowModeChanged: %b", java.lang.Boolean.valueOf(z18));
                viewOnTouchListenerC22366xcd5c2226.f288844J = c5719x35b0ea122.f136041g.f88215a;
                viewOnTouchListenerC22366xcd5c2226.y();
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = viewOnTouchListenerC22366xcd5c2226.f288850i;
                if (sVar == null) {
                    return false;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).e(viewOnTouchListenerC22366xcd5c2226.f288844J);
                return false;
            }
        };
        this.P = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h3(this);
        this.Q = null;
        this.S = true;
        this.V = false;
        q(context);
    }
}
