package vf5;

/* loaded from: classes3.dex */
public final class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f517956d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f517957e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f517958f;

    /* renamed from: g, reason: collision with root package name */
    public int f517959g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f517960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f517958f = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity);
        this.f517960h = new android.view.GestureDetector(activity, new vf5.e(activity));
    }

    public final java.util.List O6(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    if ((childAt instanceof android.widget.EditText) && ((android.widget.EditText) childAt).isFocused()) {
                        arrayList.add(childAt);
                    }
                    arrayList.addAll(O6(childAt));
                }
            }
        }
        return arrayList;
    }

    public final void P6(android.widget.FrameLayout scrollview) {
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollview, "scrollview");
        android.widget.FrameLayout frameLayout = this.f517957e;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f517957e = scrollview;
        if (scrollview instanceof android.widget.ScrollView) {
            scrollview.setOnTouchListener(new vf5.f(this));
        } else if (scrollview instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) {
            scrollview.setOnTouchListener(new vf5.g(this));
        }
        android.view.ViewTreeObserver viewTreeObserver2 = scrollview.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (this.f517959g == 0) {
            this.f517959g = i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        this.f517958f.f291933e = this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.ViewTreeObserver viewTreeObserver;
        this.f517958f.d();
        android.widget.FrameLayout frameLayout = this.f517957e;
        if (frameLayout == null || (viewTreeObserver = frameLayout.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View childAt;
        android.widget.FrameLayout frameLayout = this.f517957e;
        if (frameLayout == null || frameLayout.getChildCount() == 0 || (childAt = frameLayout.getChildAt(0)) == null) {
            return;
        }
        int height = childAt.getHeight();
        int i17 = this.f517956d;
        int i18 = height - i17;
        if (i17 != 0 && height != 0 && i18 != 0 && i18 > 0) {
            frameLayout.post(new vf5.h(frameLayout, i18));
        }
        this.f517956d = height;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f517958f.d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f517958f.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        if (z17) {
            this.f517958f.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.widget.FrameLayout frameLayout = this.f517957e;
        if (frameLayout == null) {
            return;
        }
        android.view.View childAt = frameLayout.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (i17 == 0) {
            childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), 0);
            return;
        }
        int height = frameLayout.getHeight() - (childAt.getHeight() - childAt.getPaddingBottom());
        int i18 = height >= 0 ? height : 0;
        java.util.ArrayList arrayList = (java.util.ArrayList) O6(frameLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactModScrollUIC", "onKeyboardHeightChanged, editTexts:%s", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            return;
        }
        android.widget.EditText editText = (android.widget.EditText) arrayList.get(arrayList.size() - 1);
        int[] iArr = new int[2];
        editText.getLocationOnScreen(iArr);
        int height2 = editText.getHeight();
        int[] iArr2 = new int[2];
        frameLayout.getLocationOnScreen(iArr2);
        int height3 = (iArr2[1] + frameLayout.getHeight()) - i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactModScrollUIC", "scrollTop: " + iArr2[1] + ", height: " + frameLayout.getHeight() + ", imeHeight: " + i17 + ", visibleHeight: " + height3);
        int i19 = (iArr[1] + height2) - height3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("editTextTop: ");
        sb6.append(iArr[1]);
        sb6.append(", editTextHeight: ");
        sb6.append(height2);
        sb6.append(", outOfScreenHeight:%s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactModScrollUIC", sb6.toString(), java.lang.Integer.valueOf(i19));
        childAt.post(new vf5.i(childAt, i18 + this.f517959g, i19));
    }
}
