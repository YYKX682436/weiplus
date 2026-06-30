package com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView;", "Landroid/widget/LinearLayout;", "Lxx/y;", "m", "Lxx/y;", "getBrandDataReporter", "()Lxx/y;", "setBrandDataReporter", "(Lxx/y;)V", "brandDataReporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView */
/* loaded from: classes14.dex */
public final class C10501xa4ff92d extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f146819d;

    /* renamed from: e, reason: collision with root package name */
    public zx.t f146820e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f146821f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f146822g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f146823h;

    /* renamed from: i, reason: collision with root package name */
    public int f146824i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public xx.y brandDataReporter;

    /* renamed from: n, reason: collision with root package name */
    public final zx.q f146826n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f146827o;

    public C10501xa4ff92d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146826n = new zx.a(this);
        this.f146827o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r10, zx.t r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.p715x373aa5.C10501xa4ff92d.a(androidx.recyclerview.widget.RecyclerView, zx.t, boolean):void");
    }

    public final void b() {
        android.view.View view = this.f146822g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView", "clearUnreadCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView", "clearUnreadCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f146824i = 0;
    }

    public final xx.y getBrandDataReporter() {
        return this.brandDataReporter;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gzh);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.content.Context context = linearLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        android.content.Context context2 = linearLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        marginLayoutParams.setMargins(applyDimension, 0, (int) android.util.TypedValue.applyDimension(1, 20.0f, context2.getResources().getDisplayMetrics()), 0);
        linearLayout.setLayoutParams(marginLayoutParams);
        this.f146819d = linearLayout;
        this.f146821f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.lq8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext());
        c1162x665295de.R(true);
        c1162x665295de.S(false);
        this.f146823h = c1162x665295de;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f146821f;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        }
        zx.t tVar = new zx.t(new java.util.ArrayList());
        this.f146820e = tVar;
        tVar.mo8164xbbdced85(true);
        tVar.f558501g = new zx.e(tVar, this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f146821f;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.i(new zx.f(this, tVar));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f146821f;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.O(new zx.g(this, tVar));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f146821f;
        if (c1163xf1deaba44 != null) {
            c1163xf1deaba44.mo7960x6cab2c8d(tVar);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.txl);
        this.f146822g = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new zx.h(this));
        }
    }

    /* renamed from: setBrandDataReporter */
    public final void m44094x6d80f90(xx.y yVar) {
        this.brandDataReporter = yVar;
    }

    public C10501xa4ff92d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f146826n = new zx.a(this);
        this.f146827o = true;
    }
}
