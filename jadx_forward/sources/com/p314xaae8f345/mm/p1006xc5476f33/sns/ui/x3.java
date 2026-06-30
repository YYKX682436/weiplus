package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class x3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253013d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var, android.content.Context context) {
        this.f253013d = context;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.content.Context context = this.f253013d;
        if (action == 0) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568556n81)).setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561084ab2));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.n7z)).m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561084ab2));
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            return false;
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568556n81)).setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.n7z)).m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
        return false;
    }
}
