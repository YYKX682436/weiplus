package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1724x5a0eb252;

/* renamed from: com.tencent.mm.plugin.gallery.picker.behavior.AppBarLayoutBehavior */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC15639xe454d28e extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior implements android.view.View.OnTouchListener {
    public final int A;
    public final android.graphics.Rect B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: x, reason: collision with root package name */
    public boolean f219990x;

    /* renamed from: y, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f219991y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f219992z;

    public ViewOnTouchListenerC15639xe454d28e() {
        this.f219990x = false;
        this.A = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        this.B = new android.graphics.Rect();
        this.C = true;
        this.D = false;
        this.E = false;
        this.f125829w = new y23.a(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior
    /* renamed from: J */
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        this.f219991y = c2678xa407981c;
        this.f219992z = c2678xa407981c.findViewById(com.p314xaae8f345.mm.R.id.ga6);
        if (c1081xa22a3e5a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15650x7d7c911b) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15650x7d7c911b) c1081xa22a3e5a).m63693xce6c7bd1(this);
        }
        super.g(c1081xa22a3e5a, c2678xa407981c, i17);
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /* renamed from: K */
    public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int[] iArr, int i19) {
        if (!(i19 == 1 && this.D) && this.f219990x) {
            super.l(c1081xa22a3e5a, c2678xa407981c, view, i17, i18, iArr, i19);
            if (this.C) {
                if (iArr[1] == 0) {
                    super.o(c1081xa22a3e5a, c2678xa407981c, view, 0, 0, 0, i18, i19);
                }
                iArr[1] = i18;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /* renamed from: L */
    public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        if (!(i28 == 1 && this.D) && this.f219990x) {
            super.o(c1081xa22a3e5a, c2678xa407981c, view, i17, i18, i19, i27, i28);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior
    /* renamed from: M */
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, android.view.View view2, int i17, int i18) {
        super.u(c1081xa22a3e5a, c2678xa407981c, view, view2, i17, i18);
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public /* bridge */ /* synthetic */ boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        g(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view, i17);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.graphics.Rect rect = this.B;
        if (action == 0) {
            this.f219990x = false;
            this.E = false;
            this.C = java.lang.Math.abs(y()) <= 0;
            this.D = this.f219991y.m19973xa8f0dc02() == java.lang.Math.abs(y());
            if (this.C) {
                this.f219992z.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f219990x = true;
                    this.E = true;
                }
            }
        }
        if (this.D) {
            this.f219990x = true;
        }
        if (!this.f219990x) {
            this.f219991y.getGlobalVisibleRect(rect);
            rect.bottom -= this.A;
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f219990x = true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        super.u(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view, view2, view3, i17, i18);
        return true;
    }

    public ViewOnTouchListenerC15639xe454d28e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219990x = false;
        this.A = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        this.B = new android.graphics.Rect();
        this.C = true;
        this.D = false;
        this.E = false;
        this.f125829w = new y23.a(this);
    }
}
