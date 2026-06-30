package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedModuleTitle */
/* loaded from: classes8.dex */
public class C15962xc18ff45c extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f222337d;

    public C15962xc18ff45c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222337d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gl6);
    }

    /* renamed from: setData */
    public void m64748x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        if (cVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f221770c)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f222337d.setText(cVar.f221770c);
        }
    }
}
