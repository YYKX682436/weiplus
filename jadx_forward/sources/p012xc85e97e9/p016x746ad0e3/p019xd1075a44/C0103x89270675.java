package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ViewStubCompat */
/* loaded from: classes3.dex */
public final class C0103x89270675 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f91034d;

    /* renamed from: e, reason: collision with root package name */
    public int f91035e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f91036f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.LayoutInflater f91037g;

    public C0103x89270675(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public android.view.View a() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f91034d == 0) {
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        android.view.LayoutInflater layoutInflater = this.f91037g;
        if (layoutInflater == null) {
            layoutInflater = android.view.LayoutInflater.from(getContext());
        }
        android.view.View inflate = layoutInflater.inflate(this.f91034d, viewGroup, false);
        int i17 = this.f91035e;
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
        this.f91036f = new java.lang.ref.WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    /* renamed from: getInflatedId */
    public int m2856x36b8d52e() {
        return this.f91035e;
    }

    /* renamed from: getLayoutInflater */
    public android.view.LayoutInflater m2857xacd3518b() {
        return this.f91037g;
    }

    /* renamed from: getLayoutResource */
    public int m2858x8e08264e() {
        return this.f91034d;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: setInflatedId */
    public void m2859x64dd233a(int i17) {
        this.f91035e = i17;
    }

    /* renamed from: setLayoutInflater */
    public void m2860x74c9b997(android.view.LayoutInflater layoutInflater) {
        this.f91037g = layoutInflater;
    }

    /* renamed from: setLayoutResource */
    public void m2861x55fe8e5a(int i17) {
        this.f91034d = i17;
    }

    /* renamed from: setOnInflateListener */
    public void m2862xf82967ba(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.g3 g3Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.lang.ref.WeakReference weakReference = this.f91036f;
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
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C0103x89270675(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91034d = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.C, i17, 0);
        this.f91035e = obtainStyledAttributes.getResourceId(2, -1);
        this.f91034d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
