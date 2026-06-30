package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class m6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f154271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f154272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f154273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda, android.widget.TextView textView, android.text.SpannableStringBuilder spannableStringBuilder, android.text.SpannableStringBuilder spannableStringBuilder2) {
        super(false);
        this.f154271d = textView;
        this.f154272e = spannableStringBuilder;
        this.f154273f = spannableStringBuilder2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        boolean isSelected = view.isSelected();
        android.widget.TextView textView = this.f154271d;
        if (isSelected) {
            textView.setText(this.f154272e);
            textView.setSelected(false);
        } else {
            textView.setText(this.f154273f);
            textView.setSelected(true);
        }
    }
}
