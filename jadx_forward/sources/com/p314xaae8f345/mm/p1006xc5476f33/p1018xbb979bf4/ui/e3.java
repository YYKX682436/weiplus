package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class e3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156075d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a) {
        this.f156075d = activityC11497x3bc191a;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156075d;
        int headerViewsCount = i17 - activityC11497x3bc191a.f156026i.getHeaderViewsCount();
        if (headerViewsCount >= ((java.util.LinkedList) activityC11497x3bc191a.f156021d).size()) {
            return true;
        }
        rl5.r rVar = new rl5.r(activityC11497x3bc191a.mo55332x76847179(), view);
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.u2(activityC11497x3bc191a);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.x2(activityC11497x3bc191a, headerViewsCount);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
