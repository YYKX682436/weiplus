package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/account/sdk/view/ProgressButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "account-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.sdk.view.ProgressButton */
/* loaded from: classes14.dex */
public final class C11389x36418bdf extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f154725v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ProgressBar f154726w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f154727x;

    /* renamed from: y, reason: collision with root package name */
    public int f154728y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11389x36418bdf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f154728y = -1;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dy8, this);
        this.f154725v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.snv);
        this.f154726w = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lbl);
    }

    public final void A(boolean z17) {
        android.widget.ProgressBar progressBar = this.f154726w;
        if (progressBar != null) {
            progressBar.setVisibility(z17 ? 0 : 8);
        }
        this.f154727x = z17;
    }

    public final void B(int i17) {
        int i18 = this.f154728y;
        android.widget.TextView textView = this.f154725v;
        if (i18 != -1) {
            if (textView != null) {
                textView.setText(i18);
            }
        } else if (textView != null) {
            textView.setText(i17);
        }
    }

    public final void C(int i17, boolean z17) {
        android.widget.TextView textView = this.f154725v;
        if (textView != null) {
            textView.setText(i17);
        }
        if (z17) {
            this.f154728y = i17;
        }
    }
}
