package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView */
/* loaded from: classes8.dex */
public class C19645x574159e9 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.r1 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f271337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f271338f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f271339g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f271340h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f271341i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 f271342m;

    public C19645x574159e9(android.content.Context context) {
        super(context, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    public void a() {
        this.f271340h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j8u);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.caw, (android.view.ViewGroup) null);
        this.f271341i = inflate;
        android.view.View findViewById = this.f271341i.findViewById(com.p314xaae8f345.mm.R.id.kua);
        findViewById.setPadding(findViewById.getPaddingLeft(), 0, findViewById.getPaddingRight(), 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.g2(this));
        this.f271340h.addView(this.f271341i, layoutParams);
    }

    public void b(java.lang.String str, boolean z17, boolean z18) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cax, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e) inflate.findViewById(com.p314xaae8f345.mm.R.id.kuc);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.csb);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567079i22);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.e2(this, inflate));
        }
        c19641xd487040e.setHint(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571368d3));
        if (z17) {
            c19641xd487040e.f271312f = true;
            android.graphics.drawable.Drawable drawable = c19641xd487040e.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80391x49644d6a);
            c19641xd487040e.f271310d = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), c19641xd487040e.f271310d.getIntrinsicHeight());
            c19641xd487040e.setFocusable(false);
            c19641xd487040e.setCompoundDrawablesWithIntrinsicBounds(c19641xd487040e.getCompoundDrawables()[0], c19641xd487040e.getCompoundDrawables()[1], c19641xd487040e.f271310d, c19641xd487040e.getCompoundDrawables()[3]);
        }
        c19641xd487040e.m75361x6c4ebec7(this);
        c19641xd487040e.setText(str);
        c19641xd487040e.setSelection(c19641xd487040e.getText().length());
        c19641xd487040e.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kud);
        findViewById3.setPadding(findViewById3.getPaddingLeft(), 0, findViewById3.getPaddingRight(), 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        android.widget.LinearLayout linearLayout = this.f271340h;
        linearLayout.addView(inflate, linearLayout.getChildCount() - 1, layoutParams);
        c19641xd487040e.setPadding(0, 0, 0, 0);
        if (z18) {
            c19641xd487040e.requestFocus();
            c19641xd487040e.postDelayed(new com.p314xaae8f345.mm.p2470x93e71c27.ui.f2(this, c19641xd487040e), 100L);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var = this.f271342m;
        if (h2Var != null) {
            h2Var.a(c19641xd487040e);
        }
        if (findViewById2 != null) {
            if (this.f271340h.getChildCount() > 5) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(java.lang.String str, boolean z17, boolean z18) {
        b(str, z17, z18);
        if (this.f271340h.getChildCount() > 5) {
            d();
        } else {
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        for (int i17 = 1; i17 < this.f271340h.getChildCount(); i17++) {
            this.f271340h.getChildAt(i17).clearFocus();
        }
    }

    public final void d() {
        android.view.View view = this.f271341i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var = this.f271342m;
        if (h2Var != null) {
            h2Var.c();
        }
    }

    public boolean e() {
        java.util.ArrayList<java.lang.String> m75370xcd47ad5f = m75370xcd47ad5f();
        if (m75370xcd47ad5f == null || m75370xcd47ad5f.isEmpty()) {
            return this.f271339g != null;
        }
        if (this.f271339g == null || m75370xcd47ad5f.size() != this.f271339g.length) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = m75370xcd47ad5f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (!it.next().equals(this.f271339g[i17])) {
                return true;
            }
            i17++;
        }
        return false;
    }

    public boolean f() {
        android.view.View view = this.f271341i;
        return view != null && view.getVisibility() == 0;
    }

    public final void g() {
        android.view.View view = this.f271341i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h2 h2Var = this.f271342m;
        if (h2Var != null) {
            h2Var.c();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    /* renamed from: getLayout */
    public int mo67643x22f21e20() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cay;
    }

    /* renamed from: getPhoneNumberList */
    public java.util.ArrayList<java.lang.String> m75370xcd47ad5f() {
        int childCount = this.f271340h.getChildCount();
        if (childCount == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(childCount);
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View findViewById = this.f271340h.getChildAt(i17).findViewById(com.p314xaae8f345.mm.R.id.kuc);
            if (findViewById instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e) {
                java.lang.String obj = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e) findViewById).getText().toString();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) && !obj.trim().equals("")) {
                    arrayList.add(obj);
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271337e) && arrayList.size() > 0) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    public C19645x574159e9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19645x574159e9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
