package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes4.dex */
public class q1 implements android.view.View.OnTouchListener {
    public q1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            view.setTag(com.p314xaae8f345.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
