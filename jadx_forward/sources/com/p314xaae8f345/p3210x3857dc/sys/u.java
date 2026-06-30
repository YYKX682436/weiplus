package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class u extends android.webkit.WebView {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.sys.v f302106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.p3210x3857dc.sys.v vVar, android.content.Context context) {
        super(context);
        this.f302106d = vVar;
    }

    public int a() {
        return computeVerticalScrollRange();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302106d;
            if (vVar.f302120s) {
                vVar.m();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        int contentHeight = getContentHeight();
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302106d;
        if (contentHeight != vVar.f302117p) {
            vVar.f302117p = contentHeight;
            if (vVar.f302112h != null) {
                by5.c4.f("SysWebView", "onContentHeightChanged, height:" + contentHeight);
                vVar.f302112h.b(contentHeight);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        super.onOverScrolled(i17, i18, z17, z18);
        com.p314xaae8f345.p3210x3857dc.g1 g1Var = this.f302106d.f302112h;
        if (g1Var != null) {
            g1Var.e(i17, i18, z17, z18, this);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p3210x3857dc.sys.v vVar = this.f302106d;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = vVar.f302108d;
        if (c27816xac2547f9 != null) {
            c27816xac2547f9.A0(i17, i18, i19, i27);
        }
        com.p314xaae8f345.p3210x3857dc.g1 g1Var = vVar.f302112h;
        if (g1Var != null) {
            g1Var.d(i17, i18, i19, i27, this);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        com.p314xaae8f345.p3210x3857dc.g1 g1Var = this.f302106d.f302112h;
        if (g1Var != null) {
            g1Var.a(i17, i18, i19, i27, i28, i29, i37, i38, z17, this);
        }
        return super.overScrollBy(i17, i18, i19, i27, i28, i29, i37, i38, z17);
    }
}
