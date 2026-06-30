package com.tencent.mm.feature.chatbot.brand.ui.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView;", "Landroid/widget/LinearLayout;", "Lxx/y;", "m", "Lxx/y;", "getBrandDataReporter", "()Lxx/y;", "setBrandDataReporter", "(Lxx/y;)V", "brandDataReporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CBTBrandLiveQueryListView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f65286d;

    /* renamed from: e, reason: collision with root package name */
    public zx.t f65287e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f65288f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f65289g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f65290h;

    /* renamed from: i, reason: collision with root package name */
    public int f65291i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public xx.y brandDataReporter;

    /* renamed from: n, reason: collision with root package name */
    public final zx.q f65293n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65294o;

    public CBTBrandLiveQueryListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65293n = new zx.a(this);
        this.f65294o = true;
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
    public final void a(androidx.recyclerview.widget.RecyclerView r10, zx.t r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView.a(androidx.recyclerview.widget.RecyclerView, zx.t, boolean):void");
    }

    public final void b() {
        android.view.View view = this.f65289g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView", "clearUnreadCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/feature/chatbot/brand/ui/view/CBTBrandLiveQueryListView", "clearUnreadCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f65291i = 0;
    }

    public final xx.y getBrandDataReporter() {
        return this.brandDataReporter;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gzh);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.content.Context context = linearLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int applyDimension = (int) android.util.TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        android.content.Context context2 = linearLayout.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        marginLayoutParams.setMargins(applyDimension, 0, (int) android.util.TypedValue.applyDimension(1, 20.0f, context2.getResources().getDisplayMetrics()), 0);
        linearLayout.setLayoutParams(marginLayoutParams);
        this.f65286d = linearLayout;
        this.f65288f = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.lq8);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.R(true);
        linearLayoutManager.S(false);
        this.f65290h = linearLayoutManager;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f65288f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        zx.t tVar = new zx.t(new java.util.ArrayList());
        this.f65287e = tVar;
        tVar.setHasStableIds(true);
        tVar.f476968g = new zx.e(tVar, this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f65288f;
        if (recyclerView2 != null) {
            recyclerView2.i(new zx.f(this, tVar));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f65288f;
        if (recyclerView3 != null) {
            recyclerView3.O(new zx.g(this, tVar));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f65288f;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(tVar);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.txl);
        this.f65289g = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new zx.h(this));
        }
    }

    public final void setBrandDataReporter(xx.y yVar) {
        this.brandDataReporter = yVar;
    }

    public CBTBrandLiveQueryListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f65293n = new zx.a(this);
        this.f65294o = true;
    }
}
