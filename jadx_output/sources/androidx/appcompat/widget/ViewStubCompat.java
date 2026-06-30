package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class ViewStubCompat extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f9501d;

    /* renamed from: e, reason: collision with root package name */
    public int f9502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f9503f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.LayoutInflater f9504g;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public android.view.View a() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f9501d == 0) {
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        android.view.LayoutInflater layoutInflater = this.f9504g;
        if (layoutInflater == null) {
            layoutInflater = android.view.LayoutInflater.from(getContext());
        }
        android.view.View inflate = layoutInflater.inflate(this.f9501d, viewGroup, false);
        int i17 = this.f9502e;
        if (i17 != -1) {
            inflate.setId(i17);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f9503f = new java.lang.ref.WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f9502e;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.f9504g;
    }

    public int getLayoutResource() {
        return this.f9501d;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i17) {
        this.f9502e = i17;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.f9504g = layoutInflater;
    }

    public void setLayoutResource(int i17) {
        this.f9501d = i17;
    }

    public void setOnInflateListener(androidx.appcompat.widget.g3 g3Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.lang.ref.WeakReference weakReference = this.f9503f;
        if (weakReference == null) {
            super.setVisibility(i17);
            if (i17 == 0 || i17 == 4) {
                a();
                return;
            }
            return;
        }
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null) {
            throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f9501d = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.C, i17, 0);
        this.f9502e = obtainStyledAttributes.getResourceId(2, -1);
        this.f9501d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
