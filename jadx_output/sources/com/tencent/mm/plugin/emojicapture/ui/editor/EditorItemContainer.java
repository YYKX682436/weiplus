package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010)J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "getTextItem", "", "getAttachedText", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAllEmojiMd5", "", "Lb32/c0;", "getAllItemViews", "Landroid/graphics/RectF;", "getValidRect", "itemView", "Ljz5/f0;", "setEditing", "Lb32/x;", "i", "Lb32/x;", "getStateChangeListener", "()Lb32/x;", "setStateChangeListener", "(Lb32/x;)V", "stateChangeListener", "", "m", "Z", "getDeleteEnalbe", "()Z", "setDeleteEnalbe", "(Z)V", "deleteEnalbe", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EditorItemContainer extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98725d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f98726e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f98727f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f98728g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.editor.EditorOutsideView f98729h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public b32.x stateChangeListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean deleteEnalbe;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f98732n;

    /* renamed from: o, reason: collision with root package name */
    public b32.c0 f98733o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f98734p;

    /* renamed from: q, reason: collision with root package name */
    public b32.c0 f98735q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f98736r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98725d = "MicroMsg.EditorItemContainer";
        this.deleteEnalbe = true;
        this.f98732n = new android.graphics.RectF();
        this.f98734p = new b32.z(this);
        this.f98736r = new java.util.LinkedList();
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488725a61, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d97);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98726e = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484170d82);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f98727f = textView;
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478908kf));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.d_u);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98728g = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.d_v);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f98729h = (com.tencent.mm.plugin.emojicapture.ui.editor.EditorOutsideView) findViewById4;
        c(new b32.w(this, context));
    }

    public final void a(b32.c0 itemView, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        java.lang.Runnable runnable = this.f98734p;
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
                    android.widget.TextView textView = this.f98727f;
                    if (f18 > ((float) textView.getTop())) {
                        textView.setActivated(true);
                        textView.setText(com.tencent.mm.R.string.btx);
                        if (this.f98735q == null) {
                            this.f98735q = itemView;
                        }
                    } else {
                        textView.setActivated(false);
                        textView.setText(com.tencent.mm.R.string.btw);
                        if (this.f98735q != null) {
                            this.f98735q = null;
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
        this.f98728g.bringChildToFront(getTextItem());
        if (this.f98735q != null) {
            post(new b32.a0(this));
        } else if (this.f98733o != null) {
            postDelayed(runnable, 1500L);
        }
        e(false);
    }

    public final void b() {
        android.view.ViewGroup viewGroup = this.f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                ((b32.c0) childAt).pause();
            }
        }
    }

    public final void c(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        if (this.f98732n.isEmpty()) {
            this.f98736r.add(r17);
        } else {
            r17.run();
        }
    }

    public final void d(b32.c0 itemView, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (z17) {
            if (!kotlin.jvm.internal.o.b(itemView, this.f98733o)) {
                b32.c0 c0Var = this.f98733o;
                if (c0Var != null) {
                    c0Var.setEditing(false);
                }
                this.f98733o = itemView;
            }
        } else if (kotlin.jvm.internal.o.b(itemView, this.f98733o)) {
            this.f98733o = null;
        }
        itemView.setEditing(z17);
    }

    public final void e(boolean z17) {
        this.f98727f.setVisibility(z17 ? 0 : 8);
        b32.x xVar = this.stateChangeListener;
        if (xVar != null) {
            kotlin.jvm.internal.o.d(xVar);
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = ((b32.h) xVar).f17638a;
            if (z17) {
                android.view.View view = captureEditorContainer.f98700n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = captureEditorContainer.f98700n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final java.util.ArrayList<java.lang.String> getAllEmojiMd5() {
        com.tencent.mm.api.IEmojiInfo emojiInfo;
        java.lang.String md52;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        android.view.ViewGroup viewGroup = this.f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if ((childAt instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView) && (emojiInfo = ((com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView) childAt).getEmojiInfo()) != null && (md52 = emojiInfo.getMd5()) != null) {
                arrayList.add(md52);
            }
        }
        return arrayList;
    }

    public final java.util.List<b32.c0> getAllItemViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup viewGroup = this.f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof b32.c0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final java.lang.String getAttachedText() {
        com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView textItem = getTextItem();
        if (textItem == null || textItem.getText() == null) {
            return null;
        }
        return java.lang.String.valueOf(textItem.getText());
    }

    public final boolean getDeleteEnalbe() {
        return this.deleteEnalbe;
    }

    public final b32.x getStateChangeListener() {
        return this.stateChangeListener;
    }

    public final com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView getTextItem() {
        android.view.ViewGroup viewGroup = this.f98728g;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView) {
                return (com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView) childAt;
            }
        }
        return null;
    }

    public final android.graphics.RectF getValidRect() {
        android.graphics.RectF rectF = this.f98732n;
        android.view.View view = this.f98726e;
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rectF;
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
            kotlin.jvm.internal.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }
        android.view.View view = this.f98726e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onApplyWindowInsets: ");
        sb6.append(marginLayoutParams != null);
        com.tencent.mars.xlog.Log.i(this.f98725d, sb6.toString());
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7u) + windowInsets.getSystemWindowInsetTop();
            view.setLayoutParams(marginLayoutParams);
        }
        android.view.WindowInsets onApplyWindowInsets2 = super.onApplyWindowInsets(windowInsets);
        kotlin.jvm.internal.o.f(onApplyWindowInsets2, "onApplyWindowInsets(...)");
        return onApplyWindowInsets2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getActionMasked() != 0 || this.f98732n.contains(ev6.getX(), ev6.getY())) {
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
            if (!this.f98732n.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            b32.c0 c0Var = this.f98733o;
            if (c0Var != null) {
                kotlin.jvm.internal.o.d(c0Var);
                d(c0Var, false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDeleteEnalbe(boolean z17) {
        this.deleteEnalbe = z17;
    }

    public final void setEditing(b32.c0 itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        java.lang.Runnable runnable = this.f98734p;
        removeCallbacks(runnable);
        d(itemView, true);
        postDelayed(runnable, 1500L);
    }

    public final void setStateChangeListener(b32.x xVar) {
        this.stateChangeListener = xVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorItemContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
