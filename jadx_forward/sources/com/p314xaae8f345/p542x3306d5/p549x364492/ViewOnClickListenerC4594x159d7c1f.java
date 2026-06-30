package com.p314xaae8f345.p542x3306d5.p549x364492;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/tencent/mars/test/NetworkMMTlsTest;", "Landroid/app/Activity;", "Landroid/view/View$OnClickListener;", "Ljz5/f0;", "openMMTls2", "closeMMTls2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onClick", "Landroid/widget/Button;", "bt_open_mmtls", "Landroid/widget/Button;", "getBt_open_mmtls", "()Landroid/widget/Button;", "setBt_open_mmtls", "(Landroid/widget/Button;)V", "bt_close_mmtls", "getBt_close_mmtls", "setBt_close_mmtls", "<init>", "()V", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mars.test.NetworkMMTlsTest */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC4594x159d7c1f extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements android.view.View.OnClickListener {
    public android.widget.Button bt_close_mmtls;
    public android.widget.Button bt_open_mmtls;

    /* renamed from: closeMMTls2 */
    private final void m40485xfddf904f() {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40267xa51e01af(new java.lang.String[0], new int[0]);
    }

    /* renamed from: openMMTls2 */
    private final void m40486x856d321() {
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40267xa51e01af(new java.lang.String[]{"long.weixin.qq.com", "short.weixin.qq.com", "extshort.weixin.qq.com", "findershort.weixin.qq.com", "minorshort.weixin.qq.com", "axshort.weixin.qq.com"}, new int[]{1, 1, 1, 1, 1, 1});
    }

    /* renamed from: getBt_close_mmtls */
    public final android.widget.Button m40487x722f82dd() {
        android.widget.Button button = this.bt_close_mmtls;
        if (button != null) {
            return button;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bt_close_mmtls");
        throw null;
    }

    /* renamed from: getBt_open_mmtls */
    public final android.widget.Button m40488xf1c1f77d() {
        android.widget.Button button = this.bt_open_mmtls;
        if (button != null) {
            return button;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bt_open_mmtls");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.slk) {
            m40486x856d321();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.slh) {
            m40485xfddf904f();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.ek9);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.slk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m40490x84985df1((android.widget.Button) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.slh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m40489x3a25eae9((android.widget.Button) findViewById2);
        m40488xf1c1f77d().setOnClickListener(this);
        m40487x722f82dd().setOnClickListener(this);
    }

    /* renamed from: setBt_close_mmtls */
    public final void m40489x3a25eae9(android.widget.Button button) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(button, "<set-?>");
        this.bt_close_mmtls = button;
    }

    /* renamed from: setBt_open_mmtls */
    public final void m40490x84985df1(android.widget.Button button) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(button, "<set-?>");
        this.bt_open_mmtls = button;
    }
}
