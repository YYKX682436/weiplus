package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin;", "Landroid/widget/RelativeLayout;", "Lr45/of1;", "aliasInfo", "Ljz5/f0;", "setVisitorRole", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin */
/* loaded from: classes3.dex */
public final class C14274x56897b10 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f193301e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f193302f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f193303g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f193304h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f193305i;

    /* renamed from: m, reason: collision with root package name */
    public bm2.h8 f193306m;

    public C14274x56897b10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "FinderLiveVisitorRoleChooserPlugin";
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setVisitorRole */
    public final void m56893x3608fc42(r45.of1 of1Var) {
        int m75939xb282bd08 = of1Var.m75939xb282bd08(2);
        int m75939xb282bd082 = g92.b.f351302e.k2().m75939xb282bd08(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "setVisitorRole chooseType:" + m75939xb282bd08 + ", curRoleType:" + m75939xb282bd082);
        if (m75939xb282bd08 != m75939xb282bd082) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            new ke2.m0(xy2.c.e(context), m75939xb282bd08, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ao0(this, m75939xb282bd08), 12, null).l();
        }
        yz5.l lVar = this.f193304h;
        if (lVar != null) {
            b(false);
            lVar.mo146xb9724478(java.lang.Integer.valueOf(m75939xb282bd08));
            this.f193304h = null;
        }
    }

    public final void b(boolean z17) {
        android.content.Context context;
        java.lang.Integer num;
        if (!z17) {
            android.content.Context context2 = getContext();
            context = context2 instanceof android.app.Activity ? context2 : null;
            if (context == null || (num = this.f193305i) == null) {
                return;
            }
            int intValue = num.intValue();
            android.view.Window window = ((android.app.Activity) context).getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            window.setStatusBarColor(intValue);
            return;
        }
        android.content.Context context3 = getContext();
        context = context3 instanceof android.app.Activity ? context3 : null;
        if (context != null) {
            android.view.Window window2 = ((android.app.Activity) context).getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window2, "getWindow(...)");
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                window2.setStatusBarColor(android.graphics.Color.parseColor("#05FFFFFF"));
            } else {
                window2.setStatusBarColor(android.graphics.Color.parseColor("#05000000"));
            }
        }
    }

    public final void c() {
        setId(com.p314xaae8f345.mm.R.id.f565971ea4);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1a, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) inflate.findViewById(com.p314xaae8f345.mm.R.id.p4a);
        this.f193301e = c22613xe7040d9c;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(inflate.getContext()).y);
            c22613xe7040d9c.m81307xf9cef5a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bo0.f193596d);
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.asv);
        this.f193302f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.co0(this));
        }
        this.f193303g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.p4b);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5w);
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.do0(this));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(textView.getContext());
            }
        }
        bm2.h8 h8Var = new bm2.h8();
        this.f193306m = h8Var;
        h8Var.f103484d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eo0(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f193303g;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 1, false));
            c1163xf1deaba4.mo7960x6cab2c8d(this.f193306m);
        }
        android.content.Context context = getContext();
        if (!(context instanceof android.app.Activity)) {
            context = null;
        }
        this.f193305i = context != null ? java.lang.Integer.valueOf(((android.app.Activity) context).getWindow().getStatusBarColor()) : null;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public C14274x56897b10(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.TAG = "FinderLiveVisitorRoleChooserPlugin";
        c();
    }
}
