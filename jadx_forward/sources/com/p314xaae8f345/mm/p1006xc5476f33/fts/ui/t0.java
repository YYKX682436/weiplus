package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes10.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca f219718d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca abstractActivityC15594x3d6ad6ca) {
        this.f219718d = abstractActivityC15594x3d6ad6ca;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca abstractActivityC15594x3d6ad6ca = this.f219718d;
        abstractActivityC15594x3d6ad6ca.f219440h.m80997xdc5215a6().d();
        abstractActivityC15594x3d6ad6ca.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
