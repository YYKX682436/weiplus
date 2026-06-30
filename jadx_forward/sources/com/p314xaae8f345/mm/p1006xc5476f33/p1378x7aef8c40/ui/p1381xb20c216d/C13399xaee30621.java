package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010)J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "getTextItem", "", "getAttachedText", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAllEmojiMd5", "", "Lb32/c0;", "getAllItemViews", "Landroid/graphics/RectF;", "getValidRect", "itemView", "Ljz5/f0;", "setEditing", "Lb32/x;", "i", "Lb32/x;", "getStateChangeListener", "()Lb32/x;", "setStateChangeListener", "(Lb32/x;)V", "stateChangeListener", "", "m", "Z", "getDeleteEnalbe", "()Z", "setDeleteEnalbe", "(Z)V", "deleteEnalbe", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer */
/* loaded from: classes10.dex */
public final class C13399xaee30621 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180258d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f180259e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f180260f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f180261g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13400xba451a1d f180262h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public b32.x stateChangeListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean deleteEnalbe;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f180265n;

    /* renamed from: o, reason: collision with root package name */
    public b32.c0 f180266o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f180267p;

    /* renamed from: q, reason: collision with root package name */
    public b32.c0 f180268q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f180269r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13399xaee30621(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180258d = "MicroMsg.EditorItemContainer";
        this.deleteEnalbe = true;
        this.f180265n = new android.graphics.RectF();
        this.f180267p = new b32.z(this);
        this.f180269r = new java.util.LinkedList();
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570258a61, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d97);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f180259e = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565703d82);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f180260f = textView;
        textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560441kf));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.d_u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f180261g = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.d_v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f180262h = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13400xba451a1d) findViewById4;
        c(new b32.w(this, context));
    }

    public final void a(b32.c0 itemView, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        java.lang.Runnable runnable = this.f180267p;
        if (actionMasked == 0) {
            removeCallbacks(runnable);
            d(itemView, true);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.deleteEnalbe) {
                    int pointerCount = event.getPointerCount();
                    float f17 = 0.0f;
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        f17 += event.getY(i17);
                    }
                    float f18 = f17 / pointerCount;
                    android.widget.TextView textView = this.f180260f;
                    if (f18 > ((float) textView.getTop())) {
                        textView.setActivated(true);
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.btx);
                        if (this.f180268q == null) {
                            this.f180268q = itemView;
                        }
                    } else {
                        textView.setActivated(false);
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.btw);
                        if (this.f180268q != null) {
                            this.f180268q = null;
                        }
                    }
                    e(true);
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        this.f180261g.bringChildToFront(m54948x40031356());
        if (this.f180268q != null) {
            post(new b32.a0(this));
        } else if (this.f180266o != null) {
            postDelayed(runnable, 1500L);
        }
        e(false);
    }

    public final void b() {
        android.view.ViewGroup viewGroup = this.f180261g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                ((b32.c0) childAt).mo9751x65825f6();
            }
        }
    }

    public final void c(java.lang.Runnable r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        if (this.f180265n.isEmpty()) {
            this.f180269r.add(r17);
        } else {
            r17.run();
        }
    }

    public final void d(b32.c0 itemView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        if (z17) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemView, this.f180266o)) {
                b32.c0 c0Var = this.f180266o;
                if (c0Var != null) {
                    c0Var.mo9753x40b67ed6(false);
                }
                this.f180266o = itemView;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemView, this.f180266o)) {
            this.f180266o = null;
        }
        itemView.mo9753x40b67ed6(z17);
    }

    public final void e(boolean z17) {
        this.f180260f.setVisibility(z17 ? 0 : 8);
        b32.x xVar = this.stateChangeListener;
        if (xVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = ((b32.h) xVar).f99171a;
            if (z17) {
                android.view.View view = c13397xbda8fd8e.f180233n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = c13397xbda8fd8e.f180233n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: getAllEmojiMd5 */
    public final java.util.ArrayList<java.lang.String> m54943x298172e3() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e;
        java.lang.String mo42933xb5885648;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        android.view.ViewGroup viewGroup = this.f180261g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if ((childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab) && (m43708x63ed375e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab) childAt).m43708x63ed375e()) != null && (mo42933xb5885648 = m43708x63ed375e.mo42933xb5885648()) != null) {
                arrayList.add(mo42933xb5885648);
            }
        }
        return arrayList;
    }

    /* renamed from: getAllItemViews */
    public final java.util.List<b32.c0> m54944x220820f0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup viewGroup = this.f180261g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* renamed from: getAttachedText */
    public final java.lang.String m54945xfdb75767() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 m54948x40031356 = m54948x40031356();
        if (m54948x40031356 == null || m54948x40031356.m54961xfb85ada3() == null) {
            return null;
        }
        return java.lang.String.valueOf(m54948x40031356.m54961xfb85ada3());
    }

    public final boolean getDeleteEnalbe() {
        return this.deleteEnalbe;
    }

    public final b32.x getStateChangeListener() {
        return this.stateChangeListener;
    }

    /* renamed from: getTextItem */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92 m54948x40031356() {
        android.view.ViewGroup viewGroup = this.f180261g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13403xae7eeb92) childAt;
            }
        }
        return null;
    }

    /* renamed from: getValidRect */
    public final android.graphics.RectF m54949xbd40714a() {
        android.graphics.RectF rectF = this.f180265n;
        android.view.View view = this.f180259e;
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rectF;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }
        android.view.View view = this.f180259e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onApplyWindowInsets: ");
        sb6.append(marginLayoutParams != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180258d, sb6.toString());
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7u) + windowInsets.getSystemWindowInsetTop();
            view.setLayoutParams(marginLayoutParams);
        }
        android.view.WindowInsets onApplyWindowInsets2 = super.onApplyWindowInsets(windowInsets);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(onApplyWindowInsets2, "onApplyWindowInsets(...)");
        return onApplyWindowInsets2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6.getActionMasked() != 0 || this.f180265n.contains(ev6.getX(), ev6.getY())) {
            return super.onInterceptTouchEvent(ev6);
        }
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 && i18 == i27) {
            return;
        }
        post(new b32.b0(this));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            if (!this.f180265n.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            b32.c0 c0Var = this.f180266o;
            if (c0Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
                d(c0Var, false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setDeleteEnalbe */
    public final void m54950x51ae1ce4(boolean z17) {
        this.deleteEnalbe = z17;
    }

    /* renamed from: setEditing */
    public final void m54951x40b67ed6(b32.c0 itemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        java.lang.Runnable runnable = this.f180267p;
        removeCallbacks(runnable);
        d(itemView, true);
        postDelayed(runnable, 1500L);
    }

    /* renamed from: setStateChangeListener */
    public final void m54952x599de7b3(b32.x xVar) {
        this.stateChangeListener = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13399xaee30621(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
