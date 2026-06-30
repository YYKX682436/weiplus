package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class AppBrandMenuHeader extends android.widget.LinearLayout {
    public static final l01.o0 G = new l01.o0(i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1.8f), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 18));
    public androidx.recyclerview.widget.RecyclerView A;
    public android.widget.LinearLayout B;
    public androidx.recyclerview.widget.RecyclerView C;
    public androidx.recyclerview.widget.RecyclerView D;
    public androidx.recyclerview.widget.RecyclerView E;
    public java.lang.Boolean F;

    /* renamed from: d, reason: collision with root package name */
    public final im5.c f86347d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f86348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86349f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f86350g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f86351h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f86352i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f86353m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f86354n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f86355o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f86356p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f86357q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f86358r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f86359s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f86360t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f86361u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f86362v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f86363w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f86364x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f86365y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f86366z;

    public AppBrandMenuHeader(android.content.Context context) {
        super(context);
        this.f86347d = new im5.c();
        this.f86348e = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488051fi, this);
    }

    public final void a(boolean z17) {
        if (z17) {
            this.f86350g.setVisibility(0);
            this.f86351h.setVisibility(8);
        } else {
            this.f86350g.setVisibility(8);
            this.f86351h.setVisibility(0);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317016c = 0;
        b1Var.f317022f = str2 + "?" + str3;
        b1Var.f317032k = 1246;
        b1Var.f317024g = true;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), b1Var);
    }

    public final boolean c(r45.y9 y9Var) {
        r45.v9 v9Var;
        java.util.LinkedList linkedList;
        return (y9Var == null || (v9Var = y9Var.f390876g) == null || (linkedList = v9Var.f387994d) == null || linkedList.isEmpty()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f86347d.dead();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0470, code lost:
    
        if (z65.c.a() != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0602  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPage(com.tencent.mm.plugin.appbrand.page.n7 r29) {
        /*
            Method dump skipped, instructions count: 1783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.setPage(com.tencent.mm.plugin.appbrand.page.n7):void");
    }

    public AppBrandMenuHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86347d = new im5.c();
        this.f86348e = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488051fi, this);
    }
}
