package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3 f249229d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17935xc808f2 activityC17935xc808f2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3 c17991xb1b018e3) {
        this.f249229d = c17991xb1b018e3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17991xb1b018e3 c17991xb1b018e3 = this.f249229d;
        if (c17991xb1b018e3.m70671x4b640bf9()) {
            c17991xb1b018e3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
            c17991xb1b018e3.f248125p = false;
            c17991xb1b018e3.requestLayout();
            c17991xb1b018e3.invalidate();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
        } else {
            c17991xb1b018e3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
            c17991xb1b018e3.f248125p = true;
            c17991xb1b018e3.requestLayout();
            c17991xb1b018e3.invalidate();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
    }
}
