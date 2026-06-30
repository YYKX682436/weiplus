package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse */
/* loaded from: classes13.dex */
public class ActivityC17935xc808f2 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
        super.onCreate(bundle);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        addContentView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.ScrollView scrollView = new android.widget.ScrollView(this);
        scrollView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.addView(scrollView);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this);
        linearLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        scrollView.addView(linearLayout2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3 c17991xb1b018e3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3(this);
        c17991xb1b018e3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        c17991xb1b018e3.m70675x81d1ff53("...");
        c17991xb1b018e3.m70676x3f70cd48(" Read More!");
        c17991xb1b018e3.m70679x765074af("This is some short text. It won't need to be ellipsized.");
        c17991xb1b018e3.m70677x8dd5167d(3);
        c17991xb1b018e3.setPadding(10, 10, 10, 10);
        c17991xb1b018e3.setBackgroundColor(-1786127);
        linearLayout2.addView(c17991xb1b018e3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3 c17991xb1b018e32 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3(this);
        c17991xb1b018e32.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        c17991xb1b018e32.m70675x81d1ff53("...");
        c17991xb1b018e32.m70676x3f70cd48(" Read More!");
        c17991xb1b018e32.m70677x8dd5167d(3);
        c17991xb1b018e32.m70679x765074af("This is some longer text. It should wrap and then eventually be ellipsized once it gets way too long for the horizontal width of the current application screen. We should be fixed to max [N] lines height.");
        c17991xb1b018e32.setPadding(10, 10, 10, 10);
        c17991xb1b018e32.setBackgroundColor(-204878);
        c17991xb1b018e32.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a(this, c17991xb1b018e32));
        linearLayout2.addView(c17991xb1b018e32);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
    }
}
