package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class e extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256952f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f256953g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f256954h;

    /* renamed from: i, reason: collision with root package name */
    public int f256955i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f256956m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f256957n;

    /* renamed from: o, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 f256958o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f256959p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.a f256960q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576153rt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f256955i = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f256956m = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f256957n = arrayList2;
        C(1);
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) {
                arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_1));
                arrayList.add(4);
                arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_2));
                arrayList.add(1);
                if ((b17 & 2) != 0) {
                    arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_0));
                    arrayList.add(2);
                    return;
                }
                return;
            }
            return;
        }
        arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_2));
        arrayList.add(1);
        if ((b17 & 2) != 0) {
            arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_0));
            arrayList.add(2);
        }
        if ((b17 & 4) != 0) {
            arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_1));
            arrayList.add(4);
        }
        if ((b17 & 8) != 0) {
            arrayList2.add(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_3));
            arrayList.add(8);
        }
    }

    public final void D() {
        android.widget.LinearLayout linearLayout = this.f256954h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        int i17 = 0;
        for (java.lang.Object obj : this.f256956m) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int intValue = ((java.lang.Number) obj).intValue();
            android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bne, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
            ((android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.hsw)).setText((java.lang.CharSequence) this.f256957n.get(i17));
            android.view.View findViewById = frameLayout.findViewById(com.p314xaae8f345.mm.R.id.hsv);
            int i19 = intValue == this.f256955i ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.d(this, intValue));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            android.widget.LinearLayout linearLayout2 = this.f256954h;
            if (linearLayout2 != null) {
                linearLayout2.addView(frameLayout, layoutParams);
            }
            i17 = i18;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        this.f256952f = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnd, (android.view.ViewGroup) null, false);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.view.View view = this.f256952f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        setContentView(view, layoutParams);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(34);
            window.setDimAmount(0.5f);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View view2 = this.f256952f;
        if (view2 != null) {
            this.f256953g = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.bzn);
            this.f256954h = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.hst);
        }
        android.widget.ImageView imageView = this.f256953g;
        if (imageView != null) {
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.b(this));
        }
        android.view.View view3 = this.f256952f;
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 A = p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.A(view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.lj7) : null);
        this.f256958o = A;
        if (A != null) {
            A.f90432w = new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.c(this);
        }
        D();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f256958o;
        if (c0029xbc4672a6 == null) {
            return;
        }
        c0029xbc4672a6.C(3);
    }
}
