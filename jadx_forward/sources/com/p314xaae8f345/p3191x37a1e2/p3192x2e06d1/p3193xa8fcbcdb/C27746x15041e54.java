package com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb;

/* renamed from: com.tencent.weui.base.preference.IconPreference */
/* loaded from: classes3.dex */
public class C27746x15041e54 extends android.preference.Preference {
    public android.view.View A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.widget.TextView E;
    public android.widget.ImageView F;
    public final int G;
    public final android.content.Context H;
    public final int I;

    /* renamed from: d, reason: collision with root package name */
    public final int f301640d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f301641e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f301642f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f301643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f301644h;

    /* renamed from: i, reason: collision with root package name */
    public final int f301645i;

    /* renamed from: m, reason: collision with root package name */
    public final int f301646m;

    /* renamed from: n, reason: collision with root package name */
    public final int f301647n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f301648o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f301649p;

    /* renamed from: q, reason: collision with root package name */
    public final int f301650q;

    /* renamed from: r, reason: collision with root package name */
    public final int f301651r;

    /* renamed from: s, reason: collision with root package name */
    public final int f301652s;

    /* renamed from: t, reason: collision with root package name */
    public final int f301653t;

    /* renamed from: u, reason: collision with root package name */
    public final int f301654u;

    /* renamed from: v, reason: collision with root package name */
    public final int f301655v;

    /* renamed from: w, reason: collision with root package name */
    public final int f301656w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f301657x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f301658y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f301659z;

    public C27746x15041e54(android.content.Context context) {
        this(context, null);
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.F = imageView;
        if (imageView != null) {
            android.graphics.drawable.Drawable drawable = this.f301642f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                this.F.setVisibility(0);
            } else if (getIcon() != null) {
                android.widget.ImageView imageView2 = this.F;
                android.graphics.drawable.Drawable icon = getIcon();
                this.f301642f = icon;
                imageView2.setImageDrawable(icon);
                this.F.setVisibility(0);
            } else {
                this.F.setVisibility(8);
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        linearLayout.setMinimumHeight(view.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561456j2));
        int i17 = this.G;
        if (i17 != -1) {
            linearLayout.setMinimumHeight(i17);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        this.E = textView;
        android.content.Context context = this.H;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.E.setVisibility(this.f301645i);
            this.E.setText(this.f301643g);
            int i18 = this.f301644h;
            if (i18 != -1) {
                this.E.setBackgroundDrawable(context.getResources().getDrawable(i18));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o5_);
        this.D = textView2;
        if (textView2 != null) {
            textView2.setVisibility(this.f301651r);
            this.D.setText(this.f301649p);
            int i19 = this.f301650q;
            if (i19 != -1) {
                this.D.setBackgroundDrawable(context.getResources().getDrawable(i19));
            }
            int i27 = this.f301652s;
            if (i27 != -1) {
                this.D.setTextColor(i27);
            }
            this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o4r);
        this.f301657x = imageView3;
        imageView3.setVisibility(this.f301646m);
        int i28 = this.I;
        if (i28 != -1) {
            this.f301657x.setImageResource(i28);
        }
        this.f301641e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_s);
        this.f301658y = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.m4_);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m3q);
        this.A = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f301656w));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m47);
        this.f301659z = findViewById2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(this.f301655v));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m38)).setVisibility(0);
        int i29 = this.f301640d;
        if (i29 != -1) {
            this.f301641e.setImageResource(i29);
        }
        this.f301641e.setVisibility(this.f301653t);
        this.f301658y.setVisibility(this.f301654u);
        this.B = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.C = textView3;
        if (textView3 != null) {
            textView3.setVisibility(this.f301647n);
            this.C.setText(this.f301648o);
            this.C.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        }
        android.widget.TextView textView4 = this.B;
        if (textView4 != null) {
            textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        view.setEnabled(true);
    }

    @Override // android.preference.Preference
    public android.view.View onCreateView(android.view.ViewGroup viewGroup) {
        android.view.View onCreateView = super.onCreateView(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) onCreateView.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c_h, viewGroup2);
        return onCreateView;
    }

    public C27746x15041e54(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C27746x15041e54(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f301640d = -1;
        this.f301641e = null;
        this.f301643g = "";
        this.f301644h = -1;
        this.f301645i = 8;
        this.f301646m = 8;
        this.f301647n = 8;
        this.f301648o = "";
        this.f301649p = "";
        this.f301650q = -1;
        this.f301651r = 8;
        this.f301652s = -1;
        this.f301653t = 8;
        this.f301654u = 8;
        this.f301655v = 8;
        this.f301656w = 8;
        this.f301657x = null;
        this.f301658y = null;
        this.f301659z = null;
        this.A = null;
        this.G = -1;
        this.I = -1;
        this.H = context;
        setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.byv);
    }
}
