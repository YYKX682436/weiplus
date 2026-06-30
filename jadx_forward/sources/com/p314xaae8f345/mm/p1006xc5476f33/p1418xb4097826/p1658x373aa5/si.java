package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class si extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f214573b;

    /* renamed from: c, reason: collision with root package name */
    public final long f214574c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f214575d;

    /* renamed from: e, reason: collision with root package name */
    public final long f214576e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qy0 f214577f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f214578g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f214579h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f214580i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f214581j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f214582k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f214583l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(android.content.Context context, long j17, java.lang.String str, long j18, int i17, r45.qy0 promotionInfo, yz5.l lVar) {
        super(context);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promotionInfo, "promotionInfo");
        this.f214573b = context;
        this.f214574c = j17;
        this.f214575d = str;
        this.f214576e = j18;
        this.f214577f = promotionInfo;
        this.f214578g = lVar;
        this.f214582k = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570312ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderPromotionFeedbackWindow$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62358xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si.this;
                    siVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) siVar.f214573b).mo273xed6858b4().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f214579h = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f214580i = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f214581j = textView3;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cp6));
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572835cp4));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) getContentView().findViewById(com.p314xaae8f345.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0j)).setVisibility(8);
        java.lang.String m75945x2fec8307 = promotionInfo.m75945x2fec8307(3);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) promotionInfo.m75936x14adae67(2)) != null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.c74 c74Var = (r45.c74) ((r45.wf6) obj).m75936x14adae67(5);
                if ((c74Var != null ? c74Var.m75945x2fec8307(1) : null) != null) {
                    break;
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null) {
                java.lang.CharSequence text = textView.getText();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(text, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) text;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str2);
                r45.c74 c74Var2 = (r45.c74) wf6Var.m75936x14adae67(5);
                sb6.append(c74Var2 != null ? c74Var2.m75945x2fec8307(1) : null);
                android.text.SpannableString spannableString = new android.text.SpannableString(sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mi miVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mi(this, c19786x6a1e2862);
                android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                spannableString.setSpan(miVar, str2.length(), spannableString.length(), 33);
                spannableString.setSpan(foregroundColorSpan, str2.length(), spannableString.length(), 33);
                textView.setText(spannableString);
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        c21475x81dbaa18.removeAllViews();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572833cp2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.View a17 = a(string, 1);
        c21475x81dbaa18.addView(a17);
        a17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oi(a17, this));
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572831cp0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        android.view.View a18 = a(string2, 0);
        c21475x81dbaa18.addView(a18);
        a18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pi(a18, this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.li(this));
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f214573b;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ady, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        if (i17 == 0) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79139xd0065291));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else if (i17 != 1) {
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79138x48487796));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        textView.setText(str);
        return inflate;
    }

    public final void b(android.widget.TextView textView) {
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f214582k);
        android.content.Context context = this.f214573b;
        if (L0) {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.coz));
            textView.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.coy));
            textView.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f214573b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
    }
}
