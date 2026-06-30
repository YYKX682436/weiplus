package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n f241106d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n nVar) {
        this.f241106d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n nVar = this.f241106d;
            nVar.P.setVisibility(4);
            nVar.N.setMaxLines(2000);
            nVar.Q = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m mVar = nVar.W;
            if (mVar != null) {
                java.lang.String str = nVar.f279313q;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0) mVar;
                if (str != null && str.length() > 0) {
                    v0Var.f241190a.A.put(str, bool);
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0) nVar.W).f241190a.f240842d;
                if (rVar != null) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
