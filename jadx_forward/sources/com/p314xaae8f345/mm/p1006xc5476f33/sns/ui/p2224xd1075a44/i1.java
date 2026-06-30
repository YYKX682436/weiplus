package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes.dex */
public class i1 implements android.view.View.OnTouchListener {
    public i1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe c18412x8f28cefe) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            view.setTag(com.p314xaae8f345.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$1");
        return false;
    }
}
