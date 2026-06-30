package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class o2 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f91577o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f91578d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91579e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.n2 f91580f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView f91581g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f91582h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f91583i;

    /* renamed from: m, reason: collision with root package name */
    public jg1.b f91584m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91585n;

    public o2(android.content.Context context) {
        super(context);
        android.view.ViewGroup viewGroup;
        this.f91579e = false;
        this.f91584m = null;
        this.f91585n = false;
        super.setId(com.tencent.mm.R.id.f483159y6);
        setOrientation(1);
        setBackgroundColor(-1);
        if (this.f91585n) {
            jg1.b bVar = this.f91584m;
            this.f91583i = bVar;
            if (bVar != null && (viewGroup = (android.view.ViewGroup) bVar.getParent()) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNumberKeyboardPanel", "toolbar is already exsited in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), java.lang.Integer.valueOf(viewGroup.getId()));
                viewGroup.removeView(this.f91583i);
            }
            addView(this.f91583i);
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 30));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488140i9, (android.view.ViewGroup) null);
        this.f91578d = inflate;
        zk1.m.a(inflate, android.widget.Button.class, java.lang.Integer.valueOf(com.tencent.mm.R.string.gp8), false, null, null, null, null, null, null, null, null, null);
        this.f91578d.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.input.m2(this));
        addView(this.f91578d, layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 240));
        com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView appBrandNumberKeyboardView = new com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView(getContext());
        this.f91581g = appBrandNumberKeyboardView;
        addView(appBrandNumberKeyboardView, layoutParams2);
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.o2 v(android.view.View view, jg1.b bVar) {
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = (com.tencent.mm.plugin.appbrand.widget.input.o2) view.getRootView().findViewById(com.tencent.mm.R.id.f483159y6);
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(view);
        if (d17 == null) {
            return null;
        }
        if (o2Var == null) {
            o2Var = new com.tencent.mm.plugin.appbrand.widget.input.o2(view.getContext());
        }
        d17.a(o2Var, false);
        if (o2Var.f91584m != bVar) {
            o2Var.f91584m = bVar;
        }
        return o2Var;
    }

    public android.widget.EditText getAttachedEditText() {
        return this.f91582h;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        jg1.b bVar;
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        if (getVisibility() == 0 && this.f91585n && (bVar = this.f91584m) != null && (customViewContainer = bVar.getCustomViewContainer()) != null) {
            android.view.ViewGroup viewGroup = customViewContainer.f86757a;
            if ((viewGroup instanceof android.view.ViewGroup) && viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getLayoutParams() != null) {
                return java.lang.Math.max(viewGroup.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    public int getPanelHeight() {
        return i65.a.b(getContext(), 270);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.x0.c(this);
    }

    public void setComponentView(boolean z17) {
        this.f91585n = z17;
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public <_Input extends android.widget.EditText & nl1.b> void setInputEditText(_Input _input) {
        this.f91582h = _input;
        this.f91581g.e(_input);
    }

    public <_InputEventReceiver extends nl1.b> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        this.f91581g.e(_inputeventreceiver);
    }

    public void setOnDoneListener(com.tencent.mm.plugin.appbrand.widget.input.n2 n2Var) {
        this.f91580f = n2Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.n2 n2Var;
        if (getVisibility() == i17 && (getVisibility() == 0 || getVisibility() == 8)) {
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f91579e || (n2Var = this.f91580f) == null) {
            return;
        }
        this.f91579e = true;
        n2Var.onDone();
        this.f91579e = false;
    }

    public void setXMode(int i17) {
        this.f91581g.setXMode(i17);
    }

    public void u(android.view.View view) {
        android.view.ViewGroup viewGroup;
        if (view == null || (viewGroup = (android.view.ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public void w() {
        android.view.View view;
        android.view.View view2;
        if (this.f91585n && this.f91583i == null) {
            jg1.b bVar = this.f91584m;
            this.f91583i = bVar;
            u(bVar);
            addView(this.f91583i, 0);
        }
        if (this.f91585n && (view2 = this.f91583i) != this.f91584m) {
            u(view2);
            jg1.b bVar2 = this.f91584m;
            this.f91583i = bVar2;
            u(bVar2);
            addView(this.f91583i, 0);
        }
        if (this.f91585n && this.f91583i.getParent() != this) {
            u(this.f91583i);
            addView(this.f91583i, 0);
        }
        if (this.f91585n || (view = this.f91583i) == null || view.getParent() != this) {
            return;
        }
        removeView(this.f91583i);
    }
}
