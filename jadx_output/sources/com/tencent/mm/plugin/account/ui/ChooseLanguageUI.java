package com.tencent.mm.plugin.account.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/ChooseLanguageUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes.dex */
public final class ChooseLanguageUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: f, reason: collision with root package name */
    public int f73268f;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f73266d = jz5.h.b(new com.tencent.mm.plugin.account.ui.w0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f73267e = jz5.h.b(new com.tencent.mm.plugin.account.ui.r0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f73269g = jz5.h.b(new com.tencent.mm.plugin.account.ui.s0(this));

    public final com.tencent.mm.ui.widget.picker.CustomOptionPickNew U6() {
        java.lang.Object value = ((jz5.n) this.f73266d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.picker.CustomOptionPickNew) value;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dpj;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        U6().getView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        U6().setOptionsArray((java.lang.String[]) v61.h0.f433443c.values().toArray(new java.lang.String[0]));
        U6().addView(U6().getView(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew U6 = U6();
        jz5.g gVar = this.f73269g;
        U6.c(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        this.f73268f = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        U6().setOnValueChangedListener(new com.tencent.mm.plugin.account.ui.t0(this));
        java.lang.Object value = ((jz5.n) this.f73267e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.button.WeButton) value).setOnClickListener(new com.tencent.mm.plugin.account.ui.v0(this));
    }
}
