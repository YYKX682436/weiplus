package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jm f249884d;

    public fm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jm jmVar) {
        this.f249884d = jmVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jm jmVar = this.f249884d;
        android.widget.TextView textView = jmVar.f251057c;
        if (textView != null && jmVar.f251058d != null && (view = (android.view.View) textView.getParent()) != null) {
            android.widget.TextView textView2 = jmVar.f251057c;
            android.widget.TextView textView3 = jmVar.f251058d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
            ad4.c0.f84708a.a(view, textView2, textView3, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$4");
    }
}
