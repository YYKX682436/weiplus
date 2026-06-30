package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f291110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f291111b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.q0 f291112c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f291113d;

    /* renamed from: e, reason: collision with root package name */
    public int f291114e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f291115f;

    /* renamed from: g, reason: collision with root package name */
    public int f291116g;

    /* renamed from: h, reason: collision with root package name */
    public int f291117h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f291118i;

    public r0(android.app.Activity activity, boolean z17) {
        this.f291111b = false;
        com.p314xaae8f345.mm.ui.p0 p0Var = new com.p314xaae8f345.mm.ui.p0(this);
        this.f291118i = p0Var;
        this.f291110a = activity;
        this.f291111b = z17;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) activity.findViewById(android.R.id.content);
        if (frameLayout == null) {
            return;
        }
        android.view.View childAt = frameLayout.getChildAt(0);
        this.f291113d = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(p0Var);
        this.f291115f = childAt.getLayoutParams();
    }

    public static void a(android.app.Activity activity, boolean z17) {
        new com.p314xaae8f345.mm.ui.r0(activity, z17);
    }

    public r0(android.app.Activity activity, boolean z17, android.view.View view, com.p314xaae8f345.mm.ui.q0 q0Var) {
        this.f291111b = false;
        com.p314xaae8f345.mm.ui.p0 p0Var = new com.p314xaae8f345.mm.ui.p0(this);
        this.f291118i = p0Var;
        this.f291110a = activity;
        this.f291111b = z17;
        this.f291113d = view;
        this.f291112c = q0Var;
        view.getViewTreeObserver().addOnGlobalLayoutListener(p0Var);
        this.f291115f = view.getLayoutParams();
    }
}
