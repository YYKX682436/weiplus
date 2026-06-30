package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class m6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f72738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f72739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f72740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, android.widget.TextView textView, android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableStringBuilder spannableStringBuilder2) {
        super(false);
        this.f72738d = textView;
        this.f72739e = spannableStringBuilder;
        this.f72740f = spannableStringBuilder2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        boolean isSelected = view.isSelected();
        android.widget.TextView textView = this.f72738d;
        if (isSelected) {
            textView.setText(this.f72739e);
            textView.setSelected(false);
        } else {
            textView.setText(this.f72740f);
            textView.setSelected(true);
        }
    }
}
