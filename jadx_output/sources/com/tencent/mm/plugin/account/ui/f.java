package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class f extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f73831d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f73832e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f73833f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f73834g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnTouchListener f73835h = new com.tencent.mm.plugin.account.ui.e(this);

    public f(android.content.Context context, java.lang.String[] strArr) {
        this.f73833f = null;
        this.f73831d = strArr;
        this.f73834g = context;
        this.f73832e = android.view.LayoutInflater.from(context);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.bnd);
        this.f73833f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f73831d.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f73831d[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView;
        if (view == null) {
            view = this.f73832e.inflate(com.tencent.mm.R.layout.f487996dv, (android.view.ViewGroup) null);
            textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.s_);
        } else {
            textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.s_);
        }
        view.setOnTouchListener(this.f73835h);
        boolean z17 = i17 == 0;
        java.lang.String[] strArr = this.f73831d;
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
        android.graphics.drawable.Drawable drawable = this.f73833f;
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
