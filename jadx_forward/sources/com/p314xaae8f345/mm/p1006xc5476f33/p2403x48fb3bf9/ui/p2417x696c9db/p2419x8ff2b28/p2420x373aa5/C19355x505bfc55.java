package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView;", "Landroid/widget/RelativeLayout;", "Lix4/b;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setBrowserSettingDialogClickListener", "", "Lhx4/x;", "dataList", "setBrowserList", "", ya.b.f77479x42930b2, "setSelectedBrowser", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lx4/m", "lx4/n", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView */
/* loaded from: classes8.dex */
public final class C19355x505bfc55 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f265544d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f265545e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f265546f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f265547g;

    /* renamed from: h, reason: collision with root package name */
    public lx4.m f265548h;

    /* renamed from: i, reason: collision with root package name */
    public lx4.a f265549i;

    /* renamed from: m, reason: collision with root package name */
    public ix4.b f265550m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f265551n;

    /* renamed from: o, reason: collision with root package name */
    public int f265552o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19355x505bfc55(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setBrowserList */
    public final void m74430x42053624(java.util.List<hx4.x> list) {
        if (list == null) {
            return;
        }
        java.util.List dataList = this.f265551n;
        ((java.util.ArrayList) dataList).clear();
        ((java.util.ArrayList) dataList).add(0, new hx4.x(2));
        ((java.util.ArrayList) dataList).addAll(list);
        lx4.m mVar = this.f265548h;
        if (mVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            java.util.ArrayList arrayList = mVar.f403681e;
            arrayList.clear();
            arrayList.addAll(dataList);
        }
    }

    /* renamed from: setBrowserSettingDialogClickListener */
    public final void m74431xb9f3e28a(ix4.b bVar) {
        this.f265550m = bVar;
    }

    /* renamed from: setSelectedBrowser */
    public final void m74432x28c274b(int i17) {
        if (i17 < 0) {
            this.f265552o = 0;
        } else {
            this.f265552o = i17 + 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19355x505bfc55(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f265551n = new java.util.ArrayList();
        this.f265552o = -1;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnx, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f265544d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f265547g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f265546f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f265545e = (android.widget.TextView) findViewById4;
        android.widget.TextView textView = this.f265544d;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            this.f265548h = new lx4.m(this, context);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f265547g;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.m7964x8d4ad49c(null);
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
                c1163xf1deaba4.mo7960x6cab2c8d(this.f265548h);
                c1163xf1deaba4.setOverScrollMode(2);
                c1163xf1deaba4.setVerticalFadingEdgeEnabled(false);
                c1163xf1deaba4.setNestedScrollingEnabled(false);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(context, 1);
                i0Var.d(new lx4.o(c1163xf1deaba4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560431k7)));
                c1163xf1deaba4.N(i0Var);
                if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf c12697x85b15aaf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) c1163xf1deaba4;
                    c12697x85b15aaf.m52925x25bfb969((((int) ((i65.a.k(context) * 3.0f) / 4.0f)) - c12697x85b15aaf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)) - c12697x85b15aaf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by));
                }
                android.widget.TextView textView2 = this.f265546f;
                if (textView2 != null) {
                    textView2.setOnClickListener(new lx4.q(this));
                    android.widget.TextView textView3 = this.f265545e;
                    if (textView3 != null) {
                        textView3.setOnClickListener(new lx4.p(this));
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
                        throw null;
                    }
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("browserRecyclerView");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogTitle");
        throw null;
    }
}
