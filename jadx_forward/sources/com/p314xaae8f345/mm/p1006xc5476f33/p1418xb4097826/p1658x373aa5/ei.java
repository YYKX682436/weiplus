package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ei extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f213540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f213541c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213542d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f213543e;

    /* renamed from: f, reason: collision with root package name */
    public final long f213544f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f213545g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f213546h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f213547i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f213548j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f213549k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f213550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(android.content.Context context, long j17, java.lang.String str, int i17, java.util.Map map, java.lang.String str2, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        java.lang.String bypassData = (i18 & 32) != 0 ? "" : str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i18 & 128) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        this.f213540b = context;
        this.f213541c = j17;
        this.f213542d = str;
        this.f213543e = map;
        this.f213544f = j18;
        this.f213548j = new java.util.ArrayList();
        this.f213549k = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570312ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderProductFeedbackWindow$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62354xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei eiVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ei.this;
                    eiVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) eiVar.f213540b).mo273xed6858b4().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f213545g = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f213546h = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f213547i = textView3;
        textView.setVisibility(8);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575294oy5));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) getContentView().findViewById(com.p314xaae8f345.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.p314xaae8f345.mm.R.id.e0j)).setVisibility(8);
        c21475x81dbaa18.removeAllViews();
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575291oy2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.View a17 = a(string, 1);
        c21475x81dbaa18.addView(a17);
        a17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xh(a17, this));
        hc2.v0.e(a17, "product_feed_good", 40, 0, false, false, map, null, 92, null);
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575289oy0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        android.view.View a18 = a(string2, 0);
        c21475x81dbaa18.addView(a18);
        a18.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yh(a18, this));
        hc2.v0.e(a18, "product_feed_nointerest", 40, 0, false, false, map, null, 92, null);
        if (findViewById4 != null) {
            android.widget.TextView textView4 = (android.widget.TextView) findViewById4.findViewById(com.p314xaae8f345.mm.R.id.tya);
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575292oy3));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zh(this));
            hc2.v0.e(findViewById4, "product_complaint", 40, 0, false, false, map, null, 92, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        new db2.w(j17, str, 8, nyVar != null ? nyVar.V6() : null, null, false, 0, gVar2, 48, null).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ai(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f213540b;
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

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f213540b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
    }
}
