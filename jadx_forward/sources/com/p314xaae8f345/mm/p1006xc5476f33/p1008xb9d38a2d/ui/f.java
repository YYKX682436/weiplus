package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class f extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f155364d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f155365e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f155366f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f155367g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnTouchListener f155368h = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e(this);

    public f(android.content.Context context, java.lang.String[] strArr) {
        this.f155366f = null;
        this.f155364d = strArr;
        this.f155367g = context;
        this.f155365e = android.view.LayoutInflater.from(context);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bnd);
        this.f155366f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f155364d.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f155364d[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView;
        if (view == null) {
            view = this.f155365e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569529dv, (android.view.ViewGroup) null);
            textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.s_);
        } else {
            textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.s_);
        }
        view.setOnTouchListener(this.f155368h);
        boolean z17 = i17 == 0;
        java.lang.String[] strArr = this.f155364d;
        if (z17) {
            if (i17 == strArr.length - 1) {
                textView.setPadding(25, 0, 25, 10);
                textView.setCompoundDrawablePadding(0);
                textView.setCompoundDrawables(null, null, null, null);
                textView.setText(strArr[i17]);
                return view;
            }
        }
        boolean z18 = i17 == 0;
        android.graphics.drawable.Drawable drawable = this.f155366f;
        if (z18) {
            textView.setPadding(25, 0, 10, 10);
            textView.setCompoundDrawablePadding(10);
            textView.setCompoundDrawables(null, null, drawable, null);
        } else {
            if (i17 == strArr.length - 1) {
                textView.setPadding(0, 0, 25, 10);
                textView.setCompoundDrawablePadding(0);
                textView.setCompoundDrawables(null, null, null, null);
            } else {
                textView.setPadding(0, 0, 10, 10);
                textView.setCompoundDrawablePadding(10);
                textView.setCompoundDrawables(null, null, drawable, null);
            }
        }
        textView.setText(strArr[i17]);
        return view;
    }
}
