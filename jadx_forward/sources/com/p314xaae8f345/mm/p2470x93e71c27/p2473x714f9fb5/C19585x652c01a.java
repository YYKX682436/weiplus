package com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5;

/* renamed from: com.tencent.mm.pluginsdk.location.LocationView */
/* loaded from: classes5.dex */
public class C19585x652c01a extends android.widget.LinearLayout implements w25.h {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f270288y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f270289d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f270290e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f270291f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f270292g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f270293h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f270294i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f270295m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f270296n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f270297o;

    /* renamed from: p, reason: collision with root package name */
    public int f270298p;

    /* renamed from: q, reason: collision with root package name */
    public int f270299q;

    /* renamed from: r, reason: collision with root package name */
    public int f270300r;

    /* renamed from: s, reason: collision with root package name */
    public int f270301s;

    /* renamed from: t, reason: collision with root package name */
    public int f270302t;

    /* renamed from: u, reason: collision with root package name */
    public int f270303u;

    /* renamed from: v, reason: collision with root package name */
    public w25.g f270304v;

    /* renamed from: w, reason: collision with root package name */
    public final float f270305w;

    /* renamed from: x, reason: collision with root package name */
    public final float f270306x;

    public C19585x652c01a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // w25.h
    public void a(java.lang.String str, java.lang.String str2) {
        android.view.View view = this.f270296n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f270293h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270291f.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            mo57388x93bf3962(str);
        } else {
            mo57388x93bf3962(str2);
        }
        m75122xdafb9321(this.f270299q);
        m75120x93bcfb50(com.p314xaae8f345.mm.R.raw.f79787x448e46cd);
        m75121x3e8fd5f3(this.f270298p);
    }

    @Override // w25.h
    public void b(int i17) {
        this.f270294i.c(i17, this.f270302t);
        this.f270295m.setTextColor(this.f270303u);
    }

    @Override // w25.h
    public void c() {
        android.view.View view = this.f270296n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f270293h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // w25.h
    public void d() {
        android.view.View view = this.f270296n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f270293h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270291f.setVisibility(8);
        mo57388x93bf3962(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggh));
        this.f270289d.m82040x7541828(this.f270300r);
        this.f270290e.setTextColor(this.f270301s);
        m75120x93bcfb50(com.p314xaae8f345.mm.R.raw.f80155x9d99890d);
    }

    @Override // w25.h
    public void e(int i17, float f17) {
        this.f270290e.setTextSize(i17, f17);
    }

    /* renamed from: getLocation */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19583x752a03d5 m75119xed29dd2b() {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19583x752a03d5(this.f270305w, this.f270306x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // w25.h
    /* renamed from: setDefaultLoadingPBarColor */
    public void mo57377x3f69f363(int i17) {
        this.f270302t = i17;
    }

    @Override // w25.h
    /* renamed from: setDefaultLoadingTipColor */
    public void mo57378xa6b17b65(int i17) {
        this.f270303u = i17;
    }

    @Override // w25.h
    /* renamed from: setDefaultStateIconColor */
    public void mo57379x8a507638(int i17) {
        this.f270300r = i17;
    }

    @Override // w25.h
    /* renamed from: setDefaultStateTextColor */
    public void mo57380x9f58be04(int i17) {
        this.f270301s = i17;
    }

    @Override // w25.h
    /* renamed from: setIconColor */
    public void mo57381x7541828(int i17) {
        this.f270298p = i17;
    }

    /* renamed from: setLocationIcon */
    public void m75120x93bcfb50(int i17) {
        this.f270289d.setImageResource(i17);
    }

    /* renamed from: setLocationIconColor */
    public void m75121x3e8fd5f3(int i17) {
        this.f270289d.m82040x7541828(i17);
    }

    @Override // w25.h
    /* renamed from: setLocationName */
    public void mo57388x93bf3962(java.lang.String str) {
        this.f270290e.setText(str);
    }

    /* renamed from: setLocationNameColor */
    public void m75122xdafb9321(int i17) {
        this.f270290e.setTextColor(i17);
    }

    @Override // w25.h
    /* renamed from: setLocationRightTips */
    public void mo57391x35760afd(java.lang.String str) {
        this.f270292g.setText(str);
        this.f270292g.setVisibility(0);
    }

    /* renamed from: setLocationTipColor */
    public void m75123xdecc22df(int i17) {
        this.f270291f.setTextColor(i17);
    }

    /* renamed from: setLocationTips */
    public void m75124x93c2120f(java.lang.String str) {
        this.f270291f.setText(str);
        this.f270291f.setVisibility(0);
    }

    @Override // w25.h
    /* renamed from: setOnClickLocationListener */
    public void mo57396x23417dd0(w25.g gVar) {
        this.f270304v = gVar;
    }

    @Override // w25.h
    /* renamed from: setSuggestView */
    public void mo57397x15487687(java.lang.String str) {
        android.view.View view = this.f270296n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f270293h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270291f.setVisibility(0);
        mo57388x93bf3962(str);
        m75122xdafb9321(this.f270299q);
        m75120x93bcfb50(com.p314xaae8f345.mm.R.raw.f79787x448e46cd);
        m75121x3e8fd5f3(this.f270298p);
    }

    @Override // w25.h
    /* renamed from: setTextColor */
    public void mo57398x1c5c5ff4(int i17) {
        this.f270299q = i17;
    }

    public C19585x652c01a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f270305w = -85.0f;
        this.f270306x = -1000.0f;
        this.f270297o = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bsn, this);
        this.f270289d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.in7);
        this.f270290e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.inn);
        this.f270291f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ino);
        this.f270292g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qup);
        this.f270293h = findViewById(com.p314xaae8f345.mm.R.id.inf);
        this.f270294i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById(com.p314xaae8f345.mm.R.id.inz);
        this.f270295m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567224io0);
        this.f270296n = findViewById(com.p314xaae8f345.mm.R.id.ink);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        this.f270297o.setOnClickListener(new w25.l(this));
        mo57398x1c5c5ff4(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        mo57381x7541828(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        mo57379x8a507638(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        mo57380x9f58be04(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        mo57377x3f69f363(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        mo57378xa6b17b65(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
    }
}
