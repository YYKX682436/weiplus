package com.p314xaae8f345.mm.ui.p2736xc9fa65a8;

/* renamed from: com.tencent.mm.ui.search.FTSSearchView */
/* loaded from: classes2.dex */
public class C22482x50bddb92 extends android.widget.LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f291367q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f291368d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f291369e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f291370f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f291371g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f291372h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f291373i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f291374m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f291375n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f291376o;

    /* renamed from: p, reason: collision with root package name */
    public tj5.w f291377p;

    public C22482x50bddb92(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291376o = false;
        a();
    }

    public final void a() {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        boolean z17 = this.f291376o;
        layoutInflater.inflate(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.bbq : com.p314xaae8f345.mm.R.C30864xbddafb2a.bbp, (android.view.ViewGroup) this, true);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.mdr);
        this.f291370f = linearLayout;
        if (z17) {
            linearLayout.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        }
        this.f291371g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h1e);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f291368d = textView;
        textView.setOnClickListener(new tj5.q(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.meb);
        this.f291375n = c22699x3dcdb352;
        c22699x3dcdb352.setVisibility(z17 ? 8 : 0);
        this.f291372h = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) findViewById(com.p314xaae8f345.mm.R.id.gfl);
        if (this.f291374m) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gfn);
            this.f291373i = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/search/FTSSearchView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/search/FTSSearchView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f291373i.setOnClickListener(new tj5.r(this));
        }
        this.f291375n.setOnClickListener(new tj5.s(this));
    }

    /* renamed from: getFtsEditText */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6() {
        return this.f291372h;
    }

    /* renamed from: getSearchContainer */
    public android.widget.LinearLayout m80998x5c6eb583() {
        return this.f291370f;
    }

    /* renamed from: getSearchIcon */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m80999xc3e2ba37() {
        return this.f291375n;
    }

    /* renamed from: setCancelBtnVisible */
    public void m81000x2a82112(int i17) {
        android.widget.TextView textView = this.f291368d;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    /* renamed from: setImageSearchListener */
    public void m81001xe1e7cf5(tj5.v vVar) {
    }

    /* renamed from: setSearchViewListener */
    public void m81002xcd6a5043(tj5.w wVar) {
        this.f291377p = wVar;
    }

    public C22482x50bddb92(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291376o = false;
        a();
    }

    public C22482x50bddb92(android.content.Context context, boolean z17) {
        super(context);
        this.f291376o = false;
        this.f291374m = z17;
        a();
    }

    public C22482x50bddb92(android.content.Context context, boolean z17, boolean z18) {
        super(context);
        this.f291376o = false;
        this.f291374m = z17;
        this.f291376o = z18;
        a();
    }
}
