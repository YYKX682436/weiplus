package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f f155347d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f fVar) {
        this.f155347d = fVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f fVar = this.f155347d;
        if (action == 0) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.s_)).setTextColor(fVar.f155367g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.s_)).setTextColor(fVar.f155367g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
