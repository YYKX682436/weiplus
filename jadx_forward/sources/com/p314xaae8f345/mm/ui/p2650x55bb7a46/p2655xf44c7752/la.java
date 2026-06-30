package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class la implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma f282716d;

    public la(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma maVar) {
        this.f282716d = maVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma maVar = this.f282716d;
        android.view.View view = maVar.f282735d.f282965j;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (maVar.f282735d.f282965j.getTag() != null && (maVar.f282735d.f282965j.getTag() instanceof t21.v2)) {
            t21.v2 v2Var = (t21.v2) maVar.f282735d.f282965j.getTag();
            r45.uf6 uf6Var = v2Var.E;
            if (uf6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468866d)) {
                android.view.View view2 = maVar.f282735d.f282965j;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            r45.uf6 uf6Var2 = v2Var.E;
            if (uf6Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var2.f468868f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v2Var.E.f468869g)) {
                android.view.View view3 = maVar.f282735d.f282965j;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view4 = maVar.f282735d.f282965j;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = maVar.f282735d.f282965j;
        view5.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view5.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
    }
}
