package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/FriendProfilePreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.FriendProfilePreference */
/* loaded from: classes3.dex */
public final class C16855x7429c046 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.content.Context L;
    public android.widget.LinearLayout M;
    public final java.util.List N;
    public boolean P;
    public android.widget.TextView Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16855x7429c046(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.N = new java.util.ArrayList();
        this.L = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }

    public final void M(int i17, java.lang.CharSequence charSequence, int i18, yz5.a aVar, boolean z17) {
        java.lang.Object obj;
        java.util.List list = this.N;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((hr3.j9) obj).f365217a == i17) {
                    break;
                }
            }
        }
        hr3.j9 j9Var = (hr3.j9) obj;
        if (j9Var != null) {
            j9Var.f365225i = charSequence;
            j9Var.f365226j = i18;
            return;
        }
        android.content.Context context = this.f279303d;
        java.lang.Object systemService = context.getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3h, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "createItem", "(ILjava/lang/CharSequence;ILkotlin/jvm/functions/Function0;Z)Lcom/tencent/mm/plugin/profile/ui/ItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "createItem", "(ILjava/lang/CharSequence;ILkotlin/jvm/functions/Function0;Z)Lcom/tencent/mm/plugin/profile/ui/ItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sxz);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
        textView.setLayoutParams(layoutParams);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sxw);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sxy);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sxx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        ((java.util.ArrayList) list).add(new hr3.j9(i17, inflate, textView, textView2, textView3, imageView, null, hr3.e9.f365051d, charSequence, i18, aVar, z17));
    }

    public final void N(int i17, java.lang.CharSequence charSequence, boolean z17) {
        M(i17, charSequence, z17 ? 1 : Integer.MAX_VALUE, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        java.lang.String str;
        android.content.Context context;
        android.widget.LinearLayout linearLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            textView.setText(this.f279307h);
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.b(textView);
        }
        android.widget.TextView textView2 = this.Q;
        if (textView2 != null && (linearLayout = this.M) != null) {
            linearLayout.removeView(textView2);
        }
        java.util.Iterator it = this.N.iterator();
        java.lang.Object[] objArr = false;
        while (true) {
            boolean hasNext = it.hasNext();
            str = null;
            jz5.f0 f0Var = null;
            context = this.L;
            if (!hasNext) {
                break;
            }
            hr3.j9 j9Var = (hr3.j9) it.next();
            java.lang.CharSequence charSequence = j9Var.f365225i;
            java.lang.Object[] objArr2 = charSequence == null || r26.n0.N(charSequence);
            android.graphics.drawable.Drawable drawable = j9Var.f365223g;
            if (objArr2 == true && drawable == null) {
                android.view.View view2 = j9Var.f365218b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view3 = j9Var.f365218b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/FriendProfilePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j9Var.f365219c.setText(i65.a.r(context, j9Var.f365217a));
                android.widget.ImageView imageView = j9Var.f365222f;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    imageView.setVisibility(8);
                }
                imageView.setOnClickListener(new hr3.f9(j9Var));
                java.lang.CharSequence charSequence2 = j9Var.f365225i;
                android.widget.TextView textView3 = j9Var.f365220d;
                textView3.setText(charSequence2);
                boolean z17 = j9Var.f365226j == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView3.setSingleLine(z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView3.setMaxLines(j9Var.f365226j);
                textView3.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textView3.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
                yz5.a aVar = j9Var.f365227k;
                if (aVar != null) {
                    android.widget.TextView textView4 = j9Var.f365221e;
                    if (textView4.getVisibility() == 8) {
                        textView4.setVisibility(4);
                        textView4.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
                        hr3.h9 h9Var = new hr3.h9(aVar);
                        java.lang.String r17 = i65.a.r(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.nb9);
                        android.text.SpannableString spannableString = new android.text.SpannableString(r17);
                        spannableString.setSpan(h9Var, 0, r17.length(), 17);
                        textView4.setText(spannableString);
                    }
                    textView3.post(new hr3.g9(j9Var));
                }
                android.widget.LinearLayout linearLayout2 = this.M;
                if (linearLayout2 != null) {
                    android.view.View view4 = j9Var.f365218b;
                    if (view4.getParent() == null) {
                        linearLayout2.addView(view4);
                    }
                }
                objArr = true;
            }
        }
        if (objArr == true) {
            return;
        }
        if (this.Q == null) {
            android.widget.TextView textView5 = new android.widget.TextView(context);
            textView5.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            java.lang.Object[] objArr3 = this.P ? (char) 3 : (char) 1;
            if (objArr3 == 1) {
                str = textView5.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3r);
            } else if (objArr3 == 3) {
                str = textView5.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3q);
            }
            textView5.setText(str);
            textView5.setTextSize(0, i65.a.h(textView5.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
            int color = textView5.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView5.setTextColor(color);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            this.Q = textView5;
        }
        android.widget.LinearLayout linearLayout3 = this.M;
        if (linearLayout3 != null) {
            linearLayout3.addView(this.Q);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View u17 = super.u(parent);
        java.lang.Object systemService = this.L.getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup.removeAllViews();
        ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3g, viewGroup);
        this.M = (android.widget.LinearLayout) u17.findViewById(com.p314xaae8f345.mm.R.id.uzx);
        return u17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16855x7429c046(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.N = new java.util.ArrayList();
        this.L = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16855x7429c046(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.N = new java.util.ArrayList();
        this.L = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
