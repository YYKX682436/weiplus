package dt2;

/* loaded from: classes3.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f324697d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f324698e;

    /* renamed from: f, reason: collision with root package name */
    public final long f324699f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f324700g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f324701h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f324702i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f324703m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f324704n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, boolean z17, boolean z18, long j17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f324697d = z17;
        this.f324698e = z18;
        this.f324699f = j17;
    }

    public static final void a(dt2.d dVar, boolean z17, boolean z18, long j17) {
        java.lang.String str;
        if (dVar.f324697d) {
            return;
        }
        if (!z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f408813y1, z17 ? 4 : 5, 0L);
            return;
        }
        if (z17) {
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            str = "watch_live_new_pay_click";
        } else {
            ml2.o3[] o3VarArr2 = ml2.o3.f409306d;
            str = "watch_live_new_pay_cancel";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(j17));
        ml2.z0.f409863a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj(str, jSONObject2);
    }

    public final void b(boolean z17, java.lang.String licenseDescStr, java.lang.String licenseContentStr, yz5.a callback) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(licenseDescStr, "licenseDescStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(licenseContentStr, "licenseContentStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ap8, (android.view.ViewGroup) this, false);
        this.f324700g = inflate;
        android.widget.TextView textView3 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bfe) : null;
        this.f324701h = textView3;
        if (textView3 != null) {
            int L = r26.n0.L(licenseDescStr, licenseContentStr, 0, false, 6, null);
            int length = licenseContentStr.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(licenseDescStr);
            spannableString.setSpan(new dt2.c(this), L, length, 33);
            textView3.setHighlightColor(getContext().getResources().getColor(android.R.color.transparent));
            textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView3.setText(spannableString);
        }
        android.view.View view = this.f324700g;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.bfc) : null;
        this.f324702i = button;
        if (button != null) {
            button.setOnClickListener(new dt2.a(this));
        }
        android.view.View view2 = this.f324700g;
        android.widget.Button button2 = view2 != null ? (android.widget.Button) view2.findViewById(com.p314xaae8f345.mm.R.id.bfd) : null;
        this.f324703m = button2;
        if (button2 != null) {
            button2.setOnClickListener(new dt2.b(this, callback));
        }
        if (z17) {
            android.view.View view3 = this.f324700g;
            android.view.View findViewById2 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.bfj) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view4 = findViewById2;
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.f324700g;
            if (view5 != null && (textView2 = (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.bfe)) != null) {
                textView2.setTextSize(1, 17.0f);
            }
            android.view.View view6 = this.f324700g;
            android.view.View findViewById3 = view6 != null ? view6.findViewById(com.p314xaae8f345.mm.R.id.bff) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view7 = findViewById3;
                yj0.a.d(view7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = this.f324700g;
            android.view.View findViewById4 = view8 != null ? view8.findViewById(com.p314xaae8f345.mm.R.id.bfg) : null;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view9 = this.f324700g;
            findViewById = view9 != null ? view9.findViewById(com.p314xaae8f345.mm.R.id.bfh) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view10 = this.f324700g;
            android.view.View findViewById5 = view10 != null ? view10.findViewById(com.p314xaae8f345.mm.R.id.bfj) : null;
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                android.view.View view11 = findViewById5;
                yj0.a.d(view11, arrayList5.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view12 = this.f324700g;
            if (view12 != null && (textView = (android.widget.TextView) view12.findViewById(com.p314xaae8f345.mm.R.id.bfe)) != null) {
                textView.setTextSize(1, 15.0f);
            }
            android.view.View view13 = this.f324700g;
            android.view.View findViewById6 = view13 != null ? view13.findViewById(com.p314xaae8f345.mm.R.id.bff) : null;
            if (findViewById6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                android.view.View view14 = findViewById6;
                yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view15 = this.f324700g;
            android.view.View findViewById7 = view15 != null ? view15.findViewById(com.p314xaae8f345.mm.R.id.bfg) : null;
            if (findViewById7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                android.view.View view16 = findViewById7;
                yj0.a.d(view16, arrayList7.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view17 = this.f324700g;
            findViewById = view17 != null ? view17.findViewById(com.p314xaae8f345.mm.R.id.bfh) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                android.view.View view18 = findViewById;
                yj0.a.d(view18, arrayList8.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.k(this.f324700g);
        y1Var.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8p);
        y1Var.s();
        this.f324704n = y1Var;
    }

    /* renamed from: getBottomSheet */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 m126190xb4dbbcbe() {
        return this.f324704n;
    }

    /* renamed from: getCancelBtn */
    public final android.widget.Button m126191x1bd4fecc() {
        return this.f324702i;
    }

    /* renamed from: getConfirmBtn */
    public final android.widget.Button m126192x20765f72() {
        return this.f324703m;
    }

    /* renamed from: getLicenseDesc */
    public final android.widget.TextView m126193xb399353c() {
        return this.f324701h;
    }

    /* renamed from: getObjId */
    public final long m126194x74e7fabc() {
        return this.f324699f;
    }

    /* renamed from: getRoot */
    public final android.view.View m126195xfb84e958() {
        return this.f324700g;
    }

    /* renamed from: setBottomSheet */
    public final void m126196x4b413032(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f324704n = y1Var;
    }

    /* renamed from: setCancelBtn */
    public final void m126197x7828bf40(android.widget.Button button) {
        this.f324702i = button;
    }

    /* renamed from: setConfirmBtn */
    public final void m126198x4e9aad7e(android.widget.Button button) {
        this.f324703m = button;
    }

    /* renamed from: setLicenseDesc */
    public final void m126199x49fea8b0(android.widget.TextView textView) {
        this.f324701h = textView;
    }

    /* renamed from: setRoot */
    public final void m126200x764fb064(android.view.View view) {
        this.f324700g = view;
    }
}
