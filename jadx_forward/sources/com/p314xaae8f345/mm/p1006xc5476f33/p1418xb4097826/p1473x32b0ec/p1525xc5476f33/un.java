package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f196124a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f196125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f196126c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f196127d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f196128e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f196129f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 f196130g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec f196131h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f196132i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.ViewGroup f196133j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.ViewGroup f196134k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f196135l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f196136m;

    public un(android.view.ViewGroup container, boolean z17, boolean z18, boolean z19, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f196124a = z18;
        this.f196125b = z19;
        this.f196126c = i17;
        android.widget.TextView textView = (android.widget.TextView) container.findViewById(com.p314xaae8f345.mm.R.id.ezs);
        this.f196127d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) container.findViewById(com.p314xaae8f345.mm.R.id.ezt);
        this.f196128e = textView2;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) container.findViewById(com.p314xaae8f345.mm.R.id.ezw);
        this.f196129f = c22789xd23e9a9b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234) container.findViewById(com.p314xaae8f345.mm.R.id.ezr);
        this.f196130g = c14323xd3329234;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec) container.findViewById(com.p314xaae8f345.mm.R.id.ezq);
        this.f196131h = c14224x1cce21ec;
        this.f196132i = container.findViewById(com.p314xaae8f345.mm.R.id.agx);
        this.f196133j = (android.view.ViewGroup) container.findViewById(com.p314xaae8f345.mm.R.id.ezv);
        this.f196134k = (android.view.ViewGroup) container.findViewById(com.p314xaae8f345.mm.R.id.ezu);
        this.f196135l = container.findViewById(com.p314xaae8f345.mm.R.id.f567851qn4);
        this.f196136m = (android.widget.TextView) container.findViewById(com.p314xaae8f345.mm.R.id.f567852qn5);
        if (z19) {
            android.view.ViewGroup.LayoutParams layoutParams2 = c22789xd23e9a9b != null ? c22789xd23e9a9b.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.width = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            }
            layoutParams = c22789xd23e9a9b != null ? c22789xd23e9a9b.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            }
            if (c14323xd3329234 != null) {
                c14323xd3329234.setTextSize(1, 12.0f);
            }
            if (c14224x1cce21ec != null) {
                c14224x1cce21ec.m56830x3abfd950(12.0f);
                return;
            }
            return;
        }
        if (!z18) {
            if (z17) {
                if (textView != null) {
                    textView.setTextSize(1, 15.0f);
                }
                if (textView2 != null) {
                    textView2.setTextSize(1, 15.0f);
                }
                android.view.View findViewById = container.findViewById(com.p314xaae8f345.mm.R.id.agx);
                layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                }
            } else {
                if (textView != null) {
                    textView.setTextSize(1, 17.0f);
                }
                if (textView2 != null) {
                    textView2.setTextSize(1, 17.0f);
                }
                android.view.View findViewById2 = container.findViewById(com.p314xaae8f345.mm.R.id.agx);
                layoutParams = findViewById2 != null ? findViewById2.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
                }
            }
            if (c14323xd3329234 != null) {
                c14323xd3329234.setTextSize(1, 22.0f);
            }
            if (c14224x1cce21ec != null) {
                c14224x1cce21ec.m56830x3abfd950(22.0f);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setTextSize(1, 12.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(1, 12.0f);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = c22789xd23e9a9b != null ? c22789xd23e9a9b.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = c22789xd23e9a9b != null ? c22789xd23e9a9b.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        }
        if (c14323xd3329234 != null) {
            c14323xd3329234.setTextSize(1, 17.0f);
        }
        if (c14224x1cce21ec != null) {
            c14224x1cce21ec.m56830x3abfd950(17.0f);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = container.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        }
        android.view.View findViewById3 = container.findViewById(com.p314xaae8f345.mm.R.id.agx);
        android.view.ViewGroup.LayoutParams layoutParams6 = findViewById3 != null ? findViewById3.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.width = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.U;
        }
        android.view.View findViewById4 = container.findViewById(com.p314xaae8f345.mm.R.id.agx);
        layoutParams = findViewById4 != null ? findViewById4.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = (int) container.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
    }
}
