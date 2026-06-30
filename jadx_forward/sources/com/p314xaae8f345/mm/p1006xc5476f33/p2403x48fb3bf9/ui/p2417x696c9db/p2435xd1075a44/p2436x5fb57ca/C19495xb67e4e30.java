package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid */
/* loaded from: classes8.dex */
public class C19495xb67e4e30 extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public ey4.y f268845d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.c0 f268846e;

    /* renamed from: f, reason: collision with root package name */
    public int f268847f;

    /* renamed from: g, reason: collision with root package name */
    public int f268848g;

    /* renamed from: h, reason: collision with root package name */
    public int f268849h;

    /* renamed from: i, reason: collision with root package name */
    public int f268850i;

    /* renamed from: m, reason: collision with root package name */
    public int f268851m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f268852n;

    public C19495xb67e4e30(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268848g = 0;
        this.f268850i = 0;
        this.f268851m = 0;
        this.f268852n = new ey4.x(this);
    }

    /* renamed from: getRowSpacing */
    private int m74843x359690ff() {
        return this.f268850i;
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29) {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackgroundResource(0);
        setStretchMode(2);
        setOnItemClickListener(this.f268852n);
        this.f268849h = i17;
        this.f268847f = i18;
        this.f268848g = i19;
        this.f268850i = i29;
        this.f268851m = i28;
        setNumColumns(i27);
        int m74843x359690ff = m74843x359690ff();
        int b17 = i65.a.b(getContext(), 6);
        int b18 = i65.a.b(getContext(), 6);
        if (m74843x359690ff == 0) {
            m74843x359690ff = i65.a.b(getContext(), 6);
        }
        setPadding(b17, m74843x359690ff, b18, 0);
        ey4.y yVar = new ey4.y(this, null);
        this.f268845d = yVar;
        setAdapter((android.widget.ListAdapter) yVar);
        this.f268845d.notifyDataSetChanged();
    }

    /* renamed from: setPanelManager */
    public void m74844x3e2a9e8b(ey4.c0 c0Var) {
        this.f268846e = c0Var;
    }
}
