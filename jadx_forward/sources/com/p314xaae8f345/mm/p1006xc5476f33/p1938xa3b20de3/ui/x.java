package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f234287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f234288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f234289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234290g;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f234290g = c16759xaa786f9e;
        this.f234287d = textView;
        this.f234288e = imageView;
        this.f234289f = imageView2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f234287d.getLineCount() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = this.f234290g;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.h(c16759xaa786f9e.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i65.a.h(c16759xaa786f9e.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            int b17 = i65.a.b(c16759xaa786f9e.getContext(), 2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = b17;
            this.f234288e.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i65.a.h(c16759xaa786f9e.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), i65.a.h(c16759xaa786f9e.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = b17;
            this.f234289f.setLayoutParams(layoutParams2);
        }
    }
}
