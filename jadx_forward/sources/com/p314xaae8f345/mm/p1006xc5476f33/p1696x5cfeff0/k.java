package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes.dex */
public class k implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 f218757d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6) {
        this.f218757d = c15530x17431dc6;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("face-flash").B("show-dialog", 0L);
        db5.t7.m123883x26a183b(this.f218757d.getContext(), "ok", 1).show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
