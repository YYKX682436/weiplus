package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView */
/* loaded from: classes4.dex */
public class C19729x50b2202e extends android.widget.LinearLayout implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f272894d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f272895e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f272896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272898h;

    public C19729x50b2202e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272897g = false;
        this.f272898h = false;
        a();
    }

    public final void a() {
        setOrientation(1);
        this.f272894d = new android.widget.FrameLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f272894d.setVisibility(8);
        addView(this.f272894d, layoutParams);
        android.view.View view = new android.view.View(getContext());
        this.f272895e = view;
        view.setBackgroundColor(-872415232);
        this.f272895e.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h1(this));
        this.f272894d.addView(this.f272895e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ListView listView = new android.widget.ListView(getContext());
        this.f272896f = listView;
        listView.setCacheColorHint(0);
        this.f272896f.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        this.f272896f.setSelector(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        this.f272896f.setOnItemClickListener(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        this.f272896f.setPadding(dimensionPixelSize, dimensionPixelSize / 3, dimensionPixelSize, 0);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        layoutParams2.gravity = 80;
        this.f272894d.addView(this.f272896f, layoutParams2);
        this.f272896f.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j1(getContext()));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f272895e.performClick();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    /* renamed from: setListener */
    public void m75786xc6cf6336(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i1 i1Var) {
    }

    public C19729x50b2202e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272897g = false;
        this.f272898h = false;
        a();
    }
}
