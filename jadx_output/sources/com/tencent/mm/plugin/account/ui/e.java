package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.f f73814d;

    public e(com.tencent.mm.plugin.account.ui.f fVar) {
        this.f73814d = fVar;
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
        com.tencent.mm.plugin.account.ui.f fVar = this.f73814d;
        if (action == 0) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.s_)).setTextColor(fVar.f73834g.getResources().getColor(com.tencent.mm.R.color.f478873jj));
            yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.s_)).setTextColor(fVar.f73834g.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/AliasAdapter$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
