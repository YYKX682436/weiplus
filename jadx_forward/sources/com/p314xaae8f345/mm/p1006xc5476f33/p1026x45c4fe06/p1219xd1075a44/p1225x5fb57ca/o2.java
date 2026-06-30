package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class o2 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f173110o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f173111d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173112e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n2 f173113f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb f173114g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f173115h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f173116i;

    /* renamed from: m, reason: collision with root package name */
    public jg1.b f173117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f173118n;

    public o2(android.content.Context context) {
        super(context);
        android.view.ViewGroup viewGroup;
        this.f173112e = false;
        this.f173117m = null;
        this.f173118n = false;
        super.setId(com.p314xaae8f345.mm.R.id.f564692y6);
        setOrientation(1);
        setBackgroundColor(-1);
        if (this.f173118n) {
            jg1.b bVar = this.f173117m;
            this.f173116i = bVar;
            if (bVar != null && (viewGroup = (android.view.ViewGroup) bVar.getParent()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNumberKeyboardPanel", "toolbar is already exsited in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), java.lang.Integer.valueOf(viewGroup.getId()));
                viewGroup.removeView(this.f173116i);
            }
            addView(this.f173116i);
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 30));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569673i9, (android.view.ViewGroup) null);
        this.f173111d = inflate;
        zk1.m.a(inflate, android.widget.Button.class, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.gp8), false, null, null, null, null, null, null, null, null, null);
        this.f173111d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m2(this));
        addView(this.f173111d, layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 240));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb c12774xd6ab59bb = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb(getContext());
        this.f173114g = c12774xd6ab59bb;
        addView(c12774xd6ab59bb, layoutParams2);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 v(android.view.View view, jg1.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2) view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564692y6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(view);
        if (d17 == null) {
            return null;
        }
        if (o2Var == null) {
            o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2(view.getContext());
        }
        d17.a(o2Var, false);
        if (o2Var.f173117m != bVar) {
            o2Var.f173117m = bVar;
        }
        return o2Var;
    }

    /* renamed from: getAttachedEditText */
    public android.widget.EditText m53507xb5567791() {
        return this.f173115h;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        jg1.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35;
        if (getVisibility() == 0 && this.f173118n && (bVar = this.f173117m) != null && (mo51311x3eebbc35 = bVar.mo51311x3eebbc35()) != null) {
            android.view.ViewGroup viewGroup = mo51311x3eebbc35.f168290a;
            if ((viewGroup instanceof android.view.ViewGroup) && viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getLayoutParams() != null) {
                return java.lang.Math.max(viewGroup.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    /* renamed from: getPanelHeight */
    public int m53508x10b53b15() {
        return i65.a.b(getContext(), 270);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.x0.c(this);
    }

    /* renamed from: setComponentView */
    public void m53509xb5ed2800(boolean z17) {
        this.f173118n = z17;
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setInputEditText */
    public <_Input extends android.widget.EditText & nl1.b> void m53510xce4186ff(_Input _input) {
        this.f173115h = _input;
        this.f173114g.e(_input);
    }

    /* renamed from: setInputEventReceiver */
    public <_InputEventReceiver extends nl1.b> void m53511x9a97bb01(_InputEventReceiver _inputeventreceiver) {
        this.f173114g.e(_inputeventreceiver);
    }

    /* renamed from: setOnDoneListener */
    public void m53512x87046ad7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n2 n2Var) {
        this.f173113f = n2Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n2 n2Var;
        if (getVisibility() == i17 && (getVisibility() == 0 || getVisibility() == 8)) {
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f173112e || (n2Var = this.f173113f) == null) {
            return;
        }
        this.f173112e = true;
        n2Var.mo53476xc3989e01();
        this.f173112e = false;
    }

    /* renamed from: setXMode */
    public void m53513x53eb72f9(int i17) {
        this.f173114g.mo53428x53eb72f9(i17);
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
        if (this.f173118n && this.f173116i == null) {
            jg1.b bVar = this.f173117m;
            this.f173116i = bVar;
            u(bVar);
            addView(this.f173116i, 0);
        }
        if (this.f173118n && (view2 = this.f173116i) != this.f173117m) {
            u(view2);
            jg1.b bVar2 = this.f173117m;
            this.f173116i = bVar2;
            u(bVar2);
            addView(this.f173116i, 0);
        }
        if (this.f173118n && this.f173116i.getParent() != this) {
            u(this.f173116i);
            addView(this.f173116i, 0);
        }
        if (this.f173118n || (view = this.f173116i) == null || view.getParent() != this) {
            return;
        }
        removeView(this.f173116i);
    }
}
