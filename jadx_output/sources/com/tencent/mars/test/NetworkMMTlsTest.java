package com.tencent.mars.test;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/tencent/mars/test/NetworkMMTlsTest;", "Landroid/app/Activity;", "Landroid/view/View$OnClickListener;", "Ljz5/f0;", "openMMTls2", "closeMMTls2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onClick", "Landroid/widget/Button;", "bt_open_mmtls", "Landroid/widget/Button;", "getBt_open_mmtls", "()Landroid/widget/Button;", "setBt_open_mmtls", "(Landroid/widget/Button;)V", "bt_close_mmtls", "getBt_close_mmtls", "setBt_close_mmtls", "<init>", "()V", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class NetworkMMTlsTest extends com.tencent.mm.hellhoundlib.activities.HellActivity implements android.view.View.OnClickListener {
    public android.widget.Button bt_close_mmtls;
    public android.widget.Button bt_open_mmtls;

    private final void closeMMTls2() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setMMTlsHostInfo(new java.lang.String[0], new int[0]);
    }

    private final void openMMTls2() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setMMTlsHostInfo(new java.lang.String[]{"long.weixin.qq.com", "short.weixin.qq.com", "extshort.weixin.qq.com", "findershort.weixin.qq.com", "minorshort.weixin.qq.com", "axshort.weixin.qq.com"}, new int[]{1, 1, 1, 1, 1, 1});
    }

    public final android.widget.Button getBt_close_mmtls() {
        android.widget.Button button = this.bt_close_mmtls;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.o.o("bt_close_mmtls");
        throw null;
    }

    public final android.widget.Button getBt_open_mmtls() {
        android.widget.Button button = this.bt_open_mmtls;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.o.o("bt_open_mmtls");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.slk) {
            openMMTls2();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.slh) {
            closeMMTls2();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.ek9);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.slk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setBt_open_mmtls((android.widget.Button) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.slh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setBt_close_mmtls((android.widget.Button) findViewById2);
        getBt_open_mmtls().setOnClickListener(this);
        getBt_close_mmtls().setOnClickListener(this);
    }

    public final void setBt_close_mmtls(android.widget.Button button) {
        kotlin.jvm.internal.o.g(button, "<set-?>");
        this.bt_close_mmtls = button;
    }

    public final void setBt_open_mmtls(android.widget.Button button) {
        kotlin.jvm.internal.o.g(button, "<set-?>");
        this.bt_open_mmtls = button;
    }
}
