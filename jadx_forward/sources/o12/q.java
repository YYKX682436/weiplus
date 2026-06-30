package o12;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f423697d;

    /* renamed from: e, reason: collision with root package name */
    public float f423698e;

    /* renamed from: f, reason: collision with root package name */
    public float f423699f;

    /* renamed from: g, reason: collision with root package name */
    public float f423700g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f423701h;

    /* renamed from: i, reason: collision with root package name */
    public float f423702i;

    /* renamed from: m, reason: collision with root package name */
    public float f423703m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e f423704n;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e) {
        this.f423704n = c13260x7cd1df1e;
    }

    public final float a(android.view.MotionEvent motionEvent) {
        return (float) java.lang.Math.toDegrees((float) java.lang.Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0)));
    }

    public final float b(android.view.MotionEvent motionEvent) {
        return (float) java.lang.Math.hypot(java.lang.Math.abs(motionEvent.getX(1) - motionEvent.getX(0)), java.lang.Math.abs(motionEvent.getY(1) - motionEvent.getY(0)));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        boolean z17;
        yz5.a onTextScaleEnd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e c13260x7cd1df1e = this.f423704n;
        if (!c13260x7cd1df1e.isEnabled()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextInputViewController.TextDecoration");
        o12.u uVar = (o12.u) tag;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            android.graphics.Rect rect = uVar.f423719d;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!c13260x7cd1df1e.f179034i && !this.f423701h) {
                        float abs = java.lang.Math.abs(event.getRawX() - this.f423697d);
                        float abs2 = java.lang.Math.abs(event.getRawY() - this.f423698e);
                        int i17 = c13260x7cd1df1e.f179033h;
                        if (abs > i17 || abs2 > i17) {
                            c13260x7cd1df1e.f179034i = true;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c13260x7cd1df1e.f179030e;
                            if (c22699x3dcdb352 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextIcon");
                                throw null;
                            }
                            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                            android.widget.TextView textView = c13260x7cd1df1e.f179031f;
                            if (textView == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextLabel");
                                throw null;
                            }
                            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bw7);
                            android.view.ViewGroup viewGroup = c13260x7cd1df1e.f179029d;
                            if (viewGroup == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextArea");
                                throw null;
                            }
                            viewGroup.setActivated(false);
                            c13260x7cd1df1e.f(view);
                            yz5.a onTextDragStart = c13260x7cd1df1e.getOnTextDragStart();
                            if (onTextDragStart != null) {
                                onTextDragStart.mo152xb9724478();
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "start dragging");
                        }
                    }
                    if (c13260x7cd1df1e.f179034i) {
                        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.leftMargin += (int) (event.getRawX() - this.f423699f);
                        int rawY = layoutParams2.topMargin + ((int) (event.getRawY() - this.f423700g));
                        layoutParams2.topMargin = rawY;
                        rect.offsetTo(layoutParams2.leftMargin, rawY);
                        view.requestLayout();
                        boolean contains = c13260x7cd1df1e.f179036n.contains((int) event.getRawX(), (int) event.getRawY());
                        if (contains != c13260x7cd1df1e.f179035m) {
                            c13260x7cd1df1e.f179035m = contains;
                            if (contains) {
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c13260x7cd1df1e.f179030e;
                                if (c22699x3dcdb3522 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextIcon");
                                    throw null;
                                }
                                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79698x7f34c4db);
                                android.widget.TextView textView2 = c13260x7cd1df1e.f179031f;
                                if (textView2 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextLabel");
                                    throw null;
                                }
                                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bw8);
                                android.view.ViewGroup viewGroup2 = c13260x7cd1df1e.f179029d;
                                if (viewGroup2 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextArea");
                                    throw null;
                                }
                                viewGroup2.setActivated(true);
                            } else {
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = c13260x7cd1df1e.f179030e;
                                if (c22699x3dcdb3523 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextIcon");
                                    throw null;
                                }
                                c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                                android.widget.TextView textView3 = c13260x7cd1df1e.f179031f;
                                if (textView3 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextLabel");
                                    throw null;
                                }
                                textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bw7);
                                android.view.ViewGroup viewGroup3 = c13260x7cd1df1e.f179029d;
                                if (viewGroup3 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextArea");
                                    throw null;
                                }
                                viewGroup3.setActivated(false);
                            }
                        }
                    } else if (this.f423701h && event.getPointerCount() >= 2) {
                        float b17 = b(event);
                        float f17 = uVar.f423722g * (b17 / this.f423702i);
                        uVar.f423722g = f17;
                        view.setScaleX(f17);
                        view.setScaleY(uVar.f423722g);
                        float a17 = a(event);
                        float f18 = uVar.f423723h + (a17 - this.f423703m);
                        uVar.f423723h = f18;
                        view.setRotation(f18);
                        this.f423702i = b17;
                        this.f423703m = a17;
                    }
                    this.f423699f = event.getRawX();
                    this.f423700g = event.getRawY();
                } else if (actionMasked == 5) {
                    c13260x7cd1df1e.f179034i = false;
                    this.f423701h = true;
                    this.f423702i = b(event);
                    this.f423703m = a(event);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_POINTER_DOWN");
                } else if (actionMasked == 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_POINTER_UP");
                    if (this.f423701h && (onTextScaleEnd = c13260x7cd1df1e.getOnTextScaleEnd()) != null) {
                        onTextScaleEnd.mo152xb9724478();
                    }
                }
            } else {
                if (this.f423701h) {
                    this.f423701h = false;
                    yj0.a.i(true, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                if (c13260x7cd1df1e.f179034i) {
                    if (c13260x7cd1df1e.f179035m) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "remove text decoration: " + view.getTag());
                        c13260x7cd1df1e.removeView(view);
                        z17 = false;
                        c13260x7cd1df1e.f179035m = false;
                        yz5.a onTextRemoved = c13260x7cd1df1e.getOnTextRemoved();
                        if (onTextRemoved != null) {
                            onTextRemoved.mo152xb9724478();
                        }
                    } else {
                        z17 = false;
                    }
                    c13260x7cd1df1e.f179034i = z17;
                    yz5.a onTextDragEnd = c13260x7cd1df1e.getOnTextDragEnd();
                    if (onTextDragEnd != null) {
                        onTextDragEnd.mo152xb9724478();
                    }
                    android.graphics.Rect rect2 = (android.graphics.Rect) c13260x7cd1df1e.m54754x4efbe421().mo152xb9724478();
                    int a18 = ym5.x.a(c13260x7cd1df1e.getContext(), 24.0f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "drag stops at (" + view.getLeft() + ", " + view.getTop() + ", " + view.getRight() + ", " + view.getBottom() + "), bounds: " + rect2 + ", margin: " + a18);
                    if (view.getRight() - a18 < rect2.left || view.getLeft() + a18 > rect2.right || view.getTop() + a18 > rect2.bottom || view.getBottom() - a18 < rect2.top) {
                        android.graphics.Rect rect3 = (android.graphics.Rect) c13260x7cd1df1e.m54754x4efbe421().mo152xb9724478();
                        int width = (rect3.left + (rect3.width() / 2)) - (rect.width() / 2);
                        int height = rect3.bottom - rect.height();
                        android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                        int i18 = layoutParams4.leftMargin;
                        int i19 = layoutParams4.topMargin;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "animate text from (" + i18 + ", " + i19 + ") to (" + width + ", " + height + ')');
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(300L);
                        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                        ofFloat.addUpdateListener(new o12.r(layoutParams4, i18, width, i19, height, uVar, view));
                        ofFloat.addListener(new o12.s(c13260x7cd1df1e));
                        ofFloat.start();
                    } else {
                        yz5.a onAnimateResetEnd = c13260x7cd1df1e.getOnAnimateResetEnd();
                        if (onAnimateResetEnd != null) {
                            onAnimateResetEnd.mo152xb9724478();
                        }
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, c13260x7cd1df1e.f179032g)) {
                    view.performClick();
                } else {
                    c13260x7cd1df1e.f(view);
                }
                c13260x7cd1df1e.invalidate();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTextDecorationsContainer", "ACTION_DOWN");
            this.f423697d = event.getRawX();
            this.f423699f = event.getRawX();
            this.f423698e = event.getRawY();
            this.f423700g = event.getRawY();
            c13260x7cd1df1e.f179035m = false;
            c13260x7cd1df1e.f179034i = false;
            android.view.ViewGroup viewGroup4 = c13260x7cd1df1e.f179029d;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeTextArea");
                throw null;
            }
            viewGroup4.getGlobalVisibleRect(c13260x7cd1df1e.f179036n);
            this.f423701h = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTextDecorationsContainer$TextDecorationGesture", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
