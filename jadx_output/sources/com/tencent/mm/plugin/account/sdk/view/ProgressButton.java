package com.tencent.mm.plugin.account.sdk.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/account/sdk/view/ProgressButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "account-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ProgressButton extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f73192v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ProgressBar f73193w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f73194x;

    /* renamed from: y, reason: collision with root package name */
    public int f73195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f73195y = -1;
        android.view.View.inflate(context, com.tencent.mm.R.layout.dy8, this);
        this.f73192v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.snv);
        this.f73193w = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lbl);
    }

    public final void A(boolean z17) {
        android.widget.ProgressBar progressBar = this.f73193w;
        if (progressBar != null) {
            progressBar.setVisibility(z17 ? 0 : 8);
        }
        this.f73194x = z17;
    }

    public final void B(int i17) {
        int i18 = this.f73195y;
        android.widget.TextView textView = this.f73192v;
        if (i18 != -1) {
            if (textView != null) {
                textView.setText(i18);
            }
        } else if (textView != null) {
            textView.setText(i17);
        }
    }

    public final void C(int i17, boolean z17) {
        android.widget.TextView textView = this.f73192v;
        if (textView != null) {
            textView.setText(i17);
        }
        if (z17) {
            this.f73195y = i17;
        }
    }
}
