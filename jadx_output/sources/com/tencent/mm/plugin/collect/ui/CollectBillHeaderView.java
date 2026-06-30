package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class CollectBillHeaderView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f96339d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f96340e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f96341f;

    public CollectBillHeaderView(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488630z0, this);
        this.f96339d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c1o);
        this.f96340e = (com.tencent.mm.wallet_core.ui.WalletTextView) inflate.findViewById(com.tencent.mm.R.id.c1q);
        this.f96341f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c1p);
    }

    public CollectBillHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public CollectBillHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
