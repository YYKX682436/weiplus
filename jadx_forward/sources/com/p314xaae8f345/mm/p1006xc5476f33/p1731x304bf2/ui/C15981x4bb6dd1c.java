package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageListUserIconView */
/* loaded from: classes8.dex */
public class C15981x4bb6dd1c extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222460d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1 f222461e;

    /* renamed from: f, reason: collision with root package name */
    public kk.j f222462f;

    public C15981x4bb6dd1c(android.content.Context context) {
        super(context);
        this.f222460d = context;
        if (this.f222461e == null) {
            this.f222461e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1(context);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f222461e == null) {
            this.f222461e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1(this.f222460d);
        }
    }

    /* renamed from: setSourceScene */
    public void m64770x6a7f536f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1 g1Var = this.f222461e;
        if (g1Var != null) {
            g1Var.f221851d = i17;
        } else {
            this.f222461e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1(this.f222460d, i17);
        }
    }

    public C15981x4bb6dd1c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222460d = context;
        if (this.f222461e == null) {
            this.f222461e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g1(context);
        }
    }
}
